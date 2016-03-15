package com.example.bukola_omotoso.jifyymovies;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bukola_omotoso.jifyymovies.Model.ActionMovie;
import com.example.bukola_omotoso.jifyymovies.Model.Movie;
import com.example.bukola_omotoso.jifyymovies.Model.MovieManager;
import com.example.bukola_omotoso.jifyymovies.Model.Utilities;

import java.util.ArrayList;

/**
 * Created by bukola_omotoso on 15/03/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {



    private  ArrayList<Movie> movies;
    private MovieManager movieManager;


    public RecyclerAdapter()   {
        movieManager = new MovieManager();
        movieManager.populateMovies();
        movies = new ArrayList<>();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)    {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item,parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public int getItemCount()   {
        movies = movieManager.getMovies();
        return movies.size();
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder,int position)    {

        Movie movie = movies.get(position);
        holder.movie_title.setText(movie.getMovieTitle());
        holder.release_date.setText(movie.getReleaseDate());
        holder.author_name.setText(movie.getAuthorName());

    }
}
