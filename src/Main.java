import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Dizinin boyutu ve dizinin index değeri
        System.out.print("Dizi Boyutunu Giriniz : ");
        int indexArray = input.nextInt();

        int[] numbers = new int[indexArray];

        //dizi elemanlarını döngü ile kullanıcıdan alırız.
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for(int i=0; i < numbers.length; i++){
            System.out.print((i+1) + ". Elemanı Gir : ");
            numbers[i] = input.nextInt();
        }
        //Dizinin yazdırılması.
        System.out.println("Dizi : " + Arrays.toString(numbers));
        //küçükten büyüğe sıralanması
        Arrays.sort(numbers);
        //dizinin son hali
        System.out.println("Sıralaması : " + Arrays.toString(numbers));
    }
}
