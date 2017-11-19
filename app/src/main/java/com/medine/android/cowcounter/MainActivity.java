package com.medine.android.cowcounter;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String LOGGING_TAG = "MAINACTIVITY";
    Button buttonClear, buttonRej, buttonAdd;
    EditText breed, id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOGGING_TAG, getLocalClassName() + ".onCreate() is called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonRej = (Button) findViewById(R.id.button_rej);
        buttonAdd = (Button) findViewById(R.id.button_add);
        breed = (EditText) findViewById(R.id.editText_breed);
        id = (EditText) findViewById(R.id.editText_id);

        buttonClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d(LOGGING_TAG, "BUTTON CLEAR PRESSED");
                String breedText = "";
                breedText = breed.getText().toString();
                Log.d(LOGGING_TAG, breedText);
            }
        });
        buttonRej.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d(LOGGING_TAG, "BUTTON REJECT PRESSED");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d(LOGGING_TAG, "BUTTON ADD PRESSED");
                breed.setText("");
            }
        });



    }


}

