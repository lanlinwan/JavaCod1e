package waterboss.entity;

import java.util.Date;

public class Owners {
    private  Long id;
    private String name;
    private  Long addressid;
    private String housenumber;
    private String watermeter;

    public Long getAddressid() {
        return addressid;
    }

    public void setAddressid(Long addressid) {
        this.addressid = addressid;
    }

    private java.util.Date adddate;
    private Long ownertypeid;

    public String getWatermeter() {
        return watermeter;
    }

    public void setWatermeter(String watermeter) {
        this.watermeter = watermeter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Long getOwnertypeid() {
        return ownertypeid;
    }

    public void setOwnertypeid(Long ownertypeid) {
        this.ownertypeid = ownertypeid;
    }
}
