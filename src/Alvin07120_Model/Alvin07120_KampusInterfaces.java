package Alvin07120_Model;

import Alvin07120_Entity.Alvin07120_DosenEntity;
import Alvin07120_Entity.Alvin07120_MhsEntity;
import Alvin07120_Entity.Alvin07120_KampusEntity;
import java.util.ArrayList;

public interface Alvin07120_KampusInterfaces {
    public void insert_kampus(Alvin07120_MhsEntity mhs,Alvin07120_DosenEntity dosen,Alvin07120_KampusEntity kampus);
    public ArrayList<Alvin07120_DosenEntity> getDataDosen();
    public ArrayList<Alvin07120_MhsEntity> getDataMhs();
    public ArrayList<Alvin07120_KampusEntity> getDataKampus();
};