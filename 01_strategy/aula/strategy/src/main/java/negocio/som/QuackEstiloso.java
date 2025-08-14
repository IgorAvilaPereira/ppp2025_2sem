package negocio.som;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class QuackEstiloso implements ComportamentoSom {

    @Override
    public void emitirSom() {
        System.out.println("som estiloso!");
        // Clip sound;
        // try {
        //     sound = AudioSystem.getClip();
        //     sound.open(AudioSystem.getAudioInputStream(new File(
        //             "/home/iapereira/git/ppp2025_2sem/01_strategy/aula/strategy/src/main/resources/quack.wav")));
        //     while (true) {
        //         sound.start();
        //     }
        //     // Thread.sleep(2000);
        // } catch (LineUnavailableException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (UnsupportedAudioFileException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

    }

}
