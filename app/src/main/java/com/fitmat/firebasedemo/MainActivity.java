package com.fitmat.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
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
                try {
                    addData();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });



    }

    private void addData() throws JSONException {
        long millis = System.currentTimeMillis();
        String Time = String.valueOf(millis);







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



//        JSONObject jo = new JSONObject();
//
//        jo.put("firstName", "John");
//        jo.put("lastName", "Doe");
//
//        JSONArray ja = new JSONArray();
//        ja.put(jo);
//
//        JSONObject mainObj = new JSONObject();
//        mainObj.put("employees", ja);
//
//
        String id = databaseActivities.push().getKey();

        ArrayList<HashMap> list=new ArrayList<HashMap>();
        HashMap<String,String> hm1= new HashMap<>();
        hm1.put("Min X",minX);
        hm1.put("Max X",maxX);
        hm1.put("Min Y",minY);
        hm1.put("Max Y",maxY);
        hm1.put("centre",centre);
        hm1.put("length",length);
        hm1.put("Width",width);

        list.add(hm1);

        hm1.put("Min X",minX);
        hm1.put("Max X",maxX);
        hm1.put("Min Y",minY);
        hm1.put("Max Y",maxY);
        hm1.put("centre",centre);
        hm1.put("length",length);
        hm1.put("Width",width);
        list.add(hm1);

        Activites activites = new Activites(id,Time,"AAB1205465456","10","12","36",
                "40","12","56","32","100","14","Triangle","Vertical",
                "Jump",list,hm);

        databaseActivities.child(id).setValue(activites);

        Toast.makeText(this,"Action Added",Toast.LENGTH_SHORT).show();
    }


}
