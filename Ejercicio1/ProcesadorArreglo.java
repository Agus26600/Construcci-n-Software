/**
 * identifica el arreglo de enteros y suma únicamente los valores positivos, omitiendo los negativos
 */
public class ProcesadorArreglo {

    /**
     * esta funcion suma únicamente los enteros positivos de un arreglo, omitiendo los negativos.
     *
     * @param datos arreglo de enteros a procesar 
     * @return la suma total de los elementos positivos
     */
    public static int sumaDePositiv(int[] datos) {
        // valida primero si el arreglo es nulo
        if (datos == null) {
             System.err.println("el arreglo de datos es nulo");
             return 0;
        }

        int sumaTot = 0;
        for (int dato : datos) {
            if (dato < 0) {
                System.out.println("valor negativo encontrado se omite el " + dato);
                continue;
            }
            sumaTot += dato;
        }
        return sumaTot;
    }

    /**
     * entrada del programa para verificar funcionamiento
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        int resultado = sumaDePositiv(datos);
        System.out.println("suma total: " + resultado);
    }
}