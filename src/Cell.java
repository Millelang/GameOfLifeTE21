public class Cell {
    private int x;
    private int y;
    private boolean liv;



    public Cell(int x, int y, boolean liv) {
        this.x = x;
        this.y = y;
        this.liv = liv;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLiv(boolean liv) {
        this.liv = liv;
    }
}
