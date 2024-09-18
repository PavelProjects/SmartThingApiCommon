package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@AllArgsConstructor
public class DashboardObservableValues {
    private final DashboardObservable observable;
    private final Collection<DashboardObservableValue> values;
}
