package ink.api;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.annotations.SerializedName;

import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.HttpURLConnection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 *
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            System.out.println("Hello, World!");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } // try
    } // start
} // App
