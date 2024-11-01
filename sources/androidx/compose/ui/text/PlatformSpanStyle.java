package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PlatformSpanStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformSpanStyle Default = new PlatformSpanStyle();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof PlatformSpanStyle)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final PlatformSpanStyle merge(PlatformSpanStyle platformSpanStyle) {
        return this;
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }
}
