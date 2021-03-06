/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.DTOReporte;
import entidades.Producto;
import entidades.Venta;
import entidades.Moneda;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Emanuel Álvarez
 */
public interface IGestionProducto {
    HashMap<Integer,Producto> cargarProductos();
    boolean persist(Venta venta);
    ArrayList<Moneda> cargarMonedas();
    boolean persistirReporte(DTOReporte p_reporte);
}
