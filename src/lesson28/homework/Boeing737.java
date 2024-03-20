package lesson28.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 28
 * @author Andrey Hein
 * @version 20-Mar-2024
 */
public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    // Static nested classes
    public static class Drawing {

        private int id;

        public Drawing(int id) {
            this.id = id;
        }

        public static int getPassengersCount() {
            return maxPassengersCount;
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }

        public static void main(String[] args) {

            for (int i = 0; i < 6; i++) {
                Boeing737.Drawing drawing = new Boeing737.Drawing(i);
                System.out.println(drawing);
            }
        }
    }
}
