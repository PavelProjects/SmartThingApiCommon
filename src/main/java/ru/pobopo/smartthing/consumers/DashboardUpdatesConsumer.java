package ru.pobopo.smartthing.consumers;

import ru.pobopo.smartthing.model.gateway.dashboard.DashboardValuesUpdate;

import java.util.function.Consumer;

public interface DashboardUpdatesConsumer extends Consumer<DashboardValuesUpdate> {
}
