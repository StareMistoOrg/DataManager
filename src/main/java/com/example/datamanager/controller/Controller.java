package com.example.datamanager.controller;

import com.example.datamanager.model.Response;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/testdata")
  public Response getTestData() {
    return new Response(UUID.randomUUID(), "Test Title", "Test Description", "01-23-2025",
                    "http://some-link-to-photo", "http://some-link-to-mono");
  }
}
