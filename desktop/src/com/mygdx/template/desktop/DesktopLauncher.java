package com.mygdx.template.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.template.Template;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = Template.APP_NAME;
		config.width = Template.WIDTH;
		config.height = Template.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new Template(), config);
	}
}
