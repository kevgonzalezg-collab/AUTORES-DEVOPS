package com.librerias.autores.service;

import com.librerias.autores.dto.AutorRequestDTO;
import com.librerias.autores.dto.AutorResponseDTO;
import com.librerias.autores.entity.Autor;
import com.librerias.autores.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public AutorResponseDTO crear(AutorRequestDTO dto) {
        Autor autor = new Autor(null, dto.getNombre(), dto.getNacionalidad());
        Autor guardado = repository.save(autor);

        return new AutorResponseDTO(
                guardado.getId(),
                guardado.getNombre(),
                guardado.getNacionalidad()
        );
    }

    public AutorResponseDTO obtenerPorId(Long id) {
        Autor autor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Autor no encontrado"));

        return new AutorResponseDTO(
                autor.getId(),
                autor.getNombre(),
                autor.getNacionalidad()
        );
    }

    public List<AutorResponseDTO> listar() {
        return repository.findAll().stream()
                .map(a -> new AutorResponseDTO(a.getId(), a.getNombre(), a.getNacionalidad()))
                .toList();
    }
}
