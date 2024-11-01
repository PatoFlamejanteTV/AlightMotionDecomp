package androidx.compose.material;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Track$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f8, State<Color> state, float f9, float f10, float f11, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f8;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f9;
        this.$positionFractionEnd = f10;
        this.$positionFractionStart = f11;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
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
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m2781getWidthimpl(Canvas.mo3391getSizeNHjbRc()) - this.$thumbPx, Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()));
        long j8 = z8 ? Offset2 : Offset;
        long j9 = z8 ? Offset : Offset2;
        long m2958unboximpl = this.$inactiveTrackColor.getValue().m2958unboximpl();
        float f8 = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j10 = j9;
        long j11 = j8;
        c.C(Canvas, m2958unboximpl, j8, j9, f8, companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        c.C(Canvas, this.$activeTrackColor.getValue().m2958unboximpl(), OffsetKt.Offset(Offset.m2712getXimpl(j11) + ((Offset.m2712getXimpl(j10) - Offset.m2712getXimpl(j11)) * this.$positionFractionStart), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2712getXimpl(j11) + ((Offset.m2712getXimpl(j10) - Offset.m2712getXimpl(j11)) * this.$positionFractionEnd), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        List<Float> list = this.$tickFractions;
        float f9 = this.$positionFractionEnd;
        float f10 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f9 || floatValue < f10);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f11 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Offset.m2701boximpl(OffsetKt.Offset(Offset.m2712getXimpl(OffsetKt.m2735lerpWko1d7g(j11, j10, ((Number) it.next()).floatValue())), Offset.m2713getYimpl(Canvas.mo3390getCenterF1C5BW0()))));
            }
            long j12 = j11;
            long j13 = j10;
            c.H(Canvas, arrayList, PointMode.Companion.m3231getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2958unboximpl(), f11, StrokeCap.Companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            f11 = f11;
            j11 = j12;
            j10 = j13;
        }
    }
}
