package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import c6.InterfaceC2073o;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public KeyedComposedModifierN(String str, Object[] objArr, Function1 function1, InterfaceC2073o interfaceC2073o) {
        super(function1, interfaceC2073o);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            if (AbstractC3292y.d(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
