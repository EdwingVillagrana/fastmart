/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import excepciones.PersistenciaException;
import java.util.List;

/**
 * Esta interfaz se utiliza como interfaz genérica para optimizar recursos,
 * puesto que todas las clases del proyecto van a utilizar los métodos de
 * agregar, actualizar y eliminar. Los métodos para consultar se generarán en
 * una nueva interfaz puesto que, cada entidaid requiere de distintos métodos de
 * búsqueda. T hace referencia al tipo de objeto que se va a buscar. K hace
 * referencia a la clave primaria.
 */
public interface IGenericaDAO<T, K> {

    public void agregar(T entidad) throws PersistenciaException;

    public void actualizar(T entidad) throws PersistenciaException;

    public void eliminar(T entidad) throws PersistenciaException;

    public List<T> consultarTodos() throws PersistenciaException;
}
