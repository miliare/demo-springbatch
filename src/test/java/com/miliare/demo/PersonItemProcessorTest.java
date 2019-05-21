package com.miliare.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonItemProcessorTest {

    @Test
    public void some_personItemProcessor_test() {
        PersonItemProcessor personItemProcessor = new PersonItemProcessor();
        Person person = new Person();
        person.setFirstName("Rémy");
        person.setLastName("Milia");
        assertThat(personItemProcessor.process(person).getFirstName()).isEqualTo("RÉMY");
        assertThat(personItemProcessor.process(person).getLastName()).isEqualTo("MILIA");
    }

}
