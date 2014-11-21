package de.i3mainz.flexgeo.portal.liferay.reports.portlets.model;

import java.io.Serializable;

public class Report implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String titel;
    private long count;
    private String datum;
    private boolean status;
    private boolean active = false;
    private long reportPlid;

    public Report(long id, String titel, long count, String datum,
            boolean status) {
        this.id = id;
        this.titel = titel;
        this.count = count;
        this.datum = datum;
        this.status=status;
    }

    /**
     * @return the id
     */
    public final long getId() {
        return id;
    }

    /**
     * @return the titel
     */
    public final String getTitel() {
        return titel;
    }

    /**
     * @return the count
     */
    public final long getCount() {
        return count;
    }

    /**
     * @return the datum
     */
    public final String getDatum() {
        return datum;
    }

    /**
     * @return the status
     */
    public final boolean isStatus() {
        return status;
    }
    
    /**
     * @return the active
     */
    public final boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public final void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the reportPlid
     */
    public final long getReportPlid() {
        return reportPlid;
    }

    /**
     * @param reportPlid the reportPlid to set
     */
    public final void setReportPlid(long reportPlid) {
        this.reportPlid = reportPlid;
    }
}
