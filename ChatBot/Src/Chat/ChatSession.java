package Chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChatSession {

    private ArrayList<String> empower ;
    private Random randint = new Random();

    public String empowerment(){
        Arrays.asList("“Lean in, speak out, have a voice in your organization, and never use the word, ‘sorry’.” ―Trish Bertuzzi", "“You will be defined not just by what you achieve, but by how you survive.”―Sheryl Sandberg", "“Trying to do it all and expecting it all can be done exactly right is a recipe for disappointment. Perfection is the enemy.” ― Sheryl Sandberg", "“There is nothing like a concrete life plan to weigh you down. Because if you always have one eye on some future goal, you stop paying attention to the job at hand, miss opportunities that might arise, and stay fixedly on one path, even when a better, newer course might have opened up.” ― Indra Nooyi", "“Growth and comfort do not coexist.” ― Ginni Rometty", "“I always did something I was a little not ready to do. I think that’s how you grow. When there’s that moment of ‘Wow, I’m not really sure I can do this,’ and you push through those moments, that’s when you have a breakthrough.” ― Marissa Mayer", "“Stay true to yourself and your vision. Don’t let any one person’s opinion move you; listen, but be confident.”―Amanda Kahlow");
        int rand = (int) randint.nextInt(empower.size());
        return empower.get(rand);
    }

    public ChatSession(){

    }

    public void readCmd(){
        Scanner in = new Scanner(System.in);


    }

}
