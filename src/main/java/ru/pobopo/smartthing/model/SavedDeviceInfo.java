package ru.pobopo.smartthing.model;

import lombok.*;
import ru.pobopo.smartthing.annotation.FileRepoId;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavedDeviceInfo extends DeviceInfo {
    @FileRepoId
    private UUID id;
}
