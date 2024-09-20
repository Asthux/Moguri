package org.moguri.element.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Builder
public class ElementVO {
    private int elementId;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer1Type;
    private String answer2Type;
    private String answer3Type;
}
