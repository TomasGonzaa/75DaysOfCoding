package builderDesignPattern;

public class User {

    private String name;
    private String adress;
    private String favouriteColor;




    //constructor privado para obligar uso del Builder
    private User(UserBuilder builder){
        this.name = builder.name;
        this.adress = builder.adress;
        this.favouriteColor = builder.favouriteColor;
    }

    //Clase estatica interna para construir el objeto
    public static class UserBuilder{
        private String name;
        private String adress;
        private String favouriteColor;

        //al parametro name lo haremos obligatorio
        public UserBuilder(String name){
            this.name = name;
        }

        //parametros opcionales
        public UserBuilder adress(String adress){
            this.adress = adress;
            return this;
        }
        public UserBuilder favouriteColor(String favouriteColor){
            this.favouriteColor = favouriteColor;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }

    public void showInfo(){
        System.out.println("\n User: "+name
        +"\n adress: "+ adress+"\n favourite color: "+ favouriteColor);
    }

}
