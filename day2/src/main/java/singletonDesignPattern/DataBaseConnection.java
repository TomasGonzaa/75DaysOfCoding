package singletonDesignPattern;

public class DataBaseConnection {

    private static DataBaseConnection instance;        //permitiendo unica instancia

    //constructor privado para evitar instanciacion externa
    private DataBaseConnection(){
        System.out.println("Conexion creada");
    }


    //metodo estatico para obtener la única instancia
    public static DataBaseConnection getInstance(){
        if (instance==null){
            instance = new DataBaseConnection();
        }
        return instance;
    }


    //metodo de conexion
    public void connect(){
        //System.out.println("Conectado a la base de datos");
        System.out.println(System.identityHashCode(instance));
    }
}
