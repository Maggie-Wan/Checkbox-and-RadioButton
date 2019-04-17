package com.example.student.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText x,y;
    CheckBox s1,s2,s3;
    Button cal,btnP2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=(EditText)findViewById(R.id.x);
        y=(EditText)findViewById(R.id.y);
        s1=(CheckBox)findViewById(R.id.s1);
        s2=(CheckBox)findViewById(R.id.s2);
        s3=(CheckBox)findViewById(R.id.s3);
        cal=(Button)findViewById(R.id.cal);
        ans=(TextView)findViewById(R.id.ans);
        btnP2=(Button)findViewById(R.id.btnP2);
    }
    public void btnP2(View v){
        Intent in=new Intent();
        in.setClass(MainActivity.this,P2.class);
        startActivity(in);
    }
    public void cal(View v){
        try{
        int X=Integer.parseInt(x.getText().toString());
        int Y=Integer.parseInt(y.getText().toString());
        boolean S1=s1.isChecked();
        boolean S2=s2.isChecked();
        boolean S3=s3.isChecked();
        int sum=29*X+31*Y;
        if (S1==true){
          sum=sum+30;
        }
        if (S2==true){
            sum=sum+60;
        }
        if (S3==true){
            sum=sum+60;
        }
        ans.setText("總金額合計="+sum+"元");
        }catch (Exception e){
            ans.setText("不可輸入空白");
        }
    }
}
