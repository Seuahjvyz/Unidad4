package Service;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Model.User;

public class UserService {

    public final List<User> listUsers = new ArrayList<>();

    int id =0;

    Scanner op = new Scanner(System.in);

    public void addUser() {

        
            Scanner op = new Scanner(System.in);
    
            User newUser = new User();
    
            System.out.print("\nIngresa un nombre de usuario:");
            newUser.setUser(op.next());
    
            System.out.print("\nIngresa un correo electronico:");
            newUser.setEmail(op.next()); 
    
            System.out.print("\nIngresa una contraeña:");
            newUser.setPassword(op.next());
            
            newUser.setId(id);

            listUsers.add(newUser);

            id++;

            System.out.println("\nUsuario agregado exitosamente!");
            
            
        }

    public void editUser() {

        for (User users : listUsers) {

            System.out.println(users); 

        }

        System.out.println("Ingresa tu ID");
        int editarID = op.nextInt();

        /*if (listUsers.getId(editarID)) {

            User newUser = new User();

            System.out.print("\nIngresa un nombre de usuario:");
            newUser.setUser(op.next());
    
            System.out.print("\nIngresa un correo electronico:");
            newUser.setEmail(op.next()); 
    
            System.out.print("\nIngresa una contraeña:");
            newUser.setPassword(op.next());
            
            newUser.setId(id);

            listUsers.add(id,newUser);

            id++;

            System.out.println("\nUsuario agregado exitosamente!");

            
        }*/

        System.out.println("\nUsuario editado exitosamente!");
    }

    public void deletUser() {

        for (User users : listUsers) {

            System.out.println(users);

        }

        System.out.println("Ingresa tu ID");
        int eliminarID = op.nextInt();

        listUsers.remove(eliminarID);

        System.out.println("\nUsuario eliminado exitosamente!");

    }

    public void consultUser() {

        System.out.println("Consultar usuarios ");

        for (User users : listUsers) {

            System.out.println(users);

        }

    }
}
    