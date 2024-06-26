package lesson31.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingTicTacToe extends JFrame {
    private char[][] table = new char[3][3];
    public static void main(String[] args) {
        new SwingTicTacToe();
    }

    public SwingTicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int arrayX = e.getX() / (getWidth() / 3);
                int arrayY = e.getY() / (getHeight() / 3);
                System.out.println("x: " + e.getX() + " y: " + e.getY());
                System.out.println("x: " + arrayX + " y: " + arrayY);
                table[arrayX][arrayY] = 'x';
                canvas.repaint();
            }
        });


        JButton btnInit = new JButton("Init");
        JButton btnExit = new JButton("Exit");

        btnInit.addActionListener(e -> {});
        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnInit);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }
    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            int width = getWidth();
            int height = getHeight();
            int cellWidth = width / 3;
            int cellHeight = height / 3;
            g.setColor(Color.lightGray);
            g.drawLine(0, 1, getWidth(), 1);
            for (int i = 0; i < 2; i++) {
                g.drawLine(0, cellHeight * (i + 1), width, cellHeight * (i + 1));
                g.drawLine(cellWidth * (i + 1), 1, cellWidth * (i + 1), height);
            }
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (table[x][y] == 'x') {
                        //TODO нарисовать крестик
                        g.setColor(Color.blue);
                        g.drawLine(cellWidth * x, cellHeight * y,cellWidth * (x + 1), cellHeight * (y + 1));
                        g.drawLine(cellWidth * (x + 1), cellHeight * y, cellWidth * x, cellHeight * (y + 1));
                    }
                    if (table[x][y] == 'o') {
                        //TODO нарисовать нолик
                        g.setColor(Color.blue);
                        g.drawOval(cellWidth * x, cellHeight * y, cellWidth, cellHeight);
                    }
                }
            }
        }
    }
}
