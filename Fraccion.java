public class Fraccion extends Numerica {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private void simplificar() {
        int gcd = mcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
        if (denominador < 0) { 
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    private int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof Fraccion)) {
            return false;
        }
        Fraccion otra = (Fraccion) ob;
        return this.numerador == otra.numerador && this.denominador == otra.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El argumento debe ser de tipo Fraccion.");
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El argumento debe ser de tipo Fraccion.");
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.numerador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El argumento debe ser de tipo Fraccion.");
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            if (otra.numerador == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            int nuevoNumerador = this.numerador * otra.denominador;
            int nuevoDenominador = this.denominador * otra.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El argumento debe ser de tipo Fraccion.");
    }
}
