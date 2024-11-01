package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;
    private final Function1 inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f8, float f9, Function1 function1, AbstractC3284p abstractC3284p) {
        this(alignmentLine, f8, f9, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement != null && AbstractC3292y.d(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Dp.m5160equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && Dp.m5160equalsimpl0(this.after, alignmentLineOffsetDpElement.after)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m469getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m470getBeforeD9Ej5fM() {
        return this.before;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + Dp.m5161hashCodeimpl(this.before)) * 31) + Dp.m5161hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f8, float f9, Function1 inspectorInfo) {
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.alignmentLine = alignmentLine;
        this.before = f8;
        this.after = f9;
        this.inspectorInfo = inspectorInfo;
        if ((f8 < 0.0f && !Dp.m5160equalsimpl0(f8, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) || (f9 < 0.0f && !Dp.m5160equalsimpl0(f9, Dp.Companion.m5175getUnspecifiedD9Ej5fM()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AlignmentLineOffsetDpNode node) {
        AbstractC3292y.i(node, "node");
        node.setAlignmentLine(this.alignmentLine);
        node.m474setBefore0680j_4(this.before);
        node.m473setAfter0680j_4(this.after);
    }
}
