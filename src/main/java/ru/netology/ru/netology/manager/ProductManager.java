package ru.netology.ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.Productrepository;

public class ProductManager {
    private Productrepository repository;

    public ProductManager(Productrepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.save(product);

    }

    public Product[] getAll() {
        return repository.findAll();
    }

    public void removeByID(int id) {
        repository.removeById(id);
    }

    public Product[] searchBy(String search) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (product.matches(search)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }
}
