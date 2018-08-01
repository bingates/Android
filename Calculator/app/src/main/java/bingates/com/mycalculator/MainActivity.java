package bingates.com.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void init(View v, String m){

        result = (TextView) findViewById(R.id.result);

        String calResult = "";
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        if (m=="add") {
            calResult = Integer.toString(n1+n2);
        }else if(m=="substract"){
            calResult = Integer.toString(n1-n2);
        }else if(m=="multiply"){
            calResult = Integer.toString(n1*n2);
        }else if(m=="divide"){
            calResult = Integer.toString(n1/n2);
        }

        result.setText(calResult);
    }

    public void addClick(View v){
        init(v, "add");
    }

    public void substractClick(View v){
        init(v, "substract");
    }

    public void multiplyClick(View v){
        init(v, "multiply");
    }

    public void divideClick(View v){
        init(v, "divide");
    }
}
