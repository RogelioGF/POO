package biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int librosPrestados;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, int ejemplares, int librosPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.librosPrestados = librosPrestados;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getLibrosPrestados() {
		return librosPrestados;
	}

	public void setLibrosPrestados(int librosPrestados) {
		this.librosPrestados = librosPrestados;
	}

	//método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (librosPrestados < ejemplares) {
        	librosPrestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (librosPrestados == 0) {
            devuelto = false;
        } else {
        	librosPrestados--;
        }
        return devuelto;
    }

	@Override
	public String toString() {
		return "Libro titulo= " + titulo + ", autor= " + autor + ", ejemplares= " + ejemplares + ", librosPrestados= "
				+ librosPrestados;
	}
	
	
}
