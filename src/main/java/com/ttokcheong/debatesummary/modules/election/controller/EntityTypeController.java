package com.ttokcheong.debatesummary.modules.election.controller;

import com.ttokcheong.debatesummary.modules.election.domain.ElectionType;
import com.ttokcheong.debatesummary.modules.election.service.ElectionTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class EntityTypeController {

  private final ElectionTypeService electionTypeService;

  @GetMapping("/election-types")
  public String index(
      Model model,
      @SortDefault(
              sort = {"electionDateTime"},
              direction = Sort.Direction.DESC)
          @PageableDefault
          Pageable pageable) {
    Page<ElectionType> electionTypes = electionTypeService.find(pageable);
    model.addAttribute("electionTypes", electionTypes);
    return "/view/electionType/index";
  }
}
