import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJava {

    //Takes in a array list defined on TestPuzzle.java and a random number
    //The loop iterates 10 times adding 10 random numbers between 0 and 20 to
    //rollsArray
    public ArrayList<Integer> getTenRolls(Random randMachine, ArrayList<Integer>rollsArray) {
        for(int i = 1; i <= 10; i ++) {
            rollsArray.add(randMachine.nextInt(20));
        }
        return rollsArray;
    }

    //Takes in random utility char alphabet is set to a charArray, some tool i found on Stack
    //overflow and returns alphabet with a random index number displaying a character
    public char getRandomLetter(Random randMachine) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return alphabet[randMachine.nextInt(25)];
        
    }

    //Takes in random utility and takes the same alphabet char array from the above method,
    //The password variable and alphabet is passed through a loop which iterates 8 times,
    //password is concat with the alphabet where the character is converted to string and
    //randomly picks a letter via random method-- returns the 8 letter password
    public String generatePassword(Random randMachine) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String password = "";
        for(int i = 1; i <= 8; i ++) {
            password += Character.toString(alphabet[randMachine.nextInt(25)]);
        }
        return password;
    }

    //This method takes in random utility and a integer length for the array length 
    //defined on TestPuzzle.java. An ArrayList is defined an returned as passwordSet,
    //which is passed into a loop which iterates the amound given by the length argument,
    //and passwordSet adds a randomly generated string from generatePassword method which 
    //passes in random utility.
    public ArrayList<String> getNewPasswordSet(Random randMachine, int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 1; i <= length; i ++) {
            passwordSet.add(generatePassword(randMachine));
        }
        return passwordSet;
    }
    //This method is still a work in progress to shuffle an array randomly
    // public ArrayList<Object> shuffleArray(Random randMachine, ArrayList<Object>randomShuffle, int size) {
    //     Object temp = randomShuffle.get(randMachine.nextInt(size-1));
    //     Object other = randomShuffle.get(randMachine.nextInt(size-1));
    //     for(int i = 0; i <= size; i ++) {
    //         temp = randomShuffle.get(randMachine.nextInt(size-1));
    //         other = temp;
    //     }
    //     return other;
    // }

}