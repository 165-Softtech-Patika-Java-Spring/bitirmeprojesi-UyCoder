package dev.ahmed.graduationproject.app.exception;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 12:19 AM
 * @Project bitirmeprojesi-UyCoder
 */
public class CategoryAlreadyExistsException extends RuntimeException {
    public CategoryAlreadyExistsException(String msg) {
        super(msg);
    }
}
