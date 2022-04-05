import java.util.HashMap;
import java.util.Set;

public class HashMapMusic {
    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Curel summer", " I love you aint that the worst thing you ever heard?");
        userMap.put("wildestDreams", "Say you'll remember me standing in a nice dress");
        userMap.put("veryfirstnight", "Cause they don't know about the night in the hotel");
        userMap.put("getawaycar", "There were sirens in the beat of your heart");

        String name = userMap.get("Curel summer");
        System.out.println("song Lyrics:" + name);

        Set<String> keys = userMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }

    }
}
