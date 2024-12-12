package ru.pobopo.smartthing.model.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class SensorInfo {
    private String name;
    private SensorType type;
}
