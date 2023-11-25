import java.util.HashMap;
import java.util.Set;

public class SongsList{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("title 1","lyrics of song 1");
        trackList.put("title 2","lyrics of song 2");
        trackList.put("title 3","lyrics of song 3");
        trackList.put("title 4","lyrics of song 4");

        System.out.println(String.format("these lyrics'%s' belong to song title 1", trackList.get("title 1")));

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}