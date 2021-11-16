
package bai;

import javax.swing.JFrame;


//@author sak5680

public class BAIDriver {

    public static void main(String[] args) {
        JFrame frame = new BAIViewer();
        frame.setLocation(200,200);
        frame.setTitle("BAI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
