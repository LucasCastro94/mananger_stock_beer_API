package lucascastro.git.com.Mananger_Beer_API.mapper;


import lucascastro.git.com.Mananger_Beer_API.dto.BeerDTO;
import lucascastro.git.com.Mananger_Beer_API.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);

}
