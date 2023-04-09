package com.example.ex04_;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class secondActivity extends Activity {

    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView text2=(TextView) findViewById(R.id.TextView2);
        TextView text22=(TextView) findViewById(R.id.TextView22);
        Bundle bunde=this.getIntent().getExtras();
        Bundle bunde2=this.getIntent().getExtras();

        String str=bunde.getString("text");
        String str2=bunde2.getString("text");
        text2.setText(str);
        text22.setText(str2);
        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new btnclock2());
    }
    class btnclock2 implements OnClickListener{
        public void onClick(View v)
        {
            Intent intent2=new Intent();
            intent2.setClass(secondActivity.this,MainActivity.class);
            startActivityForResult(intent2,0);
        }
    }
}