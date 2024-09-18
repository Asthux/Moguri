package org.moguri.member.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.moguri.common.enums.Role;
import org.moguri.member.domain.Member;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MemberCreateParam {

    private String email; // id

    private String password;

    private String nickName;

    private Role role;

    public Member toEntity() {
        Member member = Member.builder()
                .email(email)
                .password(password)
                .nickName(nickName)
                .role(Role.USER)
                .build();
        return member;
    }
}
