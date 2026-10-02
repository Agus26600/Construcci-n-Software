/**
 * identifica el arreglo de enteros y suma únicamente los valores positivos, omitiendo los negativos
 */
public class ProcesadorArreglo {

    /**
     * esta funcion suma únicamente los enteros positivos de un arreglo, omitiendo los negativos.
     *
     * @param datos arreglo de enteros a procesar (no debe ser null)
     * @return la suma total de los elementos positivos
     * @throws IllegalArgumentException si el arreglo proporcionado es null
     */
    public static int sumaDePositiv(int[] datos) {
        if (datos == null) {
             System.err.println("El arreglo de datos no puede ser null.");
             return 0;
        }

        int sumaTot = 0;
        for (int dato : datos) {
            if (dato < 0) {
                System.out.println("Valor negativo encontrado se omite el " + dato);
                continue;
            }
            sumaTot += dato;
        }
        return sumaTot;
    }

    /**
     * entrada del programa para verificar funcionamiento
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        int resultado = sumaDePositiv(datos);
        System.out.println("suma total: " + resultado);
    }
}