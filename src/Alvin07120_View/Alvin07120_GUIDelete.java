package Alvin07120_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Alvin07120_Controller.Alvin07120_KampusController;
public class Alvin07120_GUIDelete {
    private static Alvin07120_KampusController kampus = new Alvin07120_KampusController();
    JFrame delete = new JFrame();
    JButton back,ok;
    JLabel deletedata,top;
    JTextField deletetext;
    public Alvin07120_GUIDelete(){
        delete.setSize(700, 630);
        delete.setLayout(null);
        delete.getContentPane().setBackground(Color.YELLOW);
        
        top = new JLabel("Delete");
        top.setBounds(50, 40, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        delete.add(top);
        
        deletedata = new JLabel("Delete data");
        deletedata.setBounds(50, 100, 100, 30);
        delete.add(deletedata);
        deletetext = new JTextField();
        deletetext.setBounds(50, 140, 100, 30);
        delete.add(deletetext);
        
        ok = new JButton("OK");
        ok.setBounds(50, 190, 100, 30);
        ok.setBackground(Color.GREEN);
        delete.add(ok);
        
        back = new JButton("Back");
        back.setBounds(150, 190, 100, 30);
        back.setBackground(Color.GREEN);
        delete.add(back);
        
        delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        delete.setVisible(true);
        delete.setLocationRelativeTo(null);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String indextext = deletetext.getText();
                Alvin07120_Allobjctrl.Praktikan.remove(indextext);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Alvin07120_KampusGUI kampus = new Alvin07120_KampusGUI();
               delete.dispose();
            }
        });
    }
}
