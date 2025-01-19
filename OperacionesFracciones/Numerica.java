package OperacionesFracciones;

public abstract class Numerica {
    public abstract String toString();
    public abstract boolean equals(Object ob);
    public abstract Numerica sumar(Numerica numero);
    public abstract Numerica restar(Numerica numero);
    public abstract Numerica multiplicar(Numerica numero);
    public abstract Numerica dividir(Numerica numero);
}
