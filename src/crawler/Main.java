package crawler;

import Infrastructure.Filesystem;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        Filesystem.deleteFile("scrape");
        Crawler crawler = new Crawler();
        crawler.crawl("http://ekstrabladet.dk");

    }

}
