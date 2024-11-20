import java.util.Scanner;
import java.util.Vector;

public class Biblioteca {

    Scanner s = new Scanner(System.in);
    private Vector<Libro> libros = new Vector<>(1,1);
    Vector<Usuario> usuarios = new Vector<>(1,1);

    Biblioteca(){
    }

    public Vector<Libro> getLibros() {
        return libros;
    }

    public Vector<Usuario> getUsuarios() {
        return usuarios;
    }

    public void añairLibro(){

        System.out.println("\nAÑADIR LIBRO");
        System.out.print("Titulo: ");
        String titulo = s.nextLine();
        System.out.print("Autor: ");
        String autor = s.nextLine();
        System.out.print("Genero: ");
        String genero = s.nextLine();
        System.out.print("ISBN: ");
        String ISBN = s.nextLine();

        Libro l = new Libro(titulo, autor, genero, ISBN, true);
        libros.add(l);

        System.out.println("LIBRO AGREGADO CON ÉXITO :)");
    }

    public void eliminarLibro(){

        boolean eliminado = false;

        System.out.println("\nELIMINAR LIBRO");
        System.out.print("ISBN: ");
        String ISBN = s.nextLine();

        for(Libro l: libros){
            if(ISBN.equals(l.getISBN())){
                libros.remove(l);
                eliminado = true;
            }
        }

        if(eliminado){
            System.out.print("LIBRO " + ISBN + " ELIMINADO :)");
        }else{
            System.out.print("LIBRO " + ISBN + " NO ENCONTRADO :()");
        }
    }

    public void registrarUsuario(){

        System.out.println("\nREGISTRAR USUARIO");
        System.out.print("Nombre: ");
        String nombre = s.nextLine();
        System.out.print("Correo: ");
        String correo = s.nextLine();
        System.out.print("Número de identificación: ");
        String noId = s.nextLine();

        Usuario u = new Usuario(nombre, correo, noId);

        usuarios.add(u);

    }

    public void consultarUsuario(){
        System.out.println("\nCONSULTAR USUARIO");
        System.out.print("Número de identificación: ");
        String noId = s.nextLine();

        boolean encontrado = false;

        for(Usuario u: usuarios){
            if(noId.equals(u.getNoId())){
                System.out.print("Número de identificación: " + u.getNoId() + "\n");
                System.out.print("Nombre: " + u.getNombre() + "\n");
                System.out.print("Correo: " + u.getNombre() + "\n");

                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.print("USUARIO " + noId + " NO ECNOTRADO :()");
        }
    }

    public void consultarLibro(){

        System.out.println("\nCONSULTAR LIBRO");
        System.out.print("ISBN: ");
        String ISBN = s.nextLine();

        boolean encontrado = false;

        for(Libro l: libros){
            if(ISBN.equals(l.getISBN())){
                System.out.print("ISBN: " + l.getISBN() + "\n");
                System.out.print("Titulo: " + l.getTitulo() + "\n");
                System.out.print("Autor: " + l.getAutor() + "\n");
                System.out.print("Género: " + l.getGenero() + "\n");

                if(l.getEstado()){
                    System.out.print("Estado: DISPONIBLE :)\n\n");
                }else{
                    System.out.print("Estado: NO DISPONIBLE :(\n\n");
                }

                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.print("LIBRO " + ISBN + " NO ECNOTRADO :()");
        }

    }

    public void listadoDeLibros(){

        System.out.println("\nLISTADO DE LIBROS\n");

        for(Libro l: libros){

            System.out.print("ISBN: " + l.getISBN() + "\n");
            System.out.print("Titulo: " + l.getTitulo() + "\n");
            System.out.print("Autor: " + l.getAutor() + "\n");
            System.out.print("Género: " + l.getGenero() + "\n");

            if(l.getEstado()){
                System.out.print("Estado: DISPONIBLE :)\n\n");
            }else{
                System.out.print("Estado: NO DISPONIBLE :(\n\n");
            }
        
        }
    }

    
}
