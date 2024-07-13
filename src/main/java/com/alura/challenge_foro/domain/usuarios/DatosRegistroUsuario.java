package com.alura.challenge_foro.domain.usuarios;
import jakarta.validation.constraints.*;

public record DatosRegistroUsuario(

        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String correoElectronico,
        @NotBlank
        String contrasena,
        @NotBlank
        Boolean activo,
        @NotNull
        Perfiles perfil
) {
}
