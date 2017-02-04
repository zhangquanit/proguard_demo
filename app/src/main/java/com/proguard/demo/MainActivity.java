package com.proguard.demo;

import android.app.Activity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.proguard.demo.annotation.MyAnno;
import com.proguard.demo.bean.Child;
import com.proguard.demo.bean.Person;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = new Person();
        person.setName("老爹");
        person.setAge(100);

        Child child = new Child();
        child.setName("儿子");
        child.setAge(10);
        child.setCouse("语文");
        child.setLike("美女");
        person.setChild(child);

        String json = new Gson().toJson(person);
        System.out.println("json="+json);
        person = new Gson().fromJson(json, Person.class);
        System.out.println("person="+person);
    }

    @MyAnno("anno test")
    public void annoMethod(){

    }
}
