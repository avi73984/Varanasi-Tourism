package android.com.varanasiproject;

public class tourism {
    private String Title;
    private String category;
    private String Description;
    private int thumbnail;
    private int date;
    public tourism()
    {

    }

    public tourism(String title, String category, String description, int thumbnail, int date) {
        Title = title;
        this.category = category;
        Description = description;
        this.thumbnail = thumbnail;
        this.date = date;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getDate() {
        return date;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
