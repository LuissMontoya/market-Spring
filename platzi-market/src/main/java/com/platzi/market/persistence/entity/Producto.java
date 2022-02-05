package com.platzi.market.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {

    @Id  //LLave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementar
    @Column(name = "id_producto") //nombre real del id
    private Integer idPproducto;


    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name="codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdPproducto() {
        return idPproducto;
    }

    public void setIdPproducto(Integer idPproducto) {
        this.idPproducto = idPproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
