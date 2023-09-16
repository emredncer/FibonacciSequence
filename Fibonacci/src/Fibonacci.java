import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int limit;
        boolean errorCheck = true;//2den küçüük girdi aldığımda tekrar girdi istemesi için kullanacağım
        ArrayList<Integer> fibonacci = new ArrayList<>();//Seriyi tutacak arraylisti tanımladım.
        fibonacci.add(0);//serinin ilk ve
        fibonacci.add(1);//ikinci elemanını kendim ekledim (formülün çalışması için şart)

        Scanner input = new Scanner(System.in);

        while (errorCheck) {//en başta true olduğu için döngüye girilecek
            System.out.print("Enter how many elements you want the program to " +
                    "generate a fibonacci sequence: ");
            limit = input.nextInt();

            if (limit < 2) {
                System.out.println("At least two elements are required to define a sequence!");
                //errrorCheck hala true
            } else {
                for (int i = 2; i < limit; i++) {
                    int nextFib = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                    fibonacci.add(nextFib);//döngü döndükçe değeri yeni arrayliste ekleyecek.
                }

                System.out.print(fibonacci.size() + " elements of fibonacci sequence: " + fibonacci);
                errorCheck = false;//while döngüsünden çıkıldı.
            }
        }
    }
}
