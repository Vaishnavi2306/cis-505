package GradeBookApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KothakotaGradeBookApp extends Application {
    
	private ObservableList<Student> students = FXCollections.observableArrayList();


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Book Form");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Labels
        // Labels with padding
        Label firstNameLabel = new Label("First Name:");
        firstNameLabel.setStyle("-fx-padding: 5px;");
        Label lastNameLabel = new Label("Last Name:");
        lastNameLabel.setStyle("-fx-padding: 5px;");
        Label courseLabel = new Label("Course:");
        courseLabel.setStyle("-fx-padding: 5px;");
        Label gradeLabel = new Label("Grade:");
        gradeLabel.setStyle("-fx-padding: 5px;");

        // Text Fields
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField courseField = new TextField();

        // ComboBox for Grade
        ComboBox<String> gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "E", "F");

        // Buttons
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearForm(firstNameField, lastNameField, courseField, gradeComboBox));

        Button viewEntriesButton = new Button("View Entries");
        viewEntriesButton.setOnAction(e -> displayGrades());
        
        Button saveButton = new Button("Save Entry");
        saveButton.setOnAction(e -> saveEntry(firstNameField.getText(), lastNameField.getText(),
                courseField.getText(), gradeComboBox.getSelectionModel().getSelectedItem()));
        
        HBox actionBtnContainer = new HBox(); // Create HBox to be container of buttons.
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30) ); // Set HBox padding.
        actionBtnContainer.setSpacing(10); // Set HBox spacing.
        actionBtnContainer.getChildren().add(clearButton); // Add btnClear to actionBtnContainer HBox.
        actionBtnContainer.getChildren().add(viewEntriesButton); // Add btnViewGrades to actionBtnContainer HBox.
        actionBtnContainer.getChildren().add(saveButton); // Add btnSave to actionBtnContainer HBox.

        // Adding elements to the grid
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameField, 1, 0);
        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameField, 1, 1);
        grid.add(courseLabel, 0, 2);
        grid.add(courseField, 1, 2);
        grid.add(gradeLabel, 0, 3);
        grid.add(gradeComboBox, 1, 3);
        grid.add(actionBtnContainer, 1, 4); // Add actionBtnContainer to GridPane pane.

        
     // TableView setup
        TableView<Student> tableView = new TableView<>();
        TableColumn<Student, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Student, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> courseCol = new TableColumn<>("Course");
        courseCol.setCellValueFactory(new PropertyValueFactory<>("course"));

        TableColumn<Student, String> gradeCol = new TableColumn<>("Grade");
        gradeCol.setCellValueFactory(new PropertyValueFactory<>("grade"));

        tableView.getColumns().addAll(firstNameCol, lastNameCol, courseCol, gradeCol);
        tableView.setItems(students);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(grid, tableView);

        Scene scene = new Scene(vBox, 500, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    private void clearForm(TextField firstName, TextField lastName, TextField course, ComboBox<String> grade) {
        firstName.clear();
        lastName.clear();
        course.clear();
        grade.getSelectionModel().clearSelection();
    }
    
    private void saveEntry(String firstName, String lastName, String course, String grade) {
    	boolean newFile = false;
        File file = new File("grades.csv");
        if (!file.exists()) {
            newFile = true;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (newFile) {
                writer.write("firstName,lastName,course,grade\n");
            }
            writer.write(firstName + "," + lastName + "," + course + "," + grade + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void displayGrades() {
        students.clear(); // Clear previous entries

        try (BufferedReader reader = new BufferedReader(new FileReader("grades.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Student student = new Student(parts[0], parts[1], parts[2], parts[3]);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
