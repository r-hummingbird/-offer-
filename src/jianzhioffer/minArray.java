package jianzhioffer;

public class minArray {
    public static int minArray(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i+1] < numbers[i]) return numbers[i+1];
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] numbers={3,4,5,1,2};
        int result=minArray(numbers);
        System.out.println(result);

    }
}
