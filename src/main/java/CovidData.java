public class CovidData {
   private String region;
   private String aldersGruppe;
   private int tilfælde;
   private int døde;
   private int indlagtePåIntensiv;
   private int indlagte;
   private String dato;


    public CovidData(){

    }

    public CovidData(String region, String aldersGruppe, int tilfælde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.tilfælde = tilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    //settere
    public void setRegion(String region) {
        this.region = region;
    }

    public void setAldersGruppe(String aldersGruppe) {
        this.aldersGruppe = aldersGruppe;
    }

    public void setTilfælde(int tilfælde) {
        this.tilfælde = tilfælde;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public void setIndlagtePåIntensiv(int indlagtePåIntensiv) {
        this.indlagtePåIntensiv = indlagtePåIntensiv;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    //Gettere
    public String getRegion() {
        return region;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public int getTilfælde() {
        return tilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "region='" + region + '\'' +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", tilfælde=" + tilfælde +
                ", døde=" + døde +
                ", indlagtePåIntensiv=" + indlagtePåIntensiv +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
}
