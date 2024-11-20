import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String correo;
    private String noId;
    private Libro librosPrestados[] = new Libro[3]; 
    private int lim = 0;

    Scanner s = new Scanner(System.in);

    Usuario(){

    }

    Usuario(String nombre, String correo, String noId){
        this.nombre = nombre;
        this.correo = correo;
        this.noId = noId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNoId() {
        return noId;
    }

    public void pedirLibro(Biblioteca b){

        boolean encontrado = false;

        System.out.println("\nPEDIR LIBRO");
        System.out.print("Titulo: ");
        String titulo = s.nextLine();
        System.out.print("Autor: ");
        String autor = s.nextLine();

        

        for(Libro l: b.getLibros()){

            System.out.println(l.getAutor());
            
            if(titulo.equals(l.getTitulo()) && autor.equals(l.getAutor()) && l.getEstado()==true){
                encontrado = true;

                if(lim < 3){
                    l.setEstado(false);
                    librosPrestados[lim] = l;
                    lim++;
                }else{
                    System.out.println("LÍMITE DE LIBRO ALCANZADO :(");
                }

                break;
            }
        }

        if(!encontrado){
            System.out.println("LIBRO NO ENCONTRADO O NO DISPONIBLE :(");
        }
    }

    public void devolverLibro(Biblioteca b){

        boolean borrado = false;

        System.out.println("\nDEVOLVER LIBRO");

        for(Libro l: b.getLibros()){
            System.out.println("* " + l.getTitulo() + " / " + l.getAutor());
        }

        System.out.print("Título a devolver: ");
        String title = s.nextLine();

        for(Libro l: b.getLibros()){
            if(title.equals(l.getTitulo())){
                b.getLibros().remove(l);
                borrado = true;
                l.setEstado(true);
            }
        }        

        if(!borrado){
            System.out.println("TÍTULO NO ENCONTRADO");
        }else{
            System.out.println("LIBRO ELIMINADO CORRECTAMENTE");
        }
    }

    public void mostrarMisLibros(){

        for(int i=0 ; i<3 ; i++){
            System.out.print("ISBN: " + librosPrestados[i].getISBN() + "\n");
            System.out.print("Titulo: " + librosPrestados[i].getTitulo() + "\n");
            System.out.print("Autor: " + librosPrestados[i].getAutor() + "\n");
            System.out.print("Género: " + librosPrestados[i].getGenero() + "\n");

            System.out.println("\n");
        }
    }
}
