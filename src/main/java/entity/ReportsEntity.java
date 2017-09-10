package entity;

import javax.persistence.*;


import java.util.Date;


/*
@Entity
@Table(name = "reports", schema = "mydb")
*/
public class ReportsEntity {
    private Date startDate;
    private Date endDate;
    private String performer;
    private String activity;

    /*@Temporal(TemporalType.DATE)
    @Column(name = "StartDate", nullable = true)
*/



public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /*@Temporal(TemporalType.DATE)
    @Column(name = "EndDate", nullable = true)
    */public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

  /* @Basic
    @Column(name = "Performer", nullable = false, length = 45)
   */ public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

   /*@Id
    @Column(name = "Activity", nullable = false, length = 45)
   */ public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }













    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportsEntity that = (ReportsEntity) o;

        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (performer != null ? !performer.equals(that.performer) : that.performer != null) return false;
        if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        return result;
    }
}
