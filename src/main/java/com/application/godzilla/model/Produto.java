package com.application.godzilla.model;

import com.application.godzilla.resources.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@SQLDelete(sql = "UPDATE produtos SET deletado = CURRENT_TIMESTAMP WHERE prdt_id = ?")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "produtos")
public class Produto extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prdt_seq")
    @SequenceGenerator(name = "prdt_seq", allocationSize = 1, sequenceName = "prdt_seq")
    @Column(name = "prdt_id")
    private Long id;

    @Column(name = "prdt_descricao")
    private String descricao;

    @Column(name = "prdt_valor")
    private BigDecimal valor;

    @Column(name = "prdt_margem")
    private BigDecimal margem;

    @Column(name = "prdt_quantidade")
    private Long quantidade;

}
