import java.io.Serializable;

public class Record implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 952204686050340232L;
    private String artist;
    private String songTitle;
    private int publicationYear;
    private double sellingPrice;
    private int ID;
    private static int count = 0;

    private void setID() {
        ID = 1000 + count;
        count++;
    }

    public Record() {
        setID();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getID() {
        return ID;
    }

    public String toString() {
        return "Record [artist=" + artist + ", songTitle=" + songTitle + ", publicationYear=" + publicationYear
                + ", sellingPrice=" + sellingPrice + ", ID=" + ID + "]";
    }


}
