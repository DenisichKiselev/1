import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinndowApp extends JFrame {
    private JPanel rootPanel;
    private JPanel panelLabel;
    private JLabel millimetersLabel;
    private JLabel santimetersLabel;
    private JLabel decimetrLabel;
    private JLabel metrLabel;
    private JTabbedPane tabbedPane1;
    private JLabel kilometersLabel;
    private JLabel milleLabel;
    private JLabel nauticalMilesLabel;
    private JLabel parsekLabel;
    private JTextField textFieldMilimeter;
    private JTextField textFieldSantimeter;
    private JTextField textFieldDecimeter;
    private JTextField textFieldMeters;
    private JTextField textFieldKilometers;
    private JTextField textFieldMilles;
    private JTextField textFieldNauticalMiles;
    private JTextField textFieldParsek;
    int millimetr, santimeters, decimeters, meters, kilometers, milles, morskMilles, parsek;


    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public void setTextFieldMilimeter(JTextField textFieldMilimeter) {
        this.textFieldMilimeter = textFieldMilimeter;
    }

    public void setTextFieldSantimeter(JTextField textFieldSantimeter) {
        this.textFieldSantimeter = textFieldSantimeter;
    }

    public void setTextFieldDecimeter(JTextField textFieldDecimeter) {
        this.textFieldDecimeter = textFieldDecimeter;
    }

    public void setTextFieldMeters(JTextField textFieldMeters) {
        this.textFieldMeters = textFieldMeters;
    }

    public void setTextFieldKilometers(JTextField textFieldKilometers) {
        this.textFieldKilometers = textFieldKilometers;
    }

    public void setTextFieldMilles(JTextField textFieldMilles) {
        this.textFieldMilles = textFieldMilles;
    }

    public void setTextFieldNauticalMiles(JTextField textFieldNauticalMiles) {
        this.textFieldNauticalMiles = textFieldNauticalMiles;
    }

    public void setTextFieldParsek(JTextField textFieldParsek) {
        this.textFieldParsek = textFieldParsek;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JTextField getTextFieldMilimeter() {
        return textFieldMilimeter;
    }

    public JTextField getTextFieldSantimeter() {
        return textFieldSantimeter;
    }

    public JTextField getTextFieldDecimeter() {
        return textFieldDecimeter;
    }

    public JTextField getTextFieldMeters() {
        return textFieldMeters;
    }

    public JTextField getTextFieldKilometers() {
        return textFieldKilometers;
    }

    public JTextField getTextFieldMilles() {
        return textFieldMilles;
    }

    public JTextField getTextFieldNauticalMiles() {
        return textFieldNauticalMiles;
    }

    public JTextField getTextFieldParsek() {
        return textFieldParsek;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    private JButton raschetButton;
    private JButton buttonClear;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel rastoyaniyaPanel;
    private JLabel grammLabel;
    private JLabel kilogrammLabel;
    private JLabel centnerLabel;
    private JLabel tonnaLabel;
    private JPanel vesaPanel;
    private JPanel speedPanel;

    public WinndowApp(){
        setContentPane(rootPanel);
        setSize(300,500);
        setPreferredSize(new Dimension(300,500));
        rootPanel.setSize(300,500);
        raschetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldMilimeter.getText()!=""){             //переделать значения переменных на тип интежер
                    millimetr = Integer.parseInt(textFieldMilimeter.getText());
                    textFieldSantimeter.setText(Double.toString(millimetr*0.1));
                    textFieldDecimeter.setText(Double.toString(millimetr*0.01));
                    textFieldMeters.setText(Double.toString(millimetr*0.001));
                    textFieldKilometers.setText(Double.toString(millimetr*0.0001));
                    textFieldMilles.setText((Double.toString((millimetr*0.0001)*0.621371)));
                    textFieldNauticalMiles.setText(Double.toString((millimetr*0.0001)*0.539957));
                    textFieldParsek.setText(Double.toString((millimetr*0.0001)*3.2408e-14));


//                    milles = kilometers*1.906;
//                    parsek = kilometers*3.2408e-14;
//                    morskMilles = kilometers*0.539957;
//                    textFieldMeters.setText(Double.toString(meters));
//                    textFieldDecimeter.setText(Double.toString(decimeters));
//                    textFieldKilometers.setText(Double.toString(kilometers));
//                    textFieldMilles.setText(Double.toString(milles));
//                    textFieldParsek.setText(Double.toString(parsek));
//                    textFieldNauticalMiles.setText(Double.toString(morskMilles));
                } else if(Double.parseDouble(textFieldSantimeter.getText())!=0.0){
//                    millimetr = Integer.parseInt(Double.toString(santimeters*10));
//                    santimeters = Integer.parseInt(textFieldSantimeter.getText());
//                    textFieldSantimeter.setText(Double.toString(santimeters));
//                    decimeters = santimeters*0.1;
//                    meters = decimeters*0.1;
//                    kilometers = meters*0.1;
//                    milles = kilometers*1.906;
//                    parsek = kilometers*3.2408e-14;
//                    morskMilles = kilometers*0.539957;
//                    textFieldMeters.setText(Double.toString(meters));
//                    textFieldDecimeter.setText(Double.toString(decimeters));
//                    textFieldKilometers.setText(Double.toString(kilometers));
//                    textFieldMilles.setText(Double.toString(milles));
//                    textFieldParsek.setText(Double.toString(parsek));
//                    textFieldNauticalMiles.setText(Double.toString(morskMilles));
                }
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
