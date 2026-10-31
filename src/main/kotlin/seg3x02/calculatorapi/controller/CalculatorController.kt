package seg3x02.calculatorapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("calculator")
@Tag(name = "Calculator", description = "Opérations arithmétiques de base")
class CalculatorController {
    @Operation(summary = "Addition de nombre1 et nombre2")
    @GetMapping("/add/{nombre1}/{nombre2}")
    fun add(@PathVariable nombre1: Double, @PathVariable nombre2: Double): Double = nombre1 + nombre2

    @Operation(summary = "Soustraction : nombre1 - nombre2")
    @GetMapping("/subtract/{nombre1}/{nombre2}")
    fun subtract(@PathVariable nombre1: Double, @PathVariable nombre2: Double): Double = nombre1 - nombre2

    @Operation(summary = "Multiplication de nombre1 par nombre2")
    @GetMapping("/multiply/{nombre1}/{nombre2}")
    fun multiply(@PathVariable nombre1: Double, @PathVariable nombre2: Double): Double = nombre1 * nombre2

    @Operation(summary = "Division : nombre1 / nombre2 (erreur 400 si nombre2 = 0)")
    @GetMapping("/divide/{nombre1}/{nombre2}")
    fun divide(@PathVariable nombre1: Double, @PathVariable nombre2: Double): Double {
        if (nombre2 == 0.0) throw ArithmeticException("Division par zéro")
        return nombre1 / nombre2
    }
}
