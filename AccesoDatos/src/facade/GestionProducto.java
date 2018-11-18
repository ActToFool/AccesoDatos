/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.DTOReporte;
import entidades.Moneda;
import entidades.Producto;
import entidades.Venta;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez
 */
public class GestionProducto implements IGestionProducto{

    public GestionProducto() {
    }
    
    

    @Override
    public ArrayList<Producto> cargarProductos() {
        
        return null;
    }

    @Override
    public boolean persist(Venta venta) {
        return false;
    }

    @Override
    public ArrayList<Moneda> cargarMonedas() {
        return null;
    }

    @Override
    public boolean persistirReporte(DTOReporte p_reporte) {
        return false;
    }
    
}
