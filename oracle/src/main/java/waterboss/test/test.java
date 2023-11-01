package waterboss.test;

import waterboss.dao.Owers;
import waterboss.entity.Owners;

import java.sql.Date;

public class test {
    public static void main(String[] args) {
       Owners owners=new Owners();
       owners.setId(1L);
       owners.setName("兰");
       owners.setAddressid(1L);
       owners.setHousenumber("2-2");
       owners.setWatermeter("6156");

       owners.setOwnertypeid(1L);
       Owers.add(owners);
    }
}
