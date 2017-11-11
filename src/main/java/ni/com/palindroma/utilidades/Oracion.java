package ni.com.palindroma.utilidades;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.swing.text.StyledEditorKit;

public class Oracion {
    private @Getter @Setter String palabraEnviada;
    private @Getter @Setter boolean palabraPolindroma = false;
    private @Getter @Setter String sCadenaInvertida;



    public String getResultado(){
        if(this.palabraPolindroma) {
            return "La palabra " + this.palabraEnviada + ", es una PALABRA POLINDROMA.......";
        }
        else {
            return "La palabra " + this.palabraEnviada + ",no es políndroma......." ;
        }
    }

    public Oracion(String parametroOracion){
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

    public static Boolean EsPalindroma(String cadena){
        String cadenaInvertida = StringUtils.reverse(cadena);
        cadenaInvertida = StringUtils.upperCase(cadenaInvertida).replaceAll(" ","");
        cadena = StringUtils.upperCase(cadena).replaceAll(" ","");
        return StringUtils.equals(cadena,cadenaInvertida);
    }

    public void retornaReverso(){


        this.sCadenaInvertida="";
        for (int x=this.palabraEnviada.length()-1;x>=0;x--){
            this.sCadenaInvertida = this.sCadenaInvertida + this.palabraEnviada.charAt(x);
        }
        String sCadenaTemporal = this.sCadenaInvertida.replace(" ","");
        this.sCadenaInvertida=sCadenaTemporal.toLowerCase();
    }

    public static Boolean EsVerdadero(Boolean variable){
        return variable==true;
    }


}
