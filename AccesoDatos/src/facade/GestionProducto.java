/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.Alimento;
import entidades.Bebida;
import entidades.DTOReporte;
import entidades.Denominacion;
import entidades.Moneda;
import entidades.Producto;
import entidades.Venta;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Emanuel Álvarez
 */
public class GestionProducto implements IGestionProducto {

    public GestionProducto() {
    }

    @Override
    public HashMap<Integer,Producto> cargarProductos() {
        HashMap<Integer, Producto> productos=new HashMap<>();
        try (Scanner entrada = new Scanner(Paths.get("C:\\Users\\Usuario\\Desktop\\UNIVERSIDAD\\archivo.csv"))) {
            while (entrada.hasNext()) {
                String registro = entrada.next();
                String[] elementos = registro.split(",");
                if (elementos.length == 0) {
                    break;
                }
                int numero = Integer.parseInt(elementos[0]);
                int unidadesDisponibles = Integer.parseInt(elementos[1]);
                int unidadMedida=Integer.parseInt(elementos[2]);
                float valorMedida=Float.parseFloat(elementos[3]);
                String nombre=elementos[4];
                int tipo=Integer.parseInt(elementos[5]);
                Producto p = null;
                if(tipo==0){
                    p = new Bebida(unidadMedida, valorMedida,numero, nombre,unidadesDisponibles);
                }
                else{
                    p=new Alimento(unidadMedida,valorMedida,numero,nombre,unidadesDisponibles);
                }
                productos.put(numero,p);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return productos;
    }

    @Override
    public boolean persist(Venta venta) {
        return false;
    }

    @Override
    public ArrayList<Moneda> cargarMonedas() {
        ArrayList<Moneda> monedas=new ArrayList<>();
        try (Scanner entrada = new Scanner(Paths.get("C:\\Users\\Usuario\\Desktop\\UNIVERSIDAD\\archivoMonedas.csv"))) {
            while (entrada.hasNext()) {
                String registro = entrada.next();
                String[] elementos = registro.split(",");
                if (elementos.length == 0) {
                    break;
                }
                int cantidad = Integer.parseInt(elementos[0]);
                int denominacion=Integer.parseInt(elementos[1]);
                Moneda m = null;
                if(denominacion==500){
                    m=new Moneda(cantidad, Denominacion.QUINIENTOS);
                }
                else{
                    m=new Moneda(cantidad, Denominacion.MIL);
                }
                monedas.add(m);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return monedas;
    }

    @Override
    public boolean persistirReporte(DTOReporte p_reporte) {
        return false;
    }

}
