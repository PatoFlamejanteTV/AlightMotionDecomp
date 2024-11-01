package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;
    private final Object key3;

    public KeyedComposedModifier3(String str, Object obj, Object obj2, Object obj3, Function1 function1, InterfaceC2073o interfaceC2073o) {
        super(function1, interfaceC2073o);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            if (AbstractC3292y.d(this.fqName, keyedComposedModifier3.fqName) && AbstractC3292y.d(this.key1, keyedComposedModifier3.key1) && AbstractC3292y.d(this.key2, keyedComposedModifier3.key2) && AbstractC3292y.d(this.key3, keyedComposedModifier3.key3)) {
                return true;
            }
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int i8;
        int i9;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i10 = 0;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (hashCode + i8) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        Object obj3 = this.key3;
        if (obj3 != null) {
            i10 = obj3.hashCode();
        }
        return i12 + i10;
    }
}
