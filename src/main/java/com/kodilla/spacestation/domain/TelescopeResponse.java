package com.kodilla.spacestation.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class TelescopeResponse {
    String message;
    double distance;
    MessageType type;
}
