package com.example.dell.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edit,edit1;
    Button buton,buton2,buton3,buton4,clear;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=findViewById(R.id.editText3);
        edit1=findViewById(R.id.editText4);
        buton=findViewById(R.id.button);
        buton2=findViewById(R.id.button2);
        buton3=findViewById(R.id.button3);
        buton4=findViewById(R.id.button4);
        text=findViewById(R.id.textView);
        clear=findViewById(R.id.button5);

        buton.setOnClickListener(this);
        buton2.setOnClickListener(this);
        buton3.setOnClickListener(this);
        buton4.setOnClickListener(this);
        clear.setOnClickListener(this);

    }
    public void onClick(View v){
        int number1=-32;
                number1=Integer.parseInt(edit.getText().toString());
        int number2=-2;
                number2=Integer.valueOf(edit1.getText().toString());

        switch(v.getId()){
            case R.id.button:

                    Toast.makeText(MainActivity.this,"Toplama yapıldı",Toast.LENGTH_SHORT).show();

                    text.setText("Cevap : "+String.valueOf(number1+number2));
                    clear.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            edit.getText().clear();
                            edit1.getText().clear();
                            Toast.makeText(MainActivity.this,"ekran temizlendi",Toast.LENGTH_SHORT).show();
                        }
                    });

                break;

            case R.id.button2:
                Toast.makeText(MainActivity.this,"çıkarma yapıldı",Toast.LENGTH_SHORT).show();
                text.setText("Cevap : "+String.valueOf(number1-number2));
                clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit.getText().clear();
                    edit1.getText().clear();
                    Toast.makeText(MainActivity.this,"ekran temizlendi",Toast.LENGTH_SHORT).show();
                }
            });
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this,"çarpma yapıldı",Toast.LENGTH_SHORT).show();
                text.setText("Cevap : "+String.valueOf(number1*number2));
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edit.getText().clear();
                        edit1.getText().clear();
                        Toast.makeText(MainActivity.this,"ekran temizlendi",Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case R.id.button4:
                Toast.makeText(MainActivity.this,"bölme yapıldı",Toast.LENGTH_SHORT).show();
                text.setText("Cevap : "+String.valueOf(number1/number2));
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edit.getText().clear();
                        edit1.getText().clear();
                        Toast.makeText(MainActivity.this,"ekran temizlendi",Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            default:
                Toast.makeText(MainActivity.this,"bos islem",Toast.LENGTH_LONG).show();
                break;
        }
    }


}