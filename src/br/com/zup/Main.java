package br.com.zup;

public class Main {
    public static void main(String[] args) {
        System.out.println("Os alunos cadastrados no sistema foram:");
        for (Aluno aluno: Aluno.values()) {
            System.out.println(aluno.name());
        }
    }

}
