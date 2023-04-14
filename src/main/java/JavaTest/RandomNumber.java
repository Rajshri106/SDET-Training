package JavaTest;

import java.util.Arrays;

public class RandomNumber {

    public void PrintRandomNumber() {
        int temp = 0;
        int[] randomNum = new int[100];
        for (int index = 0; index < 100; index++) {
            randomNum[index] = (int) Math.floor(Math.random() * (100 - index + 1) + index);
        }
        for (int index = 0; index < randomNum.length; index++) {
            for (int indexOuter = index + 1; indexOuter < randomNum.length; indexOuter++) {
                if (randomNum[index] < randomNum[indexOuter]) {
                    temp = randomNum[index];
                    randomNum[index] = randomNum[indexOuter];
                    randomNum[indexOuter] = temp;
                }
            }
        }
        System.out.println("Array sorted in descending order: " + Arrays.toString(randomNum));
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.PrintRandomNumber();
    }
}