package equalshashcode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Honda"));
        queueCarros.add(new Carro("Hyundai"));
        queueCarros.add(new Carro("Toyota"));

        System.out.println(queueCarros.add(new Carro("Lexus")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Daihatsu")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());
    }

}
