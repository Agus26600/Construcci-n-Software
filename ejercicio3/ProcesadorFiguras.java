/**
 * clase abstracta que representa una figura geométrica común (en general)
 */
abstract class Figura {
    /**
     * calcula el área de la figura geométrica
     * @return el área calculada
     */
    public abstract double calcularArea();
    /**
     * retorna el nombre representativo de la figura.
     * @return nombre de la figura
     */
    public abstract String getNombre();
}

class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    /**
     * crea un rectángulo con la base y altura especificadas.
     * @param base dimensión de la base (mayor a 0)
     * @param altura dimensión de la altura (mayor a 0)
     */
    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("las dimensiones deben ser mayores a cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String getNombre() {
        return "Rectángulo";
    }
}

class Triangulo extends Figura {
    private final double base;
    private final double altura;
    /**
     * crea un triángulo con la base y altura especificadas.
     * @param base dimensión de la base (mayor a 0)
     * @param altura dimensión de la altura (mayor a 0)
     */
    public Triangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("las dimensiones deben ser mayores a cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getNombre() {
        return "Triángulo";
    }
}

/**
 * procesador de figuras geométricas, lee la informacion requerida y calcula el área de la figura
 */
public class ProcesadorFiguras {
    /**
     * imprime el área de cualquier figura geométrica
     * @param figura la figura a procesar (no debe ser null)
     */
    public void imprimirArea(Figura figura) {
        if (figura == null) {
            throw new IllegalArgumentException("error, la figura no puede ser null");
        }
        System.out.println("Área del " + figura.getNombre() + ": " + figura.calcularArea());
    }
    /**
     * punto de entrada del programa para probar la jerarquía de figuras.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        ProcesadorFiguras procesador = new ProcesadorFiguras();

        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(4, 5);

        procesador.imprimirArea(rectangulo);
        procesador.imprimirArea(triangulo);
    }
}