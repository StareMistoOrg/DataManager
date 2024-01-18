package com.example.datamanager.utils;

import com.example.datamanager.model.OuterResponse;
import com.example.datamanager.model.Response;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ResponseMapper {

  public List<OuterResponse> convertToOuterResponseList(List<Response> responses) {

    return responses.stream()
        .map(this::convertToOuterResponse)
        .toList();

  }

  public OuterResponse convertToOuterResponse(Response response) {
    return OuterResponse.builder()
        .id(response.id())
        .title(response.title())
        .date(response.date())
        .description(response.description())
        .linkToPhoto(response.linkToPhoto())
        .linkToMono(response.linkToPhoto())
        .build();
  }
}
