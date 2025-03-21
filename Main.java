public class Main {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        int totalInversionOfArray = countInversion(arr);
        System.out.println("The total Inversion of using normal method given Array is " + totalInversionOfArray);

        int totalInversionMergeSort = countInversionMergeSort(arr);
        System.out.println(
                "The total Inversion of using Merge Sort method for given Array is " + totalInversionMergeSort);
    }
    
    public static int countInversionMergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }
    
    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int inversions = 0;
        if (left < right) {

            int mid = (left + right) / 2;

            inversions += mergeSortAndCount(arr, temp, left, mid);
            inversions += mergeSortAndCount(arr, temp, mid + 1, right);

            inversions += mergeAndCount(arr, temp, left, mid, right);
        }
        return inversions;
    }
    
    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        int inversions = 0;

        // Merge garni two halfs ma and count inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1); 
            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }


        System.arraycopy(temp, left, arr, left, right - left + 1);

        return inversions;
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