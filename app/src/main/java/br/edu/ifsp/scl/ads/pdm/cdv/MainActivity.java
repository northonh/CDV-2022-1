package br.edu.ifsp.scl.ads.pdm.cdv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Iniciando cdv completo
        Log.v(CDV_LOGCAT_TAG, "onCreate: Iniciando ciclo COMPLETO");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Iniciando cdv visível
        Log.v(CDV_LOGCAT_TAG, "onStart: Iniciando ciclo VISÍVEL");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Iniciando cdv em primeiro plano
        Log.v(CDV_LOGCAT_TAG, "onResume: Iniciando ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Finalizando o cdv em primeiro plano
        Log.v(CDV_LOGCAT_TAG, "onPause: Finalizando ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Finalizando cdv visível
        Log.v(CDV_LOGCAT_TAG, "onStop: Finalizando ciclo VISÍVEL");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Finalizando cdv completo
        Log.v(CDV_LOGCAT_TAG, "onDestroy: Finalizando ciclo COMPLETO");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(CDV_LOGCAT_TAG, "onRestart: Preparando chamada do onStart");
    }
}