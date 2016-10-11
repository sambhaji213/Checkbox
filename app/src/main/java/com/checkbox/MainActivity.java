package com.checkbox;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxClicked(View v){
        //Get reference of the CheckBoxes
        CheckBox cb_red = (CheckBox) findViewById(R.id.checkbox_red);
        CheckBox cb_brown = (CheckBox) findViewById(R.id.checkbox_brown);
        CheckBox cb_yellow = (CheckBox) findViewById(R.id.checkbox_yellow);
        CheckBox cb_crimson = (CheckBox) findViewById(R.id.checkbox_crimson);
        CheckBox cb_indigo = (CheckBox) findViewById(R.id.checkbox_indigo);

        //Is the view (Clicked CheckBox) now checked
        boolean checked = ((CheckBox) v).isChecked();

        //So, check which CheckBox was Clicked and generated a Click event
        switch(v.getId()){ //get the id of clicked CheckBox
            case R.id.checkbox_red:
                if (checked){
                    //if 'Red' CheckBox checked, changed its text to bold and italic
                    cb_red.setTypeface(cb_red.getTypeface(), Typeface.BOLD_ITALIC);
                }
                else{
                    //if 'Red' CheckBox unchecked, changed its text to normal state
                    cb_red.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case R.id.checkbox_brown:
                if (checked){
                    cb_brown.setTypeface(cb_red.getTypeface(), Typeface.BOLD_ITALIC);
                }
                else{
                    cb_brown.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case R.id.checkbox_yellow:
                if (checked){
                    cb_yellow.setTypeface(cb_red.getTypeface(), Typeface.BOLD_ITALIC);
                }
                else{
                    cb_yellow.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case R.id.checkbox_crimson:
                if (checked){
                    cb_crimson.setTypeface(cb_red.getTypeface(), Typeface.BOLD_ITALIC);
                }
                else{
                    cb_crimson.setTypeface(null, Typeface.NORMAL);
                }
                break;
            case R.id.checkbox_indigo:
                if (checked){
                    cb_indigo.setTypeface(cb_red.getTypeface(), Typeface.BOLD_ITALIC);
                }
                else{
                    cb_indigo.setTypeface(null, Typeface.NORMAL);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
