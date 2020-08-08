package com.example.puspendra.trafficsignal;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView b1,b2,b3;
TextView tv;
int k=0, m=0, i=0;
CountDownTimer ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        tv=findViewById(R.id.tv1);

        ct=new CountDownTimer(6000000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                k++;
                String str=""+k;
                tv.setText(str);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.VISIBLE);
                if (m==0){
                    if (k==10){
                        b1.setVisibility(View.INVISIBLE);
                        b2.setVisibility(View.VISIBLE);
                        b3.setVisibility(View.INVISIBLE);
                        k=0;
                        m=1;
                    }
                }
                else {
                    k++;
                    if (k==10){
                        Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                        String s = "" + k;
                        tv.setText(s);
                        b1.setVisibility(View.INVISIBLE);
                        b2.setVisibility(View.INVISIBLE);
                        b3.setVisibility(View.VISIBLE);
                        k = 0;
                    }



                }


            }

            @Override
            public void onFinish() {

            }
        };
        ct.start();

   }
}
