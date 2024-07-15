package com.alura.challenge_foro.domain.topicos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "usuario_id")
    private String autor_id;
    private String curso;

public Topico(DatosRegistroTopico datosRegistroTopico){
    this.titulo = datosRegistroTopico.titulo();
    this.mensaje = datosRegistroTopico.mensaje();
    this.fecha = LocalDateTime.now();
    this.autor_id = datosRegistroTopico.autor();
    this.curso = datosRegistroTopico.curso();
}

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.curso() != null) {
            this.curso = datosActualizarTopico.curso();
        }
    }
}
