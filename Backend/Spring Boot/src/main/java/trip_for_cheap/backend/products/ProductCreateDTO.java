package trip_for_cheap.backend.products;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

public record ProductCreateDTO(
        @NotBlank @Size(max = 120) String name,
        @NotBlank String description,
        List<String> images
) {}
