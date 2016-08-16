package com.mygdx.template.services;

import com.badlogic.gdx.Screen;
import com.mygdx.template.Template;
import com.mygdx.template.enums.ScreenEnum;
import com.mygdx.template.screens.AbstractScreen;

/**
 * Created by Senpai on 16.08.2016.
 */
public class ScreenService {
    private static ScreenService instance;

    private ScreenEnum actualScreenEnum;

    private Template game;

    private ScreenService(){
        super();
    }

    public void initialize(Template game){
        this.game = game;
    }

    public void setScreen(ScreenEnum screenEnum){
        // Get current screen to dispose it
        Screen curentScreen = game.getScreen();
        ScreenEnum currentScreenEnum = actualScreenEnum;

        AbstractScreen newScreen = null;

        newScreen = screenEnum.getScreen();
        newScreen.buildStage();
        game.setScreen(newScreen);

        // Dispose old screen
        if(curentScreen!=null){
            curentScreen.dispose();
        }
    }

    public static ScreenService getInstance() {
        if(instance == null){
            instance = new ScreenService();
        }
        return instance;
    }

    public ScreenEnum getActualScreenEnum() {
        return actualScreenEnum;
    }

    public void setActualScreenEnum(ScreenEnum actualScreenEnum) {
        this.actualScreenEnum = actualScreenEnum;
    }
}
