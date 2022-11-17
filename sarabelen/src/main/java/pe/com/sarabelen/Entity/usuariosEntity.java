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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sebas
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="usuariosEntity")
@Table(name="usuario")
public class usuariosEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usu;
    @Column(name="ape_usuario")
    private String ape_usu;
    @Column(name="dni_usuario")
    private String dni_usu;
    @Column(name="email_usuario")
    private String ema_usu;
    @Column(name="foto")
    private String foto_usu;
    @Column(name="nom_usuario")
    private String nom_usu;
    @Column(name="pass_usuario")
    private String pass_usu;
    @Column(name="telef_usuario")
    private String tel_usu;
    @ManyToOne
    @JoinColumn(name="rol_usuario", referencedColumnName="id_rol", nullable = false)
    private rolEntity rol_usu;
    @Column(name="estado")
    private boolean estado;
}
