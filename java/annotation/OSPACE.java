package annotation;

public @interface OSPACE {
    String value();
    OTYPE type() default OTYPE.SPACE;
}
