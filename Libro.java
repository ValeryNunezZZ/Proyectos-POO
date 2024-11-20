public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private boolean estado;

    Libro(){}

    Libro(String titulo, String autor, String genero, String ISBN, boolean estado){
        this.titulo = titulo;
        this.autor = autor;
        this. genero = genero;
        this.ISBN = ISBN;
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean getEstado() {
        return estado;
    }
}