import java.security.MessageDigest;
import java.util.HashSet;

public class Veterinaria {
    HashSet<Medicoveterinario>medicos;
    HashSet<Asistente>asistentes;

    private String nombre;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMedicoVeterinario(Medicoveterinario v){
        medicos.add(v);

    }

    public void agregarAsistente(Asistente a){
        asistentes.add(a);

    }

    public void atender(Animal boaLoca) {
    }
}
