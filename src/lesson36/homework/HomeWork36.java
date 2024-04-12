package lesson36.homework;

public class HomeWork36 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Luke", 12345);
        pb.add("Mark", 42135);
        pb.add("Mark", 90321);
        pb.add("Mark", 55311);

        System.out.println(pb.get("Luke"));
        System.out.println(pb.get("Mark"));
        System.out.println(pb.get("Bill"));
        System.out.println(pb);
    }
}
