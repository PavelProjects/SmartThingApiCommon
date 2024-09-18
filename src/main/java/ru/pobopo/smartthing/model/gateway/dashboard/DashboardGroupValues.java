package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.Data;

import java.util.List;

@Data
public class DashboardGroupValues {
    private final DashboardGroup group;
    private final List<DashboardObservableValues> values;
}
