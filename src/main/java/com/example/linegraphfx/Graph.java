package com.example.linegraphfx;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class Graph implements Initializable {
    public LineChart<String, Number> lineGraph;


    private static final long max = 1000000000L;
    private static final long min = 1000000;

    private final Random rand = new Random();

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Capital");


        series.getData().addAll(generateData());


        lineGraph.getData().add(series);

        //removes dots from graph
        lineGraph.setCreateSymbols(false);

        //removes labels from axis
//        lineGraph.getXAxis().setTickLabelsVisible(false);
//        lineGraph.getXAxis().setOpacity(0);



    }

    private long random() {
        return rand.nextLong((max - min) + 1) + min;
    }

    private List<XYChart.Data<String, Number>> generateData() {

        final int length = 52 * 5;

        List<XYChart.Data<String, Number>> results = new ArrayList<>(length);

        for (int i = length; i >= 0; i--) {
            results.add(
                    new XYChart.Data<>(
                            dtf.format(LocalDateTime.now().minusWeeks(i)),
                            random()
                    )
            );
        }

        return results;
    }

    public void onTestBtnPress() {

        Platform.runLater(
                ()-> {}
        );



    }
}
