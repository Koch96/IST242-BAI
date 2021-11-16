package bai;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** @author sak5680 */
public class BAIViewer extends JFrame{
    private BAI BAIValue;
    private JPanel panel;
    private JLabel hipCirc;
    private JLabel height;
    private JLabel baiLabel;
    private JTextField hipCircField;
    private JTextField heightField;
    private JButton calcButton;
    protected double baiResult;

    public BAIViewer(){
        createComponents();
        setSize(250, 200);
    }
    
    private void createComponents(){
        BAIValue = new BAI();
        panel = new JPanel();
        hipCirc = new JLabel("Hip Circumference (cm): ");
        hipCircField = new JTextField(5);
        height = new JLabel("Height (cm): ");
        heightField = new JTextField(8);
        calcButton = new JButton("Calculate");
        baiLabel = new JLabel("BAI: " + BAIValue.getResult());
        
        ActionListener listener = new DepositListener();
        calcButton.addActionListener(listener);
        
        panel.add(hipCirc);
        panel.add(hipCircField);
        panel.add(height);
        panel.add(heightField);
        panel.add(calcButton);
        panel.add(baiLabel);
        add(panel);
    }
    
    class DepositListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double hc = Double.parseDouble(hipCircField.getText());
            double h = Double.parseDouble(heightField.getText());
            BAIValue.calc(hc, h);
            baiLabel.setText("BAI: " + String.format("%.1f",BAIValue.getResult()) + "%");
        }
    }
}
