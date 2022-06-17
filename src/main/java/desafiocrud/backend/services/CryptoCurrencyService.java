package desafiocrud.backend.services;

import desafiocrud.backend.models.CryptoCurrency;
import desafiocrud.backend.repositories.CryptoCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class CryptoCurrencyService {
    @Autowired
    private CryptoCurrencyRepository repository;

    public List<CryptoCurrency> getAllCryptoCurrencies() {
        return repository.findAll();
    }

    public CryptoCurrency postCryptoCurrency(CryptoCurrency postCC) {
        postCC.setInclusionDate(new Date());
        return repository.save(postCC);
    }
}
