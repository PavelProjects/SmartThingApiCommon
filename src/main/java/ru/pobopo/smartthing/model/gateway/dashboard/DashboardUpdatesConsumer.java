package ru.pobopo.smartthing.model.gateway.dashboard;

import java.util.List;

public interface DashboardUpdatesConsumer {
    void consume(DashboardGroup group, List<DashboardObservableValueUpdate> updates);
}
