package mediaplayer;

import creamy.browser.Browser;
import creamy.browser.control.*;
import creamy.entrypoint.CreamyApp;
import creamy.media.CFMediaPlayer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MediaPlayer extends CreamyApp {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Browser browser = new Browser("/MediaController/index");
        browser.setMenuBar(new DefaultBrowserMenuBar());
        browser.setHeader(new DefaultHeader());
        primaryStage.setScene(browser);
        
        
        /*
        Group root = new Group();
        Scene scene = new Scene(root, 540, 241);
        
        CFMediaPlayer mediaPlayer = new CFMediaPlayer();
        String uri = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
        mediaPlayer.setMediaPath(uri);
        mediaPlayer.setMediaViewHeight(300.0);
        mediaPlayer.setMediaViewHeight(530.0);
        mediaPlayer.create();
       
        root.getChildren().add(mediaPlayer);
        scene.setRoot(root);
        primaryStage.setScene(scene);
        */
        primaryStage.show();
    }
}