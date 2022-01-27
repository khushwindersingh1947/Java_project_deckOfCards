module com.example.deckofcards {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deckofcards to javafx.fxml;
    exports com.example.deckofcards;
}