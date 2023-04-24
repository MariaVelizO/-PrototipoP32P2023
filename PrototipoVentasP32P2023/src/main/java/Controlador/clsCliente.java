/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.util.List;
import Modelo.daoClientes;
/**
 *
 * @author visitante
 */
public class clsCliente {
    private int IdCliente;
    private String NombreCliente;
    private String NitCliente;

    public clsCliente() {
    }
    
    public clsCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }    
    
    public clsCliente(String NombreCliente, String NitCliente) {
        this.NombreCliente = NombreCliente;
        this.NitCliente = NitCliente;
    }
    
    public clsCliente(int IdCliente, String NombreCliente, String NitCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.NitCliente= NitCliente;
    }    

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }
    @Override
    public String toString() {
        return "clsUsuario{" + "IdUsuario=" + IdCliente + ", NombreUsuario=" + NombreCliente + ", ContrasenaUsuario=" + NitCliente + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsCliente getBuscarInformacionClientePorNombre(clsCliente cliente)
    {
        daoClientes daocliente = new daoClientes();
        return daocliente.consultaUsuariosPorNombre(cliente);
    }
    public clsCliente getBuscarInformacionClientePorId(clsCliente cliente)
    {
        daoClientes daocliente = new daoClientes();
        return daocliente.consultaUsuariosPorId(cliente);
    }    
    public List<clsCliente> getListadoClientes()
    {
        daoClientes daocliente = new daoClientes();
        List<clsCliente> listadoUsuarios = daocliente.consultaCliente();
        return listadoUsuarios;
    }
    public int setBorrarCliente(clsCliente cliente)
    {
        daoClientes daocliente = new daoClientes();
        return daocliente.borrarCliente(cliente);
    }          
    public int setIngresarCliente(clsCliente cliente)
    {
        daoClientes daocliente = new daoClientes();
        return daocliente.ingresaCliente(cliente);
    }              
    public int setModificarCliente(clsCliente cliente)
    {
        daoClientes daocliente = new daoClientes();
        return daocliente.actualizaCliente(cliente);
    }              
}
