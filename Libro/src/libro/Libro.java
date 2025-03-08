/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author j-and
 */

public class Libro {
    
    private String titulo;
    private String autor;
    private int totalejemplares;
    private int totalprestados;
    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.totalejemplares = 0;
        this.totalprestados = 0;
    }
    
    public Libro(String titulo, String autor, int totalejemplares, int totalprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalejemplares = totalejemplares;
        this.totalprestados = totalprestados;
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

    public int getTotalejemplares() {
        return totalejemplares;
    }

    public void setTotalejemplares(int totalejemplares) {
        this.totalejemplares = totalejemplares;
    }

    public int getTotalprestados() {
        return totalprestados;
    }

    public void setTotalprestados(int totalprestados) {
        this.totalprestados = totalprestados;
    }
    
    public boolean prestamo() {
        if (totalejemplares > totalprestados) {
            totalprestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (totalprestados > 0) {
            totalprestados--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro " + titulo + ", autor " + autor + 
               ", numero de ejemplares " + totalejemplares + ", numero de libros prestados=" + totalprestados;
    }
}