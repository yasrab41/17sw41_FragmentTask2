package com.example.fragmenttaskdualscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer,new datafragment()).commit();

        if(findViewById(R.id.defaultlayout) != null){
            FragmentManager fragmentManager  = this.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .hide(fragmentManager.findFragmentById(R.id.textfrag))
                    .show(fragmentManager.findFragmentById(R.id.listfrag))
                    .commit();
        }

        if(findViewById(R.id.landlayout) != null){
            FragmentManager fragmentManager  = this.getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .show(fragmentManager.findFragmentById(R.id.listfrag))
                    .show(fragmentManager.findFragmentById(R.id.textfrag))
                    .commit();
        }
    }
}