package com.kodilla.spacestation.service;

import com.kodilla.spacestation.domain.MessageType;
import com.kodilla.spacestation.domain.TelescopeResponse;

import java.util.List;

public interface TelescopeResponseService {

    List<TelescopeResponse> getAllResponses();
    void generateResponse(TelescopeResponse response);
    void deleteByIndex(int index);
}
