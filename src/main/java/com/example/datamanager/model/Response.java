package com.example.datamanager.model;

import java.util.UUID;
import lombok.Builder;

@Builder
public record Response(UUID id, String title,
                       String description, String date,
                       String linkToPhoto, String linkToMono) {

}
