package desafiocrud.backend.services;

import desafiocrud.backend.models.CryptoCurrency;
import desafiocrud.backend.repositories.CryptoCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
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

    public CryptoCurrency putCryptoCurrency(CryptoCurrency updateCC) {
        updateCC.setUpdateDate(new Date());
        return repository.save(updateCC);
    }

    public void deleteCryptoCurrency(Integer id) {
        Optional<CryptoCurrency> cc = repository.findById(id);
        repository.delete(cc.get());
    }

    public List<CryptoCurrency> searchCryptoCurrencies(String keyword) {
        return repository.search(keyword);
    }
}
