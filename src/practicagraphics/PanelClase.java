package practicagraphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author rodri
 */
public class PanelClase extends JPanel implements ActionListener {

    private boolean sonrie = true;
    JButton jbutton;
    JPanel panel;

    public PanelClase() {
        initPanel();
        initPantalla();
    }

    void initPanel() {
        panel = new JPanel();
        panel.setSize(800, 600);
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(800, 600));
        add(panel);
    }

    /**
     *
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujoCara(g);
        if (sonrie) {
            g.drawArc(118, 125, 75, 30, 180, 180);
        } else {
            g.drawArc(118, 125, 75, 30, 180, -180);
        }
        repaint();
    }

    /**
     *
     * @param g
     */
    public void dibujoCara(Graphics g) {
        //Dibujo el contorno de la cara 
        g.setColor(Color.BLACK);
        g.fillOval(105, 70, 100, 100);
//Dibujo de los ojos
        g.setColor(Color.GREEN);
        g.fillOval(125, 100, 10, 10);
        g.fillOval(175, 100, 10, 10);
//Dibujo de la nariz
        g.drawLine(150, 100, 150, 130);
//Dibujo de la boca
        // g.drawArc(118, 120, 75, 30, 180, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("sonrie :" + sonrie);
        sonrie = !sonrie;
        repaint();
    }

    private void initPantalla() {
        setSize(800, 600);
        setVisible(true);
    }
}
