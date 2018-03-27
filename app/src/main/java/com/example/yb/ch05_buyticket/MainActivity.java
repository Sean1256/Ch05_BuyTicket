package com.example.yb.ch05_buyticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void show(View view){
        TextView txv = (TextView) findViewById(R.id.txv);

        RadioGroup ticketType = (RadioGroup) findViewById(R.id.ticketType);
        RadioGroup numOfTicket = (RadioGroup) findViewById(R.id.numOfTicket);

            RadioButton select = (RadioButton) findViewById(ticketType.getCheckedRadioButtonId());
            RadioButton num = (RadioButton) findViewById(numOfTicket.getCheckedRadioButtonId());
            txv.setText("buy"+select.getText()+num.getText());
        

    }

}
