package ru.pobopo.smartthing.model.gateway.dashboard;

import lombok.*;
import ru.pobopo.smartthing.model.gateway.ObservableType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "units")
public class DashboardObservable {
    private ObservableType type;
    private String name;
    private String units;
}
