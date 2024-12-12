package ru.pobopo.smartthing.model.device;

import lombok.Data;

@Data
public class SensorValue extends SensorInfo {
    private Object value;
}
