package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;

/* loaded from: classes.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        throw new IllegalStateException("Function " + str + " should have been replaced by compiler.");
    }
}
