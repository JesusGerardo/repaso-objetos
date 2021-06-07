package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado;
    public Cuadrado(){
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public String getName(){
        return "Cuadrado";
    }
}
