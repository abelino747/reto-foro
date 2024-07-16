package com.alura.challenge_foro.dto;

import com.alura.challenge_foro.model.Curso;
import com.alura.challenge_foro.model.Topico;

public record DatosListaTopico(Long id, String titulo, String mensaje, Curso curso) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
