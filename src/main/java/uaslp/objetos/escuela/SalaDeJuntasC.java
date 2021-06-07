package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{

    private static SalaDeJuntasC uniqueInstance;

    private SalaDeJuntasC(){}

    public static SalaDeJuntasC getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasC();
        return uniqueInstance;
    }

    @Override
    public String getNombre() {
        return "Sala C";
    }
}
