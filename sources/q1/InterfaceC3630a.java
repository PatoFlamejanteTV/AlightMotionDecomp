package q1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC3630a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
