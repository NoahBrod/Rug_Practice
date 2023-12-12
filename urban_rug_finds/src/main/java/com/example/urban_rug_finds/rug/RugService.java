package com.example.urban_rug_finds.rug;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RugService {
    @Autowired
    private RugRepo rugRepo;

    public List<Rug> getRugs() {
        return rugRepo.findAll();
    }

    public void saveRug(Rug rug) {
        rugRepo.save(rug);
    }
}
