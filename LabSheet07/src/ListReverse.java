import java.util.ArrayList;

public class ListReverse {

    public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {

        for (int i = 0; i < original.size() / 2; i++) {

            int temp = original.get(i);
            original.set(i, original.get(original.size() - 1 - i));
            original.set(original.size() - 1 - i, temp);
        }

        return original;
    }

    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<Integer>();

        for (int i = 11; i <= 20; i++) {
            original.add(i);
        }

        System.out.println("Original Sequence: " + original);

        ArrayList<Integer> result = reverseList(original);

        System.out.println("Reverse  Sequence: " + result);
    }
}