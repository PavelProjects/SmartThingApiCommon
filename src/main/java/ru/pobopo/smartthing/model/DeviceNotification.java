package ru.pobopo.smartthing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceNotification {
    private DeviceInfo device;
    private Notification notification;
}
