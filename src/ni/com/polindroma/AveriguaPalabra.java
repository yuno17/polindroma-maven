package ni.com.polindroma;

public class AveriguaPalabra {

    public String palabraEnviada;
    public boolean palabraPolindroma = false;
    public String sCadenaInvertida;
    public String getPalabraEnviada() {
        return palabraEnviada;
    }
    public void setPalabraEnviada(String palabraEnviada) {
        this.palabraEnviada = palabraEnviada;
    }
    public String getSCadenaInvertida() {
        return sCadenaInvertida;
    }
    public void setSCadenaInvertida(String sCadenaInvertida) {
        this.sCadenaInvertida = sCadenaInvertida;
    }
    public boolean getPalabraPolindroma() {
        return palabraPolindroma;
    }
    public void setPalabraPolindroma(boolean palabraPolindroma) {
        this.palabraPolindroma = palabraPolindroma;
    }

    public String averiguaTipoOracion() {
        this.retornaReverso();
        if(!(this.palabraEnviada== this.sCadenaInvertida)){
            return "La palabra " + this.palabraEnviada + ", es una PALABRA POLINDROMA.......";
        }else{
            return "La palabra " + this.palabraEnviada + ",no es políndroma......." ;
        }
    }

    public void MensajeResultado(){
        if(this.palabraPolindroma) {
            System.out.println("La palabra " + this.palabraEnviada + ", es una POLINDROMA.......");
        }
        else {
            System.out.println("La palabra " + this.palabraEnviada + ",no es políndroma......." );
        }
    }


    public String getResultado(){
        if(this.palabraPolindroma) {
            return "La palabra " + this.palabraEnviada + ", es una PALABRA POLINDROMA.......";
        }
        else {
            return "La palabra " + this.palabraEnviada + ",no es políndroma......." ;
        }
    }

    public AveriguaPalabra(String parametroOracion){
        this.palabraEnviada=parametroOracion;
        this.retornaReverso();
        String sCadenaCompara = this.palabraEnviada.toLowerCase();
        sCadenaCompara=sCadenaCompara.replaceAll(" ","");
        String sCadenaEnviada = this.getSCadenaInvertida();
        if(sCadenaCompara.equals(sCadenaEnviada)){
            this.palabraPolindroma=true;
        }else{
            this.palabraPolindroma=false;
        }
    }

    public void retornaReverso(){
        this.sCadenaInvertida="";
        for (int x=this.palabraEnviada.length()-1;x>=0;x--){
            this.sCadenaInvertida = this.sCadenaInvertida + this.palabraEnviada.charAt(x);
        }
        String sCadenaTemporal = this.sCadenaInvertida.replace(" ","");
        this.sCadenaInvertida=sCadenaTemporal.toLowerCase();
    }

}
