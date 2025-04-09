
public class Main {

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = merge(arr1, arr2);
        int length = mergedArray.length;

        if (length % 2 == 0) {
            return (double) (mergedArray[length / 2] + mergedArray[length / 2 - 1]) / 2;
        } else {
            return (double) mergedArray[length / 2];
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                mergedArray[p3] = val1;
                p1++;
            } else {
                mergedArray[p3] = val2;
                p2++;
            }
            p3++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7};
        int[] arr2 = {3, 1, 8};

        System.out.println("Median of two sorted arrays is: " + findMedianSortedArrays(arr1, arr2));
    }
}
