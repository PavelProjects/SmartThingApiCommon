package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.Data;

import java.util.List;

@Data
public class DashboardValuesUpdate {
    private final DashboardGroup group;
    private final List<DashboardObservableValueUpdate> values;
}
