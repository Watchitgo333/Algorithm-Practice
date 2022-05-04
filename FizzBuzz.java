public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz();
        
    }
//Divisibles by 3 and 5
    public static void fizzBuzz() {
        for(int i = 1; i < 101; i ++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
