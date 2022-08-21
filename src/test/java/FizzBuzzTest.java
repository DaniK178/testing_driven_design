
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    // function called game()
    // that function will take in an input (int)

    // return "fizz" if multiple of 3
    // return "buzz" if multiple of 5
    // return "fizz buzz" if multiple of both
    // return input as a string otherwise


    @Test
    public void game__3_returns_fizz(){
        //we are trying to see of we get fizz when we pass in the funciton
        assertThat(FizzBuzz.game(3)).isEqualTo("fizz");
        // when you are passing in the information into the parameter it becomes and argument

    }

    @Test
    public void game__9_returns_fizz(){
        assertThat(FizzBuzz.game(9)).isEqualTo("fizz");
    }

    @Test
    public void game__5_returns_buzz(){
        assertThat(FizzBuzz.game(5)).isEqualTo("buzz");
    }

    @Test
    public void game__10_returns_buzz() {
        assertThat(FizzBuzz.game(10)).isEqualTo("buzz");
    }

    @Test
    public void game__15_returns_fizzbuzz() {
        assertThat(FizzBuzz.game(15)).isEqualTo("fizz buzz");
    }

    @Test
    public void game__30_returns_fizzbuzz() {
        assertThat(FizzBuzz.game(30)).isEqualTo("fizz buzz");
    }
   // we do two tests for each to make sure the tests really work

    @Test
    public void game__4_returns_4() {
        assertThat(FizzBuzz.game(4)).isEqualTo("4");
    }
    // we want this is for if the number isn't divisible by or 3 or 5
    // the number comes back as a string
    // we want to keep it the same for the method. everything in the method should recieve numbers and return strings
    // if you want more data types returned, it is best to make another methods for the best architecture

    }

