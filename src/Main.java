
public class Main {
    public static void main(String[] args) {

        Aeropuerto airport=new Aeropuerto("BCN01","EL PRAT","BARCELONA","ESPAÑA","1");

        ListAeropuertos listAeropuertos= new ListAeropuertos();
        listAeropuertos.agregar(airport);
        listAeropuertos.agregar(new Aeropuerto("MAD01","BARAJAS","MADRID","ESPAÑA","1"));
        listAeropuertos.agregar(new Aeropuerto("PAR01","ORLY","PARIS","FRANCIA","1"));
        listAeropuertos.agregar(new Aeropuerto("LON01","HEATROW","LONDRES "," GRAN BRETAÑA","0"));
        listAeropuertos.agregar(new Aeropuerto("SPA01","GUARULHOS","SAO PAULO","BRAZIL","-3"));
        listAeropuertos.agregar(new Aeropuerto("SIB01","Siberia Air","Novosibirsk","Rusia","+2"));
        System.out.println(airport.codigo);

        Vuelo vuelo1=new VueloCharter("BCN01","MAD01","01:00","SPANAIR","AIRBUS",150,"VIAJES CONDOR","15/01/2009","20:30","-");
        Vuelo vuelo2=new VueloRegular("BCN01","MAD01","01:00","IBERIA","AIRBUS",150,"L-15:00 X-15:00 V-15:00 D-15:00","-");

        ListVuelo listVuelo= new ListVuelo();
       listVuelo.agregar(vuelo2);
        listVuelo.agregar(new VueloRegular("BCN01","MAD01","01:00","Iberia","Airbus",150,"L-18:00 J-20:00 S-20:00",""));
        listVuelo.agregar(new VueloRegular("BCN01","LON01","01:05","British","Boeing",180,"L-10:00 J-10:00","-"));
        listVuelo.agregar(new VueloRegular("LON01","BCN01","01:05","British Air","Boeing",180,"L-15:00 J-15:00","-"));
        listVuelo.agregar(new VueloRegular("BCN01","LON01","01:10","Ryan Air","Airbus",120,"L-10:00 J-10:00","-"));
        listVuelo.agregar(new VueloRegular("LON01","BCN01","01:10","Ryan Air","Airbus",120,"J-15:10 J-15:10","-"));
        listVuelo.agregar(new VueloRegular("LON01","SPA01","07:00","British Air","Boeing",200,"X-09:45 J-09:45 S-09:45","-"));
        listVuelo.agregar(new VueloRegular("SPA01","MAD01","07:00","British Air","Boeing",200,"X-20:25 J-20:25 S-20:25","-"));
        listVuelo.agregar(vuelo1);
        listVuelo.agregar(new VueloCharter("BCN01","MAD01","01:00","Spanair","Airbus",150,"Viajes Condor","15/01/2009","20:30",""));
        listVuelo.agregar(new VueloCharter("MAD01","BCN01","01:00","Iberia","Airbus",150,"Viajes Condor "," 22/01/2009","20:30",""));
        listVuelo.agregar(new VueloCharter("BCN01","LON01","01:00","British Air","Boeing",180,"Viaje Ilusion","22/02/2009","20:30",""));
        listVuelo.agregar(new VueloCharter("LON01","BCN01","01:00","British Air","Boeing",180,"Viaje Ilusion","05/03/2009","15:19",""));
        listVuelo.agregar(new VueloCharter("LON01","BCN01","01:00","British Air","Boeing",180,"Viaje Ilusion","05/03/2009","15:19",""));
        listVuelo.agregar(new VueloCharter("BCN01","LON01","01:00","Ryan Air","Airbus",120,"TravelPlan","25/01/2009","15:18",""));
        listVuelo.agregar(new VueloCharter("SPA01","SPA01","01:00","Ryan Air","Airbus",120,"TravelPlan","31/01/2009","22:20",""));
        listVuelo.agregar(new VueloCharter("SIB01","SPA01","01:00","Ryan Air","Airbus",120,"TravelPlan","31/01/2009","22:20",""));


        //imprime los vuelos normalmente
        //listVuelo.imprimir();
        //listVuelo.mostrarVuelos();
        listVuelo.imprimirporVuelosEntrantes();
        listVuelo.imprimirporVuelosSalientes();
    }
}