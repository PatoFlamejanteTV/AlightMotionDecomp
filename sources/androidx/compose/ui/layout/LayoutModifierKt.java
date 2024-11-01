package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;

/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, InterfaceC2073o interfaceC2073o) {
        return modifier.then(new LayoutElement(interfaceC2073o));
    }
}
