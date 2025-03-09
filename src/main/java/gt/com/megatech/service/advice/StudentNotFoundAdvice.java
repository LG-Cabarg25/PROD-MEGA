package gt.com.megatech.service.advice;

import gt.com.megatech.service.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentNotFoundAdvice {

    @ExceptionHandler(
            StudentNotFoundException.class
    )
    @ResponseStatus(
            HttpStatus.NOT_FOUND
    )
    public String studentNotFoundHandler(
            StudentNotFoundException studentNotFoundException
    ) {
        return studentNotFoundException.getMessage();
    }
}
