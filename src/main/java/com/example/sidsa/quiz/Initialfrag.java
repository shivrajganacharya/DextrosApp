package com.example.sidsa.quiz;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.sidsa.quiz.R.id.progressBar;
import static java.sql.Types.NULL;


public class Initialfrag extends Fragment implements inter1{

    ProgressBar mprogressBar;
    public int counter3;
    int counter2 = 60, counter1=59;
    TextView tv;
    Button btnTimmer,flag;

    int counter = 60;
    int flag1=0;

    private RadioGroup radio_g;
    private TextView Q,q;
    private static RadioButton r1,r2,r3,r4,rx;
    private Button b1,bn,bp,bf;
    public int qcount=1;
    private int temp=1;
    public Initialfrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//       b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        //flag_question[5] = 0;
       // Bundle bundle = getArguments();

        /*temp = getArguments().getInt("value",1);
        Toast.makeText(getActivity(), Integer.toString(temp), Toast.LENGTH_SHORT).show();*/

       /*if(temp!=NULL)
       {
           qcount = temp;
           select(qcount);
       }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_initialfrag, container, false);
        radio_g= (RadioGroup)view.findViewById(R.id.radioGroup);
        b1= (Button)view.findViewById(R.id.button2);
        bn= (Button) view.findViewById(R.id.button4);
        bp= (Button) view.findViewById(R.id.button6);
       // bs= (Button) view.findViewById(R.id.button7);
        bf = (Button) view.findViewById(R.id.button8);
        //flag = (Button)view.findViewById(R.id.button8);
        r1= (RadioButton) radio_g.findViewById(R.id.radioButton7);
        r2= (RadioButton) radio_g.findViewById(R.id.radioButton8);
        r3= (RadioButton) radio_g.findViewById(R.id.radioButton9);
        r4= (RadioButton) radio_g.findViewById(R.id.radioButton10);
        //Q=(TextView)view.findViewById(R.id.textView5);
        q=(TextView)view.findViewById(R.id.textView4);
       // bs.setVisibility(view.INVISIBLE);

        //String[] tab_names = getResources().getStringArray(R.array.tab_names);


//        String[] tab_names = getResources().getStringArray(R.array.tab_names);
//
//        String tabname1 = tab_names[0];
//
//        Toast.makeText(getActivity(), tabname1, Toast.LENGTH_SHORT).show();


        //revisited
        try
        {
            temp = getArguments().getInt("value",1);
            qcount=temp;
            bf.setBackgroundResource(R.drawable.red_flag);
            Toast.makeText(getActivity(),Integer.toString(qcount) + " qcount",Toast.LENGTH_SHORT).show();
            select(qcount);
        }
        catch(Exception e)
        {
            Toast.makeText(getActivity(),"GI",Toast.LENGTH_SHORT).show();
        }

        //Timer

        final TextView lable = (TextView)view.findViewById(R.id.textView12);
        mprogressBar = (ProgressBar)view.findViewById(progressBar);
        ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
        anim.setDuration(60000);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();

        mprogressBar.setMax((int)161000/1000);
        mprogressBar.setProgress((int)6000000/1000);

        lable.setVisibility(View.VISIBLE);

        new CountDownTimer(60000, 1000){
            public void onTick(long millisUntilFinished){

                if(counter1<=9)
                {
                    if (counter2 <= 9)
                    {
                        lable.setText("0"+String.valueOf(counter1)+"."+"0"+String.valueOf(counter2));
                    }
                    else
                    {
                        lable.setText("0"+String.valueOf(counter1)+"."+String.valueOf(counter2));
                    }
                }
                else
                {
                    if (counter2 <= 9)
                    {
                        lable.setText(String.valueOf(counter1)+"."+"0"+String.valueOf(counter2));
                    }
                    else
                    {
                        lable.setText(String.valueOf(counter1)+"."+String.valueOf(counter2));
                    }
                }
                counter2--;
                if(counter2==0)
                {
                    counter2 =60;
                    counter1--;
                }
            }

            @Override
            public void onFinish() {

            }
        }.start();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getActivity(),"HI",Toast.LENGTH_LONG).show();
                int selected_id=radio_g.getCheckedRadioButtonId();
                rx=(RadioButton)getView().findViewById(selected_id);
                if(rx==null)
                {
                    Toast.makeText(getActivity(),"SELECT A OPTION",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getActivity(), rx.getText().toString(), Toast.LENGTH_SHORT).show();
                    // r4.setChecked(false);
                    if (qcount == 1) {
                        if (rx == r1) {
                            a[0] = 1;
                        } else {
                            a[0] = 0;
                        }
                    }
                    if (qcount == 2) {
                        if (rx == r1) {
                            a[1] = 1;
                        } else {
                            a[1] = 0;
                        }
                    }
                    if (qcount == 3) {
                        if (rx == r1) {
                            a[2] = 1;
                        } else {
                            a[2] = 0;
                        }
                    }
                    if (qcount == 4) {
                        if (rx == r1) {
                            a[3] = 1;
                        } else {
                            a[3] = 0;
                        }
                    }
                    if (qcount == 5) {
                        if (rx == r1) {
                            a[4] = 1;
                        } else {
                            a[4] = 0;
                        }
                    }
                }
            }
        });
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r1.setChecked(false);
                r2.setChecked(false);
                r3.setChecked(false);
                r4.setChecked(false);

                if(qcount<6){

                    qcount++;

                    if(qcount==6)
                    {
                        //bn.setVisibility(view.VISIBLE);
                        // bs.setVisibility(view.INVISIBLE);
                        FlagQuestion fragment = new FlagQuestion();

                        FragmentManager fragmentManager = getFragmentManager();

                        fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
                    }
                    else
                    {
                        if (flag_question[qcount-1]==1)
                        {
                            bf.setBackgroundResource(R.drawable.red_flag);
                        }

                        else if(flag_question[qcount-1]==0)
                        {
                            bf.setBackgroundResource(R.drawable.blue_flag);
                        }
                    }
                }

                /*if(qcount==6)
                {
                    //bn.setVisibility(view.VISIBLE);
                    // bs.setVisibility(view.INVISIBLE);
                    FlagQuestion fragment = new FlagQuestion();

                    FragmentManager fragmentManager = getFragmentManager();

                    fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
                }*/
                Toast.makeText(getActivity(), qcount+" qcount", Toast.LENGTH_SHORT).show();


