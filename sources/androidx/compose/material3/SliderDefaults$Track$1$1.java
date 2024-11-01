package androidx.compose.material3;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderDefaults$Track$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3292y.i(Canvas, "$this$Canvas");
        boolean z8 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m2781getWidthimpl(Canvas.mo3391getSizeNHjbRc()), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()));
        long j8 = z8 ? Offset2 : Offset;
        long j9 = z8 ? Offset : Offset2;
        float mo425toPx0680j_4 = Canvas.mo425toPx0680j_4(SliderKt.access$getTickSize$p());
        float mo425toPx0680j_42 = Canvas.mo425toPx0680j_4(SliderKt.getTrackHeight());
        long m2958unboximpl = this.$inactiveTrackColor.getValue().m2958unboximpl();
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j10 = j9;
        long j11 = j8;
        c.C(Canvas, m2958unboximpl, j8, j9, mo425toPx0680j_42, companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        c.C(Canvas, this.$activeTrackColor.getValue().m2958unboximpl(), OffsetKt.Offset(Offset.m2712getXimpl(j11) + ((Offset.m2712getXimpl(j10) - Offset.m2712getXimpl(j11)) * 0.0f), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2712getXimpl(j11) + ((Offset.m2712getXimpl(j10) - Offset.m2712getXimpl(j11)) * this.$sliderPositions.getPositionFraction()), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0())), mo425toPx0680j_42, companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f8 = tickFractions[i8];
            Boolean valueOf = Boolean.valueOf(f8 > sliderPositions.getPositionFraction() || f8 < 0.0f);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f8));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Offset.m2701boximpl(OffsetKt.Offset(Offset.m2712getXimpl(OffsetKt.m2735lerpWko1d7g(j11, j10, ((Number) it.next()).floatValue())), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()))));
            }
            long j12 = j11;
            long j13 = j10;
            c.H(Canvas, arrayList, PointMode.Companion.m3231getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2958unboximpl(), mo425toPx0680j_4, StrokeCap.Companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j10 = j13;
            j11 = j12;
        }
    }
}
