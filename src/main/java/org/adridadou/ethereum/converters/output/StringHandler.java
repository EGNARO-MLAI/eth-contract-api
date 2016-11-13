package org.adridadou.ethereum.converters.output;


/**
 * Created by davidroon on 27.04.16.
 * This code is released under Apache 2 license
 */
public class StringHandler implements OutputTypeHandler<String> {
    @Override
    public boolean isOfType(Class<?> cls) {
        return String.class.equals(cls);
    }

    @Override
    public String convert(Object obj, Class<?> cls) {
        return obj.toString();

    }
}