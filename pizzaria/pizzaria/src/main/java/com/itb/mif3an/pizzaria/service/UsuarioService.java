package com.itb.mif3an.pizzaria.service;

import com.itb.mif3an.pizzaria.model.Papel;
import com.itb.mif3an.pizzaria.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UsuarioService {

  public Usuario findByUsername(String username);
  public Papel savePapel(Papel papel);
  void addPapelToUsuario(Usuario usuario, String nomePapel);


    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
