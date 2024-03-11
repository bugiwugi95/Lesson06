package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class lesson6_courseRub {
    public static void main(String[] args) throws IOException {
        String page = downloadWebPage("https://cbr.ru/scripts/XML_daily.asp?date_req=02/03/2002");
        int starIndex = page.lastIndexOf("<Value>");
        int endIndex = page.lastIndexOf("</Value>");
        String str = page.substring(starIndex + 7, endIndex);
        String page1 = downloadWebPage("https://cbr.ru/scripts/XML_daily.asp?date_req=02/03/2012");
        int starIndex1 = page1.lastIndexOf("<Value>");
        int endIndex1 = page1.lastIndexOf("</Value>");
        String str1 = page1.substring(starIndex1 + 7, endIndex1);
        String page2 = downloadWebPage("https://cbr.ru/scripts/XML_daily.asp?date_req=02/03/2022");
        int starIndex2 = page2.lastIndexOf("<Value>");
        int endIndex2 = page2.lastIndexOf("</Value>");
        String str2 = page2.substring(starIndex2 + 7, endIndex2);
        double cors = Double.parseDouble(str.replaceAll(",","."));
        double cors1 = Double.parseDouble(str1.replaceAll(",","."));
        double cors2 = Double.parseDouble(str2.replaceAll(",","."));

        if (cors < cors1) {
            System.out.println("за 10 лет подрос на " + cors);
            System.out.println(cors1 - cors);
        } else if (cors1 < cors2) {
            System.out.println("2" + cors1);
            System.out.println(cors2 - cors1);
        }

    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();


        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }

        return result.toString();

    }


}


