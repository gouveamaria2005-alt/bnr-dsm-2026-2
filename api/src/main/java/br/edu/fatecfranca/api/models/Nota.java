
package br.edu.fatecfranca.api.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.DecimalMax;

public class Nota {

    @NotBlank(message = "O nome da avaliação é obrigatório.")
    private String avaliacao;

    @NotNull(message = "O valor da nota é obrigatório.")
    @DecimalMin(
        value = "0.0",
        message = "A nota não pode ser negativa."
    )
    @DecimalMax(
        value = "10.0",
        message = "A nota não pode ser maior que 10."
    )
    private Double valor;

    public Nota() {
    }

    public Nota(String avaliacao, Double valor) {
        this.avaliacao = avaliacao;
        this.valor = valor;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
