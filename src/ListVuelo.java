import java.util.ArrayList;
import java.util.List;

public class ListVuelo {


   public static List <Vuelo> vueloList=new ArrayList<>();
   public static  List <Aeropuerto> aeropuertoList=new ArrayList<>();


    public static List<Vuelo> getVueloList() {
        return vueloList;
    }

    public static void setVueloList(List<Vuelo> vueloList) {
        ListVuelo.vueloList = vueloList;
    }

    public ListVuelo() {
        new ArrayList<>();
    }

    public ListVuelo(List<Vuelo> vueloList) {
        this.vueloList = vueloList;
    }

    public void agregar(Vuelo vuelo){
        vueloList.add(vuelo);
    }

    public void imprimir(){
        for(Vuelo vuelo: vueloList){
            vuelo.imprimir();
        }
    }

    public void mostrarVuelos(){
        for(Vuelo vuelo: vueloList){
            ListAeropuertos listAeropuertos= new ListAeropuertos();
            Aeropuerto Origen=listAeropuertos.buscarAeropuerto(vuelo.getOrigen());
            Aeropuerto Destino=listAeropuertos.buscarAeropuerto(vuelo.getDestino());
            System.out.println("");
            System.out.println("");
            System.out.println("tipo de vuelo          : "+vuelo.getTipo_vuelo());
            System.out.println("aeropuerto de origen   : "+Origen.getNombre());
            System.out.println("aeropuerto de destino  : "+Destino.getNombre());
            System.out.println("duracion               : "+vuelo.getDuracion());
            System.out.println("Aerolinea              : "+vuelo.getAerolinea());
            System.out.println("Tipo Avion             : "+vuelo.getTipo_Avion());
            System.out.println("Capacidad              : "+vuelo.getCapacidad());
            if(vuelo.getTipo_vuelo()=="R"){
                System.out.println("Horario de Salida      : "+((VueloRegular)vuelo).getHorarioSalida());
                System.out.println("informacion adicional  : "+((VueloRegular)vuelo).getInformacion_Adicioanal());
            }else if(vuelo.getTipo_vuelo()=="C"){
                System.out.println("nombre viaje           : "+((VueloCharter)vuelo).getNombreviaje());
                System.out.println("fecha de salida        : "+((VueloCharter)vuelo).getFechasalida());
                System.out.println("Hora                   : "+((VueloCharter)vuelo).getHora());
                System.out.println("informacion adicional  : "+((VueloCharter)vuelo).getInormcaion_Adicional());
            }



        }
        ;

    }

    public void imprimirporVuelosEntrantes(){
        aeropuertoList=ListAeropuertos.getAeropuertoList();

        for(Aeropuerto aeropuerto: aeropuertoList){
            boolean ison=false;
            System.out.println(" ");
            System.out.println("");
            System.out.println("    VUELOS DE ENTRADA AL AEROPUERTO ");
            System.out.println(" nombre      : "+aeropuerto.getNombre());
            System.out.println(" codigo      : "+aeropuerto.getCodigo());
            System.out.println("");
            for(Vuelo vuelo: vueloList){
                if(aeropuerto.getCodigo()==vuelo.getDestino()){
                    vuelo.imprimir();
                    ison=true;
                }

            }
            if(!ison){
                System.out.println(" no hay vuelos con destino a este aeropuerto");
            }


        }

    }

    public void imprimirporVuelosSalientes(){
        aeropuertoList =ListAeropuertos.getAeropuertoList();
        System.out.println("");
        System.out.println("");
        System.out.println("  VUELOS SALIENTES DE LOS AEROPUERTOS  ");
        for(Aeropuerto aeropuerto:aeropuertoList){
            System.out.println("");
            System.out.println(" AEROPUERTO "+aeropuerto.getNombre());
            System.out.println(" codigo "+aeropuerto.getCodigo());
            System.out.println("");
            boolean ison=false;
            for(Vuelo vuelo:vueloList){
                if(aeropuerto.getCodigo()==vuelo.getOrigen()){
                    vuelo.imprimir();
                    ison=true;
                }
            }
            if(!ison){
                System.out.println(" no se encontraron vuelos salientes desde este aeropuerto");
            }

        }

    }

}
