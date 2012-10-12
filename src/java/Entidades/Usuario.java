/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Guillermo
 */
public class Usuario {

    String email, clave, nombre, apellido, telefono, idgenero, genero, idperfil, perfil, idestado, estado;

    public Usuario(String email, String clave, String nombre, String apellido, String telefono, String genero, String perfil, String estado) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.genero = genero;
        this.perfil = perfil;
        this.estado = estado;
    }

    public Usuario() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIdperfil(String idPerfil) {
        idperfil = idPerfil;
    }

    public String getIdperfil() {
        return idperfil;
    }

    public void setIdgenero(String idGenero) {
        idgenero = idGenero;
    }

    public String getIdgenero() {
        return idgenero;
    }

    public void setIdEstado(String idEstado) {
        idestado = idEstado;
    }

    public String getIdEstado() {
        return idestado;
    }
}
