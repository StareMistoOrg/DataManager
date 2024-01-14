package com.example.datamanager.model;

import java.util.UUID;

public record Response(UUID id, String title,
                       String description, String date,
                       String linkToPhoto, String linkToMono) {

}
