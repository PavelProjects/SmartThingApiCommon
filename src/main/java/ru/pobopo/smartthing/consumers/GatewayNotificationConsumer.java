package ru.pobopo.smartthing.consumers;

import ru.pobopo.smartthing.model.stomp.GatewayNotification;

public interface GatewayNotificationConsumer {
    void consume(GatewayNotification notification);
}
