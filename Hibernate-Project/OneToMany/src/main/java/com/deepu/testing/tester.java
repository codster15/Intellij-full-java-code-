package com.deepu.testing;

import com.deepu.Dao.CategoryDAO;
import com.deepu.Dao.CategoryDAOImp;
import com.deepu.entity.CategoryEntity;
import com.deepu.entity.ProductEntity;

import java.io.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class tester {
    public static void main(String[] args) throws IOException {
        CategoryDAO  cDao= new CategoryDAOImp();
        cDao.testJoinQuery();

//        //-----------------------------------------------------------------------------------
//
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setCategoryID(11011);
//        categoryEntity.setCategoryName("Electronics");
//
//
//        //----------------------------------------------------------------------------------
//
//        ProductEntity productEntity = new ProductEntity();
//        productEntity.setProductId(101);
//
//        productEntity.setProductName("laptop");
//
//        File file = new File("H:\\Products\\laptop1.jpg");
//        byte [] img = new byte[(int) file.length()];
//
//        FileInputStream fis = new FileInputStream(file);
//        fis.read(img);
//
//        productEntity.setProductImg(img);
//
//        //----------------------------------------------------------------------------------
//
//        ProductEntity productEntity1 = new ProductEntity();
//        productEntity1.setProductId(102);
//
//        productEntity1.setProductName("Air Freshner");
//
//        File file1 = new File("H:\\Products\\air4.jpg");
//        byte [] img1 = new byte[(int) file1.length()];
//
//        FileInputStream fis1 = new FileInputStream(file1);
//        fis1.read(img1);
//
//        productEntity1.setProductImg(img1);
//
//        //----------------------------------------------------------------------------------
//
//
//        ProductEntity productEntity2 = new ProductEntity();
//        productEntity2.setProductId(103);
//
//        productEntity2.setProductName("Dish Washer");
//
//        File file2 = new File("H:\\Products\\dish3.jpg");
//        byte [] img2 = new byte[(int) file2.length()];
//
//        FileInputStream fis2 = new FileInputStream(file2);
//        fis2.read(img2);
//
//        productEntity2.setProductImg(img2);
//-----------------------------------------------------------------------------------------------



//        List<ProductEntity> entityList = Arrays.asList(productEntity, productEntity1 , productEntity2);
//
//        categoryEntity.setLstOfProduct(entityList);
//
//        cDao.saveCategory(categoryEntity);

//        CategoryEntity categoryEntity = cDao.FetchEntity(11011);
//        List<ProductEntity> entityList = categoryEntity.lstOfProduct();

//        ProductEntity productEntity = entityList.get(0);
//        System.out.println(productEntity);

//        byte[] img = productEntity.ProductImg();
//        File  f1 = new File("H:\\Images_DB\\mobile_image.jpg");
//        FileOutputStream fis = new FileOutputStream(f1);
//        fis.write(img);
//
//            AtomicInteger count = new AtomicInteger(1);
//



//        entityList.forEach(productEntity -> {
//            String sb = "H:\\Images_DB\\img" +count+ ".jpg";
//
//            System.out.println( "Product id - " + productEntity.ProductId());
//            System.out.println( "Product name - " + productEntity.ProductName());
//
//            byte[] img = productEntity.ProductImg();
//
//
//            File  f1 = new File(sb);
//
//                    try{
//                        FileOutputStream fis = new FileOutputStream(f1);
//                        fis.write(img);
//                        fis.close();
//                        System.out.println("check image in your computer");
//
//                    }catch (Exception e){
//
//                        System.out.println("Image is not Inserted");
//                    }
//
//            System.out.println("=====================================================================");
//
//                        count.incrementAndGet();
//
//        });


    }
}
