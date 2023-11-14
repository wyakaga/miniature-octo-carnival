1. bukan
2. ```java
    int angka = 7;
    ```
3. ```java
    System.out.println("Hello, world!");
    ```
4. ```java
    for (int i = 1; i <= 29; i++) {
      System.out.println(i);
    }
    ```
5. 0
6. ```java
    import java.time.LocalDate;
    public class main {
      public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        String name = "budi";

        for (int i = 1; i <= 100; i++) {
          if (i % day == 0) {
            System.out.println(name);
          } else {
            System.out.println(i);
          }
        }
      }
    }
    ```
7. ```java
    public class main {
      public static void main(String[] args) {
        System.out.println("Hello, world!");
      }

      public void shout() {
        System.out.println("Hello!");
      }
    }
    ```
8. ```java
    public class main {
      public static void main(String[] args) {
        System.out.println("Hello, world!");
        shout();
      }

      public void shout() {
        System.out.println("Hello!");
      }
    }
    ```