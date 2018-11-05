package com.pearlmaknun.uts.uts_1157050083;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailMatchActivity extends AppCompatActivity {

    TextView a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_match);

        a = findViewById(R.id.tim1);
        b = findViewById(R.id.tim2);
        c = findViewById(R.id.skor1);
        d = findViewById(R.id.skor2);

        a.setText(getIntent().getStringExtra("Tim1"));
        b.setText(getIntent().getStringExtra("Tim2"));
        c.setText(getIntent().getIntExtra("Skor1", 0));
        c.setText(getIntent().getIntExtra("Skor2", 0));

    }
}
