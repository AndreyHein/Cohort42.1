package lesson3;
/**
 * AIT-TR, cohort 42.1, Java Basic, hm#3
 * @author Andrey Hein
 * @version 21-Jan
 */
public class HomeWork3 {
    public static void main(String[] args) {

        //Task # 1

        int a = 0,b = 1,c = 2,d = 3,e = 4,f = 5,g = 6,h = 7,i = 8,j = 9;
        int Summe = (a+b+c+d+e+f+g+h+i+j) / 10;
        double AverageSumme = (double) (a+b+c+d+e+f+g+h+i+j) / 10;
        System.out.println(" Result = " + Summe);        // "Summe" is not average, because "Summe" is Typ int
        System.out.println("Average = " + AverageSumme); // Result is average, because all variables are Typ double

        //Task #2

        int PriceA = 1000, PriceB = 500;
        int Sum = PriceA + PriceB;
        int Discount = Sum / 100 * 10;
        int DiscountPrice = Sum - Discount;
        System.out.println("Amount with discount = " + DiscountPrice + " Euro");
        System.out.println("Discount = " + Discount + " Euro");

        // Task #3

        int Mon = 2 , Tue = 1 , Wed = -1 , Thu = 1 , Fri = 3 , Sat = 2 , Sun = 4;
        int AverageTemp = (Mon + Tue + Wed + Thu + Fri + Sat + Sun) / 7;
        System.out.println("The average temperature for the last week is " + AverageTemp + " degrees Celcius");

        // Task #4

        //When divided by 2, the remainder of the division will be 0 or 1
        //When divided by 3, the remainder of the division will 0, 1 or 2
        for (int y = 1; y < 22; y++) {
            int z = y % 2;
            int r = y % 3;
            System.out.println("The remainder of division " + y + " by 2 will be : " + z);
            System.out.println("The remainder of division " + y + " by 3 will be : " + r);
            }

        // Task #5

        int x = 3;
        x += x++;
        System.out.println("x += x++  result is  " + x);  //Result is 6, although it should be 7
    }

}
