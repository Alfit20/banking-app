package kg.alfit.bankingapp.service;

public interface CommandService<T> {
    void create(T t);
}
