package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;
    private final Typeface typeface;

    public LoadedFontFamily(Typeface typeface) {
        super(true, null);
        this.typeface = typeface;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LoadedFontFamily) && AbstractC3292y.d(this.typeface, ((LoadedFontFamily) obj).typeface)) {
            return true;
        }
        return false;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
