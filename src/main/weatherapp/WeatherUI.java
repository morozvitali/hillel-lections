package main.weatherapp;

import javax.swing.*;
import java.awt.*;

public class WeatherUI extends JFrame {

    private JPanel cityPanel = new JPanel();
    private JPanel resultPanel = new JPanel();
    private JLabel cityLabel = new JLabel("Enter city name");
    private JTextField cityInput = new JTextField();
    //private JButton searchButton = new JButton();
    private JLabel resultIconLabel = new JLabel();
    private JButton searchButton = new JButton("Get Weather");

    {
        setSize(400, 200);
        setTitle("Hillel Weather App");
        setLayout(new BorderLayout());

        cityPanel.setSize(400,100);
        cityPanel.setLayout(new GridLayout(2,2));
        cityPanel.setBackground(Color.DARK_GRAY);

        cityPanel.add(cityLabel);
        cityPanel.add(cityInput);
        cityPanel.add(resultIconLabel);
        cityPanel.add(searchButton);

        resultPanel.setSize(400,100);

        add(cityPanel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.SOUTH);
        setVisible(true);

        setLayout(new BorderLayout());
    }
}
