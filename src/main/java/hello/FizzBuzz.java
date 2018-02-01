package hello;

import java.util.*;
import java.util.stream.IntStream;

public class FizzBuzz {
    private final String upperBound;
    private final List<Integer> Fizz = new ArrayList<>();
    private final List<Integer> Buzz = new ArrayList<>();
    private final List<Integer> FizzBuzz = new ArrayList<>();

    public FizzBuzz(String upperBound) {
        this.upperBound = upperBound;
        calculateFizzBuzz();
    }

    public List<Integer> getFizzBuzz() {
        return FizzBuzz;
    }

    public List<Integer> getBuzz() {
        return Buzz;
    }

    public List<Integer> getFizz() {
        return Fizz;
    }

    public void calculateFizzBuzz(){
        // grab whole number range of 1 - content (content is our upperbound)
        IntStream.rangeClosed(1, Integer.parseInt(upperBound))
                .mapToObj(i -> i % 3 == 0 ?
                            (i % 5 == 0 ? FizzBuzz.add(i) : Fizz.add(i)) :
                            (i%5==0 ? Buzz.add(i) : i))
                .forEach(i -> System.out.print(i));
    }
}
