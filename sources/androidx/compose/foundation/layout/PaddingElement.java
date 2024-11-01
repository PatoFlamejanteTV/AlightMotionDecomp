package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final Function1 inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float f8, float f9, float f10, float f11, boolean z8, Function1 function1, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, z8, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !Dp.m5160equalsimpl0(this.start, paddingElement.start) || !Dp.m5160equalsimpl0(this.top, paddingElement.top) || !Dp.m5160equalsimpl0(this.end, paddingElement.end) || !Dp.m5160equalsimpl0(this.bottom, paddingElement.bottom) || this.rtlAware != paddingElement.rtlAware) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m562getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m563getEndD9Ej5fM() {
        return this.end;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m564getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m565getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m5161hashCodeimpl(this.start) * 31) + Dp.m5161hashCodeimpl(this.top)) * 31) + Dp.m5161hashCodeimpl(this.end)) * 31) + Dp.m5161hashCodeimpl(this.bottom)) * 31) + androidx.compose.foundation.a.a(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m566setBottom0680j_4(float f8) {
        this.bottom = f8;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m567setEnd0680j_4(float f8) {
        this.end = f8;
    }

    public final void setRtlAware(boolean z8) {
        this.rtlAware = z8;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m568setStart0680j_4(float f8) {
        this.start = f8;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m569setTop0680j_4(float f8) {
        this.top = f8;
    }

    private PaddingElement(float f8, float f9, float f10, float f11, boolean z8, Function1 inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.start = f8;
        this.top = f9;
        this.end = f10;
        this.bottom = f11;
        this.rtlAware = z8;
        this.inspectorInfo = inspectorInfo;
        if (f8 >= 0.0f || Dp.m5160equalsimpl0(f8, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
            float f12 = this.top;
            if (f12 >= 0.0f || Dp.m5160equalsimpl0(f12, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
                float f13 = this.end;
                if (f13 >= 0.0f || Dp.m5160equalsimpl0(f13, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
                    float f14 = this.bottom;
                    if (f14 >= 0.0f || Dp.m5160equalsimpl0(f14, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingNode node) {
        AbstractC3292y.i(node, "node");
        node.m588setStart0680j_4(this.start);
        node.m589setTop0680j_4(this.top);
        node.m587setEnd0680j_4(this.end);
        node.m586setBottom0680j_4(this.bottom);
        node.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f8, float f9, float f10, float f11, boolean z8, Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.m5155constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5155constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5155constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5155constructorimpl(0) : f11, z8, function1, null);
    }
}
