import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    Label label;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("david king");
        button = new Button();
        button.setName("ClickMe");
        //button.setActionCommand(this);
        label = new Label();
        label.setText("Haha");

        StackPane layout = new StackPane();
        //layout.getChildren().add(button);
        Scene scene = new Scene(layout, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
