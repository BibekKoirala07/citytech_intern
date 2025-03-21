public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int totalInversionOfArray = countInversion(arr);
        System.out.println("The total Inversion of given Array is " + totalInversionOfArray);
    }
    
    public static int countInversion(int[] arr) {
        int[] temp = arr;
        int count = 0;

        for (int i = 0; i < temp.length; i++) {

            for (int j = i + 1; j < temp.length; j++) {

                if (temp[i] > temp[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}