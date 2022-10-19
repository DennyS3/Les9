public class Vector2D extends Vector {
    private static final String TEXT = "Это вектор для двумерной системы координат";

    public Vector2D(int x, int y) {
        super(x, y);
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о векторе: х = " + getX() + " у = " + getY() + " " + TEXT);
    }

    @Override
    public double loong() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()));
    }

    @Override
    public double scal(Vector vector) {
        return vector.getX() * getX() + vector.getY() * getY();
    }

    @Override
    public Vector sumVec(Vector vector) {
        return new Vector2D(getX() + vector.getX(), getY() + vector.getY());
    }

    @Override
    public Vector raznos(Vector vector) {
        return new Vector2D(vector.getX() - getX(), vector.getY() - getY());
    }

    @Override
    public Vector[] masVec(int a) {
        Vector[] vector = new Vector2D[a];
        for (int i = 0; i < a; i++) {
         vector[i] = new Vector2D((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        return vector;
    }


}
