package net.flix;

public enum Genre {
    HORROR ("HORROR"),
    HISTORICAL("Historical"),
    ACTION("ACTION!!!"),
    COMEDY("Comedy"),
    SPORTS_ROMANCE("Sports Romance"),
    WESTERN("Western");

    // everything under here is regular class defintion stuff: fields, ctors, methods
    private final String display;

    private Genre(String display) {  // automatically private, by definition
        this.display = display;
        System.out.println("net.flix.Genre ctor called");
    }

    public String display() {  // standard getter, just not named with "get"
        return display;
    }

    public String toString() {
        return display();   // generally better to call your own getter
    }
}
