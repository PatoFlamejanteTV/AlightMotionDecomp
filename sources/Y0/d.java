package Y0;

/* loaded from: classes3.dex */
public @interface d {

    /* loaded from: classes3.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
