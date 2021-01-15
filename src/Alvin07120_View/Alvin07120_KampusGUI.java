package Alvin07120_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Alvin07120_KampusGUI {
    JFrame view = new JFrame();
    JLabel top;
    JTextField text;
    JLabel labelinput,labelupdate,labelview,labeldelete;
    JButton buttoninput,buttonview,buttonupdate,buttondelete;
    public Alvin07120_KampusGUI(){
        view.setSize(700, 360);
        view.setLayout(null);
        view.getContentPane().setBackground(Color.yellow);
        
        top = new JLabel("DATA RAPOT");
        top.setBounds(50, 100, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        view.add(top);
        
            buttoninput = new JButton("1. Input");
            buttoninput.setBounds(50, 200, 100, 40);
            buttoninput.setBackground(Color.GREEN);
            view.add(buttoninput);

            buttonview = new JButton("2. View");
            buttonview.setBounds(50, 250, 100, 40);
            buttonview.setBackground(Color.GREEN);
            view.add(buttonview);

            buttonupdate = new JButton("3. UPDATE");
            buttonupdate.setBounds(50, 300, 100, 40);
            buttonupdate.setBackground(Color.GREEN);
            view.add(buttonupdate);
        
        buttondelete = new JButton("4. DELETE");
        buttondelete.setBounds(50, 350, 100, 40);
        buttondelete.setBackground(Color.GREEN);
        view.add(buttondelete);
        
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        buttoninput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Alvin07120_GUIInput GUIinput= new Alvin07120_GUIInput();
                view.dispose();
            }
         
        });
        buttonview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Alvin07120_GUIView GUIview= new Alvin07120_GUIView();
                view.dispose();
            }
        });
         buttonupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) { 
               Alvin07120_GUIUpdate GUIUpdate= new Alvin07120_GUIUpdate();
                view.dispose();
            }
         });
         buttondelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Alvin07120_GUIDelete GUIDelete = new Alvin07120_GUIDelete();
                view.dispose();
            }
         });
}
}
