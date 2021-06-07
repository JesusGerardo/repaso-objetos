package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas{

    private static SalaDeJuntasA uniqueInstance;

    private SalaDeJuntasA(){}

    public static SalaDeJuntasA getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasA();
        return uniqueInstance;
    }

    @Override
    public String getNombre() {
        return "Sala A";
    }
}
