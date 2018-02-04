package com.ersen.gdxandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.ersen.mygdxgame.core.MyGdxGame;

public class AndroidGameFragment extends AndroidFragmentApplication {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        return initializeForView(new MyGdxGame(),config);
    }
}
