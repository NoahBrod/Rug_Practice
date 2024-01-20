package com.example.urban_rug_finds.rug;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface RugRepo extends JpaRepository<Rug, Long> {
    
}
