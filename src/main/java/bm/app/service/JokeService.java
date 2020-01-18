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
        int a = (int) (Math.random() * 39) + 1;
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
        jokesList.put(11, "Chuck Norris knows the value of NULL, and he can sort by it too.");
        jokesList.put(12,"Chuck Norris played Russian Roulette with a fully loaded gun and won.");
        jokesList.put(13, "How to learn any new programming concept? Change stuff and see what happens.");
        jokesList.put(14, "A programmer is someone who fixes a problem you don't know you have in a way you do not understand.");
        jokesList.put(15, "What is the object-oriented way to become wealthy? Inheritance.");
        jokesList.put(16, "Why did a programmer quit his job? He didn't get arrays.");
        jokesList.put(17, "Why do Java programmers have to wear glasses? Because they do not C#.");
        jokesList.put(18, "Real programmers count from 0.");
        jokesList.put(19, "I'd like to make the world a better place, but they won't give me the source code.");
        jokesList.put(20, "To be fair, being alive is kind of a joke in and of itself.");
        jokesList.put(22,"When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.");
        jokesList.put(23,"What do you get when you wake up on a workday and realize you ran out of coffee? A depresso.");
        jokesList.put(24,"Why did the bee marry? He’s finally found his honey.");
        jokesList.put(25,"Why does it suck to be a penguin? Because even when you get angry, you still look cute.");
        jokesList.put(26,"It is important to make breaks between individual exercises. I personally stick to breaks of about 3-4 years.");
        jokesList.put(27,"Sometimes I drink water - just to surprise my liver.");
        jokesList.put(28,"Of course I have a talent. I'm really good in bed. Sometimes I sleep more than 9 hours in one go.");
        jokesList.put(29,"First rule of Sundays: If you can’t reach it from your couch, you don’t need it.");
        jokesList.put(30,"According to my mirror I am pregnant. The father is Nutella.");
        jokesList.put(31,"My relationship is like an iPad. I don't have an iPad.");
        jokesList.put(32,"I am nobody. Nobody is perfect. I am perfect.");
        jokesList.put(33,"As long as cocoa beans grow on trees, chocolate is fruit to me.");
        jokesList.put(34,"Somebody said today that I'm lazy. I nearly answered him.");
        jokesList.put(35,"I’m not lazy. I’m just naturally a very relaxed person.");
        jokesList.put(36,"I’m not saying I’m Batman, but so far nobody has seen me and Batman together in the same room.");
        jokesList.put(37,"I’m standing outside. In other words, I’m outstanding.");
        jokesList.put(38,"Stressed is just desserts spelled backwards.");
        jokesList.put(39,"If you ever see me running, run like hell too. I’m far too lazy to be running without a good reason.");
        jokesList.put(40,"I’m all for irony, but the phrase “Good morning” seems to be going a bit too far.");

        return jokesList.get(a);

    }


}
