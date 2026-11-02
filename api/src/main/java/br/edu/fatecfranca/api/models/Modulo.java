
package br.edu.fatecfranca.api.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Modulo {

    @NotBlank(message = "O título do módulo é obrigatório.")
    private String titulo;

    @NotBlank(message = "O conteúdo do módulo é obrigatório.")
    private String conteudo;

    @NotBlank(message = "A carga horária do módulo é obrigatória.")
    @Pattern(
        regexp = "^[1-9][0-9]*$",
        message = "A carga horária deve ser um número inteiro maior que zero."
    )
    private String cargaHoraria;

    public Modulo() {
    }

    public Modulo(
            String titulo,
            String conteudo,
            String cargaHoraria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
