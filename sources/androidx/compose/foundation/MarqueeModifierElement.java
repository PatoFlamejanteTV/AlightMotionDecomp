package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;
    private final MarqueeSpacing spacing;
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int i8, int i9, int i10, int i11, MarqueeSpacing marqueeSpacing, float f8, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, i11, marqueeSpacing, f8);
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m335component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m336component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m337copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i8, int i9, int i10, int i11, MarqueeSpacing marqueeSpacing, float f8, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = marqueeModifierElement.iterations;
        }
        if ((i12 & 2) != 0) {
            i9 = marqueeModifierElement.animationMode;
        }
        int i13 = i9;
        if ((i12 & 4) != 0) {
            i10 = marqueeModifierElement.delayMillis;
        }
        int i14 = i10;
        if ((i12 & 8) != 0) {
            i11 = marqueeModifierElement.initialDelayMillis;
        }
        int i15 = i11;
        if ((i12 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i12 & 32) != 0) {
            f8 = marqueeModifierElement.velocity;
        }
        return marqueeModifierElement.m338copylWfNwf4(i8, i13, i14, i15, marqueeSpacing2, f8);
    }

    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m338copylWfNwf4(int i8, int i9, int i10, int i11, MarqueeSpacing spacing, float f8) {
        AbstractC3292y.i(spacing, "spacing");
        return new MarqueeModifierElement(i8, i9, i10, i11, spacing, f8, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m327equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && AbstractC3292y.d(this.spacing, marqueeModifierElement.spacing) && Dp.m5160equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((this.iterations * 31) + MarqueeAnimationMode.m328hashCodeimpl(this.animationMode)) * 31) + this.delayMillis) * 31) + this.initialDelayMillis) * 31) + this.spacing.hashCode()) * 31) + Dp.m5161hashCodeimpl(this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m324boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m5153boximpl(this.velocity));
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m329toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m5166toStringimpl(this.velocity)) + ')';
    }

    private MarqueeModifierElement(int i8, int i9, int i10, int i11, MarqueeSpacing spacing, float f8) {
        AbstractC3292y.i(spacing, "spacing");
        this.iterations = i8;
        this.animationMode = i9;
        this.delayMillis = i10;
        this.initialDelayMillis = i11;
        this.spacing = spacing;
        this.velocity = f8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MarqueeModifierNode node) {
        AbstractC3292y.i(node, "node");
        node.m342updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }
}
