public class Square extends Rectangle {

    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    public int getSideLength() {
        return getWidth();
    }

    public void setSideLength(int sideLength) {
        setWidth(sideLength);
        setHeight(sideLength);
    }

    public int calculateArea() {
        return getWidth() * getHeight();
    }
}
