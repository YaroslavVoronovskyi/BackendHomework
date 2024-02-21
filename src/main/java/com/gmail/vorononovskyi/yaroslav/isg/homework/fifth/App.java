package com.gmail.vorononovskyi.yaroslav.isg.homework.fifth;

import com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.model.Person;
import com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.util.DataValidationProcessor;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Yaroslav", "Voronovskti", 30);
        DataValidationProcessor.validate(person); // true
        System.out.println(person);

        Person secondPerson = new Person("Herbert", "Schildt", 72);
        DataValidationProcessor.validate(secondPerson); // true
        System.out.println(secondPerson);

        Person thirdPerson = new Person("Y", "Yano", 17);
        DataValidationProcessor.validate(thirdPerson); // false
        System.out.println(thirdPerson);

        Person fourthPerson = new Person("Martin", "Fowler", 60);
        DataValidationProcessor.validate(fourthPerson); // true
        System.out.println(fourthPerson);

        Person fifthPerson = new Person("Yanov", "Y", 16);
        DataValidationProcessor.validate(fifthPerson); // false
        System.out.println(fifthPerson);

        Person sixthPerson = new Person("Yanov", "Yasdasdashjgjhgjhdasdasdasdasd", 16);
        DataValidationProcessor.validate(sixthPerson); // false
        System.out.println(sixthPerson);
    }
}
