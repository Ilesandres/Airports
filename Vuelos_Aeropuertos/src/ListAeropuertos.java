import java.util.ArrayList;
import java.util.List;

public class ListAeropuertos {

    public static List<Aeropuerto> aeropuertoList=new ArrayList<>();

    public static List<Aeropuerto> getAeropuertoList() {
        return aeropuertoList;
    }

    public static void setAeropuertoList(List<Aeropuerto> aeropuertoList) {
        ListAeropuertos.aeropuertoList = aeropuertoList;
    }

    public ListAeropuertos() {
        new ArrayList<>();
    }

    public void agregar(Aeropuerto aeropuerto){
        aeropuertoList.add(aeropuerto);
    }

    public Aeropuerto  buscarAeropuerto(String cod){
        for(Aeropuerto aeropuerto: aeropuertoList){
            if(aeropuerto.codigo==cod){
                return aeropuerto;
            }
        }
        return null;

    }
}
