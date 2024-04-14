package com.deepu.client;

import com.deepu.dao.ProductDAO;
import com.deepu.entity.ProductEntity;
import com.deepu.impl.ProductDAOImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class testing {
    public static void main(String[] args) {

        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductID(103);
        productEntity.setProductName("Mobile");
        productEntity.setQuantity(100);
        productEntity.setUnitPrice(12000.0);



        ProductDAOImpl pd = new ProductDAOImpl();

        // save Method
      ProductEntity productEntity1 = pd.saveProduct(productEntity);
       System.out.println(productEntity1);


       // delete Product

//   pd.deleteProductByID(101);
//

        // update product
////        ProductEntity productEntity1 = pd.updateProductByID(101, 47000.00);
//
        //load product
//        ProductEntity productEntity1 = pd.LoadProductByID(102);
//
//        System.out.println(productEntity1.productID());
//        System.out.println(productEntity1.ProductName());
//        System.out.println(productEntity1.quantity());
//        System.out.println(productEntity1.unitPrice());
//        System.out.println(productEntity1.createdOn());
//        System.out.println(productEntity1.updatedOn());

    }
}
