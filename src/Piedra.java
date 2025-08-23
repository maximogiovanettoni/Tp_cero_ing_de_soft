public class Piedra {

    public Piedra() {}

    public Piedra vs(Tijera tijera) {
        return this;
    }

    public Papel vs(Papel papel) {
        return papel;
    }

    public Piedra vs(Piedra piedra) {
        return piedra;
    }
}
