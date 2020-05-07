package seventh_chapter.inheritance;

public class Animal {
    private String genre;
    private String picture;

    public Animal() {}

    public Animal(String genre) {
        this.genre = genre;
    }

    private String food;
    private Boolean hunger;
    private Integer boundaries;
    private String location;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Boolean getHunger() {
        return hunger;
    }

    public void setHunger(Boolean hunger) {
        this.hunger = hunger;
    }

    public Integer getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(Integer boundaries) {
        this.boundaries = boundaries;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGenre() {
        return genre;
    }

    public void makeNoise(){
        System.out.println(getGenre().toUpperCase() + " says :");
    }

    public void eat(){
        System.out.println(getGenre().toUpperCase() + " eats :");
    }

    public void sleep(){
        System.out.println(getGenre().toUpperCase() + " is sleeping ...");
    }

    public void roam(){
        System.out.println(getGenre().toUpperCase() + " is roaming :");
    }
}
