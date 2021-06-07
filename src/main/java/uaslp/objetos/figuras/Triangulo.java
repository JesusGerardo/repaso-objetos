package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base = -1;
    private double altura = -1;

    public Triangulo(){

    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea(){
        if(base == -1)
            throw new BaseNoProvistaException();
        else if(altura == -1)
            throw new AlturaNoProvistaException();

        return (base*altura)/2;
    }

    public String getDescription() {
        return "Cualquier triangulo";
    }

    public String getName(){
        return "Triangulo";
    }

}
