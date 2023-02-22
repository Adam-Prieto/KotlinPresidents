package com.example.presidentlist

import android.annotation.SuppressLint
import android.content.*
import android.view.*
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.lang.String
import kotlin.Int


class RecycleViewAdapter(var presidentList: List<President>, var context: Context) :
    RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>()
{

    /**@methodName: onCreateViewHolder
     * @param: parent
     * @param: viewType
     * @return: null
     * @description: This method populates the recycler view with multiple
     * entry cards as designed in one_line_president
     */
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder
    {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_line_president, parent, false)
        return MyViewHolder(view)
    } // End onCreateViewHolder
    
    //************************************************************************
    
    /**@methodName: onBindViewHolder
     * @param: holder
     * @param: position
     * @description: This method fills the recycler view with all of the
     * relevant president data and also takes the user to the Add/ Edit one
     * activity when they click a president.
     */
    override fun onBindViewHolder(holder: MyViewHolder,
                                  @SuppressLint("RecyclerView") position: Int)
    {
        holder.presName.setText(presidentList[position].name)
        holder.assOffice.setText(
            String.valueOf(presidentList[position].dateAssumedOffice))
        
        Glide.with(context).load(presidentList[position].imageURL)
            .into(holder.presPic)
        
        holder.parentLayout.setOnClickListener {
            val intent = Intent(context, AddEditOne::class.java)
            intent.putExtra("id", presidentList[position].id)
            context.startActivity(intent)
        } // End holder.parentLayout.setOnClickListener
    } // End onBindViewHolder
    
    //************************************************************************
    /**@methodName: getItemCount
     * @return: int
     * @description: returns presidentList.size
     */
    override fun getItemCount(): Int
    {
        return presidentList.size
    } // End getItemCount
    
    //************************************************************************
    
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var presPic: ImageView
        var presName: TextView
        var assOffice: TextView
        var parentLayout: ConstraintLayout
        
        init
        {
            presPic = itemView.findViewById(R.id.ivPresidentPicture)
            presName = itemView.findViewById(R.id.tvPresidentName)
            assOffice = itemView.findViewById(R.id.tvDate)
            parentLayout = itemView.findViewById(R.id.oneLinePresidentLayout)
        } // End MyViewHolder
    } // End MyViewHolder
} // End class
