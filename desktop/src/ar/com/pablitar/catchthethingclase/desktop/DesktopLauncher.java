package ar.com.pablitar.catchthethingclase.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ar.com.pablitar.catchthethingclase.CatchTheThingGame;
import ar.com.pablitar.catchthethingclase.Configuration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Configuration.DISPLAY_WIDTH();
		config.height = Configuration.DISPLAY_HEIGHT();
		new LwjglApplication(new CatchTheThingGame(), config);
	}
}
