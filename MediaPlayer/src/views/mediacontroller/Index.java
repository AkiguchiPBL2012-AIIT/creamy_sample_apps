/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views.mediacontroller;

import creamy.activity.AvailableActivity;
import creamy.media.CFMediaPlayer;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

/**
 *
 * @author tadao
 */
public class Index extends  AvailableActivity {
    @FXML private Pane mediaPlayerPane;
    
    @Override
    public void cfinitialize() {
        
        CFMediaPlayer mediaPlayer = new CFMediaPlayer();
        String uri = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
        mediaPlayer.setMediaPath(uri);
        mediaPlayer.setMediaViewHeight(300.0);
        mediaPlayer.setMediaViewWidth(530.0);
        mediaPlayer.create();
        mediaPlayerPane.getChildren().add(mediaPlayer);
        
    }
    
}
