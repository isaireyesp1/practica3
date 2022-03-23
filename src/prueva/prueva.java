package prueva;
import documentos.contrato;
import documentos.factura;
public class prueva {
    public static void main(String [] args){

System.out.println("--------------Datos de la Factura 1------------------");
factura factura1=new factura();
factura1.insertarDatos("Jorge Cruz", 1200.00);
System.out.println("--------------Datos de la Factura 2------------------");
factura factura2=new factura();
factura2.insertarDatos("Félix García", 300.00);
System.out.println("--------------Datos del Contrato 1--------------------");
contrato contrato1=new contrato();
contrato1.insertarDatos("Alejandro Calderon", 12);
System.out.println("--------------Datos del Contrato 2---------------------");
contrato contrato2=new contrato();
contrato2.insertarDatos("Javier Fernández", 6);
}
}

