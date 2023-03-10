package lucascastro.git.com.Mananger_Beer_API.builder;


import lombok.Builder;
import lucascastro.git.com.Mananger_Beer_API.dto.BeerDTO;
import lucascastro.git.com.Mananger_Beer_API.enums.BeerType;


@Builder
public class BeerDTOBuilder {


    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;



    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
