package com.tfwong0xe.microservices.core.product.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.tfwong0xe.api.core.product.Product;
import com.tfwong0xe.api.core.product.ProductService;
import com.tfwong0xe.util.http.ServiceUtil;

@RestController
public class ProductServiceImpl implements ProductService {
	private final ServiceUtil serviceUtil;

	@Autowired
	public ProductServiceImpl(ServiceUtil serviceUtil) {
		this.serviceUtil = serviceUtil;
	}

	@Override
	public Product getProduct(int productId) {
		return new Product(productId, "name-" + productId, 123, serviceUtil.getServiceAddress());
	}
}
