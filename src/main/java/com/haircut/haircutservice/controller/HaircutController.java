package com.haircut.haircutservice.controller;

import com.haircut.haircutservice.dto.HaircutRequest;
import com.haircut.haircutservice.dto.HaircutResponse;
import com.haircut.haircutservice.service.HaircutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/haircut")
@RequiredArgsConstructor
public class HaircutController {
    private final HaircutService haircutService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createHaircut(@RequestBody HaircutRequest haircutRequest) {
        haircutService.createHaircut(haircutRequest);
    }

    @PutMapping("/{haircutId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateHaircut(@PathVariable String haircutId, @RequestBody HaircutRequest haircutRequest) {
        haircutService.updateHaircut(haircutId, haircutRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HaircutResponse> getAllHaircuts() {
        return haircutService.getAllHaircuts();
    }

    @GetMapping("/{haircutId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<HaircutResponse> detailHaircut(@PathVariable String haircutId) {
        return haircutService.detailHaircut(haircutId);
    }
}
