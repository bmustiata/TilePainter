package hellofx;

import hellofx.fheroes2.agg.AggFile;
import hellofx.fheroes2.kingdom.World;
import hellofx.fheroes2.serialize.FileUtils;
import hellofx.framework.GamePreferences;
import hellofx.framework.MainContext;
import hellofx.framework.controls.CanvasWrap;
import hellofx.framework.controls.MainBorderPane;
import hellofx.framework.controls.MainStackPane;
import hellofx.framework.controls.PerFrameTimer;
import hellofx.game.MapView;
import hellofx.graphics.ImageRepo;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author ciprian
 */
public class HelloFx extends Application {
    public static void main(String[] args) {
        Application.launch(HelloFx.class);
    }

    public static void saveToFile(Image image, File outputFile) {
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start(Stage stage) {
        if (!FileUtils.Exists("DATA/HEROES2.AGG")) {
            var urlToDownload = "https://github.com/ciplogic/fheroes2enh/releases/download/0.9.1/h2demo.zip";
            FileUtils.downloadFile(urlToDownload, "h2demo.zip");
            return;
        }
        var aggFile = new AggFile();
        aggFile.Open("DATA/HEROES2.AGG");
        aggFile.RenderICNSprite(6, 1);

        var world = new World();
        world.loadMapMp2("maps\\BROKENA.MP2");

        //saveToFile(img, new File("cursor.png"));
        var context = new MainContext();
        var timer = context.inject(PerFrameTimer.class);
        context.inject(GamePreferences.class);
        context.inject(ImageRepo.class);

        context.injectInstance(new MapView(128, 128));

        var mainBorderPane = context.inject(MainBorderPane.class);

        CanvasWrap canvasWrap = context.inject(CanvasWrap.class);
        MainStackPane mainStackPane = context.inject(MainStackPane.class);
        mainStackPane.push(canvasWrap.canvas);

        context.inject(Gameplay.class);

        mainBorderPane.borderPane.setCenter(mainStackPane.stackPane);

        stage.setScene(new Scene(mainBorderPane.borderPane));
        stage.show();
        timer.start();
    }
}
