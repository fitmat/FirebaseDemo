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
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

//    EditText bufferstream,minX,Actions;
        Button submitData;

    DatabaseReference databaseActivities,blobActivities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseActivities = FirebaseDatabase.getInstance().getReference("users");
       // blobActivities = databaseActivities.getRoot().child("Blob");

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
        long millis = System.currentTimeMillis();
        String Time = String.valueOf(millis);

        String id = databaseActivities.push().getKey();

        String minX = "1500";
        String maxX = "2000";
        String minY = "1500";
        String maxY = "2000";
        String centre = "1500";
        String length = "2000";
        String width = "1500";

        HashMap<String,String> hm= new HashMap<>();
        hm.put("Min X",minX);
        hm.put("Max X",maxX);
        hm.put("Min Y",minY);
        hm.put("Max Y",maxY);
        hm.put("centre",centre);
        hm.put("length",length);
        hm.put("Width",width);
        hm.put("Min X",minX);
        hm.put("Max X",maxX);
        hm.put("Min Y",minY);
        hm.put("Max Y",maxY);
        hm.put("centre",centre);
        hm.put("length",length);
        hm.put("Width",width);
        Activites activites = new Activites(id,Time,"AAB1205465456","10","12","36",
                "40","12","56","32","100","14","Triangle","Vertical","Jump",hm);

        databaseActivities.child(id).setValue(activites);

        Toast.makeText(this,"Action Added",Toast.LENGTH_SHORT).show();
    }


}
