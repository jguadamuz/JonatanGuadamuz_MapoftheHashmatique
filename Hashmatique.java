import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();

        songs.put("Take On Me", 
                "\tWe're talking away\n" +
                "\tI don't know what\n" +
                "\tI'm to say I'll say it anyway\n" +
                "\tToday's another day to find you\n" +
                "\tShying away\n" +
                "\tI'll be coming for your love, okay?");
        songs.put("Total eclipse  of the heart",
                "\tEvery now and then I get a little bit lonely\n" + 
                "\tAnd you're never coming 'round\n" +
                "\t(Turn around) every now and then I get a little bit tired\n" +
                "\tOf listening to the sound of my tears");
        songs.put("The winner takes it all",
                "\tI don't wanna talk\n" + 
                "\tAbout things we've gone through\n" + 
                "\tThough it's hurting me\n" + 
                "\tNow it's history");
        songs.put("We are the champions", 
                "\tI've paid my dues\n" +
                "\tTime after time\n" +
                "\tI've done my sentence\n" +
                "\tBut committed no crime\n" +
                "\tAnd bad mistakes\n" +
                "\tI've made a few\n" +
                "\tI've had my share of sand kicked in my face\n" +
                "\tBut I've come through");
        String lyrics = songs.get("The winner takes it all");
        System.out.println("The song's lyrics is: \n" + lyrics);

        Set<String> keys = songs.keySet();
        for (String key : keys) {
            System.out.println(key + ":");
            System.out.println(songs.get(key));
        }
    }
}