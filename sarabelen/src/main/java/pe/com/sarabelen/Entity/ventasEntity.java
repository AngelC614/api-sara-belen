/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sarabelen.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Angel
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ventasEntity")
@Table(name="ventas")
public class ventasEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ven;
    @Column(name="producto")
    private Long  pro_ven;
    @Column(name="cantidad")
    private int can_ven;
    @Column(name="fecha")
    private String fec_ven;
    @Column(name="usuario")
    private String usu_ven;
    @Column(name="estado")
    private boolean estado;
}
