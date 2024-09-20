package org.moguri.element.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.moguri.common.response.ApiResponse;
import org.moguri.element.dto.ElementDTO;
import org.moguri.element.service.ElementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/api/element")
@RequiredArgsConstructor
@Slf4j
public class ElementController {
    private final ElementService service;

    @GetMapping("")
    public ApiResponse<List<ElementDTO>> getList() {
        return ApiResponse.of(service.getList());
    }

    @GetMapping("/{elementId}")
    public ApiResponse<ElementDTO> get(@PathVariable int elementId) {
        return ApiResponse.of(service.get(elementId));
    }


}
