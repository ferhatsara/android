package com.sara.girisekranslemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class kayitActivity extends AppCompatActivity {
    EditText editTextKAdi;
    EditText editTextSifre;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);
        editTextKAdi=findViewById(R.id.editTextKAdiKayit);
        editTextSifre=findViewById(R.id.editTextSifreKayit);
    }


    public void kayit(View view){
        String kadi=editTextKAdi.getText().toString();
        String sifre=editTextSifre.getText().toString();

        if (!kadi.matches("")&& !sifre.matches("")){
            sharedPreferences=this.getSharedPreferences("com.sara.girisekranslemleri",MODE_PRIVATE);
            sharedPreferences.edit().putString(kadi,sifre).apply();
            Toast.makeText(kayitActivity.this,"KAYIT TAMAMLANDI!",Toast.LENGTH_LONG).show();
            Intent intent= new Intent(kayitActivity.this,anaActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(kayitActivity.this,"Kullanici Adi yada Şifre BOŞ!",Toast.LENGTH_LONG).show();
        }
    }
}