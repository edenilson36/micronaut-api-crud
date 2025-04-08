package sv.edu.udb.dto.response;

import java.time.LocalDate;

public record PostResponse(
        Long id,
        String title,
        LocalDate postDate
) { }
