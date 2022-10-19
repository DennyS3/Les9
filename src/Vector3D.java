public class Vector3D extends Vector {
    private static final String TEXT = "Это вектор для трехмерной системы координат";

    public Vector3D(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о векторе: х = " + getX() + " у = " + getY() + " z = " + getZ() +" " + TEXT);
    }

    @Override
    public double loong() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()) + (getZ() * getZ()));
    }

    @Override
    public double scal(Vector vector) {
        return vector.getX() * getX() + vector.getY() * getY() + vector.getZ() * getZ();
    }

    @Override
    public Vector sumVec(Vector vector) {
        return new Vector3D(getX() + vector.getX(), getY() + vector.getY(), getZ() + vector.getZ());
    }

    @Override
    public Vector raznos(Vector vector) {
        return new Vector3D(vector.getX() - getX(), vector.getY() - getY(), vector.getZ() - getZ());
    }

    @Override
    public Vector[] masVec(int a) {
        Vector[] vector = new Vector3D[a];
        for (int i = 0; i < a; i++) {
            vector[i] = new Vector3D((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        return vector;
    }
}