                select(qcount);

                if(qcount==5)
                {
                    //bn.setVisibility(view.INVISIBLE);
                    //bs.setVisibility(view.VISIBLE);

                    for(int i=0; i<5; i++)
                    {
                        if(flag_question[i]==1)
                        {
                            Toast.makeText(getActivity(), Integer.toString(i+1), Toast.LENGTH_SHORT).show();
                        }
                    }

                   /* bn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            FlagQuestion fragment = new FlagQuestion();

                            FragmentManager fragmentManager = getFragmentManager();

                            fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
                        }
                    });*/
                }

            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setChecked(false);
                r2.setChecked(false);
                r3.setChecked(false);
                r4.setChecked(false);
                if(qcount>1)
                {
                    //Toast.makeText(getActivity(), Integer.toString(qcount-1), Toast.LENGTH_SHORT).show();
                    qcount--;
                }
                select(qcount);

                if (flag_question[qcount-1]==1)
                {
                    bf.setBackgroundResource(R.drawable.red_flag);
                }

                else if(flag_question[qcount-1]==0)
                {
                    bf.setBackgroundResource(R.drawable.blue_flag);
                }

                if(qcount==4)
                {
                    bn.setVisibility(view.VISIBLE);
                    //bs.setVisibility(view.INVISIBLE);
                }

            }
        });
        /*bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                Intent intent1=new Intent(getActivity(),LAST.class);
                startActivity(intent1);
            }
        });*/

        //flag button
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bf.setBackgroundResource(R.drawable.blue_flag);
                if (flag_question[qcount-1]==0)
                {
                    // Toast.makeText(getActivity(), Integer.toString(qcount-1), Toast.LENGTH_SHORT).show();
                    bf.setBackgroundResource(R.drawable.red_flag);
                    flag_question[qcount-1]=1;
                }
                else if(flag_question[qcount-1] == 1)
                {
                    bf.setBackgroundResource(R.drawable.blue_flag);
                    flag_question[qcount-1]=0;
                }
            }
        });
        return view;
    }


    public void radio_qw()
    {
        int selected_id=radio_g.getCheckedRadioButtonId();
        rx=(RadioButton)getView().findViewById(selected_id);
        Toast.makeText(getActivity(),r1.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    public void select(int choice)
    {
        String[] tab_names = getResources().getStringArray(R.array.tab_names);

        //String tabname1 = tab_names[0];

        //Toast.makeText(getActivity(), tabname1, Toast.LENGTH_SHORT).show();

        switch (choice)
        {
            case 1:
            {
                r1.setText("A. Anguish");
                r2.setText("B. Abstinence");
                r3.setText("C. Asperity");

                //Q.setText("QUESTION 1");
                q.setText("Out of the given alternatives select the alternative which best expresses the meaning of the word - Proclivity");
                break;
            }
            case 2:
            {
                r1.setText(tab_names[6]);
                r2.setText(tab_names[7]);
                r3.setText(tab_names[8]);
                r4.setText(tab_names[9]);
                //Q.setText("QUESTION 2");
                q.setText(tab_names[5]);
                break;
            }
            case 3:
            {
                r1.setText("option1");
                r2.setText("option2");
                r3.setText("option3");
                //Q.setText("QUESTION 3");
                q.setText("3) This is the third question");
                break;
            }
            case 4:
            {
                r1.setText("option1");
                r2.setText("option2");
                r3.setText("option3");
                //Q.setText("QUESTION 4");
                q.setText("4) This is the four question");
                break;
            }
            case 5:
            {
                r1.setText("option1");
                r2.setText("option2");
                r3.setText("option3");
                //Q.setText("QUESTION 5");
                q.setText("5) This is the five question");
                break;
            }
            case 6:
            {
                FlagQuestion fragment = new FlagQuestion();

                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();
            }
        }
    }
}
