package com.example.benevole_service.Repository;

import com.example.benevole_service.Entite.Benevole;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@Produces(MediaType.APPLICATION_JSON)
public interface BenevoleRepository extends JpaRepository<Benevole,Long> {
}
