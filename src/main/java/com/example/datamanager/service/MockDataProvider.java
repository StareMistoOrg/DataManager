package com.example.datamanager.service;

import com.example.datamanager.model.Response;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class MockDataProvider implements DataProvider {

  @Override
  public List<Response> getAllData() {
    return List.of(
        Response.builder()
            .id(UUID.randomUUID())
            .title("Title")
            .date(LocalDate.now().toString())
            .description("Description")
            .linkToPhoto("some link")
            .linkToMono("some link")
            .build());
  }
}
