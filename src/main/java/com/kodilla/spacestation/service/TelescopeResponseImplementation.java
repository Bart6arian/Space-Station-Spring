package com.kodilla.spacestation.service;


import com.kodilla.spacestation.domain.TelescopeResponse;
import com.kodilla.spacestation.repository.TelescopeResponseRepo;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class TelescopeResponseImplementation implements TelescopeResponseService {

    private final TelescopeResponseRepo responseRepo;

    @Override
    public List<TelescopeResponse> getAllResponses() {
        return responseRepo.getAllResponses();
    }

    @Override
    public void generateResponse(TelescopeResponse response) {
        responseRepo.saveResponse(response);
    }

    @Override
    public void deleteByIndex(int index) {
        responseRepo.deleteByIndex(index);
    }
}
