package androidx.compose.ui.util;

import android.os.Trace;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, Function0 function0) {
        Trace.beginSection(str);
        try {
            return (T) function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            Trace.endSection();
            AbstractC3290w.a(1);
        }
    }
}
