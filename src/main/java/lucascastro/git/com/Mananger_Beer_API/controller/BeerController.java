package lucascastro.git.com.Mananger_Beer_API.controller;



import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lucascastro.git.com.Mananger_Beer_API.dto.BeerDTO;
import lucascastro.git.com.Mananger_Beer_API.dto.QuantityDTO;
import lucascastro.git.com.Mananger_Beer_API.exception.BeerAlreadyRegisteredException;
import lucascastro.git.com.Mananger_Beer_API.exception.BeerNotFoundException;
import lucascastro.git.com.Mananger_Beer_API.exception.BeerStockExceededException;
import lucascastro.git.com.Mananger_Beer_API.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController implements BeerControllerDocs {

    private final BeerService beerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }

    @GetMapping("/{name}")
    public BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException {
        return beerService.findByName(name);
    }

    @GetMapping
    public List<BeerDTO> listBeers() {
        return beerService.listAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws BeerNotFoundException {
        beerService.deleteByID(id);
    }

    @PatchMapping("/{id}/increment")
    public BeerDTO increment(@PathVariable Long id, @RequestBody @Valid QuantityDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException {
        return beerService.increment(id, quantityDTO.getQuantity());
    }

    @PatchMapping("/{id}/decrement")
    public BeerDTO decrement(@PathVariable Long id, @RequestBody @Valid QuantityDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException {
        return beerService.decrement(id, quantityDTO.getQuantity());
    }

}
