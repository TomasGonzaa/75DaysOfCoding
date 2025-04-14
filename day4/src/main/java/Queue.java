import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {

    //SIMULA UNA COLA DE PERSONAS ESPERANDO A SER ATENDIDA.
    //cada persona tiene un nombre.
    //El sistema debe encolar 5 personas, mostrar el primero y atender usando poll(),
    //mostrando la cola en cada paso


    private String name;

    public void customerService(String name,String name2,String name3,String name4,String name5){
        java.util.Queue<String> queue = new LinkedList<>();

        queue.offer(name);
        queue.offer(name2);
        queue.offer(name3);
        queue.offer(name4);
        queue.offer(name5);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            System.out.println("Fila: "+ queue);
            queue.poll();
        }
    }


    public void customerService2(String... names){
        java.util.Queue<String> queue = new LinkedList<>();
        for(String name : names){
            queue.offer(name);
        }
        while (!queue.isEmpty()){
            System.out.println("Atendiendo a: " + queue.peek());
            System.out.println("Fila: "+ queue);
            queue.poll();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.customerService2("Lorenzo","Martina","Paco","Victoria","Tomás");

    }
}
