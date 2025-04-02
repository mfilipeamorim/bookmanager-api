package com.github.mfilipeamorim.bookmanager_api.service;

import com.github.mfilipeamorim.bookmanager_api.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;


}
