package br.com.fiap.repository;

import br.com.fiap.model.HigieneBucal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HigieneBucalRepository extends JpaRepository<HigieneBucal, Long> {
}
