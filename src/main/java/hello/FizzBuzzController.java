package hello;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class FizzBuzzController {
    @RequestMapping("/fizzbuzz")
    public FizzBuzz fizzBuzz(
            // @RequestParm binds the value of the query string parameter upperBound into the upperBound parameter in FizzBuzz
            @RequestParam(value="upperBound", defaultValue="No parameter value given") String upperBound) {
        try {
            Integer.valueOf(upperBound);
            return new FizzBuzz(upperBound);
        }
         catch (NumberFormatException e)
         {
             return new FizzBuzz("Invalid");
         }

    }
}