package com.example.bukola_omotoso.jifyymovies;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bukola_omotoso on 15/03/16.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder{

    public TextView movie_title;
    public TextView release_date;
    public TextView author_name;

    public ItemViewHolder(View itemView){

        super(itemView);
        movie_title = (TextView)itemView.findViewById(R.id.movie_title);
        release_date = (TextView)itemView.findViewById(R.id.release_date);
        author_name = (TextView)itemView.findViewById(R.id.movie_author);
    }

}
