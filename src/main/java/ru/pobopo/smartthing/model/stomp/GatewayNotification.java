package ru.pobopo.smartthing.model.stomp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.pobopo.smartthing.model.DeviceInfo;
import ru.pobopo.smartthing.model.GatewayInfo;
import ru.pobopo.smartthing.model.Notification;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GatewayNotification {
    private GatewayInfo gateway;
    private DeviceInfo device;
    private Notification notification;
}
