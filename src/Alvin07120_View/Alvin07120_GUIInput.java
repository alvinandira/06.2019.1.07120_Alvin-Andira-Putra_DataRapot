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
public class Alvin07120_GUIInput {
private static Alvin07120_KampusController kampus = new Alvin07120_KampusController();
    JFrame input = new JFrame();
    JButton back,ok;
    JLabel inputnilailabel,namalabel,kelaslabel,npmlabel,utslabel,uaslabel,praktikumlabel,top;
    JTextField nama,kelas,npm,uts,uas,praktikum;
    public Alvin07120_GUIInput(){
        input.setSize(700, 630);
        input.setLayout(null);
        input.getContentPane().setBackground(Color.YELLOW);
        
        top = new JLabel("Input");
        top.setBounds(50, 40, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        input.add(top);
        
        namalabel = new JLabel("Nama");
        namalabel.setBounds(30, 120, 100, 30);
        input.add(namalabel);
        nama = new JTextField();
        nama.setBounds(30, 150, 200, 30);
        input.add(nama);
        
        kelaslabel = new JLabel("Kelas");
        kelaslabel.setBounds(30, 180, 100, 30);
        input.add(kelaslabel);
        kelas = new JTextField();
        kelas.setBounds(30, 210, 200, 30);
        input.add(kelas);
        
        npmlabel = new JLabel("NPM");
        npmlabel.setBounds(30, 240, 100, 30);
        input.add(npmlabel);
        npm = new JTextField();
        npm.setBounds(30, 270, 200, 30);
        input.add(npm);
        
        uaslabel = new JLabel("UAS");
        uaslabel.setBounds(30, 300, 100, 30);
        input.add(uaslabel);
        uas = new JTextField();
        uas.setBounds(30, 330, 200, 30);
        input.add(uas);
        
        utslabel = new JLabel("UTS");
        utslabel.setBounds(30, 360, 100, 30);
        input.add(utslabel);
        uts = new JTextField();
        uts.setBounds(30, 390, 200, 30);
        input.add(uts);
        
        praktikumlabel = new JLabel("Praktikum");
        praktikumlabel.setBounds(30, 420, 100, 30);
        input.add(praktikumlabel);
        praktikum = new JTextField();
        praktikum.setBounds(30, 450, 200, 30);
        input.add(praktikum);
       
        ok = new JButton("OK");
        ok.setBounds(200, 500, 100, 30);
        ok.setBackground(Color.GREEN);
        input.add(ok);
        
        back = new JButton("Back");
        back.setBounds(100, 500, 100, 30);
        back.setBackground(Color.GREEN);
        input.add(back);
        
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.setVisible(true);
        input.setLocationRelativeTo(null);
        
       
       
       
        ok.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                    String textnama = nama.getText();
                    String textkelas = kelas.getText();
                    String textnpm = npm.getText();
                    String textuas = uas.getText();
                    String textuts = uts.getText(); 
                    String textpraktikum = praktikum.getText();
                    Alvin07120_View.Alvin07120_Allobjctrl.Praktikan.add(new Alvin07120_KampusEntity(textkelas, textnama, textnpm, textuts, textuas, textpraktikum));
                    JOptionPane.showMessageDialog(null, "sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Alvin07120_KampusGUI kampus = new Alvin07120_KampusGUI();
                input.dispose();
            }
        });
    }
    void kosong(){
        npm.setText(null);
        kelas.setText(null);
        nama.setText(null);
        uts.setText(null);
        uas.setText(null);
        praktikum.setText(null);
    }
}
