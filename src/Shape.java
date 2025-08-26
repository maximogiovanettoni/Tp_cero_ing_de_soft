public abstract class Shape {
    public abstract Shape vs(Shape shape);
    // Métodos para sobrecarga: por defecto, devuelve this para evitar loop
    public Shape vs(Piedra piedra) { return this; }
    public Shape vs(Papel papel) { return this; }
    public Shape vs(Tijera tijera) { return this; }
}