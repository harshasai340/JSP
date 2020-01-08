package com.deloitte.estore.service;

import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;
import com.deloitte.estore.util.DuplicateProductException;
import com.deloitte.estore.util.InvalidNameException;
import com.deloitte.estore.util.InvalidPriceException;
import com.deloitte.estore.util.InvalidProductIdException;

public class ProductServiceImpl implements ProductService {
	private ProductRepo pRepo;

	public ProductServiceImpl() {
		super();
		pRepo = new ProductRepoImpl();
	}

	public ProductServiceImpl(ProductRepo pRepo) {
		super();
		this.pRepo = pRepo;
	}

	@Override
	public boolean addProduct(Product product) throws SQLException, InvalidNameException, DuplicateProductException,
			InvalidProductIdException, InvalidPriceException {
		if (pRepo.getProductById(product.getProductId()) == null) {
			if (product.getName() != null && product.getName().length() > 3) {
				if (product.getProductId() > 99 && product.getProductId() < 100000) {
					if (product.getPrice() > 0.0) {
						return pRepo.addProduct(product);
					} else {
						throw new InvalidPriceException();
					}
				} else {
					throw new InvalidProductIdException();
				}
			} else {
				throw new InvalidNameException();
			}
		} else {
			throw new DuplicateProductException();
		}
	}

	@Override
	public boolean deleteProduct(Product product) throws SQLException, InvalidPriceException, InvalidProductIdException,
			InvalidNameException, DuplicateProductException {
		if (pRepo.getProductById(product.getProductId()) == null) {
			if (product.getName() != null && product.getName().length() > 3) {
				if (product.getProductId() > 9999 && product.getProductId() < 100000) {
					if (product.getPrice() > 0.0) {
						return pRepo.deleteProduct(product);
					} else {
						throw new InvalidPriceException();
					}
				} else {
					throw new InvalidProductIdException();
				}
			} else {
				throw new InvalidNameException();
			}
		} else {
			throw new DuplicateProductException();
		}
	}

	@Override
	public boolean updateProduct(Product product) throws SQLException, InvalidPriceException, InvalidProductIdException,
			InvalidNameException, DuplicateProductException {
		if (pRepo.getProductById(product.getProductId()) == null) {
			if (product.getName() != null && product.getName().length() > 3) {
				if (product.getProductId() > 9999 && product.getProductId() < 100000) {
					if (product.getPrice() > 0.0) {
						return pRepo.deleteProduct(product);
					} else {
						throw new InvalidPriceException();
					}
				} else {
					throw new InvalidProductIdException();
				}
			} else {
				throw new InvalidNameException();
			}
		} else {
			throw new DuplicateProductException();
		}
	}

	@Override
	public Product getProductById(int productId) throws SQLException {
		return pRepo.getProductById(productId);
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		return pRepo.getAllProducts();
	}
}
