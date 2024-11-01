package androidx.compose.runtime.collection;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IdentityArraySet$toString$1 extends AbstractC3293z implements Function1 {
    public static final IdentityArraySet$toString$1 INSTANCE = new IdentityArraySet$toString$1();

    IdentityArraySet$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(T t8) {
        return t8.toString();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IdentityArraySet$toString$1) obj);
    }
}
