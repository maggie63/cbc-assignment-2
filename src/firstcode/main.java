package firstcode;

public class main {
    public static void main(String[] args) {
        int[] boo = new int[]{0, 1, 2, 3, 4};
        int[] bar = new int[100];
        for (int i = 0; i <= 99; i++) {
            bar[i] = i;
        }
        System.out.println("The number of even numbers in boo is:");
        System.out.println(countEvenNum(boo, 5));
        System.out.println("The number of even numbers in bar is:");
        System.out.println(countEvenNum(bar, 100));
    }
    public static int countEvenNum(int[] arr, int size){
        int count = 0;
        for (int i : arr) {
            if(i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
