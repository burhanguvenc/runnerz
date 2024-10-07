package dev.danvega.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {

    private final RunRepository runRepository;

    public RunController() {
        this.runRepository = new RunRepository();
    }

List<Run> findAll(){
    return null;
    }


}
