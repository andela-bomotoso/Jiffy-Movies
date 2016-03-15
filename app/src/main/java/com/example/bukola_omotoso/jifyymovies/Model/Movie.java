package com.example.bukola_omotoso.jifyymovies.Model;

/**
 * Created by bukola_omotoso on 15/03/16.
 */
public class Movie {
    private String movieTitle;
    private String releaseDate;
    private String authorName;

    public Movie()   {

    }

    public Movie(String movieTitle, String releaseDate, String authorName)    {

        this.authorName = authorName;
        this.releaseDate = releaseDate;
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
