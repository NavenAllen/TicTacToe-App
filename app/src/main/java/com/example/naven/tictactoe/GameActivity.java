package com.example.naven.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sq00 = (TextView)findViewById(R.id.sq00);
        sq00.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                setchar(sq00, true);
            }
        });
    }

    public void setchar(TextView view, boolean isMax){
        if(isMax){
            view.setText("X");
        }
    }
}
