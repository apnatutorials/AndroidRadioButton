package com.apnatutorials.androidradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method will be called when user click on a radio button
     * @param view
     */
    public void radioButtonClickHandler(View view){
        RadioButton radioButton = (RadioButton) view ;
        RadioGroup radioGroup = (RadioGroup) radioButton.getParent();

        switch(radioGroup.getId()){
            case R.id.rgDefault:
                showMessage("Default", radioButton);
                break;

            case R.id.rgCustom:
                showMessage("Custom", radioButton);
                break;
        }
        /*
               // You can use this code to get checked radio button id of a radiogroup

                int checkedId = radioGroup.getCheckedRadioButtonId();
                if(checkedId != -1){
                    RadioButton radioButton = (RadioButton) findViewById(checkedId) ;
                    // This is checked radio button, do whatever you want
                }
                else {
                    // No selection in this radiogroup
                }
         */

    }

    /**
     * Method display checked RadioButton and RadioGroup
     * @param group
     * @param radioButton
     */
    private void showMessage(String group, RadioButton radioButton){
        String msg = "You clicked " + radioButton.getText() + " button of Group "+ group ;
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
        /* You can use below code to handle click event of a radio button
        switch(radioButton.getId()){
            case R.id.rbCustomMale:

                break;

            case R.id.rbCustomFemale:

                break;

            case R.id.rbDefaultMale:

                break;

            case R.id.rbDefaultFemale :

                break;
        }
        */


    }
}
