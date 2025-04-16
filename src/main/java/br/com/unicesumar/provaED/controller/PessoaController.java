package br.com.unicesumar.provaED.controller;


import br.com.unicesumar.provaED.entity.Emprego;
import br.com.unicesumar.provaED.entity.Pessoa;
import br.com.unicesumar.provaED.repository.EmpregoRepository;
import br.com.unicesumar.provaED.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController()
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private EmpregoRepository empregoRepository;

    @PostMapping()
    public ResponseEntity criarPessoa(@RequestBody Pessoa pessoa){
        try {
            return ResponseEntity.ok(this.repository.save(pessoa));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @GetMapping()
    public ResponseEntity listarPessoas(){
        try {
            return ResponseEntity.ok(this.repository.findAll());
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity pegarPersonagem(@PathVariable Integer id){
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
    public ResponseEntity atualizarPersonagem(@RequestBody Pessoa pessoa){
        try {
            return ResponseEntity.ok(this.repository.save(pessoa));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
