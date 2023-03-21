package TA08_Ex4;

public class Serie {

	// Atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	final int NUMEROTEMPORADASDEFECTO = 3;
	final boolean ENTREGADODEFECTO = false;

	// Constructores
	public Serie() {
		this.numeroTemporadas = NUMEROTEMPORADASDEFECTO;
		this.entregado = ENTREGADODEFECTO;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = NUMEROTEMPORADASDEFECTO;
		this.entregado = ENTREGADODEFECTO;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public boolean getEntregado() {
		return this.entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getCreador() {
		return creador;
	}
}
