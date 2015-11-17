package crawler;

import Infrastructure.Filesystem;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        SpiderLeg spiderLeg = new SpiderLeg();
        spiderLeg.crawl("http://www.dr.dk");
        System.out.println(spiderLeg.links.toString());

        Spider spider = new Spider();
        spider.search("http://www.dr.dk");

    }

}
