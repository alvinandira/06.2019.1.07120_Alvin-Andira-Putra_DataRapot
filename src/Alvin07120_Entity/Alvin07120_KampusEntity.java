package Alvin07120_Entity;

public class Alvin07120_KampusEntity {
    protected String Alvin07120_matkul,Alvin07120_namamhs,Alvin07120_npm;
    protected String Alvin07120_uts,Alvin07120_uas,Alvin07120_praktikum;
   

  
    public Alvin07120_KampusEntity(String Alvin07120_matkul,String Alvin07120_namamhs,String Alvin07120_npm,
        String Alvin07120_uts,String Alvin07120_uas,String Alvin07120_praktikum
        ) {
        this.Alvin07120_matkul = Alvin07120_matkul;
        this.Alvin07120_namamhs = Alvin07120_namamhs;
        this.Alvin07120_npm = Alvin07120_npm;
        this.Alvin07120_praktikum = Alvin07120_praktikum;
       
        this.Alvin07120_uas = Alvin07120_uas;
        this.Alvin07120_uts = Alvin07120_uts;
    }

    public String getAlvin07120_npm(){
        return Alvin07120_npm;
    }
   
   
    public String getAlvin07120_matkul(){
        return Alvin07120_matkul;
    }
    public String getAlvin07120_namamhs(){
        return Alvin07120_namamhs;
    }
    public String getAlvin07120_praktikum(){
        return Alvin07120_praktikum;
    }
   
    public String getAlvin07120_uas(){
        return Alvin07120_uas;
    }
    public String getAlvin07120_uts(){
        return Alvin07120_uts;
    }
}
