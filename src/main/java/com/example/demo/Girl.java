package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String CupSize;
    private Integer age;
    public Girl(){
    }
    public Integer getId() {
        return id;
    }
    public Girl setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getCupSize() {
        return CupSize;
    }
    public Girl setCupSize(String cupSize) {
        CupSize = cupSize;
        return this;
    }
    public Integer getAge() {
        return age;
    }
    public Girl setAge(Integer age) {
        this.age = age;
        return this;
    }
}