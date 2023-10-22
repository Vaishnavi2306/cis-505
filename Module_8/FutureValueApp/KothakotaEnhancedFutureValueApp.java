package FutureValueApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

/*
 * JavaFX application for Future Value app.
 */
public class KothakotaEnhancedFutureValueApp extends Application {
	
	private TextField textField1 = new TextField();
    private TextField textField2 = new TextField();
    private TextArea textArea = new TextArea();
    private Label lblFutureValueDate = new Label("");
    private Label lblYears = new Label("Years:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private ComboBox<Integer> comboBox = new ComboBox<>();
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

	public static void main(String[] args) {
        launch(args);
    }
	
	@Override
    public void start(Stage primaryStage) {
		lblInterestRateFormat.setTextFill(Color.RED);
		ObservableList<Integer> comboBoxValues = FXCollections.observableArrayList();
        for (int i = 0; i <= 10; i++) {
            comboBoxValues.add(i);
        }
        comboBox.setItems(comboBoxValues);
        textField1.setPrefWidth(200); // Set your desired width
        textField2.setPrefWidth(200); // Set your desired width
        comboBox.setPrefWidth(200);
        textArea.setPrefWidth(200);
        
	    // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new javafx.geometry.Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);
        
        // Add components to the GridPane
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(lblInterestRateFormat, 1, 2);
        gridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        gridPane.add(lblYears, 0, 3);
        gridPane.add(comboBox, 1, 3);
        
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        gridPane.add(actionBtnContainer, 1, 4);
        gridPane.setHalignment(actionBtnContainer, HPos.RIGHT);
        gridPane.add(lblFutureValueDate, 0, 5);
        // Add TextArea with column span to cover 2 columns
        gridPane.add(textArea, 0, 6, 2, 1);
        
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());
        
        // Create a scene and set it on the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Kothakota Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	private void clearFormFields() {
		textField1.setText("");
        textField2.setText("");
        textArea.setText("");
        lblFutureValueDate.setText("");
        comboBox.setValue(0);
	}
	
	private void calculateResults() {
		String text = "Calculation as of " + getTodayDate();
		lblFutureValueDate.setText(text);
		double futureValue = FinanceCalculator.calculateFutureValue(Double.parseDouble(textField1.getText()),
				Double.parseDouble(textField2.getText()), comboBox.getValue());
		
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedAmount = decimalFormat.format(futureValue);
		String futureValueText = "The future value is $" + formattedAmount;
		textArea.setText(futureValueText);
	}
	
	private static String getTodayDate() {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);

        return formattedDate;
    }
	
	
}
