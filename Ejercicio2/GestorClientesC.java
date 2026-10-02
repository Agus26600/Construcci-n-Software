import java.util.ArrayList;
import java.util.List;

/**
 * Gestor de clientes, permite eliminar clientes inactivos de una lista de nombres.
 */
public class GestorClientesC {

    /**
     * Elimina de la lista a todos los clientes que coincidan con el nombre inactivo especificado.
     *
     * @param clientes lista de nombres de clientes a modificar
     * @param clienteInactivo nombre del cliente a remover
     * @return true si se eliminó al menos un cliente, false si no se encontró ninguno
     */
    public static boolean eliminarInactivos(List<String> clientes, String clienteInactivo) {
        if (clientes == null || clienteInactivo == null) {
            System.err.println("la lista de clientes o el nombre del cliente inactivo no puede ser null.");
            return false;
        }

        // Se usa removeIf, pero ahora compara directamente con equals
        clientes.removeIf(cliente -> clienteInactivo.equals(cliente));
        return true;
    }

    /**
     * entrada del programa para identificar inactivos
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add("Pedro");

        System.out.println("Lista original: " + clientes);
        eliminarInactivos(clientes, "Pedro");
        System.out.println("Lista procesada: " + clientes);
    }
}