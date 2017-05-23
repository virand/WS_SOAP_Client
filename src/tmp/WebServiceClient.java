package tmp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by artemsolonin on 18.05.2017.
 */
public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/PlaceService?wsdl");
        PlaceService placeService = new PlaceService(url);
        List<Place> places=null;
        try {
            places = placeService.getPlaceWebServicePort().getPlaces("", "", "", "");
        }
        catch (IllegalNameException e)
        {
            e.printStackTrace();
        }
        for(Place place : places){
            System.out.println("name: "+place.getName()+ ", description: " + place.getDescription()+ ", city: " + place.getCity()+ ", address: " + place.getAddress());
        }
        System.out.println("Total places: " + places.size());


        int id=placeService.getPlaceWebServicePort().createPLace("Петропавловская крепость", "Высокое здание", "Питер", "где-то на Неве");
        System.out.println("ID of inserted row: "+id);

        int status=placeService.getPlaceWebServicePort().changePlace(3,"Авиагородок","находится в моск раойне", "СПб", "Пулково");
        System.out.println("Status of changed place query " + status);

        status=placeService.getPlaceWebServicePort().deletePlace(5);
        System.out.println("Status of deleted place query " + status);
    }
}