package holaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	/**
	 * Launches main window using console arguments.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Defines title and shows window using provided Stage.
	 * 
	 * @param stage as Stage the Object where window's content will be drawn. 	
	 * @throws Exception
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("HolaFX"); /* Sets the window title to "HolaFX"*/
		stage.show();
	}

}

