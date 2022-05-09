import java.util.Random;
// import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {

    Random randMachine = new Random();

    PuzzleJava appTest = new PuzzleJava();

    ArrayList<Integer> rollsArray = new ArrayList<Integer>();
    ArrayList<Object> randomShuffle = new ArrayList<Object>();
    int size = 3;
    for (int i = 0; i <= size; i ++) {
        randomShuffle.add(i);
    }
    
    System.out.println(appTest.getTenRolls(randMachine, rollsArray));
    System.out.println(appTest.getRandomLetter(randMachine));
    System.out.println(appTest.generatePassword(randMachine));
    System.out.println(appTest.getNewPasswordSet(randMachine, 4));
    //This is the work in progress method to shuffle array.
    // System.out.println(appTest.shuffleArray(randMachine, randomShuffle, 4));


    }


}
