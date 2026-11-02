
package br.edu.fatecfranca.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.Valid;

@Document(collection = "matriculas")
public class Matricula {

    @Id
    private String id;

    @NotBlank(message = "O identificador do aluno é obrigatório.")
    private String alunoId;

    @NotBlank(message = "O identificador da turma é obrigatório.")
    private String turmaId;

    @NotBlank(message = "A data da matrícula é obrigatória.")
    private String data;

    private String situacao;

    @Valid
    private List<Nota> notas;

    public Matricula() {
    }

    public Matricula(
            String id,
            String alunoId,
            String turmaId,
            String data,
            String situacao,
            List<Nota> notas) {

        this.id = id;
        this.alunoId = alunoId;
        this.turmaId = turmaId;
        this.data = data;
        this.situacao = situacao;
        this.notas = notas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public String getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(String turmaId) {
        this.turmaId = turmaId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
