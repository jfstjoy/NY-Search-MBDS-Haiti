package mbds.com.nysearch;

import java.util.List;
/**
 * Created by Joel Felix St Joy on 02/16/18.
 */
public class TopStoryResult {

    String title;

    List<Multimedia> multimedia;

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public String getThumbnail() {
        if (multimedia.size() > 0 ) {
            return multimedia.get(0).getUrl();

        }
        return null;
    }

    public String getTitle() {
        return title;
    }



}
