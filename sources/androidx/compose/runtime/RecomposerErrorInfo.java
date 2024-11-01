package androidx.compose.runtime;

@InternalComposeApi
/* loaded from: classes.dex */
public interface RecomposerErrorInfo {
    Exception getCause();

    boolean getRecoverable();
}
