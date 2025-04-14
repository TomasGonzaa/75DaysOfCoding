package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<User> userList= new ArrayList<>();

        User user1 = new User.UserBuilder("Carlos")
                .adress("Muñecas 496")
                .favouriteColor("rosa")
                .build();

        User user2 = new User.UserBuilder("Roxana")
                .adress("Domingo Sarmiento 899")
                .build();

        User user3 = new User.UserBuilder("Damian")
                .build();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("Usuarios creados correctamente");

        for (User user : userList){
            user.showInfo();
        }
    }
}
