package ru.pobopo.smartthing.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"ip", "name", "type"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Device information")
public class DeviceInfo {
    @Schema(description = "Device board name", example = "esp32")
    private String board;
    @Schema(description = "Ip in local network")
    private String ip;
    @Schema(description = "Device type", example = "lamp")
    private String type;
    @Schema(description = "Device name")
    private String name;
    @Schema(description = "Firmware version")
    private String version;

    public DeviceInfo(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

    public static DeviceInfo fromMulticastMessage(String message) {
        if (StringUtils.isBlank(message)) {
            return null;
        }

        String[] splited = message.split("[$]");
        if (splited.length < 4) {
            return null;
        }

        DeviceInfo.DeviceInfoBuilder builder = builder();
        builder.ip(splited[0])
                .type(splited[1])
                .name(splited[2])
                .version(splited[3]);
        // todo remove after all devices update
        if (splited.length == 5) {
            builder.board(splited[4]);
        }
        return builder.build();
    }
}