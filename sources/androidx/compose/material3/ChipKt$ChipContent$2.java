package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $avatar;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ InterfaceC2072n $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$2(InterfaceC2072n interfaceC2072n, TextStyle textStyle, long j8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, long j9, long j10, float f8, PaddingValues paddingValues, int i8) {
        super(2);
        this.$label = interfaceC2072n;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j8;
        this.$leadingIcon = interfaceC2072n2;
        this.$avatar = interfaceC2072n3;
        this.$trailingIcon = interfaceC2072n4;
        this.$leadingIconColor = j9;
        this.$trailingIconColor = j10;
        this.$minHeight = f8;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ChipKt.m1476ChipContentfe0OD_I(this.$label, this.$labelTextStyle, this.$labelColor, this.$leadingIcon, this.$avatar, this.$trailingIcon, this.$leadingIconColor, this.$trailingIconColor, this.$minHeight, this.$paddingValues, composer, this.$$changed | 1);
    }
}
