package com.example.calculator20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String text1 = "";
    String opration = "";
    double ans = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Numberclick(View view){
        TextView display1 = (TextView) findViewById(R.id.display1);
        String text = display1.getText().toString();
        switch (view.getId()){
            case R.id.one:
                display1.setText(text+"1");
                break;
            case R.id.two:
                display1.setText(text+"2");
                break;
            case R.id.three:
                display1.setText(text+"3");
                break;
            case R.id.four:
                display1.setText(text+"4");
                break;
            case R.id.five:
                display1.setText(text+"5");
                break;
            case R.id.six:
                display1.setText(text+"6");
                break;
            case R.id.seven:
                display1.setText(text+"7");
                break;
            case R.id.eight:
                display1.setText(text+"8");
                break;
            case R.id.nine:
                display1.setText(text+"9");
                break;
            case R.id.zero:
                display1.setText(text+"0");
                break;
            case R.id.dot:
                display1.setText(text+".");
                break;
            case R.id.plusMinus:
                display1.setText("-" +text);
                break;
            default:
                display1.setText("");
                break;
        }
    }
    public void onOperation(View view){
        TextView display2 = (TextView) findViewById(R.id.display2);
        TextView display1 = (TextView) findViewById(R.id.display1);
        String text = display1.getText().toString();
        text1 = text;
         switch (view.getId()){
             case R.id.plus:
                 display2.setText(text + " +");
                 display1.setText("");
                 opration = "Addition";
                 break;
             case R.id.substraction:
                 display2.setText(text + " -");
                 display1.setText("");
                 opration = "Substraction";
                 break;
             case R.id.Multiply:
                 display2.setText(text + " *");
                 display1.setText("");
                 opration = "Multiplication";
                 break;
             case R.id.divide:
                 display2.setText(text + " /");
                 display1.setText("");
                 opration = "Division";
                 break;
             case R.id.mod:
                 display2.setText(text + " %");
                 display1.setText("");
                 opration = "Mod";
                 break;
         }
    }
    public void DisplayAns(View view){
        TextView display1 = (TextView) findViewById(R.id.display1);
        String text = display1.getText().toString();
        TextView display2 = (TextView) findViewById(R.id.display2);
        String text2 = display2.getText().toString();
        display2.setText(text2 + " " +text);

        Double value2 = Double.parseDouble(text);
        Double value1 = Double.parseDouble(text1);
        switch (opration){
            case "Addition":
               display1.setText("ans : "+ (value1 + value2));
               ans= value1 + value2;
               break;
            case "Substraction":
                display1.setText("ans : "+ (value1 - value2));
                ans= value1 - value2;
                break;
            case "Multiplication":
                display1.setText("ans : "+ (value1 * value2));
                ans= value1 * value2;
                break;
            case "Division":
                display1.setText("ans : "+ (value1 / value2));
                ans= value1 / value2;
                break;
            case "Mod":
                display1.setText("ans : "+ (value1 % value2));
                ans= value1 % value2;
                break;
        }

    }
    public void ClearDisplay(View view){
        TextView display2 = (TextView) findViewById(R.id.display2);
        TextView display1 = (TextView) findViewById(R.id.display1);
        display1.setText(null);
        display2.setText(null);
    }
    public void onCclicked(View view){
        TextView display2 = (TextView) findViewById(R.id.display2);
        display2.setText(Double.toString(ans));
        TextView display1 = (TextView) findViewById(R.id.display1);
        display1.setText(null);
    }
}