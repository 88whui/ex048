package com.example.ex04_;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.EditText;
public class MainActivity extends Activity {

    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new btnclock());
    }
    class btnclock implements OnClickListener{
        public void onClick(View v)
        {
            Intent intent=new Intent();
            Intent intent2=new Intent();
            intent.setClass(MainActivity.this,secondActivity.class);
            intent2.setClass(MainActivity.this,secondActivity.class);
            EditText txt=(EditText)findViewById(R.id.editText1);
            EditText txt22=(EditText)findViewById(R.id.editText22);
            Bundle bundle=new Bundle();
            Bundle bundle2=new Bundle();
            bundle.putString("text",txt.getText().toString());
            bundle2.putString("text",txt22.getText().toString());
            intent.putExtras(bundle);
            intent2.putExtras(bundle2);
            startActivity(intent);
            startActivity(intent2);
        }
    }
}