import service.OWService;

import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) throws Exception {
        OWService owService = new OWService();

//        System.out.println(owService.getResponseObject());
        System.out.println(owService.getResponseOWcurrentAirPollution());
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("WELCOME TO MY WEATHER APP ver. 0.1");
            System.out.println("TYPE K FOR WEATHER IN KATOWICE NOW");
            System.out.println("TYPE A FOR AIR POLLUTION IN KATOWICE NOW");
            System.out.println("TYPE X FOR EXIT");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "K":
                    owService.getWeatherNowInfo();
                    break;
                case "A":
                    owService.getAirPollutionInfo();
                    break;
                case "X":
                    System.out.println("BYE BYE");
                    isRunning = false;
                    break;
                default:
                    System.out.println("WRONG LETTER");
            }
        }



//
//        HttpClient client = HttpClient.newHttpClient();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String url = "https://api.openweathermap.org/data/2.5/weather?lat=57&lon=-2.15&appid=449dd40fd82f8653fa2228a555a7d27f&units=metric&lang=pl";
//
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .header("accept", "application/json")
//                .GET()
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
////           System.out.println(response3.body());
//
//        String json = response.body();
//        OWResponse objectResponse = objectMapper.readValue(json, OWResponse.class);
////        System.out.println(objectResponse);
//
//        System.out.println("Current weather for city Zabrze: " + "\n" + objectResponse.getMain());


    }

    private static void showOpenScreen(){
        System.out.println("A - ALL WEATHER INFO FOR CITY ZABRZE");
    }
}
