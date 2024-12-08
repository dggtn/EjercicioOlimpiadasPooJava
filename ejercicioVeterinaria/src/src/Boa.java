import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Boa extends Animal{

    private ArrayList<String> cuidados;

    public Boa(String boaLaLoca) {
        super();
        cuidados = new ArrayList<>();
    }

    @Override
    public String asignarCuidados(String c) {
        r
    }

    @Override
    public List<String> mostrarCuidados() {
        return cuidados;
    }

    @Override
    public void agregarCuidados(String s) {
        cuidados.add(s);

    }
}
