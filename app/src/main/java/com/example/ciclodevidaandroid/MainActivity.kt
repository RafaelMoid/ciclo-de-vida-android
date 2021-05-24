package com.example.ciclodevidaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //onCreate, onStart, onPause são METODOS
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle", "entrei no onCreate() - Estou criando a tela")
    }

    override fun onStart(){
        super.onStart()
        Log.w("Lifecycle", "entrei no onStart() - Deixei a tela visivel")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "entrei no onResume() - Agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "entrei no onPause() - A tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "entrei no onStop() - A tela não está mais visivel mais ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "entrei no onRestart() - A tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "entrei no onDestroy() - Ahh não, o usuario fechou o app")
    }


}
