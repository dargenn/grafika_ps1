package io.dargenn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Controller {

    private static final String CIRCLE = "#circle";
    private static final String CIRCLE_VBOX = "#circleVbox";
    private static final String LINE = "#line";
    private static final String LINE_VBOX = "#lineVbox";
    private static final String RECTANGLE = "#rectangle";
    private static final String RECTANGLE_VBOX = "#rectangleVbox";

    @FXML private TextField radiusTextField;
    @FXML private TextField widthTextField;
    @FXML private TextField heightTextField;
    @FXML private TextField startXTextField;
    @FXML private TextField startYTextField;
    @FXML private TextField endXTextField;
    @FXML private TextField endYTextField;

    @FXML
    public void initialize() {
        radiusTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Circle circle = (Circle) radiusTextField.getScene().lookup(CIRCLE);
            circle.setRadius(Double.valueOf(newValue));
        });

        widthTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Rectangle rectangle = (Rectangle) widthTextField.getScene().lookup(RECTANGLE);
            rectangle.setWidth(Double.valueOf(newValue));
        });

        heightTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Rectangle rectangle = (Rectangle) heightTextField.getScene().lookup(RECTANGLE);
            rectangle.setHeight(Double.valueOf(newValue));
        });

        startXTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Line line = (Line) startXTextField.getScene().lookup(LINE);
            line.setStartX(Double.valueOf(newValue));
        });

        startYTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Line line = (Line) startYTextField.getScene().lookup(LINE);
            line.setStartY(Double.valueOf(newValue));
        });

        endXTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Line line = (Line) endXTextField.getScene().lookup(LINE);
            line.setEndX(Double.valueOf(newValue));
        });

        endYTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            Line line = (Line) endYTextField.getScene().lookup(LINE);
            line.setEndY(Double.valueOf(newValue));
        });
    }

    @FXML
    private void circleClicked(ActionEvent event) {
        handleShapeClick(event, CIRCLE, CIRCLE_VBOX);
    }

    @FXML
    private void lineClicked(ActionEvent event) {
        handleShapeClick(event, LINE, LINE_VBOX);
    }

    @FXML
    private void rectangleClicked(ActionEvent event) {
        handleShapeClick(event, RECTANGLE, RECTANGLE_VBOX);
    }

    private void handleShapeClick(ActionEvent event, String shape, String shapeVbox) {
        Node source = (Node) event.getSource();
        Scene scene = source.getScene();
        SceneUtils.hideAllElements(scene);
        scene.lookup(shape).setVisible(true);
        scene.lookup(shapeVbox).setVisible(true);
    }
}
