package com.example.joshgenao.mainmenu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by joshgenao on 2/22/15.
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder>
{
    private LayoutInflater inflater;
    List<MainMenuInformation> data = Collections.emptyList();

    public MenuAdapter(Context context, List<MainMenuInformation> data)
    {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // View represents the custom Linear Layout in custom_row.xml
        View view = inflater.inflate(R.layout.custom_row, parent, false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        MainMenuInformation current = data.get(position);

        holder.title.setText(current.title);

        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        ImageView icon;

        // This is where we find out text view and image in the custom_row.xml
        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.listText);

            icon = (ImageView) itemView.findViewById(R.id.listIcon);

        }
    }

}
