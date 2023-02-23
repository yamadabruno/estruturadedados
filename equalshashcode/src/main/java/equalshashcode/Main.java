package equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Honda"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Toyota"));

        System.out.println(listaCarros.contains(new Carro("Honda")));
        System.out.println(new Carro("Honda").hashCode());

        Carro carro1 = new Carro("Honda");
        Carro carro2 = new Carro("Toyota");
        System.out.println(carro1.equals(carro2));
    }

}
