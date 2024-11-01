package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CombinedModifier$toString$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final String invoke(String str, Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
