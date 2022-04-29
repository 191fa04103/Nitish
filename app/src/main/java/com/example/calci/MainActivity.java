package com.example.calci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    Button zero,one,two,three,four,five,six,seven,eight,nine,equal,point,plus,clear,minus,mul,div,percent,openbrace,closedbrace,cancel;
    TextView textview;
    String exp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=findViewById(R.id.textview);

        zero=findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"0";
                textview.setText(exp);

            }
        });
        one=findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"1";
                textview.setText(exp);
            }
        });
        two=findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"2";
                textview.setText(exp);
            }
        });
        three=findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"3";
                textview.setText(exp);
            }
        });
        four=findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"4";
                textview.setText(exp);
            }
        });
        five=findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"5";
                textview.setText(exp);
            }
        });
        six=findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"6";
                textview.setText(exp);
            }
        });
        seven=findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"7";
                textview.setText(exp);
            }
        });
        eight=findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"8";
                textview.setText(exp);
            }
        });
        nine=findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"9";
                textview.setText(exp);
            }
        });


        point=findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+".";
                textview.setText(exp);
            }
        });
        plus=findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"+";
                textview.setText(exp);
            }
        });
        clear=findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp="";
                textview.setText(exp);
            }
        });
        minus=findViewById(R.id.min);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"-";
                textview.setText(exp);
            }
        });
        mul=findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"*";
                textview.setText(exp);
            }
        });
        div=findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"/";
                textview.setText(exp);
            }
        });
        percent=findViewById(R.id.percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"%";
                textview.setText(exp);
            }
        });
        openbrace=findViewById(R.id.openbrace);
        openbrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+"(";
                textview.setText(exp);
            }
        });
        closedbrace=findViewById(R.id.closedbrace);
        closedbrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+")";
                textview.setText(exp);
            }
        });
        cancel=findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (exp.length()>=1){
                    exp=exp.substring(0,exp.length()-1);}
                else{
                    exp="";
                }
                textview.setText(exp);
            }
        });
        equal=findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, exp, Toast.LENGTH_SHORT).show();
                // exp=evaluate(exp.toString());
                try {
                    Expression e = new ExpressionBuilder(exp).build();
                    Double result = e.evaluate();
                    textview.setText(result.toString());
                    exp = result.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }

}