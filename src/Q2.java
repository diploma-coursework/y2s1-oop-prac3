public class Q2 {
    public static void main(String[] args) {
        int[] list = { 1, -2, 4, 5, 10, 200, -32, -22 };
        int smallestIntIndex = 0;

        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[smallestIntIndex]) smallestIntIndex = i;
        }

        System.out.printf("The index of the min is %d which the value is %d", smallestIntIndex, list[smallestIntIndex]);
    }
}
