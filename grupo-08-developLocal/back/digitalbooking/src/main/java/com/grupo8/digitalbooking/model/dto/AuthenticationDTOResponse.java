package com.grupo8.digitalbooking.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticationDTOResponse {

    String jwt;
    Integer id;
    String nombre;
    String apellido;
    String ciudadUsuario;
    String emailUsuario;
    String rol;



}
