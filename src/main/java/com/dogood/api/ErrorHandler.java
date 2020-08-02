package com.dogood.api;

import com.dogood.exception.ApplicationError;
import com.dogood.exception.UserDataException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @Value("${api_doc_url}")
    private String details;

    @ExceptionHandler(UserDataException.class)
    public ResponseEntity<ApplicationError> handleUserNotFoundException(UserDataException userDataException, WebRequest webRequest){
        ApplicationError applicationError=new ApplicationError();
        applicationError.setCode(101);
        applicationError.setMessage(userDataException.getMessage());
        applicationError.setDetails(details);
        return new ResponseEntity<>(applicationError, HttpStatus.NOT_FOUND);
    }


}
