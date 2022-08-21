public class FizzBuzz {

    public static String game(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "fizz buzz";
        } else if(number % 3 == 0){
            return "fizz";
        // is the int is divisible by three return fizz
        } else if (number % 5 == 0) {
            return "buzz";
        }

        //return "hello";
        // we need this because if the number isn't divisible by three, what should the main method return

        //we are entering an integer (in the parameter) and expecting back a string
        // remember using tdd we are trying to solve a error, so we return fizz

        return String.valueOf(number);
        // this converts numbers into strings
        // this helps solve the game__4_returns_4 test

    }

}
