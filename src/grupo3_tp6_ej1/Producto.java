/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo3_tp6_ej1;
//holaaaa
/**
 *
 * @author kamil
 */
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    
    public Producto(String nombre, String categoria, double precio){
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
    }
    
    public String getNombre(){return nombre;}
    public String getCategoria(){return categoria;}
    public double getPrecio(){return precio;}
}
