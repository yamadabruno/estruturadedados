package equalshashcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Honda"));
        hashSetCarros.add(new Carro("Hyundai"));
        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Lexus"));
        hashSetCarros.add(new Carro("Daihatsu"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Honda"));
        treeSetCarros.add(new Carro("Hyundai"));
        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Kia"));
        treeSetCarros.add(new Carro("Daihatsu"));

        System.out.println(treeSetCarros);

    }

}
