public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int rateList[] = new int[3];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    @Override
    public void display() {
        System.out.printf("Title: " + this.title + " - Publish date: "
                + this.publishDate + " - Author: " + this.author + " - Content: " + this.content + " - Average rate: " + this.averageRate + "\n");
    }

    public void calculate(){
        this.averageRate = (rateList[0]+rateList[1]+rateList[2])/3;
    }


}
