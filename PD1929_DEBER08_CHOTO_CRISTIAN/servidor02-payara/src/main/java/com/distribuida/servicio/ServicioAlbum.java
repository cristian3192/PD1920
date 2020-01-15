package com.distribuida.servicio;

import java.util.List;

import com.distribuida.dto.Album;

public interface ServicioAlbum {
	
	void crear(Album album);
	void editar(Album album, int id) ;
	void eliminar(Integer id);
	List<Album> listar() ;
	Album buscarPorId(Integer id);
	
	

}
