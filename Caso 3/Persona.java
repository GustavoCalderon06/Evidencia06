import java.util.Vector;

public class Persona {
	private String _nombre;
	public Vector<Persona> _amigos = new Vector<Persona>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public void agregarAmigo() {
		throw new UnsupportedOperationException();
	}
}