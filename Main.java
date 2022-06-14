import java.util.*;

class Main {
  public static void main(String[] args) {
        //Declare two sets Months1 and Months2 and populate them with the strings above.
        Set<String> months1 = new HashSet<>(Arrays.asList("Jan", "Feb", "March", "April", "May", "June"));
        System.out.println("Months One\n" + months1);
        Set<String> months2 = new HashSet<>(Arrays.asList("May", "June", "July", "August"));
        System.out.println("\nMonths Two\n" + months2);

        //Union months
        Set<String> unionMonths = new HashSet<>();
        unionMonths.addAll(months1);
        unionMonths.addAll(months2);
        System.out.println("\nUnion - Months\n" + unionMonths);
        //Intersection months
        months1.retainAll(months2);
        System.out.println("\nIntersection - Months\n" + months1);

        //  Remove May and June from set Months1 and determine the Union  and Intersection of the new sets.
        if (months1.remove("May")) {
            System.out.println("\nMay is removed");
        }
        if (months1.remove("June")) {
            System.out.println("June is removed");
        }
        unionMonths.addAll(months1);
        unionMonths.addAll(months2);
        System.out.println("\nUnion - Months after May and June removed\n" + unionMonths);

        //  Write code to check to see if the intersection is an empty set and determine the size of the resulting Union set.

        if (months1.retainAll(months2)){
            System.out.println("\nThe intersection is not empty");
        }
        else
            System.out.println("\nThe intersection is empty");


        months1.retainAll(months2);
        System.out.println("Intersection - Size after May and June removed is: " + months1.size());

  }
}