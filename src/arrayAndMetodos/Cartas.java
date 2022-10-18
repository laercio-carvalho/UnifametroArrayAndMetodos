package arrayAndMetodos;

public class Cartas {
    private final String face;
    private final String naipe;

    public Cartas(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }
    public String descricao(){
        return face + " de " + naipe;
    }


}
