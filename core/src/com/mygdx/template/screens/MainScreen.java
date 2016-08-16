package com.mygdx.template.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.template.Template;

/**
 * Created by Senpai on 16.08.2016.
 */
public class MainScreen extends AbstractScreen {
    @Override
    public void buildStage() {
        initBgTexture();
    }

    @Override
    public void initBgTexture() {
        bgTexture = new Texture(Gdx.files.internal("badlogic.jpg"));
        Image bgImg = new Image(bgTexture);

        bgImg.setPosition(Template.WIDTH/2 - bgImg.getWidth()/2,50);

        addActor(bgImg);
    }
}
