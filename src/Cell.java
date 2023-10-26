public class Cell {
    private int x;
    private int y;

    private boolean liv;

    private int color;



    public Cell(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
