package com.mygdx.template.enums;

import com.mygdx.template.screens.AbstractScreen;
import com.mygdx.template.screens.MainScreen;

/**
 * Created by Senpai on 16.08.2016.
 */
public enum ScreenEnum {
    MAIN {
        @Override
        public AbstractScreen getScreen() {
            return new MainScreen();
        }
    };

    public abstract AbstractScreen getScreen();
}
