package org.luciano.Services;

import org.luciano.Entidades.Estudiante;

public interface EstudianteService {

    void registrarEstudiante(Estudiante estudiante);

    Estudiante buscarPorId(int id);

    void eliminarEstudiante(int id);

    void actualizarEstudiante(Estudiante estudiante);

    void mostrarTodos();
}