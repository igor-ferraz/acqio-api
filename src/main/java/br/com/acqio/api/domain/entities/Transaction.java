package br.com.acqio.api.domain.entities;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Time time;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(nullable = false)
    private CardEnum cardApplication;

    @Column(nullable = false)
    private StatusEnum status;

    //region Getters
    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public BigDecimal getValue() {
        return value;
    }

    public CardEnum getCardApplication() {
        return cardApplication;
    }

    public StatusEnum getStatus() {
        return status;
    }
    //endregion

    //region Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setCardApplication(CardEnum cardApplication) {
        this.cardApplication = cardApplication;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    //endregion
}