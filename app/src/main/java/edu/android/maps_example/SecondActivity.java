package edu.android.maps_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        List<Location> list = (List<Location>) intent.getSerializableExtra("location");

        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        for (Location location : list) {
            textView.append(location.toString() + "\n");
        }
    }
}
