package com.example.kadibibas.limodim;

import java.text.DateFormat;
import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class Schedule extends AppCompatActivity {

    DateFormat dateFormat = DateFormat.getDateTimeInstance();
    Calendar DateTime = Calendar.getInstance();
    private TextView textView4;
    private Button bo1,bo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        textView4  = (TextView)findViewById(R.id.textView4);
        bo1 = (Button)findViewById(R.id.button2);
        bo2 = (Button)findViewById(R.id.button3);
        updateTextLabel();

        bo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateDate();
            }
        });

        bo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateTime();
            }
        });

        final ImageButton back16 = (ImageButton)findViewById(R.id.back16);

        back16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Schedule.this, MainActivity.class);
                Schedule.this.startActivity(registerIntent);
            }
        });

    }

    private void UpdateDate()
    {
        new DatePickerDialog(this, d, DateTime.get(Calendar.YEAR), DateTime.get(Calendar.MONTH), DateTime.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void UpdateTime()
    {
        new TimePickerDialog(this, t, DateTime.get(Calendar.HOUR_OF_DAY), DateTime.get(Calendar.MINUTE), true).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
        {
            DateTime.set(Calendar.YEAR, year);
            DateTime.set(Calendar.MONTH,month);
            DateTime.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            updateTextLabel();

        }
    };

    TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute)
        {
            DateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            DateTime.set(Calendar.MINUTE, minute);
            updateTextLabel();
        }
    };


    private void updateTextLabel()
    {
        textView4.setText(dateFormat.format(DateTime.getTime()));
    }
}
