public class Vuelo {
    String Tipo_vuelo;
    String Origen;
    String Destino;
    String Duracion;
    String Aerolinea;
    //tipo avion
    String Tipo_Avion;
    int Capacidad;

    public String getTipo_vuelo() {
        return Tipo_vuelo;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        Tipo_vuelo = tipo_vuelo;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String duracion) {
        Duracion = duracion;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        Aerolinea = aerolinea;
    }

    public String getTipo_Avion() {
        return Tipo_Avion;
    }

    public void setTipo_Avion(String tipo_Avion) {
        Tipo_Avion = tipo_Avion;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public Vuelo() {
    }

    public Vuelo(String tipo_vuelo, String origen, String destino, String duracion, String aerolinea, String tipo_Avion, int capacidad) {
        Tipo_vuelo = tipo_vuelo;
        Origen = origen;
         Destino = destino;
        Duracion = duracion;
        Aerolinea = aerolinea;
        Tipo_Avion = tipo_Avion;
        Capacidad = capacidad;
    }

    public  void imprimir(){
        System.out.println("");
        System.out.println("");
        System.out.println("tipo de vuelo          : "+Tipo_vuelo);
        System.out.println("aeropuerto de destino  : "+Destino);
        System.out.println("duracion               : "+Duracion);
        System.out.println("Aerolinea              : "+Aerolinea);
        System.out.println("Tipo Avion             : "+Tipo_Avion);
        System.out.println("Capacidad              : "+Capacidad);


    }
}
