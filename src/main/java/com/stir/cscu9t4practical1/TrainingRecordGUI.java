// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    private JTextField activity = new JTextField(10);
    private JCheckBox outdoors = new JCheckBox();
    private JCheckBox headwind = new JCheckBox();
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labdist = new JLabel(" Distance (km):");
    private JLabel labact = new JLabel("Activity:");
    private JLabel labod = new JLabel("Check if Outdoors:");
    private JLabel labhw = new JLabel("Check if Headwind");
    private JButton addR = new JButton("Add");
    private JButton removeR = new JButton("Remove");
    private JButton lookUpByDate = new JButton("Look Up");
    private JButton lookUpAllByDate = new JButton("Look Up All");

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI 
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        add(labn);
        add(name);
        name.setEditable(true);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        dist.setEditable(true);
        add(labact);
        add(activity);
        activity.setEditable(true);
        add(labod);
        add(outdoors);
        add(labhw);
        add(headwind);
        add(addR);
        addR.addActionListener(this);
        add(removeR);
        removeR.addActionListener(this);
        add(lookUpByDate);
        lookUpByDate.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false);
        setSize(720, 200);
        setVisible(true);
        blankDisplay();
        
        add(lookUpAllByDate);
        lookUpAllByDate.addActionListener(this);

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)
        
    } // constructor

    // listen for and respond to GUI events 
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if ((event.getSource() == addR) && activity.getText().equalsIgnoreCase("Swim")) {
            message = addSwimEntry("swim");
        }
        if ((event.getSource() == addR) && activity.getText().equalsIgnoreCase("Sprint")) {
            message = addSprintEntry("sprint");
        }
        if ((event.getSource() == addR) && activity.getText().equalsIgnoreCase("Cycle")) {
            message = addCycleEntry("cycle");
        }
        
        if (event.getSource() == removeR)
        {
        	message = removeEntry();
        }
        
        if (event.getSource() == lookUpByDate) {
            message = lookupEntry();
        }
        if (event.getSource() == lookUpAllByDate) {
        	message = lookUpAllEntry();
        }
        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    public String addSwimEntry(String what) {
    	
    	String message = "Swim Record added\n";
    	String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        float km = java.lang.Float.parseFloat(dist.getText());
        int h = Integer.parseInt(hours.getText());
        int mm = Integer.parseInt(mins.getText());
        int s = Integer.parseInt(secs.getText());
        String act = activity.getText();
        boolean od = outdoors.isSelected();
        Entry e = new Swim(n, d, m, y, h, mm, s, km, act, od);
        System.out.println("Adding "+what+" entry to the records");
        myAthletes.addEntry(e);
        return message;
    }
    
    public String addSprintEntry(String what) {
        String message = "Sprint Record added\n";
        System.out.println("Adding "+what+" entry to the records");
        String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        float km = java.lang.Float.parseFloat(dist.getText());
        int h = Integer.parseInt(hours.getText());
        int mm = Integer.parseInt(mins.getText());
        int s = Integer.parseInt(secs.getText());
        String act = activity.getText();
        Entry e = new Sprint(n, d, m, y, h, mm, s, km, act);
        myAthletes.addEntry(e);
        return message;
    }
    
    public String addCycleEntry(String what) {
        String message = "Cycle Record added\n";
        System.out.println("Adding "+what+" entry to the records");
        String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        float km = java.lang.Float.parseFloat(dist.getText());
        int h = Integer.parseInt(hours.getText());
        int mm = Integer.parseInt(mins.getText());
        int s = Integer.parseInt(secs.getText());
        String act = activity.getText();
        boolean hw = headwind.isSelected();
        Entry e = new Cycle(n, d, m, y, h, mm, s, km, act, hw);
        myAthletes.addEntry(e);
        return message;
    }
    
    public String lookupEntry() {
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up record ...");
        String message = myAthletes.lookupEntry(d, m, y);
        return message;
    }
    
    public String removeEntry()
    {
    	String n = name.getText();
    	int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up record ...");
        String message = myAthletes.removeEntry(n, d, m, y);
        return message;
    }

    public String lookUpAllEntry()
    {
    	int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up records ... ");
        String message = myAthletes.lookUpAllEntry(d, m, y);
        return message;
    }
    
    public void blankDisplay() {
        name.setText("");
        day.setText("");
        month.setText("");
        year.setText("");
        hours.setText("");
        mins.setText("");
        secs.setText("");
        dist.setText("");
        activity.setText("");

    }// blankDisplay
    // Fills the input fields on the display for testing purposes only
    public void fillDisplay(Entry ent) {
        name.setText(ent.getName());
        day.setText(String.valueOf(ent.getDay()));
        month.setText(String.valueOf(ent.getMonth()));
        year.setText(String.valueOf(ent.getYear()));
        hours.setText(String.valueOf(ent.getHour()));
        mins.setText(String.valueOf(ent.getMin()));
        secs.setText(String.valueOf(ent.getSec()));
        dist.setText(String.valueOf(ent.getDistance()));
    }

} // TrainingRecordGUI

