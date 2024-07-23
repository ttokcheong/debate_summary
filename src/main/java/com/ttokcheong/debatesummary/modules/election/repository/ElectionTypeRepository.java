package com.ttokcheong.debatesummary.modules.election.repository;

import com.ttokcheong.debatesummary.modules.election.domain.ElectionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionTypeRepository extends JpaRepository<ElectionType, Long> {
  Page<ElectionType> findAll(Pageable pageable);
}
