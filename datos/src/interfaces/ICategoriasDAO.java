/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Categoria;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Kevin Rios
 */
public interface ICategoriasDAO extends IGenericaDAO<Categoria, Long> {

    public Categoria consultarPorNombre(String nombre) throws PersistenciaException;

    public Categoria consultarPorId(Long id) throws PersistenciaException;
}
