public class Aeropuerto {

    String codigo;
    String nombre;
    String Poblacion;
    String Pais;
    String GMT;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getGMT() {
        return GMT;
    }

    public void setGMT(String GMT) {
        this.GMT = GMT;
    }

    public Aeropuerto() {
    }

    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, String GMT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Poblacion = poblacion;
        this.Pais = pais;
        this.GMT = GMT;
    }
}
