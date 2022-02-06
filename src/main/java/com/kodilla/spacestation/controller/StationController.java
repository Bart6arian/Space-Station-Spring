package com.kodilla.spacestation.controller;

import com.kodilla.spacestation.domain.MessageType;
import com.kodilla.spacestation.domain.TelescopeResponseDto;
import com.kodilla.spacestation.mapper.TelescopeResponseMapper;
import com.kodilla.spacestation.service.TelescopeResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/telescope")
public class StationController {

    private TelescopeResponseService service;

    @GetMapping
    @ResponseBody
    public List<TelescopeResponseDto> getAllResponses() {
        return TelescopeResponseMapper.mapToTelescopeResponseListDto(service.getAllResponses());
    }

    @PostMapping
    public void generateSignal(@RequestBody TelescopeResponseDto dto) {
        service.generateResponse(TelescopeResponseMapper.mapToTelescopeResp(dto));
    }

    @DeleteMapping(path = "/{index}")
    public void deleteByIndex(@PathVariable("index") int index) {
        service.deleteByIndex(index);
    }

}
