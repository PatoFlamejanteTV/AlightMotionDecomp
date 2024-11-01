package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface PreviewParameter {
    int limit() default Integer.MAX_VALUE;

    Class<? extends PreviewParameterProvider<?>> provider();
}
