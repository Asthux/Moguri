package org.moguri.member.repository;

import org.apache.ibatis.annotations.Mapper;
import org.moguri.member.domain.Member;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    int save(Member member); // 회원 정보 추가

    Optional<Member> findById(long id);

    List<Member> findAll(PageRequest pageRequest);
}