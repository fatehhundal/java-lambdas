import java.util.Arrays;
import java.util.List;

public class nameArrays {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Priya", "John", "Vidya", "Anu"};

        String searchName = "Vidya";

        List<String> nameList = Arrays.asList(names);

        nameList.forEach(name -> {
            if (name.equals(searchName)) {
                System.out.println("Name found: " + name);
            }
        });
    }
}

//import java.util.ArrayList;

//public class nameArrays {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList();
//        names.add("Ravi");
//        names.add("Priya");
//        names.add("John");
//        names.add("Vidya");
//        names.add("Anu");
//        System.out.println(names);
//        names.forEach(n -> { if (n == "Vidya") System.out.println("Name found: " + n); });
//    }
//}