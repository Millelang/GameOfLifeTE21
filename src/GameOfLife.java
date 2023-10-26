public class GameOfLife extends Engine {
    Engine e;

    public GameOfLife(int w, int h, int scale) {
        super(w, h, scale);
    }

    public void update() {
        Cell cell[][] = new Cell[100][100];
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y< 100; y++) {
                cell[x][y] = new Cell(x,y,0xFFFFFF);
                drawPixel (cell[x][y].getX(),cell[x][y].getY(),cell[x][y].getColor());
            }

        }
    }
}