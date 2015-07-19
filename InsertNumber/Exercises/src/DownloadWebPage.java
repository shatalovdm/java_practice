import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Дмитрий Шаталов on 5/17/2015.
 */
public class DownloadWebPage {
    static final String URL = "https://www.wikipedia.org/";

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect(args[0]).get();
        //Document doc = Jsoup.connect(URL).get();
        String text = doc.body().text();

        System.out.print(doc.html());
    }
}
