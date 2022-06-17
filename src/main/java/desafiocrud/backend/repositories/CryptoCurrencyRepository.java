package desafiocrud.backend.repositories;

import desafiocrud.backend.models.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, Integer> {
    @Query(value = "SELECT * FROM crypto_currencies WHERE description LIKE %:keyword%", nativeQuery = true)
    List<CryptoCurrency> search(@Param("keyword") String keyword);
}
