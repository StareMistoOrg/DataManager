package com.example.datamanager.controller;

import com.example.datamanager.model.OuterResponse;
import com.example.datamanager.service.DataProvider;
import com.example.datamanager.utils.ResponseMapper;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  private final DataProvider dataProvider;
  private final ResponseMapper responseMapper;
  public Controller(DataProvider dataProvider, ResponseMapper responseMapper) {
    this.dataProvider = dataProvider;
    this.responseMapper = responseMapper;
  }
  @GetMapping("/testdata")
  public List<OuterResponse> getTestData() {
    return responseMapper.convertToOuterResponseList(dataProvider.getAllData());
  }
}
