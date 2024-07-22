package com.ttokcheong.debatesummary.modules.election.service;

import com.ttokcheong.debatesummary.modules.election.domain.ElectionType;
import com.ttokcheong.debatesummary.modules.election.repository.ElectionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElectionTypeService {

  private final ElectionTypeRepository electionTypeRepository;

  public Page<ElectionType> find(Pageable pageable) {
    return electionTypeRepository.findAll(pageable);
  }
}
