package com.hand;

public class Film {
    private int filmId;
    private String title;
    private String description;
    private String releaseYear;
    private int languageId;
    private int originalLanguageId;
    private int rentalDuration;

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageId() {
        return String.valueOf(languageId);
    }

    public void setOriginalLanguageId(int originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public String getOriginalLanguageId() {
        return String.valueOf(originalLanguageId);
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getRentalDuration() {
        return String.valueOf(rentalDuration);
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
