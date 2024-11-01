package androidx.compose.foundation;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$4$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<Offset> state) {
            super(0);
            this.$sourceCenterInRoot$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Offset.m2701boximpl(m319invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m319invokeF1C5BW0() {
            return MagnifierKt$magnifier$4.invoke$lambda$8(this.$sourceCenterInRoot$delegate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$4$1(State<Offset> state) {
        super(1);
        this.$sourceCenterInRoot$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        semantics.set(MagnifierKt.getMagnifierPositionInRoot(), new AnonymousClass1(this.$sourceCenterInRoot$delegate));
    }
}
