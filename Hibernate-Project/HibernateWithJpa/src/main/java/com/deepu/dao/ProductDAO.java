package com.deepu.dao;

import com.deepu.entity.ProductEntity;

public interface ProductDAO {

    // four methods available for crud operation


                                //    this method is used to insert the data into database
    ProductEntity saveProduct (ProductEntity product);



                                    //    this method is used to Load the data from database using id
    ProductEntity LoadProductByID  (int productId);



                                          //    this method is used to update product price in db using product id
    ProductEntity updateProductByID (int ProductID , Double newUnitPrice);


                                             //    this method is used to delete  product by ID
    void deleteProductByID (int ProductID);

}

