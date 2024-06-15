package domain;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoria;

    public Curso() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoria() {
        return cargaHoria;
    }

    public void setCargaHoria(int cargaHoria) {
        this.cargaHoria = cargaHoria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoria=" + cargaHoria +
                '}';
    }
}
