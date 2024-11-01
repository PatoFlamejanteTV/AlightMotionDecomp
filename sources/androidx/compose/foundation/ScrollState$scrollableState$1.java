package androidx.compose.foundation;

import e6.AbstractC2829a;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f8) {
        float f9;
        f9 = this.this$0.accumulator;
        float value = this.this$0.getValue() + f8 + f9;
        float j8 = m.j(value, 0.0f, this.this$0.getMaxValue());
        boolean z8 = !(value == j8);
        float value2 = j8 - this.this$0.getValue();
        int d8 = AbstractC2829a.d(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + d8);
        this.this$0.accumulator = value2 - d8;
        if (z8) {
            f8 = value2;
        }
        return Float.valueOf(f8);
    }
}
