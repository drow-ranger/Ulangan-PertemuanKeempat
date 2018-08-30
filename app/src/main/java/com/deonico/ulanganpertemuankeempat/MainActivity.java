package com.deonico.ulanganpertemuankeempat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnAngka1 = findViewById(R.id.btn1);
        Button BtnAngka2 = findViewById(R.id.btn2);
        Button BtnAngka3 = findViewById(R.id.btn3);
        Button BtnAngka4 = findViewById(R.id.btn4);
        Button BtnAngka5 = findViewById(R.id.btn5);
        Button BtnAngka6 = findViewById(R.id.btn6);
        Button BtnAngka7 = findViewById(R.id.btn7);
        Button BtnAngka8 = findViewById(R.id.btn8);
        Button BtnAngka9 = findViewById(R.id.btn9);
        Button BtnAngka0 = findViewById(R.id.btn0);
        Button BtnRmv = findViewById(R.id.btnRmv);
        final Button BtnTmb = findViewById(R.id.btnTmb);
        Button BtnKrg = findViewById(R.id.btnKrg);
        Button BtnKali = findViewById(R.id.btnKali);
        Button BtnBagi = findViewById(R.id.btnBagi);
        final Button Calc = findViewById(R.id.btnCalc);
        final TextView Angka1 = findViewById(R.id.tvAngka1);
        final TextView Angka2 = findViewById(R.id.tvAngka2);
        final TextView Operator = findViewById(R.id.tvOperator);

        BtnAngka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"1");
            }
        });

        BtnAngka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"2");
            }
        });

        BtnAngka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"3");
            }
        });

        BtnAngka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"4");
            }
        });

        BtnAngka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"5");
            }
        });

        BtnAngka6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"6");
            }
        });

        BtnAngka7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"7");
            }
        });

        BtnAngka8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"8");
            }
        });

        BtnAngka9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"9");
            }
        });

        BtnAngka0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1.setText(Angka1.getText()+"0");
            }
        });

        BtnRmv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = Angka1.getText().toString();
                str = str.substring ( 0, str.length() - 1 );
                Angka1.setText(str);
            }
        });

        BtnTmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operator.setText("+");
                Angka2.setText(Angka1.getText());
                Angka1.setText("");
            }
        });

        BtnKrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operator.setText("-");
                Angka2.setText(Angka1.getText());
                Angka1.setText("");
            }
        });

        BtnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operator.setText("*");
                Angka2.setText(Angka1.getText());
                Angka1.setText("");
            }
        });

        BtnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operator.setText("/");
                Angka2.setText(Angka1.getText());
                Angka1.setText("");
            }
        });

        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Operator.getText().toString().equals("+"))
                {
                    int ang1 = Integer.parseInt(Angka2.getText().toString());
                    int ang2 = Integer.parseInt(Angka1.getText().toString());
                    int hasil = ang2 + ang1;
                    Angka1.setText(String.valueOf(hasil));
                }
                else if(Operator.getText().toString().equals("-"))
                {
                    int ang1 = Integer.parseInt(Angka2.getText().toString());
                    int ang2 = Integer.parseInt(Angka1.getText().toString());
                    int hasil = ang2 - ang1;
                    Angka1.setText(String.valueOf(hasil));
                }
                else if(Operator.getText().toString().equals("*"))
                {
                    int ang1 = Integer.parseInt(Angka2.getText().toString());
                    int ang2 = Integer.parseInt(Angka1.getText().toString());
                    int hasil = ang2 * ang1;
                    Angka1.setText(String.valueOf(hasil));
                }
                else if(Operator.getText().toString().equals("/"))
                {
                    int ang1 = Integer.parseInt(Angka2.getText().toString());
                    int ang2 = Integer.parseInt(Angka1.getText().toString());
                    int hasil = ang2 / ang1;
                    Angka1.setText(String.valueOf(hasil));
                }

            }
        });

    }
}
