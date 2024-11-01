package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerStateImpl$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final PagerStateImpl$Companion$Saver$2 INSTANCE = new PagerStateImpl$Companion$Saver$2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ List<Object> $it;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<? extends Object> list) {
            super(0);
            this.$it = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Object obj = this.$it.get(2);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }
    }

    PagerStateImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PagerStateImpl invoke(List<? extends Object> it) {
        AbstractC3292y.i(it, "it");
        Object obj = it.get(0);
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = it.get(1);
        AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new PagerStateImpl(intValue, ((Float) obj2).floatValue(), new AnonymousClass1(it));
    }
}
