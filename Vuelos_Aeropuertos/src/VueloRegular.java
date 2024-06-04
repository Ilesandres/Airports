public class VueloRegular extends  Vuelo{
    String Tipo_vuelo;
    String Origen;
    String Destino;
    String Duracion;
    String Aerolinea;
    //tipo avion
    String Tipo_Avion;
    int Capacidad;
    String horarioSalida;
    String informacion_Adicioanal;

    @Override
    public String getTipo_vuelo() {
        return Tipo_vuelo;
    }

    @Override
    public void setTipo_vuelo(String tipo_vuelo) {
        Tipo_vuelo = tipo_vuelo;
    }

    @Override
    public String getOrigen() {
        return Origen;
    }

    @Override
    public void setOrigen(String origen) {
        Origen = origen;
    }

    @Override
    public String getDestino() {
        return Destino;
    }

    @Override
    public void setDestino(String destino) {
        Destino = destino;
    }

    @Override
    public String getDuracion() {
        return Duracion;
    }

    @Override
    public void setDuracion(String duracion) {
        Duracion = duracion;
    }

    @Override
    public String getAerolinea() {
        return Aerolinea;
    }

    @Override
    public void setAerolinea(String aerolinea) {
        Aerolinea = aerolinea;
    }

    @Override
    public String getTipo_Avion() {
        return Tipo_Avion;
    }

    @Override
    public void setTipo_Avion(String tipo_Avion) {
        Tipo_Avion = tipo_Avion;
    }

    @Override
    public int getCapacidad() {
        return Capacidad;
    }

    @Override
    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getInformacion_Adicioanal() {
        return informacion_Adicioanal;
    }

    public void setInformacion_Adicioanal(String informacion_Adicioanal) {
        this.informacion_Adicioanal = informacion_Adicioanal;
    }


    public VueloRegular( String origen, String destino, String duracion, String aerolinea, String tipo_Avion, int capacidad, String HorarioSalida, String Informacion_Adicioanal) {
        Tipo_vuelo = "R";
        Origen = origen;
        Destino = destino;
        Duracion = duracion;
        Aerolinea = aerolinea;
        Tipo_Avion = tipo_Avion;
        Capacidad = capacidad;
        horarioSalida = HorarioSalida;
        informacion_Adicioanal = Informacion_Adicioanal;
    }


    @Override
    public void imprimir(){
        System.out.println("");
        System.out.println("");
        System.out.println("tipo de vuelo          : "+Tipo_vuelo);
        System.out.println("aeropuerto de origen   : "+Origen);
        System.out.println("aeropuerto de destino  : "+Destino);
        System.out.println("duracion               : "+Duracion);
        System.out.println("Aerolinea              : "+Aerolinea);
        System.out.println("Tipo Avion             : "+Tipo_Avion);
        System.out.println("Capacidad              : "+Capacidad);
        System.out.println("Horario de Salida      : "+horarioSalida);
        System.out.println("informacion adicional  : "+informacion_Adicioanal);
    }

}
