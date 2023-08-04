package com.example.pinshot.repository;

import com.example.pinshot.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberEntityRepository extends CrudRepository<MemberEntity, Long> {
}
