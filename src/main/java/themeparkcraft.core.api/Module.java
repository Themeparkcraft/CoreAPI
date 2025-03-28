package themeparkcraft.core.api;

import themeparkcraft.core.api.server.ServerType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@SuppressWarnings("unused")
public @interface Module {

    String name();

    String[] authors();

    ServerType[] servers() default {};
}
