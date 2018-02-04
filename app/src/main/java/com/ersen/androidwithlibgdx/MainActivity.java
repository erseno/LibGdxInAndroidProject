package com.ersen.androidwithlibgdx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.ersen.gdxandroid.AndroidGameFragment;

public class MainActivity extends AppCompatActivity implements AndroidFragmentApplication.Callbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AndroidGameFragment(),AndroidGameFragment.class.getSimpleName()).commit();
    }

    @Override
    public void exit() {

    }
}
