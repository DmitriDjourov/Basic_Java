package org.example;

public class Film {
    private static int globalId = 1;
    public void getGlobalId(){
        System.out.println(globalId);
    }
    private int id;
    private String title;
    // конструктор
    public Film(String title) {
        this.title = title;

        this.id = globalId;
        globalId = globalId + 1;
    }

    public String getInfo() {
//        return  "title: " + getTitle() + " id: " + getId();
        return "title: " + this.title + " id: " + this.id;}



    // метод
    // void - возвращаемый тип метода
    public void setTitle(String title) {
        this.title  = title;
    }
    public String getTitle(){
        return  this.title;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    }

//    public Foo f;
//
//    public void bar() {
//        Foo b = f;
//        System.out.println(b.value);
//    }

