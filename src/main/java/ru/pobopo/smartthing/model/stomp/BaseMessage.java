package ru.pobopo.smartthing.model.stomp;

import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@ToString
public class BaseMessage {
    private UUID id;
    private final GatewayMessageType type;
    private boolean needResponse = true;

    public BaseMessage(GatewayMessageType type) {
        this.type = type;
    }
}
