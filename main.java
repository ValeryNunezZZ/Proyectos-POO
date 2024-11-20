import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        Biblioteca b = new Biblioteca();
        Usuario usuario;
        int op;
        int id;

        do{
            System.out.println("1. Registrar usuario");
            System.out.println("2. Consultar usuario");
    
            System.out.println("3. Añadir libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Consultar libro");
            System.out.println("6. Listado de libros");
    
    
            System.out.println("7. Pedir libro");
            System.out.println("8. Devolver libro");
            System.out.println("9. Consultar mis libros");
            System.out.println("10. Salir");
    
            System.out.print("Opcion a realizar: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    b.registrarUsuario();
                    break;

                case 2:
                    b.consultarUsuario();
                    break;

                case 3:
                    b.añairLibro();
                    break;

                case 4:
                    b.eliminarLibro();
                    break;

                case 5:
                    b.consultarLibro();
                    break;

                case 6:
                    b.listadoDeLibros();
                    break;

                case 7:
                    System.out.print("ID Usuario: ");
                    id = s.nextInt();
                    usuario = b.getUsuarios().get(id);
                    usuario.pedirLibro(b);
                    break;

                case 8:
                    System.out.print("ID Usuario: ");
                    id = s.nextInt();
                    usuario = b.getUsuarios().get(id);
                    usuario.devolverLibro(b);
                    break;

                case 9:
                    System.out.print("ID Usuario: ");
                    id = s.nextInt();
                    usuario = b.getUsuarios().get(id);
                    usuario.mostrarMisLibros();
                    break;

                case 10:
                    System.out.println("VUELVE PRONTO :)");
                    break;
            
                default:
                    System.out.println("OPCIÓN INVÉLIDA");
                    break;
            }

        }while(op != 10);


    }
}
