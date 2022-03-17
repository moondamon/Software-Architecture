package lsp;

// import com.solid.lsp.Quadrilateral;

public class Square implements Quadrilateral {
    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}