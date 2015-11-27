package crawler;

import Infrastructure.Filesystem;

public class Main {

    public static void main(String[] args) {
        Filesystem.deleteFile("scrape");

        String url = "http://dr.dk";
        Crawler crawler = new Crawler(url);
        crawler.crawl();
    }

}
