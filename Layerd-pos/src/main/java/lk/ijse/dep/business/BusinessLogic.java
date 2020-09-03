package lk.ijse.dep.business;


import lk.ijse.dep.dao.DataLayer;
import lk.ijse.dep.util.CustomerTM;
import lk.ijse.dep.util.ItemTM;

import javax.xml.crypto.Data;
import java.util.List;

public class BusinessLogic {

    public static List<CustomerTM> getAllCustomers(){
        return DataLayer.getAllCustomers();
    }

    public static boolean saveCustomer(String id,String name,String address){
        return DataLayer.saveCustomer(new CustomerTM(id,name,address));
    }
    public static boolean deleteCustomer(String customerId){
        return DataLayer.deleteCustomer(customerId);
    }
    public static boolean updateCustomer(CustomerTM customer){
        return DataLayer.updateCustomer(customer);
    }
    public static List<ItemTM> getAllItems(){
        return DataLayer.getAllItems();
    }
}
