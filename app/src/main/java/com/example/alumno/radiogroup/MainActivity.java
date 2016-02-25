package com.example.alumno.radiogroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    TextView t1;
    TextView t2;
    RadioButton b;
    CheckBox d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        t1=(TextView)findViewById(R.id.t);
        t2=(TextView)findViewById(R.id.t2);
    }
    public void cambiarColor(View view){
        if(r1.isChecked()==true){
            b=r1;
        }
        if(r2.isChecked()==true){
            b=r2;
        }
        if(r3.isChecked()==true) {
            b=r3;
        }
    }
    public void jugar(View view){
        switch (b.getCurrentTextColor()){
            case Color.RED:
                t1.setTextColor(Color.RED);
                break;
            case Color.BLUE:
                t1.setTextColor(Color.BLUE);
                break;
            case Color.GREEN:
                t1.setTextColor(Color.GREEN);
                break;
        }

    }
    public void cambiarColor2(View view){
        if(c1.isChecked()==true){
            t2.setTextColor(Color.RED);
        }
        if(c2.isChecked()==true){
            t2.setTextColor(Color.BLUE);
        }
        if(c3.isChecked()==true){
            t2.setTextColor(Color.GREEN);
        }
        if(c1.isChecked()==false && c2.isChecked()==false && c3.isChecked()==false){
            t2.setTextColor(Color.BLACK);
        }
    }
}
