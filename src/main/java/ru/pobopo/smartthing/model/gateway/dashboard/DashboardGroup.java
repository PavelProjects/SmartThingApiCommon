package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.Data;
import ru.pobopo.smartthing.model.DeviceInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class DashboardGroup {
    private UUID id;
    private DeviceInfo device;
    private List<DashboardObservable> observables = new ArrayList<>();
    private DashboardGroupConfig config = new DashboardGroupConfig();
}
