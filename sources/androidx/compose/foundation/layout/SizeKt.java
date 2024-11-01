package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxHeight;
    private static final FillElement FillWholeMaxSize;
    private static final FillElement FillWholeMaxWidth;
    private static final WrapContentElement WrapContentHeightCenter;
    private static final WrapContentElement WrapContentHeightTop;
    private static final WrapContentElement WrapContentSizeCenter;
    private static final WrapContentElement WrapContentSizeTopStart;
    private static final WrapContentElement WrapContentWidthCenter;
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m608defaultMinSizeVpY3zN4(Modifier defaultMinSize, float f8, float f9) {
        AbstractC3292y.i(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsElement(f8, f9, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m609defaultMinSizeVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m608defaultMinSizeVpY3zN4(modifier, f8, f9);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, float f8) {
        FillElement height;
        AbstractC3292y.i(modifier, "<this>");
        if (f8 == 1.0f) {
            height = FillWholeMaxHeight;
        } else {
            height = FillElement.Companion.height(f8);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        return fillMaxHeight(modifier, f8);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, float f8) {
        FillElement size;
        AbstractC3292y.i(modifier, "<this>");
        if (f8 == 1.0f) {
            size = FillWholeMaxSize;
        } else {
            size = FillElement.Companion.size(f8);
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        return fillMaxSize(modifier, f8);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, float f8) {
        FillElement width;
        AbstractC3292y.i(modifier, "<this>");
        if (f8 == 1.0f) {
            width = FillWholeMaxWidth;
        } else {
            width = FillElement.Companion.width(f8);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        return fillMaxWidth(modifier, f8);
    }

    @Stable
    /* renamed from: height-3ABfNKs */
    public static final Modifier m610height3ABfNKs(Modifier height, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(height, "$this$height");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return height.then(new SizeElement(0.0f, f8, 0.0f, f8, true, noInspectorInfo, 5, null));
    }

    @Stable
    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m611heightInVpY3zN4(Modifier heightIn, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(heightIn, "$this$heightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return heightIn.then(new SizeElement(0.0f, f8, 0.0f, f9, true, noInspectorInfo, 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m612heightInVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m611heightInVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m613requiredHeight3ABfNKs(Modifier requiredHeight, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredHeight, "$this$requiredHeight");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredHeight.then(new SizeElement(0.0f, f8, 0.0f, f8, false, noInspectorInfo, 5, null));
    }

    @Stable
    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m614requiredHeightInVpY3zN4(Modifier requiredHeightIn, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredHeightIn, "$this$requiredHeightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredHeightIn.then(new SizeElement(0.0f, f8, 0.0f, f9, false, noInspectorInfo, 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m615requiredHeightInVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m614requiredHeightInVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m616requiredSize3ABfNKs(Modifier requiredSize, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredSize, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSize.then(new SizeElement(f8, f8, f8, f8, false, noInspectorInfo, null));
    }

    @Stable
    /* renamed from: requiredSize-6HolHcs */
    public static final Modifier m617requiredSize6HolHcs(Modifier requiredSize, long j8) {
        AbstractC3292y.i(requiredSize, "$this$requiredSize");
        return m618requiredSizeVpY3zN4(requiredSize, DpSize.m5253getWidthD9Ej5fM(j8), DpSize.m5251getHeightD9Ej5fM(j8));
    }

    @Stable
    /* renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m618requiredSizeVpY3zN4(Modifier requiredSize, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredSize, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSize.then(new SizeElement(f8, f9, f8, f9, false, noInspectorInfo, null));
    }

    @Stable
    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m619requiredSizeInqDBjuR0(Modifier requiredSizeIn, float f8, float f9, float f10, float f11) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredSizeIn, "$this$requiredSizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f8, f9, f10, f11);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSizeIn.then(new SizeElement(f8, f9, f10, f11, false, noInspectorInfo, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m620requiredSizeInqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m619requiredSizeInqDBjuR0(modifier, f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m621requiredWidth3ABfNKs(Modifier requiredWidth, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredWidth, "$this$requiredWidth");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredWidth.then(new SizeElement(f8, 0.0f, f8, 0.0f, false, noInspectorInfo, 10, null));
    }

    @Stable
    /* renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m622requiredWidthInVpY3zN4(Modifier requiredWidthIn, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(requiredWidthIn, "$this$requiredWidthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredWidthIn.then(new SizeElement(f8, 0.0f, f9, 0.0f, false, noInspectorInfo, 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m623requiredWidthInVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m622requiredWidthInVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: size-3ABfNKs */
    public static final Modifier m624size3ABfNKs(Modifier size, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(size, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return size.then(new SizeElement(f8, f8, f8, f8, true, noInspectorInfo, null));
    }

    @Stable
    /* renamed from: size-6HolHcs */
    public static final Modifier m625size6HolHcs(Modifier size, long j8) {
        AbstractC3292y.i(size, "$this$size");
        return m626sizeVpY3zN4(size, DpSize.m5253getWidthD9Ej5fM(j8), DpSize.m5251getHeightD9Ej5fM(j8));
    }

    @Stable
    /* renamed from: size-VpY3zN4 */
    public static final Modifier m626sizeVpY3zN4(Modifier size, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(size, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return size.then(new SizeElement(f8, f9, f8, f9, true, noInspectorInfo, null));
    }

    @Stable
    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m627sizeInqDBjuR0(Modifier sizeIn, float f8, float f9, float f10, float f11) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(sizeIn, "$this$sizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f8, f9, f10, f11);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return sizeIn.then(new SizeElement(f8, f9, f10, f11, true, noInspectorInfo, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m628sizeInqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m627sizeInqDBjuR0(modifier, f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: width-3ABfNKs */
    public static final Modifier m629width3ABfNKs(Modifier width, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(width, "$this$width");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return width.then(new SizeElement(f8, 0.0f, f8, 0.0f, true, noInspectorInfo, 10, null));
    }

    @Stable
    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m630widthInVpY3zN4(Modifier widthIn, float f8, float f9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(widthIn, "$this$widthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f8, f9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return widthIn.then(new SizeElement(f8, 0.0f, f9, 0.0f, true, noInspectorInfo, 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m631widthInVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        return m630widthInVpY3zN4(modifier, f8, f9);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical align, boolean z8) {
        WrapContentElement height;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (AbstractC3292y.d(align, companion.getCenterVertically()) && !z8) {
            height = WrapContentHeightCenter;
        } else if (AbstractC3292y.d(align, companion.getTop()) && !z8) {
            height = WrapContentHeightTop;
        } else {
            height = WrapContentElement.Companion.height(align, z8);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return wrapContentHeight(modifier, vertical, z8);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment align, boolean z8) {
        WrapContentElement size;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (AbstractC3292y.d(align, companion.getCenter()) && !z8) {
            size = WrapContentSizeCenter;
        } else if (AbstractC3292y.d(align, companion.getTopStart()) && !z8) {
            size = WrapContentSizeTopStart;
        } else {
            size = WrapContentElement.Companion.size(align, z8);
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return wrapContentSize(modifier, alignment, z8);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal align, boolean z8) {
        WrapContentElement width;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (AbstractC3292y.d(align, companion.getCenterHorizontally()) && !z8) {
            width = WrapContentWidthCenter;
        } else if (AbstractC3292y.d(align, companion.getStart()) && !z8) {
            width = WrapContentWidthStart;
        } else {
            width = WrapContentElement.Companion.width(align, z8);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return wrapContentWidth(modifier, horizontal, z8);
    }
}
