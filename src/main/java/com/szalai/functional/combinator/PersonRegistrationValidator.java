package com.szalai.functional.combinator;

import java.util.function.Function;
import com.szalai.functional.combinator.PersonRegistrationValidator.ValidationResult;

public interface PersonRegistrationValidator extends Function<Person, ValidationResult> {

    static PersonRegistrationValidator isEmailValid(){
        return person -> person.email().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID_ERROR;
    }

    static PersonRegistrationValidator isPhoneNumberValid(){
        return person -> person.phoneNumber().contains("+36") ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID_ERROR;
    }

    static PersonRegistrationValidator isEmailTaken(){
        return person -> ValidationResult.SUCCESS;
    }

    default PersonRegistrationValidator and(PersonRegistrationValidator other){
        return person -> {
            ValidationResult result = this.apply(person);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(person) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        EMAIL_NOT_VALID_ERROR,
        EMAIL_TAKEN_ERROR,
        PHONE_NOT_VALID_ERROR,
        NOT_ADULT_ERROR,
    }
}
