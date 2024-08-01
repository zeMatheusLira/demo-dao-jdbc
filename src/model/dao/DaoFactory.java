package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
// a classe que vai expor o metodo que retorna o tipo da interface (SellerDao), mas
//  internamente  vai instanciar a implementacao
// macete para nao precisar expor a implementacao deixar somente a interface

    }
}
