package com.microservice.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosSolicitacaoEmissaoCartao {

    private Long id;
    private String cpf;
    private String endereco;
    private BigDecimal limiteLiberado;
}
