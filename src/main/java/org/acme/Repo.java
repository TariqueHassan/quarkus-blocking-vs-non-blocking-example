package org.acme;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.common.annotation.NonBlocking;

import javax.enterprise.context.RequestScoped;
import java.io.IOException;

//@Blocking
//@NonBlocking
@RequestScoped
public class Repo {

    public void handleBlocking() throws IOException {
        System.out.println("Handling request 1...");

        int result = System.in.read();

        System.out.println("Handling request 2");
    }
}
