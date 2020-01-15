package bm.app.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JokeService {

    //public static String joke(){
    //ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    //return chuckNorrisQuotes.getRandomQuote();

// }

    public String generateAJoke() {
        int a = (int) (Math.random() * 9) + 1;
        Map<Integer, String> jokesList = new HashMap<>();
        jokesList.put(1, "Chuck Norris can unit test entire applications with a single assert.");
        jokesList.put(2, "Chuck Norris can slam a revolving door.");
        jokesList.put(3, "Simply by pulling on both ends, Chuck Norris can stretch diamonds back into coal.");
        jokesList.put(4, "July 4th is Independence day. And the day Chuck Norris was born. Coincidence? I think not.");
        jokesList.put(5, "Aliens DO indeed exist. They just know better than to visit a planet that Chuck Norris is on.");
        jokesList.put(6, "What was going through the minds of all of Chuck Norris' victims before they died? His shoe.");
        jokesList.put(7, "Chuck Norris doesnt wear a watch, HE decides what time it is.");
        jokesList.put(8, "Chuck Norris invented black. In fact, he invented the entire spectrum of visible light. Except pink. Tom Cruise invented pink.");
        jokesList.put(9, "Chuck Norris's first program was kill -9.");
        jokesList.put(10, "Chuck Norris knows everything there is to know - Except for the definition of mercy.");

        return jokesList.get(a);

    }


}
