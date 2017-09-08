package com.example.sidsa.quiz;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Question extends AppCompatActivity {

private static Button n;
    static int cnt=0;
    int counter2 = 60, counter1=59;

    ProgressBar mprogressBar;
    String qno;
    public int counter,i;
    TextView tv;
    Button btnTimmer,btn;
    public int qacount=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        btnTimmer = (Button)findViewById(R.id.button5);

        final HomeWatcher mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new inter() {
            @Override
            public void onHomePressed() {
                Toast.makeText(Question.this, "HOME BUTTON PRESSED", Toast.LENGTH_SHORT).show();
                finish();
                Intent intent1=new Intent(Question.this,LAST.class);
                startActivity(intent1);
            }
            @Override
            public void onHomeLongPressed() {
            }
        });
        mHomeWatcher.startWatch();

       //switch1();

    }



    public void OnPause()
    {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("QUIT")
                .setMessage("Are you sure you want to quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Intent intent1=new Intent(Question.this,LAST.class);
                        startActivity(intent1);
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

//    public void switch1()
//    {
//        n= (Button) findViewById(R.id.button4);
//
//        n.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(cnt==0) {
//                    Frag1 fragment,f;
//                    fragment = new Frag1();
//                    f=new Frag1();
//                    FragmentManager fm = getFragmentManager();
//                    FragmentTransaction ft = fm.beginTransaction();
//                    ft.replace(R.id.frag_place, f);
//                    ft.commit();
//                }
//                else if(cnt==1){
//                    Frag2 fragment;
//                    fragment = new Frag2();
//                    FragmentManager fm = getFragmentManager();
//                    FragmentTransaction ft = fm.beginTransaction();
//                   // ft.replace(R.id.frag_place, fragment);
//                    ft.commit();
//                }
//                else if(cnt==2){
//                    Frag3 fragment;
//                    fragment = new Frag3();
//                    FragmentManager fm = getFragmentManager();
//                    FragmentTransaction ft = fm.beginTransaction();
//                    ft.replace(R.id.frag_place, fragment);
//                    ft.commit();
//                }
//
//                cnt++;
//            }
//        });
 //   }

    /*public void fun(View v)
    {
        Initialfrag fragment = new Initialfrag();
        Bundle bundle = new Bundle();
        bundle.putInt("value",2);
        // bundle.putString("value",Integer.toString(i));
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
        //Toast.makeText(this, "in main", Toast.LENGTH_SHORT).show();
    }*/

}
