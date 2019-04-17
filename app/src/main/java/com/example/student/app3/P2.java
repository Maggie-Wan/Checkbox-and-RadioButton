package com.example.student.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class P2 extends AppCompatActivity {
    Button home,ok;
    RadioButton b1,b2,b3;
    CheckBox c1,c2,c3;
    TextView ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        home=(Button)findViewById(R.id.home);
        ok=(Button)findViewById(R.id.ok);
        b1=(RadioButton)findViewById(R.id.b1);
        b2=(RadioButton)findViewById(R.id.b2);
        b3=(RadioButton)findViewById(R.id.b3);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        ans2=(TextView)findViewById(R.id.ans2);
    }
    public void home(View v){
        Intent in=new Intent();
        in.setClass(P2.this,MainActivity.class);
        startActivity(in);
    }
    public void ok(View v){
        String job="";
        String interest="";
        if (b1.isChecked()){
            job="資訊";
        }else if(b2.isChecked()){
            job="教育";
        }else if(b3.isChecked()){
            job="金融";
        }

        //if(!(c1.isChecked())&&!(c2.isChecked())&&!(c3.isChecked()))interest=interest+"請選擇任一興趣!";
        if(c1.isChecked())interest=interest+" 電影";
        if(c2.isChecked())interest=interest+" 運動";
        if(c3.isChecked())interest=interest+" 音樂";
        ans2.setText("您的職業是："+job+"\n您的興趣是："+interest);
    }
}
