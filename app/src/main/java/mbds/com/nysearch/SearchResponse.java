package mbds.com.nysearch;

import java.util.List;

/**
 * Created by Joel Felix St Joy on 02/16/18.
 */

public class SearchResponse {

    Meta meta;

    List<Article> docs;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Article> getDocs() {
        return docs;
    }

    public void setDocs(List<Article> docs) {
        this.docs = docs;
    }
}
