import AirportModel.Airport;
import AirportModel.AirportTraffic;
import CitiesModel.CitiesTraffic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private TextField Search;

    @FXML
    private ListView AirportsView;
    @FXML
    private ListView CitiesView;

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = Search.getText();
    }

    @FXML
    public void onSearchClicked(){
        setCity();
        AirportsView.getItems().clear();
        CitiesView.getItems().clear();
        AirportTraffic airportTraffic = new AirportTraffic(getCity());
        airportTraffic.ExecuteSearch(AirportsView);
    }

    @FXML
    public void handleClickListView(){
        String selectedAirport = (String)AirportsView.getSelectionModel().getSelectedItem();
        String split[] = selectedAirport.split(" ");
        CitiesTraffic citiesTraffic = new CitiesTraffic(Float.parseFloat(split[split.length - 1].trim()), Float.parseFloat(split[split.length - 3].trim()));
        CitiesView.getItems().clear();
        citiesTraffic.ExcecuteSearch(CitiesView);
    }
}
