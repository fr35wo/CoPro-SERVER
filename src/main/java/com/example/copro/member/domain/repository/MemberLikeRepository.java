package com.example.copro.member.domain.repository;

import com.example.copro.member.domain.Member;
import com.example.copro.member.domain.MemberLike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberLikeRepository extends JpaRepository<MemberLike, Long> {
    boolean existsByMemberAndLikedMember(Member member, Member memberLike);

    Page<MemberLike> findByMember(Member member, Pageable pageable);
}
