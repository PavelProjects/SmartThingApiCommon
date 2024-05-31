package ru.pobopo.smartthing.model.stomp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseMessage {
    private UUID requestId;
    private Object data;
    private String error;
    private String stack;
    private boolean success = true;
}
