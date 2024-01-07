package Versuch04;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AmpelAnwendungChatGpt extends Application {
    private Circle redLight;
    private Circle yellowLight;
    private Circle greenLight;
    private int currentPhase = 0;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        redLight = createLight(Color.RED);
        yellowLight = createLight(Color.LIGHTGRAY);
        greenLight = createLight(Color.LIGHTGRAY);
        
        

        Button switchButton = createButton("Switch");
        switchButton.setOnAction(event -> switchLights());

        Button exitButton = createButton("Exit");
        exitButton.setOnAction(event -> stage.close());

        HBox lightsContainer = createLightsContainer();
        HBox buttonsContainer = createButtonsContainer(switchButton, exitButton);

        BorderPane root = new BorderPane();
        root.setCenter(lightsContainer);
        root.setBottom(buttonsContainer);
        root.setStyle("-fx-background-color: DARKGRAY");
        BorderPane.setMargin(lightsContainer, new Insets(5));
        BorderPane.setMargin(buttonsContainer, new Insets(5));

        stage.setTitle("Ampel");
        stage.setScene(new Scene(root, 200, 200));
        stage.setResizable(false);
        stage.show();
    }

    private Circle createLight(Color color) {
        Circle light = new Circle(20, color);
        return light;
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setAlignment(Pos.CENTER);
        return button;
    }

    private HBox createLightsContainer() {
        HBox lightsContainer = new HBox();
        lightsContainer.setSpacing(5);
        lightsContainer.setAlignment(Pos.CENTER);
        lightsContainer.getChildren().addAll(redLight, yellowLight, greenLight);
        return lightsContainer;
    }

    private HBox createButtonsContainer(Button... buttons) {
        HBox buttonsContainer = new HBox();
        buttonsContainer.setSpacing(5);
        buttonsContainer.setAlignment(Pos.CENTER);
        buttonsContainer.getChildren().addAll(buttons);
        return buttonsContainer;
    }

    private void switchLights() {
        switch (currentPhase) {
            case 0:
                redLight.setFill(Color.RED);
                yellowLight.setFill(Color.LIGHTGRAY);
                greenLight.setFill(Color.LIGHTGRAY);
                currentPhase++;
                break;
            case 1:
                redLight.setFill(Color.RED);
                yellowLight.setFill(Color.YELLOW);
                greenLight.setFill(Color.LIGHTGRAY);
                currentPhase++;
                break;
            case 2:
                redLight.setFill(Color.LIGHTGRAY);
                yellowLight.setFill(Color.LIGHTGRAY);
                greenLight.setFill(Color.LAWNGREEN);
                currentPhase++;
                break;
            case 3:
                redLight.setFill(Color.LIGHTGRAY);
                yellowLight.setFill(Color.YELLOW);
                greenLight.setFill(Color.LIGHTGRAY);
                currentPhase = 0;
                break;
        }
    }
}
