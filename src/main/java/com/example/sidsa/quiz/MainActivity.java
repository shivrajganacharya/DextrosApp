package com.example.sidsa.quiz;
import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static EditText email,pass;
    String visit;
    private static Button b1;
    private FirebaseAuth mAuth;
    private String mail,password,k;
    private DatabaseReference mDatabase;
    int attempts=3;
    String preferences_name = "isFirstTime";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();



        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent welcome = new Intent(MainActivity.this, MainActivity.class);
                startActivity(welcome);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        }, 2000);
        click();
    }




    public  void  firstTime(){

        SharedPreferences sharedTime = getSharedPreferences(preferences_name,0);
        if (sharedTime.getBoolean("firstTime",true))
        {
            //Your tutorial code
            sharedTime.edit().putBoolean("firstTime",false).apply();
        }
        else
        {
            Intent intent=new Intent(MainActivity.this,LAST.class);
            startActivity(intent);
            finish();
        }

    }

    public void click()
    {
        b1= (Button) findViewById(R.id.button);
        email= (EditText) findViewById(R.id.editText2);
        pass= (EditText) findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     //          login_func();
                Intent i = new Intent(MainActivity.this, Question.class);
                startActivity(i);

            }
        });
    }

    public void login_func() {

        mail = email.getText().toString().trim();
        password = pass.getText().toString().trim();

        if (!TextUtils.isEmpty(mail) && !TextUtils.isEmpty(password)) {
            mAuth.signInWithEmailAndPassword(mail, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override

                        public void onComplete(@NonNull Task<AuthResult> task) {

                              if (task.isSuccessful()) {
                                 String ad_mail;
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                ad_mail = user.getEmail().toString();
                                /////
                                mDatabase = FirebaseDatabase.getInstance().getReference("Participants").child("Chinmay").child("Visited");
                                  mDatabase.addValueEventListener(new ValueEventListener() {
                                      @Override
                                      public void onDataChange(DataSnapshot dataSnapshot) {
                                          k=dataSnapshot.getValue().toString();
                                          if(k.equals("0")) {
                                              mDatabase.setValue("1");
                                              Intent i = new Intent(MainActivity.this, Question.class);
                                              startActivity(i);
                                          }
                                          else
                                          {
                                              Toast.makeText(MainActivity.this,k+"Hii", Toast.LENGTH_SHORT).show();
                                          }
                                      }

                                      @Override
                                      public void onCancelled(DatabaseError databaseError) {

                                      }
                                  });

                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(MainActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
        }
        else
        {
            Toast.makeText(MainActivity.this, "Enter mail id and password!", Toast.LENGTH_SHORT).show();

        }
    }


}