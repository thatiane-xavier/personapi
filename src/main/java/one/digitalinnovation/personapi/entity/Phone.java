package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity // Indica que essa classe é uma entidade do banco de dados
@Data //insere todos os getters e setters
@Builder //otimiza a criação de objetos
@AllArgsConstructor //gera um construtor com todos os argumentos
@NoArgsConstructor //gera um construtor padrão, sem argumentos
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
