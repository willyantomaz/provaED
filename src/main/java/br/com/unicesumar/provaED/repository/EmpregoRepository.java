package br.com.unicesumar.provaED.repository;

import br.com.unicesumar.provaED.entity.Emprego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregoRepository extends JpaRepository<Emprego,Integer> {
}
