package com.deepu.testing;

import com.deepu.Dao.CategoryDAO;
import com.deepu.Dao.CategoryDAOImp;
import com.deepu.entity.CategoryEntity;
import com.deepu.entity.ProductEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class tester {
    public static void main(String[] args) throws IOException {
        CategoryDAO  cDao= new CategoryDAOImp();


        //----------------------------------------------------------------------------------

        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryID(11011);
        categoryEntity.setCategoryName("Electronics");


        //----------------------------------------------------------------------------------

        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(101);

        productEntity.setProductName("laptop");

        File file = new File("H:\\Products\\laptop1.jpg");
        byte [] img = new byte[(int) file.length()];

        FileInputStream fis = new FileInputStream(file);
        fis.read(img);

        productEntity.setProductImg(img);

        //----------------------------------------------------------------------------------

        ProductEntity productEntity1 = new ProductEntity();
        productEntity1.setProductId(102);

        productEntity1.setProductName("Air Freshner");

        File file1 = new File("H:\\Products\\air4.jpg");
        byte [] img1 = new byte[(int) file1.length()];

        FileInputStream fis1 = new FileInputStream(file1);
        fis1.read(img1);

        productEntity1.setProductImg(img1);

        //----------------------------------------------------------------------------------


        ProductEntity productEntity2 = new ProductEntity();
        productEntity2.setProductId(103);

        productEntity2.setProductName("Dish Washer");

        File file2 = new File("H:\\Products\\dish3.jpg");
        byte [] img2 = new byte[(int) file2.length()];

        FileInputStream fis2 = new FileInputStream(file2);
        fis2.read(img2);

        productEntity2.setProductImg(img2);
//-----------------------------------------------------------------------------------------------



        List<ProductEntity> entityList = Arrays.asList(productEntity, productEntity1 , productEntity2);

        categoryEntity.setLstOfProduct(entityList);

        cDao.saveCategory(categoryEntity);



    }
}
