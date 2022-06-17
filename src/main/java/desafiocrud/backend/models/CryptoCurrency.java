package desafiocrud.backend.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="crypto_currencies")
public class CryptoCurrency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String abbreviations;

    private String description;

    private float price;

    private Date inclusionDate;

    private Date updateDate;
}
