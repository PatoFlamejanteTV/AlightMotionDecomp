package androidx.compose.foundation;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$isMagnifierShown$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$isMagnifierShown$2$1(State<Offset> state) {
        super(0);
        this.$sourceCenterInRoot$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(OffsetKt.m2731isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$8(this.$sourceCenterInRoot$delegate)));
    }
}
