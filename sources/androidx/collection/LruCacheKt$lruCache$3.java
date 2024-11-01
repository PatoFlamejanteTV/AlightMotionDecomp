package androidx.collection;

import Q5.I;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$3 extends AbstractC3293z implements InterfaceC2074p {
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public final void invoke(boolean z8, Object obj, Object obj2, Object obj3) {
        AbstractC3292y.i(obj, "<anonymous parameter 1>");
        AbstractC3292y.i(obj2, "<anonymous parameter 2>");
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
        return I.f8786a;
    }
}
