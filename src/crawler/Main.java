package crawler;

public class Main {


    public static void main(String[] args) {

        SpiderLeg spiderLeg = new SpiderLeg();
        spiderLeg.crawl("http://www.dr.dk");
        System.out.println(spiderLeg.links.toString());

        Spider spider = new Spider();
        spider.search("http://www.dr.dk", "test");

    }

}
