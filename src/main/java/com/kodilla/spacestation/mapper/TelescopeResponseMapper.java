package com.kodilla.spacestation.mapper;

import com.kodilla.spacestation.domain.TelescopeResponse;
import com.kodilla.spacestation.domain.TelescopeResponseDto;

import java.util.List;
import java.util.stream.Collectors;

public class TelescopeResponseMapper {

    public static TelescopeResponse mapToTelescopeResp(TelescopeResponseDto dto) {
        return TelescopeResponse.of(dto.getMessage(), dto.getDistance(), dto.getType());
    }

    public static TelescopeResponseDto mapToTelescopeRespDto(TelescopeResponse response) {
        return new TelescopeResponseDto(response.getMessage(), response.getDistance(), response.getType());
    }

    public static List<TelescopeResponse> mapToTelescopeResponseList(List<TelescopeResponseDto> dtos) {
        return dtos.stream()
                .map(dt -> TelescopeResponse.of(dt.getMessage(), dt.getDistance(), dt.getType()))
                .collect(Collectors.toList());
    }

    public static List<TelescopeResponseDto> mapToTelescopeResponseListDto(List<TelescopeResponse> responses) {
        return responses.stream()
                .map(resp -> new TelescopeResponseDto(resp.getMessage(), resp.getDistance(), resp.getType()))
                .collect(Collectors.toList());
    }
}
