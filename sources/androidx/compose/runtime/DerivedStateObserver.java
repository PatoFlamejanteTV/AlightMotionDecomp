package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface DerivedStateObserver {
    void done(DerivedState<?> derivedState);

    void start(DerivedState<?> derivedState);
}
