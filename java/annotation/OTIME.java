package annotation;

public @interface OTIME{
    String value();
    OTYPE type() default OTYPE.TIME;
}
