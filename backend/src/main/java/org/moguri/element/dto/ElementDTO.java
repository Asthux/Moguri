package org.moguri.element.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.moguri.element.domain.ElementVO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElementDTO {
    private int elementID;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer1Type;
    private String answer2Type;
    private String answer3Type;

    //VO->DTO 변환
    public static ElementDTO of(ElementVO vo) {
        return vo == null ? null : ElementDTO.builder()
                .elementID(vo.getElementID())
                .question(vo.getQuestion())
                .answer1(vo.getAnswer1())
                .answer2(vo.getAnswer2())
                .answer3(vo.getAnswer3())
                .answer1Type(vo.getAnswer1Type())
                .answer2Type(vo.getAnswer2Type())
                .answer3Type(vo.getAnswer3Type())
                .build();

    }
//DTO->VO 변환
    public ElementVO toVO(){
        return ElementVO.builder()
                .elementID(elementID)
                .question(question)
                .answer1(answer1)
                .answer2(answer2)
                .answer3(answer3)
                .answer1Type(answer1Type)
                .answer2Type(answer2Type)
                .answer3Type(answer3Type)
                .build();
    }
}
