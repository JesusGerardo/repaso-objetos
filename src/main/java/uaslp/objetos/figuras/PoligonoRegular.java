package uaslp.objetos.figuras;
import java.lang.Math;
public class PoligonoRegular implements Figura{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) {
        if(numeroDeLados < 5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");

        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        if(numeroDeLados < 5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");

        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double angulo = 360/numeroDeLados;
        double apotema = (lado/2)/Math.tan(Math.toRadians(angulo/2));
        return (lado*numeroDeLados*apotema)/2;
    }

    public double getLado() {
        return lado;
    }

    public String getName(){
        return "Poligono Regular";
    }
}
