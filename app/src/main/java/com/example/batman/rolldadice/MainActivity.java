package com.example.batman.rolldadice;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity{

    Random r = new Random();

    private Button d4, d6, d8, d10, d12, d20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Set each button to its respective button on the layout
        d4 = (Button) findViewById(R.id.button);

        d6 = (Button) findViewById(R.id.button2);

        d8 = (Button) findViewById(R.id.button3);

        d10 = (Button) findViewById(R.id.button4);

        d12 = (Button) findViewById(R.id.button5);

        d20 = (Button) findViewById(R.id.button6);

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
    //Roll a random number between 1 and the number of sides on the die
    public void rolld4(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(""+(r.nextInt(4)+1));
    }

    public void rolld6(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(""+(r.nextInt(6)+1));
    }

    public void rolld8(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView3);
        t.setText(""+(r.nextInt(8)+1));
    }

    public void rolld10(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView4);
        t.setText(""+(r.nextInt(10)+1));
    }

    public void rolld12(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView5);
        t.setText(""+(r.nextInt(12)+1));
    }

    public void rolld20(View v)
    {
        TextView t = (TextView) findViewById(R.id.textView6);
        t.setText(""+(r.nextInt(20)+1));
    }

}
