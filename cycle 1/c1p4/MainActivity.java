package com.example.sjcet.pgm4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public ublic class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1, button2;
        final RelativeLayout relativeLayout;


        button1 = findViewById(R.id.btVar1);


        button2 = findViewById(R.id.btVar2);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
