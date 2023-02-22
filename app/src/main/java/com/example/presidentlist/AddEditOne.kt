package com.example.presidentlist

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.lang.String
import kotlin.Int


class AddEditOne : AppCompatActivity()
{
    
    var presidentList: MutableList<President>? = null
    var id = 0
    
    
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_one)
        
        presidentList = MyKotlinClass.getPresidentList()
        
        val btnOK: Button = findViewById(R.id.btn_OK)
        val btnCancel: Button = findViewById(R.id.btn_Cancel)
        val mainActivityIntent =
            Intent(this@AddEditOne, MainActivity::class.java)
        val etPresName: EditText = findViewById(R.id.editTextTextPersonName)
        val etPresDate: EditText = findViewById(R.id.editTextDate)
        val etPresImageURL: EditText = findViewById(R.id.et_URL)
        val tvPresId: TextView = findViewById(R.id.tvPresIDNumber)
        
        
        val intent = intent
        id = intent.getIntExtra("id", -1)
        var president: President? = null
        
        if (id >= 0)
        {
            // Edit president
            for (p in presidentList!!)
            {
                if (p.id === id)
                {
                    president = p
                } // End if
            } // End for
            
            if (president != null)
            {
                etPresName.setText(president.presName)
                etPresDate.setText(String.valueOf(president.dateAssumedOffice))
                etPresImageURL.setText(president.imageURL)
                tvPresId.text = id.toString()
            } // End if
        } // End if
        
        
        btnOK.setOnClickListener { v ->
            
            if (id >= 0)
            {
                // Update
                val updatedPres = President(id, etPresName.text.toString(),
                    etPresDate.text.toString().toInt(),
                    etPresImageURL.text.toString())
                presidentList!![id] = updatedPres
            } // End if
            
            else
            {
                // Create president object
                var nextID: Int = MyKotlinClass.nextInt
                val newPresident = President(nextID, etPresName.text.toString(),
                    etPresDate.text.toString().toInt(),
                    etPresImageURL.text.toString())
                
                // Add president to list
                presidentList!!.add(newPresident)
                MyKotlinClass.nextInt = nextID++
                //myApplication.setNextInt(nextID++)
            } // End else
            
            startActivity(mainActivityIntent)
        }
        
        btnCancel.setOnClickListener { _ ->
            startActivity(mainActivityIntent)
        }
    } // End onCreate
} // End AddEditOne class
