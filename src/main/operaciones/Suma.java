package main.operaciones;

public class Suma implements Operaciones{
    @Override
    public int calcular(int n1, int n2) {
        return n1+n2;
    }
}
