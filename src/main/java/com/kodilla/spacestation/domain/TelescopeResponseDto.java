package com.kodilla.spacestation.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelescopeResponseDto {
    String message;
    double distance;
    MessageType type;
}
