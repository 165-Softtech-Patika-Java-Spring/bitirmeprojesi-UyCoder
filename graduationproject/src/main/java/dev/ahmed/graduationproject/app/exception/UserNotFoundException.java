package dev.ahmed.graduationproject.app.exception;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 12:01 AM
 * @Project bitirmeprojesi-UyCoder
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String msg){
        super(msg);
    }
}
