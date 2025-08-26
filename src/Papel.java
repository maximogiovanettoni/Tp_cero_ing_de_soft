public class Papel extends Shape {

    public Papel() {}

    @Override
    public Shape vs(Shape shape) {
        return shape.vs(this);
    }

    public Shape vs(Piedra piedra) {
        return this;
    }

    public Shape vs(Tijera tijera) {
        return tijera;
    }

    public Shape vs(Papel papel) {
        return papel;
    }
}