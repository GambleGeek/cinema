package org.cinema;

import org.cinema.models.Show;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Show show = context.getBean("show", Show.class);
        show.showInfo();
    }
}
