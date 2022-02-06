package com.kodilla.spacestation.repository;

import com.kodilla.spacestation.domain.TelescopeResponse;

import java.util.ArrayList;
import java.util.List;

class InMemoryTelescopeResponseRepository implements TelescopeResponseRepo {

    List<TelescopeResponse> responses = new ArrayList<>();

    @Override
    public List<TelescopeResponse> getAllResponses() {
        return responses;
    }

    @Override
    public void deleteByIndex(int position) {
        responses.remove(position);
    }

    @Override
    public void saveResponse(TelescopeResponse response) {
        responses.add(response);
    }

}
