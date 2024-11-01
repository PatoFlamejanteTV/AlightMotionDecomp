package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<Offset> $animatedCenter$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(State<Offset> state) {
        super(0);
        this.$animatedCenter$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m2701boximpl(m1009invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
    public final long m1009invokeF1C5BW0() {
        long invoke$lambda$0;
        invoke$lambda$0 = SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(this.$animatedCenter$delegate);
        return invoke$lambda$0;
    }
}
