/*  

 Este programa ejemplifica
 un TDA (Tipo Dato Abstracto) 

 ¿Que hace el programa?

Por medio de una pila, la cual es
revisada o recorrida por un ciclo
muestra una cadena de texto con todos
los nombres que son agregados a la pila
 
*/

import java.util.Stack;

public class TDA{
    /*
     Esta clase se encargara de
     concatenar nombres de usuario
     */

     public static void main(String[] args){
        /*
         Stack<String> almacena una coleccion
         de elementos de tipo cadena (String)
         */
        Stack<String> nombre_pila = new Stack<>();

        nombre_pila.push("Salvador");
        nombre_pila.push("Pepito");
        nombre_pila.push("Estefany");

        // Concatenacion (de los elementos en la pila, en este caso nombres)
        StringBuilder desplegar_msg = new StringBuilder(
            "Estos son los nombres en la pila: ");
        /*
         StringBuilder:

         Clase en java que se utiliza para construir
         y manipular cadenas de caracteres de manera
         eficiente, con la diferencia y ventaja de 
         los Strings normales, de que son mutables
         osea, se pueden modificar sin crear objetos
         nuevos.
        */
        
        while (!nombre_pila.isEmpty()){
            // Mientras NO este VACIA
            // Operador de negacion logica !
            desplegar_msg.append(nombre_pila.pop());

            // Separador (de nombres, hasta que no sea el ultimo)
            if (!nombre_pila.isEmpty()){
                desplegar_msg.append(", ");
            }
        }

        System.out.println(desplegar_msg.toString());
     }

}