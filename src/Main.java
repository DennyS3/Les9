import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector vector2 = new Vector2D(2, 5);
        vector2.getInfo();
        System.out.println("длинна вектора 2D= " + vector2.loong());
        System.out.println("сложение векторов 2D = "+ vector2.sumVec(new Vector2D(2,6)));
        System.out.println("разность векторов 2D = "+ vector2.sumVec(new Vector2D(2,6)));
        System.out.println("скалярное произведение 2D= " + vector2.scal(new Vector2D(2,6)));
        System.out.println(Arrays.toString(vector2.masVec(2)));
        Vector vector3 = new Vector3D(4,4,4);
        vector3.getInfo();
        System.out.println("длинна вектора 3D= " + vector3.loong());
        System.out.println("сложение векторов 3D = "+ vector3.sumVec(new Vector3D(2,6, 6)));
        System.out.println("разность векторов 3D = "+ vector3.sumVec(new Vector3D(2,6, 6)));
        System.out.println("скалярное произведение 3D= " + vector3.scal(new Vector3D(2,6, 6)));
        System.out.println(Arrays.toString(vector2.masVec(2)));
    }

}
    /*




        Каждый из классов должен иметь константу, содержащею описание
        вектора.
        Например, "Это вектор для двумерной системы координат".
        Эта константа так же должна выводиться в методе для вывода
        информации о векторе.*/