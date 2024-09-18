package ru.pobopo.smartthing.model.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ObservableType {
    @JsonProperty("sensor")
    SENSOR,
    @JsonProperty("state")
    STATE;
}
