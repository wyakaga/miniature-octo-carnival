import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("Hello, World!");
        app.biodata();
        int[] arr1 = new int[] { 2, 3, 4, 5 };
        int[] arr2 = new int[] { 1, 3, 5, 7 };
        app.findCommonNumbers(arr1, arr2);
        int[] numArr = new int[] { 3, 2, 4, 1, 5 };
        app.sorter(numArr);
        Integer[] numbers = { 163, 160, 172, 168, 170, 169, 166, 180 };
        app.finder(numbers, 100);
    }

    public void biodata() throws Exception {
        Scanner input = new Scanner(System.in);

        try {
            String firstName, lastName, birthPlace, birthYear, progrLangFav;

            System.out.println();
            System.out.println("Input your data");
            System.out.print("first name: ");
            firstName = input.nextLine();
            System.out.print("last name: ");
            lastName = input.nextLine();
            System.out.print("birth place: ");
            birthPlace = input.nextLine();
            System.out.print("birth year: ");
            birthYear = input.nextLine();
            System.out.print("your favourite programming language: ");
            progrLangFav = input.nextLine();
            System.out.println("first name : " + firstName);
            System.out.println("last name : " + lastName);
            System.out.println("birth place : " + birthPlace);
            System.out.println("birth year : " + birthYear);
            System.out.println("your favourite programming language : " + progrLangFav);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }

    public void findCommonNumbers(int arr1[], int arr2[]) throws Exception {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }

    public void sorter(int numArr[]) throws Exception {
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }

    public void finder(Integer[] numbers, int target) throws Exception {
        List<Integer> list = Arrays.asList(numbers);
        if (list.indexOf(target) < 0) {
            System.out.println("no such number");
        } else {
            System.out.println(list.indexOf(target));
        }
    }
}
