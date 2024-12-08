import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pais {

    private String nombre;

    private Set<Participante> participantes = new HashSet<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public int getCantOro() {
        int cant = 0;
        for (Participante p : participantes) {
            if (p.tieneOro()) {
                cant = p.cantMedallasOro();
                return cant;
            }

        }
        return cant;
    }

    public int cantMedallas() {
        int sumatoria = 0;
        for(Participante p : participantes){
            sumatoria += p.cantMedallas();
        }
        return sumatoria;
    }

    public int cantAtletas() {
        participantes.toArray();
        return participantes.size();
    }

    public String getNombre() {
        return nombre;
    }
}