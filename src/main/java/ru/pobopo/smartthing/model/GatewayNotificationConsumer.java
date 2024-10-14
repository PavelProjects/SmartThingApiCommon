package ru.pobopo.smartthing.model;

import ru.pobopo.smartthing.model.stomp.GatewayNotification;

public interface GatewayNotificationConsumer {
    void consume(GatewayNotification notification);
}
