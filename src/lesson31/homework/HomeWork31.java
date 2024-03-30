package lesson31.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 31
 * @author Andrey Hein
 * @version 25-Mar-2024
 */
public class HomeWork31 extends JFrame {

    private ShapeForm shapeForm = ShapeForm.CIRCLES;
    private Shapes shapes = new Shapes();

    public static void main(String[] args) {
        new HomeWork31();
    }

    HomeWork31() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX() + ", " + e.getY());
                canvas.repaint();
            }
        });

        JButton btnDrawCircle = new JButton("Draw Circle");
        JButton btnDrawTriangle = new JButton("Draw Triangle");
        JButton btnDrawRectangle = new JButton("Draw Rectangle");
        JButton btnExit = new JButton("Exit");

        btnDrawCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = ShapeForm.CIRCLES;
                canvas.repaint();
            }
        });

        btnExit.addActionListener(e -> System.exit(0));

        btnDrawTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = ShapeForm.TRIANGLES;
                canvas.repaint();
            }
        });

        btnDrawRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = ShapeForm.RECTANGLES;
                canvas.repaint();
            }
        });

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnDrawCircle);
        btnPanel.add(btnDrawTriangle);
        btnPanel.add(btnDrawRectangle);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            shapes.paint(g, shapeForm, this);
        }
    }
}
