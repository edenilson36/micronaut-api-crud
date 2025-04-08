package sv.edu.udb.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PostRequest(
        @NotBlank String title,
        @NotNull LocalDate postDate
) { }
