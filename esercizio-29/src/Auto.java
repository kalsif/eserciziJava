//Anche qui continuo ad utilizzare public
public class Auto {
    public int cilindrata;
    public String targa;
    public String marca;
    public String modello;

    public Auto(int cilindrata,String targa,String marca, String modello){
        this.cilindrata=cilindrata;
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
    }

    public int getCilindrata(){
        return cilindrata;
    }
    public String getTarga(){
        return targa;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata=cilindrata;
    }

    @Override
    public String toString() {
        return "Auto {" +
                "cilindrata = " + cilindrata +
                ", targa = '" + targa + '\'' +
                ", marca = '" + marca + '\'' +
                ", modello = '" + modello + '\'' +
                '}';
    }
}
