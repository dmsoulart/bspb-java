package ru.bspb.anketa;

import ru.bspb.client.Client;

import java.util.Objects;

public abstract class Anketa{
private String type;
private String name;
private String sex;
private int age;
private int ogrn;

    public Anketa() {
    }

    public Anketa(String type, String name, String sex, int age){
    this.type=type;
    this.name=name;
    this.sex=sex;
    this.age=age;
}
    public Anketa(String type,String name, int age, int ogrn){
        this.type=type;
        this.name=name;
        this.age=age;
        this.ogrn=ogrn;
    }

    public String getName() {
        return this.name;
    }

    public boolean anketafiltersex(){
    if (this.sex.equals("m")) {return true;}else{return false;}
    }

    public static void anketafilterduble(Anketa[] arr){
        for (int i = 0; i < arr.length; i++) {
            int k=0;
            if (arr[i].anketafiltersex()) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i].name.equals(arr[j].name)) {
                        k++;
                    }
                }
                if(k==1){
                    System.out.println(arr[i]);}
            }
        }
    }

    public static void anketasort(Anketa[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j].age > arr[j+1].age ){
                    Anketa tmpA = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmpA;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Anketa{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age+
                '}';
    }
}