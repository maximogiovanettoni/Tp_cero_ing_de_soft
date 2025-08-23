public class Papel {

    public Papel() {}

    public Papel vs(Piedra piedra) {
        return this;
    }

    public Tijera vs(Tijera tijera) {
        return tijera;
    }

    public Papel vs(Papel papel) {return papel;}
}

