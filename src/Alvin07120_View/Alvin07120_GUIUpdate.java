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
import Alvin07120_Entity.Alvin07120_KampusEntity;
import javax.swing.JOptionPane;
public class Alvin07120_GUIUpdate {
    private static Alvin07120_KampusController kampus = new Alvin07120_KampusController();
    JFrame update = new JFrame();
    JButton back,ok;
    JLabel inputnilailabel,namalabel,kelaslabel,npmlabel,utslabel,uaslabel,praktikumlabel,top,indexlabel;
    JTextField nama,kelas,npm,uts,uas,praktikum,index;

    public Alvin07120_GUIUpdate(){
        update.setSize(700, 630);
        update.setLayout(null);
        update.getContentPane().setBackground(Color.YELLOW);
        
        top = new JLabel("Input");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        update.add(top);
        
        indexlabel = new JLabel("Index ke ");
        indexlabel.setBounds(30, 60, 100, 30);
        update.add(indexlabel);
        index = new JTextField();
        index.setBounds(30, 90, 200, 30);
        update.add(index);
        
        namalabel = new JLabel("Nama");
        namalabel.setBounds(30, 120, 100, 30);
        update.add(namalabel);
        nama = new JTextField();
        nama.setBounds(30, 150, 200, 30);
        update.add(nama);
        
        kelaslabel = new JLabel("Kelas");
        kelaslabel.setBounds(30, 180, 100, 30);
        update.add(kelaslabel);
        kelas = new JTextField();
        kelas.setBounds(30, 210, 200, 30);
        update.add(kelas);
        
        npmlabel = new JLabel("NPM");
        npmlabel.setBounds(30, 240, 100, 30);
        update.add(npmlabel);
        npm = new JTextField();
        npm.setBounds(30, 270, 200, 30);
        update.add(npm);
        
        uaslabel = new JLabel("UAS");
        uaslabel.setBounds(30, 300, 100, 30);
        update.add(uaslabel);
        uas = new JTextField();
        uas.setBounds(30, 330, 200, 30);
        update.add(uas);
        
        utslabel = new JLabel("UTS");
        utslabel.setBounds(30, 360, 100, 30);
        update.add(utslabel);
        uts = new JTextField();
        uts.setBounds(30, 390, 200, 30);
        update.add(uts);
        
        praktikumlabel = new JLabel("Praktikum");
        praktikumlabel.setBounds(30, 420, 100, 30);
        update.add(praktikumlabel);
        praktikum = new JTextField();
        praktikum.setBounds(30, 450, 200, 30);
        update.add(praktikum);
       
        ok = new JButton("OK");
        ok.setBounds(200, 500, 100, 30);
        ok.setBackground(Color.GREEN);
        update.add(ok);
        
        back = new JButton("Back");
        back.setBounds(100, 500, 100, 30);
        back.setBackground(Color.GREEN);
        update.add(back);
        
        update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update.setVisible(true);
        update.setLocationRelativeTo(null);
       
    ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             String indextext = index.getText();
             String textnama = nama.getText();
             String textkelas = kelas.getText();
             String textnpm = npm.getText();
             String textuas = uas.getText();
             String textuts = uts.getText(); 
             String textpraktikum = praktikum.getText();
             Alvin07120_Allobjctrl.Praktikan.set(indextext, new Alvin07120_KampusEntity(textnama, textkelas, textnpm, textuts, textuas, textpraktikum));
             JOptionPane.showMessageDialog(null, "sukses", "information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Alvin07120_KampusGUI kampus = new Alvin07120_KampusGUI();
                update.dispose();
            }
        });
    }
}
