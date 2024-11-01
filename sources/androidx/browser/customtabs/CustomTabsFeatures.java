package androidx.browser.customtabs;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class CustomTabsFeatures {
    public static final String ENGAGEMENT_SIGNALS = "ENGAGEMENT_SIGNALS";

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface CustomTabsFeature {
    }

    private CustomTabsFeatures() {
    }
}
