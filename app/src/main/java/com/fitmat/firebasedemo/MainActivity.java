package com.fitmat.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.DatabaseMetaData;

public class MainActivity extends AppCompatActivity {

//    EditText bufferstream,minX,Actions;
        Button submitData;

    DatabaseReference databaseActivities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseActivities = FirebaseDatabase.getInstance().getReference();

//        bufferstream = (EditText)findViewById(R.id.bufferText);
//        minX = (EditText)findViewById(R.id.BlobProp1);
//        Actions = (EditText)findViewById(R.id.Actions);

        submitData = (Button)findViewById(R.id.buttonAddData);

        submitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addData();
            }
        });



    }

    private void addData()
    {
//        String buffStream = bufferstream.getText().toString().trim();
//        String BlobProp1=minX.getText().toString().trim();
//        String Action = Actions.getText().toString().trim();

        long millis = System.currentTimeMillis();
        String Time = String.valueOf(millis);

        String id = databaseActivities.push().getKey();
        Activites activites = new Activites(id,Time,"AAB1205465456","10","12","36",
                "40","12","56","32","100","14","Triangle","Vertical","Jump");

        databaseActivities.child(id).setValue(activites);

        Toast.makeText(this,"Action Added",Toast.LENGTH_SHORT).show();
    }


}
