package androidx.datastore.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import w6.InterfaceC4158a;

/* loaded from: classes3.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(InterfaceC4158a interfaceC4158a, Object obj, Function1 block) {
        AbstractC3292y.i(interfaceC4158a, "<this>");
        AbstractC3292y.i(block, "block");
        boolean b9 = interfaceC4158a.b(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(b9));
        } finally {
            AbstractC3290w.b(1);
            if (b9) {
                interfaceC4158a.d(obj);
            }
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(InterfaceC4158a interfaceC4158a, Object obj, Function1 block, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        AbstractC3292y.i(interfaceC4158a, "<this>");
        AbstractC3292y.i(block, "block");
        boolean b9 = interfaceC4158a.b(obj);
        try {
            return block.invoke(Boolean.valueOf(b9));
        } finally {
            AbstractC3290w.b(1);
            if (b9) {
                interfaceC4158a.d(obj);
            }
            AbstractC3290w.a(1);
        }
    }
}
