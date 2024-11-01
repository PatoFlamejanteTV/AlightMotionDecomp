package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@InternalComposeApi
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ComposableInferredTarget {
    String scheme();
}
