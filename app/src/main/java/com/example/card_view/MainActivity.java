package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    myAdapter myAdapter;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase = FirebaseDatabase.getInstance();

        mRecyclerview = findViewById(R.id.recycler_view);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new myAdapter(this,getMyList());

        mRecyclerview.setAdapter(myAdapter);






    }

    private ArrayList<model>  getMyList (){

        ArrayList<model> models = new ArrayList<>();
        model m = new model();
        m.setName("parmanad");
        m.setSeat("120");
        models.add(m);

        model m1 = new model();
        m1.setName("dinesh");
        m1.setSeat("180");
        models.add(m1);


        model m2 = new model();
        m2.setName("anand");
        m2.setSeat("20");
        models.add(m2);

        model m3= new model();
        m3.setName("parnesh");
        m3.setSeat("120");
        models.add(m3);

        model m4 = new model();
        m4.setName("parmila" +
                "");
        m4.setSeat("1560");
        models.add(m4);

        return models;

    }
}