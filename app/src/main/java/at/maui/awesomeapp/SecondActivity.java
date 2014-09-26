package at.maui.awesomeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by maui on 26.09.14.
 */
public class SecondActivity extends Activity {

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        myTextView = (TextView) findViewById(R.id.targetText);

        Intent myIntent = getIntent();
        myTextView.setText(myIntent.getStringExtra("myinput"));
    }
}
