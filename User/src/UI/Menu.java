package UI;

import java.util.Scanner;

import Service.UserService;

public class Menu {

    Scanner op = new Scanner(System.in);

    int opcion;

    UserService users = new UserService();

    public void Menu() {

        do {

            System.out.println("---------------------MENU----------------------");
            System.out.println("Ingresa un numero dependiendo de que quieres realizar");

            System.out.println("0: Cerrar programa");
            System.out.println("1: Agregar un usuario");
            System.out.println("2: Editar un usuario");
            System.out.println("3: Eliminar un usuario");
            System.out.println("4: Consultar usuarios");
            opcion = op.nextInt();

            switch (opcion) {

                case 1:

                    users.addUser();

                    break;

                case 2:

                    users.editUser();

                    break;

                case 3:

                    users.deletUser();

                    break;

                case 4:

                    users.consultUser();

                    break;

                default:
                    break;

            }

        } while (opcion !=0);

    }

}