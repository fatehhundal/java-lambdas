import java.util.ArrayList;

class animalArrays {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("========== Printing Current Array ==========");
        System.out.println(animals);
        animals.clear();
        System.out.println("========== Printing Cleared Array ==========");
        System.out.println(animals);
        if (animals.isEmpty()) {
            System.out.println("This array is empty.");
        }
        else {
            System.out.println("This array is not empty.");
        }
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("Array size: " + animals.size());
        System.out.println("More elements added: " + animals.add("Cat"));
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
    }
}