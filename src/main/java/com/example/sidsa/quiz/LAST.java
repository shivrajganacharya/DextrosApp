package com.example.sidsa.quiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.firebase.client.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



import com.google.firebase.auth.FirebaseAuth;

public class LAST extends AppCompatActivity implements inter1{

    public TextView txt;
    private DatabaseReference mDatabase;
    int res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        txt= (TextView) findViewById(R.id.textView11);
        for (int i=0;i<5;i++)
        {
            res=res+a[i];
        }
        txt.setText("your score is "+res);
        mDatabase = FirebaseDatabase.getInstance().getReference("Participants").child("Chinmay").child("Score");
        mDatabase.setValue(res);
        FirebaseAuth.getInstance().signOut();
    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("QUIT")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }

                })
                .setNegativeButton("No", null)
                .show();

    }
}
