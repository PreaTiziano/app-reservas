package trip_for_cheap.backend.products;

import java.util.List;

public record ProductResponseDTO(
        Long id,
        String name,
        String description,
        List<String> images
) {}
