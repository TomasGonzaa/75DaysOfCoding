package singletonDesignPattern;

public class main {

    public static void main(String[] args) {

        DataBaseConnection db1 = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();
        DataBaseConnection db3 = DataBaseConnection.getInstance();

        db1.connect();
        db2.connect();
        db3.connect();

        if(db1 == db2 & db2==db3){
            System.out.println("ambas referencias apuntan a la misma instancia");
        }else {
            System.out.println("se crearon diferentes instancias");
        }
    }
}
