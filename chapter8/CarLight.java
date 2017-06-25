package com.chapter8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CarLight extends JPanel
{
    private Color lastColor = Color.YELLOW;
    // For telling the panel to be repainted at regular intervals
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        if(lastColor.equals(Color.RED))
        {
            lastColor = Color.WHITE;
        }
        else
        {
            lastColor = Color.RED;
        }
        g.setColor(lastColor);
        g.fillOval(25, 25, 100, 100);
    }

    public CarLight()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Carlights");
        frame.add(this);
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setVisible(true);
        service.scheduleAtFixedRate(new Runnable()
        {
            public void run()
            {
                repaint();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    public static void main(String[] args)
    {
        new CarLight();
    }
}