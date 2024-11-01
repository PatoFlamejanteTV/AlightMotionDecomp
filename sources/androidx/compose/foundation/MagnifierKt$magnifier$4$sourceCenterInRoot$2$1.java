package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ State<Function1> $updatedSourceCenter$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(Density density, State<? extends Function1> state, MutableState<Offset> mutableState) {
        super(0);
        this.$density = density;
        this.$updatedSourceCenter$delegate = state;
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m2701boximpl(m320invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
    public final long m320invokeF1C5BW0() {
        Function1 invoke$lambda$3;
        invoke$lambda$3 = MagnifierKt$magnifier$4.invoke$lambda$3(this.$updatedSourceCenter$delegate);
        long m2722unboximpl = ((Offset) invoke$lambda$3.invoke(this.$density)).m2722unboximpl();
        if (OffsetKt.m2731isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate)) && OffsetKt.m2731isSpecifiedk4lQ0M(m2722unboximpl)) {
            return Offset.m2717plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate), m2722unboximpl);
        }
        return Offset.Companion.m2727getUnspecifiedF1C5BW0();
    }
}
