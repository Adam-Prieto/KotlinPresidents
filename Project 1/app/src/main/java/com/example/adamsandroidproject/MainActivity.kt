package com.example.adamsandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var gettingStartedProject = Project(
            "Getting started project",
            "Our very first project getting started app",
        5)
        
        var recyclerView: RecyclerView = findViewById(R.id.recycler_view_projects)
    
        var projects = Array<Project>(10) {
            Project("Getting started project",
                "Our very first project getting started app",
            R.drawable.ic_baseline_ac_unit_24)
            Project("Vin Quote",
                "Second Project",
                R.drawable.ic_baseline_30fps_select_24)
            Project("BMI Calculator",
                "Third Project",
                R.drawable.ic_baseline_access_alarms_24)
            Project("Inch converter",
                "Fourth Project",
                R.drawable.ic_baseline_account_balance_24)
            Project("Hungry Dev",
                "Fifth Project",
                R.drawable.ic_launcher_foreground)
            
            
            
        }
        
        
        
    }
}