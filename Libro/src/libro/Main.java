/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;
import java.util.Scanner;
/**
 *
 * @author j-and
 */

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("la historia de mi vida", "jhoan andres serna", 10, 5);
        
        Libro libro2 = new Libro();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los datos del libro:");
        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
        
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        
        System.out.print("Número de ejemplares: ");
        libro2.setTotalejemplares(sc.nextInt());
        
        System.out.print("Número de ejemplares prestados: ");
        libro2.setTotalprestados(sc.nextInt());
        
        
        System.out.println("\n libro 1:");
        System.out.println(libro1.toString());
        
        System.out.println("\n libro 2:");
        System.out.println(libro2.toString());
        
        
        System.out.println("\n préstamo para libro1:");
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro correctamente");
        } else {
            System.out.println("No quedan ejemplares disponibles para prestar");
        }
        System.out.println("Ejemplares disponibles después del préstamo: " + libro1.getTotalprestados());
        
        
        System.out.println("\n devolución para libro1:");
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro correctamente");
        } else {
            System.out.println("No hay ejemplares prestados para devolver");
        }
        System.out.println("Ejemplares disponibles después del préstamo: " + libro1.getTotalprestados());
        
        
        System.out.println("\n devolución para libro2:");
        if (libro2.devolucion()) {
            System.out.println("Se ha devuelto el libro correctamente");
        } else {
            System.out.println("No hay ejemplares prestados para devolver");
        }
        System.out.println("Ejemplares disponibles después del préstamo: " + libro2.getTotalprestados());
        
        sc.close();
    }
}
