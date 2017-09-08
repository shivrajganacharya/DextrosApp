package com.example.sidsa.quiz;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FlagQuestion extends Fragment implements inter1{

    //TextView t1,t2,t3,t4,t5;
    public String question;
    private Button bs;
    public Button[] flg = new Button[5];
    public Button btn_question;
    int flag,i;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_flag_question, container, false);

        flg[0] = (Button)v.findViewById(R.id.button7);
        flg[1] = (Button)v.findViewById(R.id.button10);
        flg[2] = (Button)v.findViewById(R.id.button11);
        flg[3] = (Button)v.findViewById(R.id.button12);
        flg[4] = (Button)v.findViewById(R.id.button13);
        //flg[5] = (Button)v.findViewById(R.id.button39);
        /*flg[6] = (Button)v.findViewById(R.id.button40);
        flg[7] = (Button)v.findViewById(R.id.button41);
        flg[8] = (Button)v.findViewById(R.id.button42);
        flg[9] = (Button)v.findViewById(R.id.button43);
        flg[10] = (Button)v.findViewById(R.id.button44);
        flg[11] = (Button)v.findViewById(R.id.button45);
        flg[12] = (Button)v.findViewById(R.id.button46);
        flg[13] = (Button)v.findViewById(R.id.button47);
        flg[14] = (Button)v.findViewById(R.id.button48);
        flg[15] = (Button)v.findViewById(R.id.button49);
        flg[16] = (Button)v.findViewById(R.id.button50);
        flg[17] = (Button)v.findViewById(R.id.button51);
        flg[18] = (Button)v.findViewById(R.id.button52);
        flg[19] = (Button)v.findViewById(R.id.button53);
        flg[20] = (Button)v.findViewById(R.id.button54);
        flg[21] = (Button)v.findViewById(R.id.button55);
        flg[22] = (Button)v.findViewById(R.id.button56);
        flg[23] = (Button)v.findViewById(R.id.button57);
        flg[24] = (Button)v.findViewById(R.id.button58);
        flg[25] = (Button)v.findViewById(R.id.button59);
        flg[26] = (Button)v.findViewById(R.id.button60);
        flg[27] = (Button)v.findViewById(R.id.button61);
        flg[28] = (Button)v.findViewById(R.id.button62);
        flg[29] = (Button)v.findViewById(R.id.button63);
        flg[30] = (Button)v.findViewById(R.id.button64);
        flg[31] = (Button)v.findViewById(R.id.button65);
        flg[32] = (Button)v.findViewById(R.id.button66);
        flg[33] = (Button)v.findViewById(R.id.button67);
        flg[34] = (Button)v.findViewById(R.id.button68);*/


        for (i=0; i<5; i++)
        {
        if (flag_question[i]==1)
            {
                //Toast.makeText(getActivity(),Integer.toString(i+1)+"value of i",Toast.LENGTH_SHORT).show();
                flg[i].setTextColor(Color.RED);
               /* flg[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                        Initialfrag fragment = new Initialfrag();
                        Bundle bundle = new Bundle();
                        bundle.putInt("value",i+1);

                       // bundle.putString("value",Integer.toString(i));
                        fragment.setArguments(bundle);
                        FragmentManager fragmentManager = getFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

                        //b1.setVisibility(view.INVISIBLE);
                    }
                });*/
            }
        }

        bs=(Button)v.findViewById(R.id.button9);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                Intent intent1=new Intent(getActivity(),LAST.class);
                startActivity(intent1);
            }
        });



        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",2);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",3);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",4);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",5);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        /*flg[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        /*flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });
        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });

        flg[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Initialfrag fragment = new Initialfrag();
                Bundle bundle = new Bundle();
                bundle.putInt("value",i+1);
                // bundle.putString("value",Integer.toString(i));
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frag_place, fragment).commit();

            }
        });*/




        return v;
    }

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
