package Alvin07120_Controller;
import Alvin07120_Entity.Alvin07120_KampusEntity;
public class Alvin07120_KampusController {
   public Alvin07120_KampusController(){
}
   public Alvin07120_KampusEntity getData(int index) {
       return Alvin07120_AllObjectModel.modelkampus.getKampusEntityArrayList(index); 
  }

    public void add(Alvin07120_KampusEntity alvin07120_KampusEntity) {
        Alvin07120_AllObjectModel.modelkampus.add(alvin07120_KampusEntity);
    }
    public void set(String index, Alvin07120_KampusEntity alvin07120_KampusEntity) {
       Alvin07120_AllObjectModel.modelkampus.set(alvin07120_KampusEntity);
    }

    public void remove(String Alvin07120_index) {
        Alvin07120_AllObjectModel.modelkampus.delete(0);
    }

    public int size() {
       Alvin07120_AllObjectModel.modelkampus.size();
       return 0;
    }
    }
