//****************************************************************************
package com.example.javapresidents;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    Button btnAddOne;
    Menu menu;

    MyJavaClass myApplication = (MyJavaClass) this.getApplication();
    List<President> presidentListMain;


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    //************************************************************************

    /**@methodName:
     * @param:
     * @return:
     * @description:
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presidentListMain = myApplication.getPresidentList();

        btnAddOne = findViewById(R.id.btn_addOne);
        btnAddOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, AddEditOne.class);
                startActivity(intent);
            } // End onClick
        }); // End btnAddOne.setOnClickListener

        recyclerView = findViewById(R.id.rv_PresdidentList);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecycleViewAdapter(presidentListMain, MainActivity.this);
        recyclerView.setAdapter(mAdapter);
    } // End onCreate

    //************************************************************************

    /**@methodName:
     * @param:
     * @return:
     * @description:
     * */

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sort_menu, menu);

        return true;
    } // End onCreateOptionsMenu

    //************************************************************************

    /**@methodName:
     * @param:
     * @return:
     * @description:
     * */

    // Sort presidents
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            // Sort by ascending name
            case R.id.menu_AtoZ:
                Collections.sort(presidentListMain,
                                 President.PresidentNameAZComparator);
                Toast.makeText(getApplicationContext(), "Sorted Name Ascending",
                               Toast.LENGTH_SHORT).show();
                mAdapter.notifyDataSetChanged();
                return true;

            // Sort by descending name
            case R.id.menu_ZtoA:
                Collections.sort(presidentListMain,
                                 President.PresidentNameZAComparator);
                Toast.makeText(getApplicationContext(),
                               "Sorted Name Descending", Toast.LENGTH_SHORT)
                     .show();
                mAdapter.notifyDataSetChanged();
                return true;

            // Sort by ascending date
            case R.id.menu_dateAscending:
                Collections.sort(presidentListMain,
                                 President.PresidentDateAscendingComparator);
                Toast.makeText(getApplicationContext(), "Sorted Date Ascending",
                               Toast.LENGTH_SHORT).show();
                mAdapter.notifyDataSetChanged();
                return true;

            // Sort by descending date
            case R.id.menu_dateDescending:
                Collections.sort(presidentListMain,
                                 President.PresidentDateDescendingComparator);
                Toast.makeText(getApplicationContext(),
                               "Sorted Date Descending", Toast.LENGTH_SHORT)
                     .show();
                mAdapter.notifyDataSetChanged();
                return true;
        } // End switch
        return super.onOptionsItemSelected(item);
    } // End onOptionsItemSelected
} // End MainActivity class