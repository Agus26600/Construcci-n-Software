//ANALISIS
import java.util.ArrayList;
import java.util.List;

//codigo sin documentar
public class GestorClientes {

    //no hay javadoc
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        //error, no se valida si la lista de clientes es null antes de que se itere sobre ella
        //error,usa un for-each e intenta modificar la lista, pero java no permite modificar una lista 
        //durante la iteración usando for-each
        for (String cliente : clientes) {
            //error, al usar == compara si ambas referencias de memoria están en la misma ubicacion, 
            // no compara el contenido de las cadenas
            //para new String("Pedro") la comparación == devolverá false aunque el texto sea igual
            if (cliente == inactivo) {
                clientes.remove(cliente);
            }
        }
    }

    //sin javadoc en el main.
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        //el new String("Pedro") es innecesario, ya que el literal "Pedro" ya es un objeto String válido,
        //esto solo deja peor el error en la comparación ==, porque será un objeto distinto en memoria aunque el contenido sea igual
        clientes.add(new String("Pedro"));

        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}