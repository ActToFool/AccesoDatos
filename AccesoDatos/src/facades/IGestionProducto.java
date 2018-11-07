/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez
 */
public interface IGestionProducto {
    ArrayList<Producto> cargarProductos();
    boolean persist(Venta venta);
    ArrayList<Moneda> cargarMonedas();
    boolean persistirReporte(DTOReporte p_reporte);
}
