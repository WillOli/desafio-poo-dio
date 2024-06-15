import domain.Curso;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Orientação a Objetos");
        curso1.setCargaHoria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso MySQL");
        curso2.setDescricao("Curso básico de sql");
        curso2.setCargaHoria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tire suas dúvidas.");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}