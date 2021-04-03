package com.sara.girisekranslemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class anaActivity extends AppCompatActivity {
    TextView textView;
    EditText editTextKadi;
    EditText editTextSifre;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana);

        editTextKadi=findViewById(R.id.editTextKAdiAna);
        editTextSifre=findViewById(R.id.editTextSifreAna);

        textView=findViewById(R.id.textViewKayitAna);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(anaActivity.this,kayitActivity.class);
                startActivity(intent);
            }
        });
    }


    public void giris(View view){
        String sifre=editTextSifre.getText().toString();
        String kadi=editTextKadi.getText().toString();

        if (sifre.matches("")|| kadi.matches("")){
            Toast.makeText(this, "Kullanıcı Adı veya Şifre Hatalı!", Toast.LENGTH_SHORT).show();
        }else{
            sharedPreferences=this.getSharedPreferences("com.sara.girisekranslemleri",MODE_PRIVATE);
            String gelenSifre=sharedPreferences.getString(kadi,"YOK");

            if (gelenSifre.matches(sifre)){
                Intent intent= new Intent(anaActivity.this,girisActivity.class);
                intent.putExtra("kullanici",kadi);
                startActivity(intent);

            }else{
                Toast.makeText(this, "Kullanıcı Adı ya da Şifre Hatalı!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}