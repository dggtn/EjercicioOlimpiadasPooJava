import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pais {
    int cantidadOro;
    int cantidadPlanta;
    int cantidadBronce;
    private String nombre;

    private Set<Participante> participantes = new HashSet<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public void agregarParticipante(Participante participante) {

        this.participantes.add(participante);
    }


}
