package com.schoolchat.schoolchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;

import Firebase.conexion;

public class MainActivity extends AppCompatActivity {
//clase para la vista de los usuarios / grupos de la aplicacion

    private Firebase starFirebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciamos Firebase
        starFirebase=new Firebase(conexion.FIREBASE_SCHOOLCHAT);

    }
}
