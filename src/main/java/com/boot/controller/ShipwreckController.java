package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @GetMapping(value = "shipwreck")
    public List<Shipwreck> list(){
        return ShipwreckStub.list();
    }

    @PostMapping(value = "shipwreck")
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return ShipwreckStub.create(shipwreck);
    }

    @GetMapping(value = "shipwreck/{id}")
    public Shipwreck get(@PathVariable Long id){
        return ShipwreckStub.get(id);
    }

    @PutMapping(value = "shipwreck/{id}")
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        return ShipwreckStub.update(id, shipwreck);
    }

    @DeleteMapping(value = "shipwreck/{id}")
    public Shipwreck delete(@PathVariable Long id){
        return ShipwreckStub.delete(id);
    }
}
