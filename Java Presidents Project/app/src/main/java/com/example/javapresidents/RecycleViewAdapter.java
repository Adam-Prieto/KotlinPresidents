//****************************************************************************
package com.example.javapresidents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class RecycleViewAdapter
        extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>
{
    List<President> presidentList;
    Context context;

    //************************************************************************
    /**@methodName: RecycleViewAdapter (constructor)
     * @param: presidentList
     * @param: context
     * @return: null
     * @description: Basic constructor for RecycleViewAdapter class
     * */
    public RecycleViewAdapter(List<President> presidentList, Context context)
    {
        this.presidentList = presidentList;
        this.context = context;
    } // End Constructor

    //************************************************************************
    /**@methodName: onCreateViewHolder
     * @param: parent
     * @param: viewType
     * @return: null
     * @description: This method populates the recycler view with multiple
     * president entry cards as designed in one_line_president
     * */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                           int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.one_line_president, parent,
                                           false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    } // End onCreateViewHolder

    //************************************************************************
    /**@methodName: onBindViewHolder
     * @param: holder
     * @param: position
     * @return: void
     * @description: This method fills the recycler view with all of the
     * relevant president data and also takes the user to the Add/ Edit one
     * activity when they click a president.
     * */

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,
                                 @SuppressLint("RecyclerView") final int position)
    {
        holder.presName.setText(presidentList.get(position).getName());
        holder.assOffice.setText(String.valueOf(
                presidentList.get(position).getDateAssumedOffice()));
        Glide.with(this.context).load(presidentList.get(position).getImageURL())
             .into(holder.presPic);

        holder.parentLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(context, AddEditOne.class);
                intent.putExtra("id", presidentList.get(position).getId());
                context.startActivity(intent);
            }
        }); // End holder.parentLayout.setOnClickListener
    } // End onBindViewHolder

    //************************************************************************
    /**@methodName: getItemCount
     * @return: int
     * @description: returns presidentList.size
     * */

    @Override
    public int getItemCount()
    {
        return presidentList.size();
    } // End getItemCount

    //************************************************************************


    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView presPic;
        TextView presName;
        TextView assOffice;

        ConstraintLayout parentLayout;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            presPic = itemView.findViewById(R.id.ivPresidentPicture);
            presName = itemView.findViewById(R.id.tvPresidentName);
            assOffice = itemView.findViewById(R.id.tvDate);
            parentLayout = itemView.findViewById(R.id.oneLinePresidentLayout);
        } // End MyViewHolder
    } // End MyViewHolder
} // End class
