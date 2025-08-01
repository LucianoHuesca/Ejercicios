package org.luciano.Implementaciones;

import org.luciano.Entidades.Estudiante;
import org.luciano.Services.EstudianteService;

import java.util.ArrayList;
import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {

    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante registrado correctamente.");
    }

    @Override
    public Estudiante buscarPorId(int id) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        System.out.println("Estudiante no encontrado.");
        return null;
    }

    @Override
    public void eliminarEstudiante(int id) {
        Estudiante encontrado = buscarPorId(id);
        if (encontrado != null) {
            listaEstudiantes.remove(encontrado);
            System.out.println("Estudiante eliminado.");
        }
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId() == estudiante.getId()) {
                listaEstudiantes.set(i, estudiante);
                System.out.println("Estudiante actualizado.");
                return;
            }
        }
        System.out.println("No se encontró el estudiante para actualizar.");
    }

    @Override
    public void mostrarTodos() {
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.mostrarInformacion());
        }
    }
}
