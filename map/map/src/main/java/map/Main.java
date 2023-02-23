package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<String, String>();

        aluno.put("Nome", "Bruno");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3c");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<String, String>();

        aluno.put("Nome", "Ellen");
        aluno.put("Idade", "16");
        aluno.put("Media", "9");
        aluno.put("Turma", "2c");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

    }

}
