package Alvin07120_Model;

import Alvin07120_Entity.Alvin07120_DosenEntity;
import Alvin07120_Entity.Alvin07120_MhsEntity;
import Alvin07120_Entity.Alvin07120_KampusEntity;
import java.util.ArrayList;
//relasi realization dgn interfaces
public class Alvin07120_ModelKampus implements Alvin07120_Model.Alvin07120_KampusInterfaces{
    ArrayList <Alvin07120_DosenEntity> dataDosen = new ArrayList<>();
    ArrayList <Alvin07120_MhsEntity> dataMhs  = new ArrayList<>();
    ArrayList <Alvin07120_KampusEntity> dataKampus  = new ArrayList<>();
    
    // composition dari kampusEntity dan mhsEntity membentuk satu class kampusnmodel
    public Alvin07120_ModelKampus(){
        dataDosen = new ArrayList();
        dataMhs = new ArrayList();
        dataKampus = new ArrayList();
    }
    
    //polymorphism override karena memiliki method yang sama seperti interfaces
    @Override
    public void insert_kampus(Alvin07120_MhsEntity mhs, Alvin07120_DosenEntity dosen,Alvin07120_KampusEntity kampus) {
        dataDosen.add(dosen);
        dataMhs.add(mhs);
        dataKampus.add(kampus);
    }

    @Override
    public ArrayList<Alvin07120_DosenEntity> getDataDosen() {
        return dataDosen;
    }
    @Override
    public ArrayList<Alvin07120_KampusEntity> getDataKampus(){
        return dataKampus;
    }

    @Override
    public ArrayList<Alvin07120_MhsEntity> getDataMhs() {
        return dataMhs;
    }
     public Alvin07120_MhsEntity getMhsEntityArrayList(int index){
        return dataMhs.get(index);
    }
      public Alvin07120_DosenEntity getDosenEntityArrayList(int index){
        return dataDosen.get(index);
    }
      public Alvin07120_KampusEntity getKampusEntityArrayList(int index){
        return dataKampus.get(index);
    }

    public void add(Alvin07120_KampusEntity alvin07120_KampusEntity) {
        dataKampus.add(alvin07120_KampusEntity);
    }
     public void set(Alvin07120_KampusEntity alvin07120_KampusEntity) {
        dataKampus.set(0, alvin07120_KampusEntity);
    }
     public void size() {
         dataKampus.size();
    }
     public void delete(int index){
        dataKampus.remove(index);
     }


}
