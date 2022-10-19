public abstract class Vector {
    private int x, y, z;

    public Vector(){}
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public abstract void getInfo();
    public abstract double loong();
    public abstract double scal(Vector vector);
    public abstract Vector sumVec(Vector vector);
    public abstract Vector raznos(Vector vector);

    public abstract Vector[] masVec(int a);


}
