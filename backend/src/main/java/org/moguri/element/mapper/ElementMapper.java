package org.moguri.element.mapper;

import org.moguri.element.domain.ElementVO;

import java.util.List;

public interface ElementMapper {
    public List<ElementVO> getList();
    public ElementVO get(int elementID);
}
