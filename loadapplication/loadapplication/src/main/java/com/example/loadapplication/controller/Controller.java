package com.example.loadapplication.controller;

import com.example.loadapplication.entities.Loads;
import com.example.loadapplication.services.LoadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "this is the homepage";
    }

    @Autowired
    private LoadsService ls;
    // Get the load details
    @GetMapping("/load")
    public List<Loads> getLoads()
    {
        return this.ls.getLoads();
    }


    @GetMapping("/load/{loadId}")
    public Loads getLoad(@PathVariable long loadId)

    {
        return ls.getLoad(loadId);
    }
    @RequestMapping(value="/load", method = RequestMethod.GET, params = "ship")
    public List<Loads> getLoadswithShipperId(@RequestParam String ship)
    {
        return ls.getLoadswithshipperId(ship);
    }

    @PostMapping(path="/load", consumes="application/json")
    public Loads addLoad(@RequestBody Loads load)
    {
        return this.ls.addLoad(load);
    }

    @DeleteMapping("load/{loadId}")
    public void deleteLoad(@PathVariable long loadId)
    {

         this.ls.deleteLoad(loadId);
    }
    @PutMapping("load/{loadId}")
    public Loads putLoad(@PathVariable long loadId, @RequestBody Loads load)
    {
        return this.ls.putLoad(loadId,load);
    }
}
