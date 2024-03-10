package lesson23;

import lesson22.TriangleRectangle;

public class Lesson23 {
    public static void main(String[] args) {
        Lesson23 lesson23 = new Lesson23();
        // toString()
        System.out.println(lesson23);
        // hashCode
        System.out.println(Integer.toHexString(lesson23.hashCode()));
        // getClass
        System.out.println(lesson23.getClass().getSimpleName());
        // equals
        lesson23.equals(lesson23);
        String s1 = "qwerty";
        String s2 = "qwerty";
        String s3 = "qwert";
        s2 = s3 +"y";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);

        TriangleRectangle tr1 = new TriangleRectangle();
        TriangleRectangle tr2 = new TriangleRectangle();
        System.out.println("Triangles: " + tr1.equals(tr2));

        // notify, notifyAll, wait - multithreading
    }

    @Override
    public String toString() {
        return "Lesson23{}";
    }
}
