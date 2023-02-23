package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Honda"));
        listCarros.add(new Carro("Hyundai"));
        listCarros.add(new Carro("Toyota"));
        listCarros.add(new Carro("Lexus"));

        System.out.println(listCarros.contains(new Carro("Honda")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Lexus")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }

}
