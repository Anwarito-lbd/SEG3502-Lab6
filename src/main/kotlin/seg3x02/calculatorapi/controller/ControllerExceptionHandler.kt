package seg3x02.calculatorapi.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ControllerExceptionHandler {
    @ExceptionHandler(ArithmeticException::class, NumberFormatException::class,
        org.springframework.web.method.annotation.MethodArgumentTypeMismatchException::class)
    fun handleException(ex: Exception): ResponseEntity<String> =
        ResponseEntity.badRequest().body("Unable to process request: ${ex.message}")
}
