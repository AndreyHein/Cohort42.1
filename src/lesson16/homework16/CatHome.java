package lesson16.homework16;

public class CatHome {
    private String name;
    private String color;
    private int age;
    private int volume;

public CatHome(String name, String color, int age, int volume) {
    this.name = name;
    this.color = color;
    this.age = age;
    this.volume = volume;
}

public void printCat() {
    System.out.println(name + ", " + color + ", " + age + " years");
}

public int getVolume() {
    return volume;
}

}
