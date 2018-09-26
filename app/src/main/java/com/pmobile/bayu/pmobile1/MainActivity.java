package com.pmobile.bayu.pmobile1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cup(View view) {
        a = a + 1;
        display(a);
    }

    public void cdwn(View view) {
        a = a - 1;
        display(a);
    }

    private void display(int angka) {
        TextView displayInteger = (TextView) findViewById(R.id.angkatxt);
        displayInteger.setText("" + angka);
    }
}