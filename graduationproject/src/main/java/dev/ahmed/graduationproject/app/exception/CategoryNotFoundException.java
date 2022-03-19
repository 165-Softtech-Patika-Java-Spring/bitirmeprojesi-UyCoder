package dev.ahmed.graduationproject.app.exception;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 12:01 AM
 * @Project bitirmeprojesi-UyCoder
 */
public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String msg){
        super(msg);
    }
}
