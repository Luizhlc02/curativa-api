package com.api.curativa.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContasAPagar {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "beneficiario")
    private String beneficiario;
    @Column(name = "nroParcela")
    private int nroParcela;
    @Column(name = "valorParcela")
    private String valorParcela;
    @Column(name = "dataVencimento")
    private Date dataVencimento;
}
