package org.wbm.eXchange;

import org.knowm.xchange.Exchange;
import org.reflections.Reflections;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by wbminera1 on 15.01.2016.
 */
public class Enumerator {
    private static final Logger log = Logger.getLogger( Enumerator.class.getName() );

    public static void main(String[] args)
    {
        Reflections reflections = new Reflections("com.xchnage");
        Set<Class<? extends Exchange>> classes = reflections.getSubTypesOf(Exchange.class);
        for(Object e : classes) {
            log.log(Level.INFO, e.getClass().getName());
        }
    }
}
