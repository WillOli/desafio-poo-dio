package domain;

import java.time.LocalDate;
import java.util.*;

public class BootCamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays((45));
    private Set<Dev> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return conteudosInscritos;
    }

    public void setDevsInscritos(Set<Dev> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudosConcluidos;
    }

    public void setConteudos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(getNome(), bootCamp.getNome()) && Objects.equals(getDescricao(), bootCamp.getDescricao()) && Objects.equals(getDataInicial(), bootCamp.getDataInicial()) && Objects.equals(getDataFinal(), bootCamp.getDataFinal()) && Objects.equals(getDevsInscritos(), bootCamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootCamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDataFinal(), getDevsInscritos(), getConteudos());
    }
}
