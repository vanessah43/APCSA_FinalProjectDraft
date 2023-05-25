public class Rack {
    private int rows;
    private int cols;
    private GridSpace[][] grid;

    public Rack() {
        rows = 6;
        cols = 7;
        grid = new GridSpace[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = new GridSpace();
            }
        }
    }

    public void insertPiece(int col, Player p) {
        for (int r = grid.length - 1; r >= 0; r++) {
            if (grid[r][col].isEmpty()) {
                grid[r][col].occupy(p);
                break;
            }
        }
    }

    public void display() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c].getCharacter());
            }
            System.out.println();
        }
    }
}
