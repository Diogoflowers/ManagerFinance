package com.managerfinance.managerfinance.domain.ports.out;

import com.managerfinance.managerfinance.domain.model.Usuario;

public interface UsuarioRepository {
    Usuario criarUsuario(Usuario usuario);

}
