package com.example.sidsa.quiz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Frag2 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private RadioGroup radio_g2;
    private RadioButton r2;
    private Button b2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_frag2, container, false);
        radio_g2= (RadioGroup) view.findViewById(R.id.rad);
        b2= (Button)view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected_id=radio_g2.getCheckedRadioButtonId();
                r2=(RadioButton)view.findViewById(selected_id);
                Toast.makeText(getActivity(),r2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }


}
