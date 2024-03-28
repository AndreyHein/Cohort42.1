package lesson31.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #31
 *
 * @version 25-Mar-24
 */
public class HomeWork31 extends JFrame {
    private Random random;
    private final Color[] COLORS = {Color.red, Color.green, Color.blue};
    private int CIRCLE_COUNT = 100;
    private int TRIANGLE_COUNT = 10;
    private int RECTANGLE_COUNT = 50;

    private enum ShapeForm {
        CIRCLES, RECTANGLES, TRIANGLES;
    }

    private ShapeForm shapeForm;

    public static void main(String[] args) {
        new HomeWork31();
    }

    HomeWork31() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);

        DrawTriangle drawTriangle = new DrawTriangle();
        drawTriangle.setBackground(Color.WHITE);

        DrawRectangle drawRectangle = new DrawRectangle();
        drawRectangle.setBackground(Color.WHITE);

        JButton btnDrawCircle = new JButton("Draw Circle");
        JButton btnDrawTriangle = new JButton("Draw Triangle");
        JButton btnDrawRectangle = new JButton("Draw Rectangle");
        JButton btnExit = new JButton("Exit");

        btnDrawCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.repaint();
            }
        });

        btnExit.addActionListener(e -> System.exit(0));

        btnDrawTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawTriangle.repaint();
            }
        });

        btnDrawRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawRectangle.repaint();
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
        add(drawTriangle, BorderLayout.CENTER);
        add(drawRectangle, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < CIRCLE_COUNT; i++) {
                if (shapeForm == ShapeForm.CIRCLES) {
                    int d = random.nextInt(20) + 60;
                    int x = random.nextInt(getWidth() - d);
                    int y = random.nextInt(getHeight() - d);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.fillOval(x, y, d, d);
                    g.setColor(Color.black);
                    g.drawOval(x, y, d, d);
                }
                if (shapeForm == ShapeForm.RECTANGLES) {
                    int width = random.nextInt(20) + 100;
                    int height = random.nextInt(20) + 100;
                    int x = random.nextInt(getWidth() - width);
                    int y = random.nextInt(getHeight() - height);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y , width, height);
                }
                if (shapeForm == ShapeForm.TRIANGLES) {
                    int length = random.nextInt(20) + 80;
                    int h = (int) (length * Math.sqrt(3) / 2);
                    int x1 = random.nextInt(getWidth() - length);
                    int y1 = random.nextInt(getHeight() - length);
                    int x2 = x1 + length;
                    int y2 = y1;
                    int x3 = x2 / 2;
                    int y3 = y2 + h;
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.drawLine(x1, y1, x2, y2);
                    g.drawLine(x1, y1, x3, y3);
                    g.drawLine(x3, y3, x2, y2);
                }
            }
        }
    }

    private class DrawTriangle extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < TRIANGLE_COUNT; i++) {

                int length = random.nextInt(20) + 80;
                int h = (int) (length * Math.sqrt(3) / 2);
                int x1 = random.nextInt(getWidth() - length);
                int y1 = random.nextInt(getHeight() - length);
                int x2 = x1 + length;
                int y2 = y1;
                int x3 = x2 / 2;
                int y3 = y2 + h;

                g.drawLine(x1, y1, x2, y2);
                g.drawLine(x1, y1, x3, y3);
                g.drawLine(x3, y3, x2, y2);
            }
        }
    }

    private class DrawRectangle extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < RECTANGLE_COUNT; i++) {
                int l = random.nextInt(20) + 100;
                int h = random.nextInt(20) + 100;
                int x1 = random.nextInt(getWidth() - l);
                int y1 = random.nextInt(getHeight() - h);
                Color color = COLORS[random.nextInt(COLORS.length)];
                g.setColor(color);
                g.fillRect(x1, y1, l, h);
                g.setColor(Color.black);
                g.drawRect(x1, y1, l, h);
            }
        }
    }
}
