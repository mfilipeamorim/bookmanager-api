package com.github.mfilipeamorim.bookmanager_api.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BookDTO {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "ISBN is required")
    private String isbn;

    @NotNull(message = "Year is required")
    private Integer year;

    @NotNull(message = "Available copies is required")
    @Min(value = 0, message = "Available copies cannot be negative")
    private Integer availableCopies;
}
