import java.util.Date;

public class VueloCharter extends Vuelo{
    String nombreviaje;
    String fechasalida;
    String Hora;
    String inormcaion_Adicional;

    public String getInormcaion_Adicional() {
        return inormcaion_Adicional;
    }

    public void setInormcaion_Adicional(String inormcaion_Adicional) {
        this.inormcaion_Adicional = inormcaion_Adicional;
    }

    public String getNombreviaje() {
        return nombreviaje;
    }

    public void setNombreviaje(String nombreviaje) {
        this.nombreviaje = nombreviaje;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public VueloCharter() {
    }

    public VueloCharter( String origen, String destino, String duracion, String aerolinea, String tipo_Avion, int capacidad, String nombreviaje, String fechasalida, String hora,String info_Adicional){
        this.Tipo_vuelo="C";
        this.Origen=origen;
        this.Destino=destino;
        this.Duracion=duracion;
        this.Aerolinea=aerolinea;
        this.Tipo_Avion=tipo_Avion;
        this.Capacidad=capacidad;
        this.nombreviaje = nombreviaje;
        this.fechasalida = fechasalida;
        inormcaion_Adicional=info_Adicional;
        Hora = hora;
    }

    @Override
    public void imprimir(){
        System.out.println("");
        System.out.println("");
        System.out.println("tipo de vuelo          : "+Tipo_vuelo);
        System.out.println("aeropuerto origen      : "+Origen);
        System.out.println("aeropuerto de destino  : "+Destino);
        System.out.println("duracion               : "+Duracion);
        System.out.println("Aerolinea              : "+Aerolinea);
        System.out.println("Tipo Avion             : "+Tipo_Avion);
        System.out.println("Capacidad              : "+Capacidad);
        System.out.println("Capacidad              : "+Capacidad);
        System.out.println("Nombre viaje           : "+nombreviaje);
        System.out.println("Fecha de salida        : "+fechasalida);
        System.out.println("Hora                   : "+Hora);
        System.out.println("informacion adicional  : "+inormcaion_Adicional);
    }
}
