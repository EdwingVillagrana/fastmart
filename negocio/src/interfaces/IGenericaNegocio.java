/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author EDW
 */
public interface IGenericaNegocio<T> {

    public void agregar(T entidad) throws NegocioException;

    public void actualizar(T entidad) throws NegocioException;

    public void eliminar(T entidad) throws NegocioException;

    public List<T> consultarTodos() throws NegocioException;
}
