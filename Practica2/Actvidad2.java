//Ingresar blibliotecas
import java.util.Scanner;
import java.util.ArrayList;


// Iniciar la clase
public class Actvidad2{
    public static void main(String[] args){
        //Parte I
        System.out.println("Actividad 2 Parte I: ");
        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("luis");
        nombres.add("felipe");
        nombres.add("juan");
        nombres.add("francisco");
        nombres.add("maria");
        nombres.add("renee");
        nombres.add("fernanda");
        //INGRESAR NOMBRE
        Scanner ingreso = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingresa tu nombre: ");
        String nombre_inp = ingreso.nextLine();  // Read user input
        String nombre = nombre_inp.toLowerCase();
        System.out.println("Hola " + nombre);  // Output user input
        if (nombres.contains(nombre)){
           System.out.println("Tu nombre ya esta en la lista");
        } else{
            System.out.println("Felicidades, el nombre " + nombre + " no se encuntra en el registro");
                    }
        // PARTE II
        System.out.println("Actividad 2 Parte II: ");
        //Definir numero inicial del contador
        int contador = 2;
        //Definir lista
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(contador);
        //Bucle
        while (contador<101){
            contador++;
            if (contador%2==0){
                numeros.add (contador);
            }
            else{
                
            }
            
        }
        //Mostrar lista
        System.out.println(numeros);                 

        }
    }