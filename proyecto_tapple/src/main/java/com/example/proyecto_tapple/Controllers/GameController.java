package com.example.proyecto_tapple.Controllers;

import java.util.list

@RestController
@RequestMapping("api")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/platos")
    public  List<Platos> index(){
        return clienteService.findAll();
    }
}