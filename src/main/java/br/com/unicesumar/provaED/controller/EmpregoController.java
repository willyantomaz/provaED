package br.com.unicesumar.provaED.controller;

import br.com.unicesumar.provaED.entity.Emprego;
import br.com.unicesumar.provaED.entity.Pessoa;
import br.com.unicesumar.provaED.repository.EmpregoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprego")
public class EmpregoController {

    @Autowired
    private EmpregoRepository repository;

    @PostMapping("/emprego")
    public ResponseEntity criarEmprego(@RequestBody Emprego emprego){
        try {
            return ResponseEntity.ok(this.repository.save(emprego));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping()
    public ResponseEntity listarEmpregos(){
        try {
            return ResponseEntity.ok(this.repository.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity pegarEmpregos(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(this.repository.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarPersonagem(@PathVariable Integer id){
        try {
            this.repository.deleteById(id);
            return ResponseEntity.ok("detetado com sucesso");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping()
    public ResponseEntity atualizarEmprego(@RequestBody Emprego emprego){
        try {
            return ResponseEntity.ok(this.repository.save(emprego));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
