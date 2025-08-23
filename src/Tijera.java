public class Tijera {
    public Tijera() {}

    public Tijera vs(Papel papel) {
        return this;
    }

    public Piedra vs(Piedra piedra) {
        return piedra;
    }

    public Tijera vs(Tijera tijera) {
        return tijera;
    }
}
