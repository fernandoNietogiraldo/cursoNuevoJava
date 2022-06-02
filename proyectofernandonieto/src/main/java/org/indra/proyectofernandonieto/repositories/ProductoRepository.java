package org.indra.proyectofernandonieto.repositories;


import org.indra.proyectofernandonieto.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
