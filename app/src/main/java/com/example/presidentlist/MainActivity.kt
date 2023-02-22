package com.example.presidentlist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.*
import java.util.Collections.*


class MainActivity : AppCompatActivity()
{
    var menu: Menu? = null
    private var presidentList: MutableList<President>? = null
    lateinit var recyclerView: RecyclerView
    private var mAdapter: RecyclerView.Adapter<*>? = null
    
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    
        // Add one button and intent
        val btnAddOne: Button = findViewById(R.id.btn_addOne)
        val addEditOneIntent = Intent()
        addEditOneIntent.setClass(this, AddEditOne::class.java)
        
        // Initialize list and adapter
        presidentList = MyKotlinClass.getPresidentList()
        mAdapter = RecycleViewAdapter(presidentList!!, this)
    
        // Recycler View population and padding
        recyclerView = findViewById(R.id.rv_PresdidentList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter
        
        // Check president count
        Toast.makeText(this, "President Count: ${presidentList!!.size}",
            Toast.LENGTH_SHORT).show()
        
        // Go to Add Edit One Activity on click
        btnAddOne.setOnClickListener {
            startActivity(addEditOneIntent)
        } // End btnAddOne.setOnClickListener
    } // End onCreate
    
    //************************************************************************
    
    /**@methodName:
     * @param:
     * @return:
     * @description:
     */
    
    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        val inflater = menuInflater
        inflater.inflate(R.menu.sort_menu, menu)
        return true
    } // End onCreateOptionsMenu
    
    //************************************************************************
    /**@methodName: onOptionsItemSelected
     * @param: item (MenuItem)
     * @return: Bool (t/f if the presidents could be sorted.)
     * @description: Sorts presidents
     */
    
    @SuppressLint("NotifyDataSetChanged")
    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId)
        {
            // Ascending Order
            R.id.menu_AtoZ ->
            {
                presidentList?.let {
                    sort(it, President.PresidentNameAZComparator)
                }
                Toast.makeText(applicationContext, "Ascending",
                    Toast.LENGTH_SHORT).show()
                mAdapter!!.notifyDataSetChanged()
                return true
            } // End R.id.menu_AtoZ
            
            // Descending
            R.id.menu_ZtoA ->
            {
                presidentList?.let {
                    sort(it, President.PresidentNameZAComparator)
                }
                Toast.makeText(applicationContext, "Descending",
                    Toast.LENGTH_SHORT).show()
                mAdapter!!.notifyDataSetChanged()
                return true
            } // End R.id.menu_ZtoA
            
            // Oldest
            R.id.menu_dateAscending ->
            {
                presidentList?.let {
                    sort(it, President.PresidentDateAscendingComparator)
                }
                Toast.makeText(applicationContext, "Chronological",
                    Toast.LENGTH_SHORT).show()
                mAdapter!!.notifyDataSetChanged()
                return true
            } // End R.id.menu_dateAscending
            
            // Most Recent
            R.id.menu_dateDescending ->
            {
                presidentList?.let {
                    sort(it, President.PresidentDateDescendingComparator)
                }
                Toast.makeText(applicationContext, "Most Recent",
                    Toast.LENGTH_SHORT).show()
                mAdapter!!.notifyDataSetChanged()
                return true
            } // End R.id.menu_dateDescending
        } // End when
        return super.onOptionsItemSelected(item)
    } // End onOptionsItemSelected
} // End MainActivity class
