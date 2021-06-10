package com.tvt.gof.builder;

import com.tvt.gof.builder.builders.PersonBuilder;
import com.tvt.gof.builder.model.Person;
import org.junit.jupiter.api.Test;

public class PersonBuilderTest {

    @Test
    public void testPersonBuilder() {

        // 1° Implementation: Person Constructor with builder
        final Person person = new PersonBuilder()
                .withFirstName("Siva")
                .withLastName("Rachakonda")
                .withHeight(200)
                .build();
        System.out.println(person);

        // 2° Implementation: Builder constructor independent of Person object
        Person person2 = PersonBuilder.builder()
                .withFirstName("Siva")
                .withLastName("Rachakonda")
                .withHeight(200)
                .build();
        System.out.println(person2);

        // 3° Implementation: Static Inner Class
        Person person3 = new Person.PersonBuilder2("Siva")
                .withLastName("Rachakonda")
                .withHeight(200)
                .build3();
        System.out.println(person3);
    }
}