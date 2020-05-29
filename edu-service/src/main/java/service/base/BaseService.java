package service.base;

public interface BaseService<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteByUUID(String uuid);
    public void deleteById(Integer id);

    public void update(T t);

    public void insert(T t);
}
