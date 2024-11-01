package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8);

    void removeState(Object obj);
}
