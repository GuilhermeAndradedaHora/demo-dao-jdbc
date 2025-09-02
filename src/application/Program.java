package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dp = new Department(1, "Books");
        Seller sl = new Seller(21, "Guilherme", "guilherme@gmail.com", new Date(), 3000.00, dp);
        SellerDao sellerDao = DaoFactory.cerateSellerDao();
        System.out.println(sl);

    }
}