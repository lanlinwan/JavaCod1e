package waterboss.dao;

import waterboss.entity.Owners;

import java.sql.SQLException;

public class Owers {
    public static void add(Owners owenrs){

        java.sql.Connection conn=null;
        java.sql.PreparedStatement stmt=null;

        try {
            conn=BaseDao.getConnection();
            stmt=conn.prepareStatement("insert into t_owners values(?,?,?,?,?,?,?)");
            stmt.setLong(1,owenrs.getId());
            stmt.setString(2,owenrs.getName());
            stmt.setLong(3,owenrs.getAddressid());
            stmt.setString(4, owenrs.getHousenumber());
            stmt.setString(5,owenrs.getWatermeter());
            stmt.setDate(6,new java.sql.Date(owenrs.getAdddate().getTime()));
            stmt.setLong(7,owenrs.getOwnertypeid());
            stmt.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {

        }

    }
}
