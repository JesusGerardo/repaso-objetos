package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado = -1;
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
        if(lado == -1)
            throw new LadoNoProvistoException();

        return lado * lado;
    }

    public String getName(){
        return "Cuadrado";
    }
}
