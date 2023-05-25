public class GridSpace {
    private boolean empty;
    private String character;

    public GridSpace() {
        empty = true;
        character = "⬜";
    }

    public boolean occupy(Player p1) {
        if (empty) {
            empty = false;
            character = p1.getSymbol();
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public String getCharacter() {
        return character;
    }
}
