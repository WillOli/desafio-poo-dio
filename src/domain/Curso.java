package domain;

public class Curso extends Conteudo {

    private int cargaHoria;
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoria;
    }

    public Curso() {

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
