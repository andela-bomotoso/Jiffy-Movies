package com.example.bukola_omotoso.jifyymovies.Model;

import android.support.v4.app.Fragment;

import com.example.bukola_omotoso.jifyymovies.Fragments.ActionFragment;
import com.example.bukola_omotoso.jifyymovies.Fragments.CartoonFragment;
import com.example.bukola_omotoso.jifyymovies.Fragments.ScienceFrictionFragment;

import java.util.ArrayList;

/**
 * Created by bukola_omotoso on 15/03/16.
 */
public class MovieManager {

    private ArrayList<Movie> movies;


    public MovieManager()   {
        movies = new ArrayList<>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie)    {
        movies.add(movie);
    }


    public void populateMovies()  {
        Fragment fragment = Utilities.getCurrentFragment();

        if(fragment instanceof ActionFragment) {

            populateActionMovie();
        }

        else if(fragment instanceof CartoonFragment)    {
            populateCartoons();
        }

        else {
            populateScienceFriction();
        }
    }

    public void populateActionMovie() {

        ActionMovie actionMovie1 = new ActionMovie("London Has Fallen","06-05-16","Nollywood");
        ActionMovie actionMovie2 = new ActionMovie("Captain America","04-03-16","Nollywood");
        ActionMovie actionMovie3 = new ActionMovie("Apolcalypse","27-05-16","X-Men");
        ActionMovie actionMovie4 = new ActionMovie("The Divergent Series","18-03-16","Allegiant");
        ActionMovie actionMovie5 = new ActionMovie("A Star Wars Story","16-12-15","Rogue One");

        addMovie(actionMovie1);
        addMovie(actionMovie2);
        addMovie(actionMovie3);
        addMovie(actionMovie4);
        addMovie(actionMovie5);
    }

    public void populateCartoons()  {
        Cartoon cartoon1 = new Cartoon("Back to the Jungle","2015","Curious George");
        Cartoon cartoon2 = new Cartoon("Adventures of Captain Marvel","1941","Hiram S. Brown");
        Cartoon cartoon3 = new Cartoon("The Amazing Spider Man","07-02-12","James Vanderbilt");
        Cartoon cartoon4 = new Cartoon("Dennis the Menace","1987","Phil Fehrle");
        Cartoon cartoon5 = new Cartoon("Josie and the Pussycats","2001","Harry Elfont");

        addMovie(cartoon1);
        addMovie(cartoon2);
        addMovie(cartoon3);
        addMovie(cartoon4);
        addMovie(cartoon5);

    }

    public void populateScienceFriction()   {
        ScienceFriction scienceFriction1 = new ScienceFriction("Blade Runner","1982","Ridlet Scott");
        ScienceFriction scienceFriction2 = new ScienceFriction("Star Wars Trilogy","1977","George Lucas, et all");
        ScienceFriction scienceFriction3 = new ScienceFriction("Aliens","1986","James Cameron");
        ScienceFriction scienceFriction4 = new ScienceFriction("The Matrix","1999","L & A Wachowski");
        ScienceFriction scienceFriction5 = new ScienceFriction("The Fifth Element","1997","Luc Besson");

        addMovie(scienceFriction1);
        addMovie(scienceFriction2);
        addMovie(scienceFriction3);
        addMovie(scienceFriction4);
        addMovie(scienceFriction5);
    }

}
