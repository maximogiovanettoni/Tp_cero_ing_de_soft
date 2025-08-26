public class Tijera extends Shape {
    @Override
    public Shape vs(Shape shape) {
        return shape.vs(this);
    }

    public Shape vs(Piedra piedra) {
        return piedra; // piedra gana
    }

    public Shape vs(Papel papel) {
        return this; // tijera gana
    }

    public Shape vs(Tijera tijera) {
        return this; // empate
    }
}