package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{

    private static SalaDeJuntasB uniqueInstance;

    private SalaDeJuntasB(){}

    public static SalaDeJuntasB getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasB();
        return uniqueInstance;
    }

    @Override
    public String getNombre() {
        return "Sala B";
    }
}
