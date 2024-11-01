package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FocusProperties$exit$1 extends AbstractC3293z implements Function1 {
    public static final FocusProperties$exit$1 INSTANCE = new FocusProperties$exit$1();

    FocusProperties$exit$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m2651invoke3ESFkO8(((FocusDirection) obj).m2632unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m2651invoke3ESFkO8(int i8) {
        return FocusRequester.Companion.getDefault();
    }
}
