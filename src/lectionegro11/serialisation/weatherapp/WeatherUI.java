package lectionegro11.serialisation.weatherapp;

import javax.swing.*;
import java.awt.*;

public class WeatherUI extends JFrame {

    private JPanel cityPanel = new JPanel();
    private JPanel resultPanel = new JPanel();


    {
        setSize(400, 200);
        setTitle("Hillel Weather App");
        setLayout(new BorderLayout());

        cityPanel.setSize(400,100);
        cityPanel.setBackground(Color.DARK_GRAY);

        resultPanel.setSize(400,100);


        add(cityPanel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.SOUTH);



        setVisible(true);



        setLayout(new BorderLayout());
    }
}
