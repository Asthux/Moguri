package org.moguri.element.service;


import org.moguri.element.mapper.ElementMapper;
import org.moguri.element.domain.ElementVO;
import org.moguri.element.dto.ElementDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ElementServiceImpl implements ElementService {
    private final ElementMapper mapper;

    @Override
    public List<ElementDTO> getList() {
        List<ElementDTO> elementDTOList = mapper.getList().stream()
                .map(ElementDTO::of)
                .toList();
        return elementDTOList;
    }

    @Override
    public ElementDTO get(int elementId) {
        ElementVO elementVO = mapper.get(elementId);
        ElementDTO elementDTO = ElementDTO.of(elementVO);

        return Optional.ofNullable(elementDTO)
                .orElseThrow(NoSuchElementException::new);
    }
}
