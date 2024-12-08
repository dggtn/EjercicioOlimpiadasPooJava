import java.util.ArrayList;
import java.util.List;

public abstract class Participante {
    int oro;
    int plata;
    int bronce;
    private String nombre;
    private Deporte deporteEnQueParticipa;
    private List<Medalla> medallasObtenidas = new ArrayList<>();

    public Participante(String nombre, Deporte deporteEnQueParticipa) {
        this.nombre = nombre;
        this.deporteEnQueParticipa = deporteEnQueParticipa;
    }

    public boolean tieneOro() {
        for (Medalla m : medallasObtenidas) {
            if (m.equals(TipoMedalla.ORO)) {
                return true;
            }
        }
        return false;
    }
    public int cantMedallasOro(){
        int cant =0;
        for(Medalla m:medallasObtenidas){
            if(m.equals(TipoMedalla.ORO)){
                cant+=1;
            }
        }
        return cant;
    }

    public int cantMedallasPlata(){
        int cant =0;
        for(Medalla m:medallasObtenidas){
            if(m.equals(TipoMedalla.PLATA)){
                cant+=1;
            }
        }
        return cant;
    }

    public int cantMedallasBronce(){
        int cant =0;
        for(Medalla m:medallasObtenidas){
            if(m.equals(TipoMedalla.BRONCE)){
                cant+=1;
            }
        }
        return cant;
    }

    public int cantMedallas() {
        return cantMedallasOro()+cantMedallasPlata()+cantMedallasBronce();
    }

    public void asignarMedallaoORO(Medalla ORO) {
        this.oro++;
    }
    public void asignarMedallaoPLATA(TipoMedalla PLATA) {
        this.plata++;
    }
    public void asignarMedallaoBRONCE(TipoMedalla BRONCE) {
        this.bronce++;
    }
}