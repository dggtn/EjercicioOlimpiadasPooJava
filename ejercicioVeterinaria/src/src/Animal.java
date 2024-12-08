import java.util.List;

public abstract class Animal {

    List<String> cuidados;

    public abstract List<String>mostrarCuidados();

    public abstract void agregarCuidados(String s);
}
