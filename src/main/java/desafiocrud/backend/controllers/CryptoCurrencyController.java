package desafiocrud.backend.controllers;

import desafiocrud.backend.models.CryptoCurrency;
import desafiocrud.backend.services.CryptoCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cryptocurrencies")
@CrossOrigin(origins = "*")
public class CryptoCurrencyController {
    @Autowired
    private CryptoCurrencyService service;

    @GetMapping
    public List<CryptoCurrency> getAll() { return service.getAllCryptoCurrencies(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CryptoCurrency post(@RequestBody CryptoCurrency cc) { return service.postCryptoCurrency(cc); }

    @PutMapping
    public CryptoCurrency put(@RequestBody CryptoCurrency cc) { return service.putCryptoCurrency(cc); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) { service.deleteCryptoCurrency(id); }

    @GetMapping("/search")
    public List<CryptoCurrency> search(@RequestParam String keyword) { return service.searchCryptoCurrencies(keyword); }
}
