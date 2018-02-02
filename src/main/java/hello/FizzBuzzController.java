package hello;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class FizzBuzzController {
    @RequestMapping("/fizzbuzz/{upperBound}")
    public FizzBuzz fizzBuzz(
            // @RequestParm binds the value of the query string parameter upperBound into the upperBound parameter in FizzBuzz
            @PathVariable String upperBound) {
        try {
            Integer.valueOf(upperBound);
            return new FizzBuzz(upperBound);
            //return good request 200?
        }
         catch (NumberFormatException e)
         {
             // should i return new bad request 400?
             return new FizzBuzz("Invalid");
         }

    }
}