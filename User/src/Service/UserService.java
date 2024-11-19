package Service;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Model.User;

public class UserService {

    public final List<User> listUsers = new ArrayList<>();

    int id = 1;

    Scanner op = new Scanner(System.in);

    public void addUser() {

        User newUser = new User();

        Scanner op = new Scanner(System.in);

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

        for (User user : listUsers) {
            System.out.println(user);
        }

        System.out.print("\nIngresa el ID del usuario que deseas editar: ");
        int editId = op.nextInt();

        User editUser = null;
        for (User user : listUsers) {
            if (user.getId() == editId) {
                editUser = user;
                break;
            }
        }

        if (editUser != null) {
            System.out.print("\nIngresa un nuevo nombre de usuario: ");
            editUser.setUser(op.next());

            System.out.print("\nIngresa un nuevo correo electrónico: ");
            editUser.setEmail(op.next());

            System.out.print("\nIngresa una nueva contraseña: ");
            editUser.setPassword(op.next());

            System.out.println("\nUsuario editado exitosamente!");
        } else {
            System.out.println("Usuario no encontrado con ID: " + editId);
        }

    }

    public void deletUser() {

        for (User user : listUsers) {
            System.out.println(user);
        }

        System.out.print("\nIngresa el ID del usuario que deseas eliminar: ");
        int deleteId = op.nextInt();

        // Buscar el usuario con ese ID
        boolean userFound = false;
        for (User user : listUsers) {
            if (user.getId() == deleteId) {
                listUsers.remove(user);
                System.out.println("\nUsuario eliminado exitosamente!");
                userFound = true;
                break;
            }
        }

        if (!userFound) {
            System.out.println("Usuario no encontrado con ID: " + deleteId);
        }
    }

    public void consultUser() {

        System.out.println("Consultar usuarios ");

        if (listUsers.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (User user : listUsers) {
                System.out.println(user);
            }

        }
    }
}
