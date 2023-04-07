/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package implementaciones;

import entidades.Categoria;
import excepciones.PersistenciaException;
import interfaces.ICategoriasDAO;
import interfaces.IConexion;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Clase de pruebas unitarias para la clase CategoriasDAO utilizando JUnit.
 *
 * @author EDW
 */
public class CategoriasDAOTest {

    IConexion conexion = new Conexion();
    ICategoriasDAO categoriasDAO = new CategoriasDAO(conexion);

    @Test
    public void testAgregarCategoria() throws Exception {
        System.out.println("agregar");
        Categoria categoria = new Categoria("Herramientas");
        categoriasDAO.agregar(categoria);

        // Verificar que la categoria fue agregada correctamente
        Categoria categoriaAgregada = categoriasDAO.consultarPorNombre("Herramientas");
        assertNotNull(categoriaAgregada);
        assertEquals("Herramientas", categoriaAgregada.getNombre());
    }

    @Test
    public void testConsultarPorNombreCuandoNoExiste() throws Exception {
        // consultar la categoria por su nombre y verificar que se obtiene un resultado nulo
        Categoria categoriaConsultada = categoriasDAO.consultarPorNombre("categoriaNoExistente");
        assertNull(categoriaConsultada);
    }

    //Utilizamos la anotación suppresswarnings para evitar que nos marque un error por no cachar los errores.
    @Test
    @SuppressWarnings("ThrowableResultIgnored")
    public void testAgregarCategoriaExistente() {
        System.out.println("agregar categoría existente");
        Categoria categoria = new Categoria("Cereales");
        try {
            // Agregar la categoría por primera vez
            categoriasDAO.agregar(categoria);

            // Intentar agregar la misma categoría de nuevo, debería lanzar una excepción
            assertThrows(PersistenciaException.class, () -> {
                categoriasDAO.agregar(categoria);
            });
        } catch (Exception e) {
            fail("Se produjo una excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testActualizarCategoria() throws Exception {
        Categoria categoria = new Categoria("Hogar");
        categoriasDAO.agregar(categoria);
        Long idCategoria = categoria.getId();
        Categoria categoriaActualizada = new Categoria(idCategoria, "Hogar Actualizado");

        try {
            categoriasDAO.actualizar(categoriaActualizada);
        } catch (PersistenciaException e) {
            fail("No se debería haber lanzado una excepción: " + e.getMessage());
        }

        // Verificar que la categoría fue actualizada correctamente
        Categoria categoriaGuardada = categoriasDAO.consultarPorId(categoria.getId());
        assertNotNull(categoriaGuardada);
        assertEquals(categoriaActualizada.getNombre(), categoriaGuardada.getNombre());
    }

    @Test
    public void testEliminarCategoria() throws Exception {
        // Crear una nueva categoría y guardarla en la base de datos
        Categoria categoria = new Categoria();
        categoria.setNombre("Electrónica");
        categoriasDAO.agregar(categoria);

        // Consultar la categoría recién creada por su ID
        Categoria categoriaExistente = categoriasDAO.consultarPorId(categoria.getId());
        assertNotNull(categoriaExistente);

        // Eliminar la categoría
        try {
            categoriasDAO.eliminar(categoriaExistente);
        } catch (PersistenciaException e) {
            fail("No se debería haber lanzado una excepción: " + e.getMessage());
        }

        // Verificar que la categoría fue eliminada correctamente
        Categoria categoriaEliminada = categoriasDAO.consultarPorId(categoriaExistente.getId());
        assertNull(categoriaEliminada);
    }

    @Test
    public void testConsultarPorId() throws Exception {
        // Consultar la categoría por id
        Categoria categoriaConsultada = categoriasDAO.consultarPorId(2L);

        // Verificar que la categoría fue encontrada correctamente
        assertNotNull(categoriaConsultada);
        assertEquals("Lacteos", categoriaConsultada.getNombre());
    }

    @Test
    public void testConsultarPorNombre() throws Exception {
        // Crear una nueva categoría
        Categoria categoria = new Categoria("Lacteos");

        // Consultar la categoría por nombre
        Categoria categoriaConsultada = categoriasDAO.consultarPorNombre(categoria.getNombre());

        // Verificar que la categoría fue encontrada correctamente
        assertNotNull(categoriaConsultada);
        assertEquals(categoria.getNombre(), categoriaConsultada.getNombre());
    }

    @Test
    public void testAgregarConIdGeneradoManualmente() throws Exception {
//         Crear una nueva categoría con un ID generado manualmente
        Categoria categoria = new Categoria(10L, "Línea blanca");
        categoriasDAO.agregar(categoria);

        Categoria categoriaConsultada = categoriasDAO.consultarPorNombre("Detergentes");
        assertNotNull(categoriaConsultada);
    }
}
