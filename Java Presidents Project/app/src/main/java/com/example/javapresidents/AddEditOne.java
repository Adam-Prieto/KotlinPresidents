//****************************************************************************

package com.example.javapresidents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


public class AddEditOne extends AppCompatActivity
{

    Button btnOK;
    Button btnCancel;

    EditText etPresDate, etPresName, etPresImageURL;

    List<President> presidentList;
    TextView tvPresId;
    int id;
    MyJavaClass myApplication = (MyJavaClass) this.getApplication();

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
        setContentView(R.layout.activity_add_edit_one);

        presidentList = MyJavaClass.getPresidentList();

        btnOK = findViewById(R.id.btn_OK);
        btnCancel = findViewById(R.id.btn_Cancel);
        Intent mainActivityIntent =
                new Intent(AddEditOne.this, MainActivity.class);

        etPresName = findViewById(R.id.editTextTextPersonName);
        etPresDate = findViewById(R.id.editTextDate);
        etPresImageURL = findViewById(R.id.et_URL);
        tvPresId = findViewById(R.id.tvPresIDNumber);

        Intent intent = getIntent();
        id = intent.getIntExtra("id", -1);
        President president = null;

        if (id >= 0)
        {
            // Edit president
            for (President p : presidentList)
            {
                if (p.getId() == id)
                {
                    president = p;
                } // End if
            } // End for

            etPresName.setText(president.getName());
            etPresDate.setText(
                    String.valueOf(president.getDateAssumedOffice()));
            etPresImageURL.setText(president.getImageURL());
            tvPresId.setText(String.valueOf(id));
        } // End if


        btnOK.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (id >= 0)
                {
                    // Update
                    President updatedPres =
                            new President(id, etPresName.getText().toString(),
                                          Integer.parseInt(etPresDate.getText()
                                                                     .toString()),
                                          etPresImageURL.getText().toString());
                    presidentList.set(id, updatedPres);
                } // End if

                else
                {
                    // Create president object
                    int nextID = MyJavaClass.getNextInt();
                    President newPresident = new President(nextID,
                                                           etPresName.getText()
                                                                     .toString(),
                                                           Integer.parseInt(
                                                                   etPresDate.getText()
                                                                             .toString()),
                                                           etPresImageURL.getText()
                                                                         .toString());

                    // Add president to list
                    presidentList.add(newPresident);
                    myApplication.setNextInt(nextID++);
                } // End else
                // Go back to MainActivity
                startActivity(mainActivityIntent);
            } // End onClick
        }); // btnOK.setOnClickListener

        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(mainActivityIntent);
            } // End onClick
        }); // End btnCancel.setOnClickListener
    } // End onCreate
} // End AddEditOne class