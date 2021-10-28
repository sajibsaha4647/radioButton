package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttons;
    private RadioButton radioButton;
    private TextView texts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.RadioGroupid1);

        buttons = findViewById(R.id.resbutton);

        texts = findViewById(R.id.showText);



           buttons.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                  if(radioGroup.getCheckedRadioButtonId() == -1){
                      Toast.makeText(MainActivity.this,"all field are required",Toast.LENGTH_LONG).show();
                  }else{
                      try {
                          int selectedid = radioGroup.getCheckedRadioButtonId();
                          radioButton = (RadioButton) findViewById(selectedid);

                          String values =  radioButton.getText().toString();

                          texts.setText("you have clicked"+ values);

                          Log.d("radioButton", values);

                      }catch (Exception E){

                      }
                  }


               }
           });




    }
}