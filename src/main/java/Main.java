import AirportModel.AirportTraffic;
import CitiesModel.CitiesTraffic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

            Parent root = FXMLLoader.load(getClass().getResource("fxml/jumbotron.fxml"));
            primaryStage.setTitle("GeoLocating");
            primaryStage.setScene(new Scene(root, 900, 450));
            primaryStage.show();

    }
}
//    AirportTraffic airportTraffic = new AirportTraffic("Paris");
//        airportTraffic.ExcecuteSearch();
//                CitiesTraffic citiesTraffic = new CitiesTraffic(49.009722, 2.548611);
//                citiesTraffic.ExcecuteSearch();
//







