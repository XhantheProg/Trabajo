public class Main {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Main calculadora = new Main();

        int sumaEnteros2 = calculadora.sumar(5, 7);
        int sumaEnteros3 = calculadora.sumar(2, 4, 6);
        double sumaDoubles2 = calculadora.sumar(3.5, 2.7);
        double sumaDoubles3 = calculadora.sumar(1.2, 2.2, 3.2);

        System.out.println("Suma de enteros (2 valores): " + sumaEnteros2);
        System.out.println("Suma de enteros (3 valores): " + sumaEnteros3);
        System.out.println("Suma de doubles (2 valores): " + sumaDoubles2);
        System.out.println("Suma de doubles (3 valores): " + sumaDoubles3);
    }
}
