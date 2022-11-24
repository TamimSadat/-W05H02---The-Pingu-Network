package pgdp.pingunetwork;

public class Picture {

    private String location;
    private int width;
    private int height;
    private int[][] data;

    private Picture[] thumbnails;

    public Picture(String location, int[][] data) {
        this.location = location;
        this.data = data;
    }

    public void setThumbnails(Picture[] thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getLocation() {
        return location;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int[][] getData() {
        return data;
    }


}
