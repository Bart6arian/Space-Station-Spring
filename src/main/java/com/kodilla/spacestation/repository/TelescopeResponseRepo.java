package com.kodilla.spacestation.repository;

import com.kodilla.spacestation.domain.TelescopeResponse;

import java.util.List;

public interface TelescopeResponseRepo {

    List<TelescopeResponse> getAllResponses();
    void deleteByIndex(int position);
    void saveResponse(TelescopeResponse response);
}
