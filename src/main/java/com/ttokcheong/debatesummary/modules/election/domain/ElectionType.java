package com.ttokcheong.debatesummary.modules.election.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;

@Entity
public class ElectionType extends AuditingEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private Long id;

  @Getter private String name;

  @Getter private Long termNumber;

  @Getter private LocalDateTime electionDateTime;

  public String getFullName() {
    return "제 " + termNumber + "대 " + name;
  }
}
