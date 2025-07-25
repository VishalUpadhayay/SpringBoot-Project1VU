package com.vishalspringboot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Suppose we have to inject an third party class into our app so we can use this @Component and if we dont use this than we spring will not be able to create bean or it will not use this container.
public class MyApp {
    private final MyComponent myComponent;

    @Autowired
    //If we have to inject automatically then we can use @Autowired if we have single argument constructor then we dont have to write the @Autowired if there is multiple constructor then we have to write but maine yaha practice ke liye likha hai bas isme single constructor hai multiple constructor nahi hai
    public MyApp(MyComponent myComponent) { // Constructor MyApp mai hamlog ne dependency add kiya hai uska jarurat tha MyComponent
        this.myComponent = myComponent;
    }

    public void run() {
        myComponent.getMessage();
    }
}