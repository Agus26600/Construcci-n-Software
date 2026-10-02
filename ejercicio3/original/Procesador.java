package original;
//sin documentar
//tiene errores de encapsulamiento, las variables base y altura son públicas.
//Figura debería ser una clase abstracta o interfaz, ya que no representa una figura concreta, 
// al ser public igual provoca un error directamente al compilar
/*public */class Figura {
    public double base;
    public double altura;

    //error, la fórmula que está usando da a entender que toda figura es un rectángulo, pero puede ser otra figura
    public double calcularArea() {
        return base * altura;
    }
}

//sin documentar
/*public*/ class Triangulo extends Figura {
    //falta la anotación @Override, ya que triangulo hereda de figura pero sobreescribe calcularArea
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

//sin Javadoc
//nombre algo ambiguo
public class Procesador {

    //error de estructura, pues cada vez que se quiera agregar un nuevo tipo de figura se tiene que modificar el 
    //método imprimirArea, lo forza a tener más bloques if/else, o instanceof
    //error, al usar instanceof y hacer casteo explícito destruye el polimorfismo, entonces si se añade una nueva figura
    // hay que modificar este método
    public void imprimirArea(Figura figura) {
        if (figura instanceof Triangulo) {
            Triangulo t = (Triangulo) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
            System.out.println("Área: " + figura.calcularArea());
        }
    }

    //sin Javadoc
    public static void main(String[] args) {
        //que es p? nombre ambiguo
        Procesador p = new Procesador();

        //error, se asigna directamente a los atributos, en lugar de usar constructores y getters/setters
        Figura rectangulo = new Figura();
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}