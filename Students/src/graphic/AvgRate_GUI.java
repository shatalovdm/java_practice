package graphic;

import domain.AvgRates;
import avgRates.AvgRates_HashMap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Дмитрий Шаталов on 5/9/2015.
 */
public class AvgRate_GUI extends Frame {
    private Label headerLabel;
    private Panel controlPanel;

    public AvgRate_GUI() {
        new Frame("Students");
        setSize(400, 400);
        setLayout(new GridLayout(3, 1));
        controlPanel = new Panel();
        add(controlPanel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setText("Download a file with a list");
        //headerLabel.setLocation(100, 300);
        controlPanel.add(headerLabel);
        add(headerLabel);

        Button selectFile = new Button("Open file");
        selectFile.setBounds(50, 100, 70, 30);
        controlPanel.add(selectFile);
        selectFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadFile();
            }
        });
        setVisible(true);
    }

    String loadFile() {
        FileDialog fileDialog = new FileDialog(this,"Select a file", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String fname = fileDialog.getDirectory() + fileDialog.getFile();
        AvgRates ar = new AvgRates_HashMap();
        headerLabel.setText(String.valueOf(ar.readData(fname).values().toArray()[0]));
        return fileDialog.getFile();
    }

    String makeAverage() {
        headerLabel.setText("Compute average for a specific student");
        Label  studentId = new Label();
        TextField userText = new TextField(6);
        Button submit = new Button("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = userText.getText();
                studentId.setText(data);
            }
        });
        controlPanel.add(userText);
        controlPanel.add(submit);
        return studentId.getText();
    }

    public static void main(String args[]){
        new AvgRate_GUI();
    }
}
