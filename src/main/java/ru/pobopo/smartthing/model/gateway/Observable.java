package ru.pobopo.smartthing.model.gateway;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Observable {
    private ObservableType type;
    private String name;
}
