package gestionPublication.gestionPUB.controllers;

import gestionPublication.gestionPUB.entity.Publication;
import gestionPublication.gestionPUB.repositories.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("publications")
public class PublicationController {



        @Autowired
        private PublicationRepository publicationRepository;

        @PostMapping("/save")
        public void save(@RequestBody Publication publication){
            publicationRepository.save(publication);
        }

        @GetMapping("/get")
        public List<Publication> findAll() {
            return publicationRepository.findAll();
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Long id){
            publicationRepository.deleteById(id);
        }

        @PutMapping("/update")
        public void update(@RequestBody Publication publication){
            publicationRepository.save(publication);
        }
    }

