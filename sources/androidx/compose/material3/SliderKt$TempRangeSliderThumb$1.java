package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$TempRangeSliderThumb$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_TempRangeSliderThumb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$TempRangeSliderThumb$1(BoxScope boxScope, float f8, InterfaceC2073o interfaceC2073o, int i8) {
        super(2);
        this.$this_TempRangeSliderThumb = boxScope;
        this.$offset = f8;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.m1736TempRangeSliderThumbrAjV9yQ(this.$this_TempRangeSliderThumb, this.$offset, this.$content, composer, this.$$changed | 1);
    }
}
