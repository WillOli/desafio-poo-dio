package domain;

public class Curso extends Conteudo {
    private String titulo;
    private String descricao;
    private int cargaHoria;
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoria;
    }

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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoria=" + cargaHoria +
                '}';
    }
}
