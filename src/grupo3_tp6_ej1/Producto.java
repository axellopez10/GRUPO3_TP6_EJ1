package grupo3_tp6_ej1;

/**
 *
 * @author kamil
 */
public class Producto implements Comparable<Producto> {
    private String nombre;
    private String categoria;
    private double precio;
    
    
    
    public Producto(String nombre, String categoria, double precio){
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    public String getNombre(){return nombre;}
    public String getCategoria(){return categoria;}
    public double getPrecio(){return precio;}

    @Override
    public int compareTo(Producto t) {
        return this.nombre.compareToIgnoreCase(t.nombre);
    }
}
