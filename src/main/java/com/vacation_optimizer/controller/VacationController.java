package com.vacation_optimizer.controller;

import com.vacation_optimizer.dto.RequestDto;
import com.vacation_optimizer.dto.VacationOptionDto;
import com.vacation_optimizer.service.VacationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Vacation Optimizer", description = "API para calcular as melhores datas de férias")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vacations")
public class VacationController {
    private final VacationService vacationService;


    @Operation(summary = "Calcular melhores datas de férias",
            description = "Retorna uma lista ordenada das melhores opções de férias considerando feriados e fins de semana")
    @PostMapping
    public List<VacationOptionDto> calculateBestVacation(@RequestBody RequestDto request){
        return vacationService.calculateBestVacation(request);
    }
}
