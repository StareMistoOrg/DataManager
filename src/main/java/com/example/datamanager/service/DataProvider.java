package com.example.datamanager.service;

import com.example.datamanager.model.Response;
import java.util.List;

public interface DataProvider {
  List<Response> getAllData();
}
