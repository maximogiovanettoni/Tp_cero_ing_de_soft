
public class Piedra extends Shape {
    @Override
    public Shape vs(Shape shape) {
        return shape.vs(this);
    }

    // Métodos concretos, NO llaman a vs()
    public Shape vs(Piedra piedra) {
        return this; // empate
    }

    public Shape vs(Papel papel) {
        return papel; // papel gana
    }

    public Shape vs(Tijera tijera) {
        return this; // piedra gana
    }
}

