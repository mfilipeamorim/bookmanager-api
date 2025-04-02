package com.github.mfilipeamorim.bookmanager_api.repository;

import com.github.mfilipeamorim.bookmanager_api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
