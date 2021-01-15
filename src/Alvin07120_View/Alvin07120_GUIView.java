package Alvin07120_View;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Alvin07120_Controller.Alvin07120_KampusController;
public class Alvin07120_GUIView {
    private static Alvin07120_KampusController kampus = new Alvin07120_KampusController();
    JFrame update = new JFrame();
    JButton back,ok;
    JLabel inputnilailabel,namalabel,kelaslabel,npmlabel,utslabel,uaslabel,praktikumlabel,top,indexlabel;
    JTextField nama,kelas,npm,uts,uas,praktikum,index;
    public Alvin07120_GUIView(){
    }
}
