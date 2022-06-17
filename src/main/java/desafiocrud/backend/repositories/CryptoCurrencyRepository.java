package desafiocrud.backend.repositories;

import desafiocrud.backend.models.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, Integer> {
}
