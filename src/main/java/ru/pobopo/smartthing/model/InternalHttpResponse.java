package ru.pobopo.smartthing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InternalHttpResponse implements Serializable {
    private HttpStatusCode status;
    private String data;
    private HttpHeaders headers;
}
