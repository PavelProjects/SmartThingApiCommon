package ru.pobopo.smartthing.consumers;

import ru.pobopo.smartthing.model.DeviceNotification;

public interface DeviceNotificationConsumer {
    void consume(DeviceNotification notification);
}
