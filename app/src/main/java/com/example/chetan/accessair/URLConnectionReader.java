package com.example.chetan.accessair;

import java.net.*;
import java.io.*;
import java.lang.*;


public class URLConnectionReader {

    public String main(String postcode) throws Exception {
        //URL oracle = new URL("http://api.openweathermap.org/pollution/v1/co/0.0,10.0/2016-03-01Z.json?appid=9d5e2625e69320042732a1644b135d95");
        //URL air = new URL("https://api.breezometer.com/baqi/?lat=40.7324296&lon=-73.9977264&key=c9cf958daa0c4529853f4146a7997a71&fields=pollutants");
        String x = new String();
        String overall = new String();
        x = "BS81AD";
        URL googleMap = new URL("https://maps.googleapis.com/maps/api/geocode/json?address="+ x + "&key=AIzaSyCLAfG6rkOeBAnsbmmV9RJUc2Pzr24S3Fc");

        URLConnection yc = googleMap.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));

        String inputLine;
        String latitude = new String();
        String longitude = new String();
        int counter = 0;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(counter + inputLine);
            if (inputLine.contains("lat")) {
                latitude = inputLine;
            }
            else if (inputLine.contains("lng")) {
                longitude = inputLine;
            }
            counter = counter + 1;
        }
        latitude = latitude.substring(26);
        longitude = longitude.substring(26);
        //float number = Float.parseFloat(latitude);
        latitude = latitude.replace(",", "");
        longitude = longitude.replace(",", "");
        //float number = Float.parseFloat(latitude);
        //System.out.println(latitude);
        //System.out.println(longitude);
        //System.out.println(latitude.length());
        //System.out.println(number);

        URL air = new URL("https://api.breezometer.com/baqi/?lat=" + latitude + "&lon=" + longitude + "&key=c9cf958daa0c4529853f4146a7997a71");
        URLConnection ycc = air.openConnection();
        BufferedReader inin = new BufferedReader(new InputStreamReader(
                ycc.getInputStream()));

        String inputLines;
//        String overall = new String();
        while ((inputLines = inin.readLine()) != null) {
//            System.out.println(inputLines);
            overall = overall + inputLines;
        }
        in.close();
        return overall;

//        return ("Output Pollution for: "+postcode);
//        return("\"Exposure to air hazards is dangerous for people with health sensitivities, " +
//                " so it is important to monitor air quality at this time\"\n" +
//                " \"Inside:\"\n" +
//                " \"The amount of pollutants in the air is noticeable " +
//                " but still there is no danger to health - It is recommended to watch for changes\"\n" +
//                " \"Outside:\"\n" +
//                " \"It's still OK to go out and enjoy a stroll " +
//                " just pay attention for changes in air quality\"\n" +
//                " \"Dominant Pollutant:\"\n" +
//                " \"o3\"" +
//                " \"Ozone\"\n" +
//                " \"The dominant pollutant is ozone (O\\u2083).\"\n" +
//                " \"Effects:\"\n" +
//                " \"Ozone can irritate the airways causing coughing, " +
//                " a burning sensation, " +
//                " wheezing and shortness of breath.\n"+
//                " Children, " +
//                " people with respiratory or lung and heart diseases, " +
//                " elderly and those who exercise outdoors are particularly vulnerable to ozone exposure.\"");
    }

//    public static String getOverall(){
//        return this.main();
//        return overall;
//    }

}