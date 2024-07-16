package com.alura.challenge_foro.dto;

import com.alura.challenge_foro.model.Curso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(@NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensaje,
                                  @NotNull @Valid
                                  Curso curso) {
}
