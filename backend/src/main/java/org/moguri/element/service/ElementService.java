package org.moguri.element.service;

import org.moguri.element.dto.ElementDTO;

import java.util.List;

public interface ElementService {
    public List<ElementDTO> getList();
    public ElementDTO get(int elementID);
}
