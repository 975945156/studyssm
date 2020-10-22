package study.ssm.service;

import study.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

}
