package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("myLogs", "onCreate"); //отладка (degub)
        Log.i("myLogs", "onCreate"); //информация (info)
        Log.e("myLogs", "onCreate"); //ошибки (error)
        Log.v("myLogs", "onCreate"); //подробности (verbose)
        Log.w("myLogs", "onCreate"); //предупреждения (warning)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myLogs", "onStart"); //отладка (degub)
        Log.i("myLogs", "onStart"); //информация (info)
        Log.e("myLogs", "onStart"); //ошибки (error)
        Log.v("myLogs", "onStart"); //подробности (verbose)
        Log.w("myLogs", "onStart"); //предупреждения (warning)
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myLogs", "onResume"); //отладка (degub)
        Log.i("myLogs", "onResume"); //информация (info)
        Log.e("myLogs", "onResume"); //ошибки (error)
        Log.v("myLogs", "onResume"); //подробности (verbose)
        Log.w("myLogs", "onResume"); //предупреждения (warning)
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myLogs", "onPause"); //отладка (degub)
        Log.i("myLogs", "onPause"); //информация (info)
        Log.e("myLogs", "onPause"); //ошибки (error)
        Log.v("myLogs", "onPause"); //подробности (verbose)
        Log.w("myLogs", "onPause"); //предупреждения (warning)
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myLogs", "onStop"); //отладка (degub)
        Log.i("myLogs", "onStop"); //информация (info)
        Log.e("myLogs", "onStop"); //ошибки (error)
        Log.v("myLogs", "onStop"); //подробности (verbose)
        Log.w("myLogs", "onStop"); //предупреждения (warning)
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("myLogs", "onRestart"); //отладка (degub)
        Log.i("myLogs", "onRestart"); //информация (info)
        Log.e("myLogs", "onRestart"); //ошибки (error)
        Log.v("myLogs", "onRestart"); //подробности (verbose)
        Log.w("myLogs", "onRestart"); //предупреждения (warning)
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myLogs", "onDestroy"); //отладка (degub)
        Log.i("myLogs", "onDestroy"); //информация (info)
        Log.e("myLogs", "onDestroy"); //ошибки (error)
        Log.v("myLogs", "onDestroy"); //подробности (verbose)
        Log.w("myLogs", "onDestroy"); //предупреждения (warning)
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}