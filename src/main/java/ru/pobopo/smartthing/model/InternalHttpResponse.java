package ru.pobopo.smartthing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InternalHttpResponse implements Serializable {
    private int status;
    private String data;
    private Map<String, String> headers;
}
