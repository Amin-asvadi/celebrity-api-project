package com.example.novindevelopers.json_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.novindevelopers.json_project.Model.Celebrity;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by NovinDevelopers on 2/9/2018.
 */

public class Adapter extends  RecyclerView.Adapter<Adapter.viewholder>
{

    Context context;
    ArrayList<Celebrity> celebrities;

    public Adapter(Context context, ArrayList<Celebrity> celebrities)
    {
        this.context = context;
        this.celebrities = celebrities;
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_celebrity,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position)
    {
        Celebrity items=celebrities.get(position);
        holder.textViewName.setText(items.getName());
        holder.textViewEmail.setText(items.getEmail());
        Glide
                .with(context)
                .load(items.getImage())
                .into(holder.circleImageViewCelebrity);

    }

    @Override
    public int getItemCount()
    {
        return celebrities.size();
    }

    public class viewholder extends RecyclerView.ViewHolder
    {
        CircleImageView circleImageViewCelebrity;
        TextView textViewName,textViewEmail;
        public viewholder(View itemView)
        {
            super(itemView);

            circleImageViewCelebrity = (CircleImageView)itemView.findViewById(R.id.imageCelebrity);
            textViewName = (TextView)itemView.findViewById(R.id.textName);
            textViewEmail = (TextView)itemView.findViewById(R.id.textEmail);
        }
    }
}
