package androidx.compose.ui.text.platform.extensions;

import Q5.p;
import android.text.style.TtsSpan;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;

/* loaded from: classes.dex */
public final class TtsAnnotationExtensions_androidKt {
    public static final TtsSpan toSpan(TtsAnnotation ttsAnnotation) {
        if (ttsAnnotation instanceof VerbatimTtsAnnotation) {
            return toSpan((VerbatimTtsAnnotation) ttsAnnotation);
        }
        throw new p();
    }

    public static final TtsSpan toSpan(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
