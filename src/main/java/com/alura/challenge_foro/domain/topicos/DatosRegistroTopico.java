package com.alura.challenge_foro.domain.topicos;

import com.alura.challenge_foro.domain.usuarios.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        LocalDateTime fecha,
        @NotNull
        String autor,
        @NotNull
        String curso
) {
}
