package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "books");

        Seller seller = new Seller(21,"bob","bob@gmail.com",new Date(),3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        // dessa forma o programa nao conhece a implementacao apenas a interface
        // é uma forma de fazer uma injecao de dependencia sem explicitar a implementacao

        System.out.println(obj);
        System.out.println(seller);
    }
}
