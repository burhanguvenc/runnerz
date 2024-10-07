package dev.danvega.runnerz.run;

import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return  runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1,"Monday Morning Run", (LocalDateTime.now()), (LocalDateTime.now().plusMinutes(30)), 3, (Location.INDOOR) ));
        runs.add(new Run(2,"Wednesday Evening Run", (LocalDateTime.now()), (LocalDateTime.now().plusMinutes(60)), 6, (Location.INDOOR) ));

    }


}
