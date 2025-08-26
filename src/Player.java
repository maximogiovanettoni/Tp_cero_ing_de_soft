public class Player {
    private Shape move;
    public Player() {}

    public Shape getMove() {
        return this.move;
    }

    public void addMove(Shape move) {
        this.move = move;
    }
}
