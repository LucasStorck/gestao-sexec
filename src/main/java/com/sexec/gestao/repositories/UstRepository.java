package com.sexec.gestao.repositories;

import com.sexec.gestao.entities.Ust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UstRepository extends JpaRepository<Ust, Long> {
}
