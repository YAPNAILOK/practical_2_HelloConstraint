package com.example.practical_2_helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private int mZero=0;
    private Button reset;
    private Button mOddEven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
        reset = (Button) findViewById(R.id.button_zero);
        mOddEven = (Button) findViewById(R.id.button_count);
        }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
        reset.setBackgroundColor(Color.MAGENTA);
        if(mCount%2 == 0) {
            mOddEven.setBackgroundColor(Color.GREEN);
        }
        else {
            mOddEven.setBackgroundColor(Color.BLUE);
        }
    }

    public void backZero(View view) {
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mZero));
            reset.setBackgroundColor(Color.GRAY);
    }
}