package be.odisee.demoplanner.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="datum")
public class Datum implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // HV 201804015 tbv Gebruik AutoIncrement
    private int id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime start;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime einde;

    @Column
    private String status;



    public Datum(){

    }
    public Datum( LocalDateTime start, LocalDateTime einde, String status ) {
        this.start = start;
        this.einde = einde;
        this.status = status;
    }

    public Datum( int id, LocalDateTime start, LocalDateTime einde, String status ) {
        this.id = id;
        this.start = start;
        this.einde = einde;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEinde() {
        return einde;
    }

    public String getStatus() {
        return status;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEinde(LocalDateTime einde) {
        this.einde = einde;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
