import java.util.HashSet;
import java.util.Set;

public class Olimpiada {

    private Set<Pais> paises = new HashSet<>();
    private Set<Deporte> deportes = new HashSet<>();

    public void agregarDeporte(Deporte unDeporte) {
        this.deportes.add(unDeporte);
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public int obtenerCantOroPorPais(Pais pais, Medalla oro) {
        Pais paisbuscado = null;
        for (Pais p : paises) {
            if (p.equals(pais)) {
                paisbuscado = p;
            }
        }
        if (paisbuscado != null) {
            paisbuscado.getCantOro();
        }
        return 0;
    }

    public int obtenerPaisConMasMedallas() {
        int maximo = 0;
        for (Pais p : paises) {
            if (p.cantMedallas() > maximo) {
                maximo = p.cantMedallas();
            }
        }
        return maximo;
    }

    public String compararPaisesPorMasMedallero(Pais pais1, Pais pais2) {
        String maximo = "No se encuentran en la lista de paises";
        for (Pais p : paises) {
            if (paises.contains(pais1)& paises.contains(pais2)) {
                if (pais1.cantMedallas() > pais2.cantMedallas()) {
                    maximo = pais1.getNombre();
                } else {
                    maximo = pais2.getNombre();
                }
            }
        }
        return maximo;
    }

    public int obtenerCantTotalMedallas() {
        int total =0 ;
        for (Pais p : paises) {
            total += p.cantMedallas();
        }
        return total;
    }

};