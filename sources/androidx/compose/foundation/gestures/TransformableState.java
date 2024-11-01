package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public interface TransformableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar);
}
