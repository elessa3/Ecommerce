package br.com.residencia.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencia.ecommerce.entity.Role;
import br.com.residencia.ecommerce.entity.RoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(RoleEnum name);
}
