package ru.pobopo.smartthing.model.stomp;

import lombok.*;
import ru.pobopo.smartthing.model.GatewayInfo;

@EqualsAndHashCode(callSuper = true)
@Data
public class GatewayNotification extends DeviceNotification {
    private GatewayInfo gateway;
}
