package documentos;
public class factura {
   private  String comprador;
   private Double importe;
    public void insertarDatos(String Comprador, Double Importe){
     
     comprador = Comprador;
     importe = Importe;
     System.out.println("Factura a nombre de: "+comprador);
        System.out.println("Por un importe de: "+importe);
    } 
    
}
