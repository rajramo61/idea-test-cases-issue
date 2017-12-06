package org.rajesh;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;


class HelloWorldTest {

    @Test
    void testGetHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertThat("Hello World text did not match", "Hello World", is(equalTo(helloWorld.getHelloWorld())));
    }

}