package androidx.compose.ui.text.platform;

import android.text.style.URLSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;

@StabilityInferred(parameters = 0)
@InternalTextApi
/* loaded from: classes.dex */
public final class URLSpanCache {
    public static final int $stable = 8;
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    public final URLSpan toURLSpan(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
