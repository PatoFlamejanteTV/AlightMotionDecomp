package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
@ExperimentalTextApi
/* loaded from: classes.dex */
public final class UrlAnnotation {
    public static final int $stable = 0;
    private final String url;

    public UrlAnnotation(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UrlAnnotation) && AbstractC3292y.d(this.url, ((UrlAnnotation) obj).url)) {
            return true;
        }
        return false;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
