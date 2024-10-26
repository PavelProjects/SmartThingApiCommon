package ru.pobopo.smartthing.consumers;

import ru.pobopo.smartthing.model.gateway.dashboard.DashboardGroup;
import ru.pobopo.smartthing.model.gateway.dashboard.DashboardObservableValueUpdate;

import java.util.List;

public interface DashboardUpdatesConsumer {
    void consume(DashboardGroup group, List<DashboardObservableValueUpdate> updates);
}
