import domain.*;

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

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWilliam = new Dev();
        devWilliam.setNome("Camila");
        devWilliam.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos William:" + devWilliam.getConteudosInscritos());
        devWilliam.progredir();
        devWilliam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos William:" + devWilliam.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos William:" + devWilliam.getConteudosConcluidos());
        System.out.println("XP:" + devWilliam.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");
        //criar um novo curso
        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Curso básico de Python");
        curso3.setCargaHoria(6);
        //printar o curso
        System.out.println(curso3);



    }
}