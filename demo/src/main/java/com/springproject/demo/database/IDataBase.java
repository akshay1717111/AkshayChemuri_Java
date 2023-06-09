package com.springproject.demo.database;

import com.springproject.demo.dto.SubmissionRequest;

import java.util.List;
import java.util.UUID;

public interface IDataBase {
    SubmissionRequest store(SubmissionRequest sr);
    SubmissionRequest fetch(UUID id);
    boolean update(SubmissionRequest sr);
    void delete(UUID id);
    List<SubmissionRequest> fetchAll();
}