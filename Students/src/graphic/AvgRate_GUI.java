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
public class AvgRate_GUI {
    private Label headerLabel;
    private Frame newFrame;
    private Panel controlPanel;

    public AvgRate_GUI() {
        prepareFrame();
    }
    void prepareFrame() {
        newFrame = new Frame("Students");
        newFrame.setSize(400, 400);
        newFrame.setLayout(new GridLayout(3, 1));
        controlPanel = new Panel();
        headerLabel = new Label();
        newFrame.add(controlPanel);
        newFrame.add(headerLabel);
        newFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        newFrame.setVisible(true);
    }
    String loadFile() {
        headerLabel.setText("Download a file with a list");
        headerLabel.setLocation(100, 300);
        controlPanel.add(headerLabel);
        FileDialog fileDialog = new FileDialog(newFrame,"Select a file", FileDialog.LOAD);
        Button selectFile = new Button("Open file");
        selectFile.setBounds(50, 100, 70, 30);
        controlPanel.add(selectFile);
        selectFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileDialog.setVisible(true);
                String fname = fileDialog.getDirectory() + fileDialog.getFile();
                AvgRates ar = new AvgRates_HashMap();
                headerLabel.setText(String.valueOf(ar.readData(fname).values().toArray()[0]));
            }
        });
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
        AvgRate_GUI f=new AvgRate_GUI();
        f.loadFile();
        f.makeAverage();

    }
}
