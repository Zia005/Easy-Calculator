package com.rootdata21.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Double numberOne,numberTwo;
    Boolean Add= false;
    Boolean Sub= false;
    Boolean Div = false;
    Boolean Mul = false;
    Boolean Mod = false ;
    boolean Dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = findViewById(R.id.textViewForOutput);
        Button btn0 = findViewById(R.id.button0);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btnAdd = findViewById(R.id.buttonAddition);
        Button btnMul = findViewById(R.id.buttonMultiplication);
        Button btnSub = findViewById(R.id.buttonSubtraction);
        Button btnDiv = findViewById(R.id.buttonDiv);
        Button btnDot = findViewById(R.id.buttonDot);
        Button btnMod = findViewById(R.id.buttonModulus);
        Button btnDel = findViewById(R.id.buttonDelete);
        Button btnEql = findViewById(R.id.buttonEqual);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"9");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().length() != 0){
                    numberOne = Double.parseDouble(output.getText().toString());
                    Add = true;
                    Dot = false;
                    output.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().length() != 0){
                    numberOne = Double.parseDouble(output.getText().toString());
                    Sub = true;
                    Dot = false;
                    output.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().length() != 0){
                    numberOne = Double.parseDouble(output.getText().toString());
                    Mul = true;
                    Dot = false;
                    output.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().length() != 0){
                    numberOne = Double.parseDouble(output.getText().toString());
                    Div = true;
                    Dot = false;
                    output.setText("");
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().length() != 0){
                    numberOne = Double.parseDouble(output.getText().toString());
                    Mod = true;
                    Dot = false;
                    output.setText("");
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(output.getText().length() != 0) {
//
//                }

                if(Add || Sub || Mul || Div || Mod){
                    numberTwo = Double.parseDouble(output.getText().toString());
                    Log.d("check",numberTwo.toString());
                }

                if(Add){
                    output.setText((numberOne + numberTwo) +"");
                    Add = false;
                }

                if(Sub){
                    output.setText(numberOne - numberTwo +"");
                    Sub = false;
                }

                if(Mul){
                    output.setText(numberOne * numberTwo +"");
                    Mul = false;
                }

                if(Div){
                    output.setText(numberOne / numberTwo +"");
                    Div = false;
                }

                if(Mod){
                    output.setText(numberOne % numberTwo +"");
                    Mod = false;
                }
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                numberOne = 0.0;
                numberTwo = 0.0;
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Dot){
                    output.setText(output.getText()+".");
                    Dot= true;
                }
            }
        });


    }
}