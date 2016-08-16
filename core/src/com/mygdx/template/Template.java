package com.mygdx.template;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.template.enums.ScreenEnum;
import com.mygdx.template.services.ScreenService;

public class Template extends Game {
	public final static String APP_NAME = "Template";

	public final static int WIDTH = 405;
	public final static int HEIGHT = 720;
	
	@Override
	public void create () {
		ScreenService.getInstance().initialize(this);
		ScreenService.getInstance().setScreen(ScreenEnum.MAIN);
	}

}
