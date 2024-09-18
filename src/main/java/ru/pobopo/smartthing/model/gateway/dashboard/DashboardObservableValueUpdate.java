package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.Data;

@Data
public class DashboardObservableValueUpdate {
    private final DashboardObservable observable;
    private final DashboardObservableValue value;
}
