package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class PainterElement extends ModifierNodeElement<PainterNode> {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterElement(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z8;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f8;
        this.colorFilter = colorFilter;
    }

    public static /* synthetic */ PainterElement copy$default(PainterElement painterElement, Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            painter = painterElement.painter;
        }
        if ((i8 & 2) != 0) {
            z8 = painterElement.sizeToIntrinsics;
        }
        boolean z9 = z8;
        if ((i8 & 4) != 0) {
            alignment = painterElement.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i8 & 8) != 0) {
            contentScale = painterElement.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i8 & 16) != 0) {
            f8 = painterElement.alpha;
        }
        float f9 = f8;
        if ((i8 & 32) != 0) {
            colorFilter = painterElement.colorFilter;
        }
        return painterElement.copy(painter, z9, alignment2, contentScale2, f9, colorFilter);
    }

    public final Painter component1() {
        return this.painter;
    }

    public final boolean component2() {
        return this.sizeToIntrinsics;
    }

    public final Alignment component3() {
        return this.alignment;
    }

    public final ContentScale component4() {
        return this.contentScale;
    }

    public final float component5() {
        return this.alpha;
    }

    public final ColorFilter component6() {
        return this.colorFilter;
    }

    public final PainterElement copy(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter) {
        return new PainterElement(painter, z8, alignment, contentScale, f8, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC3292y.d(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && AbstractC3292y.d(this.alignment, painterElement.alignment) && AbstractC3292y.d(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && AbstractC3292y.d(this.colorFilter, painterElement.colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.painter.hashCode() * 31) + androidx.compose.foundation.a.a(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter == null) {
            hashCode = 0;
        } else {
            hashCode = colorFilter.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PainterNode create() {
        return new PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PainterNode painterNode) {
        boolean sizeToIntrinsics = painterNode.getSizeToIntrinsics();
        boolean z8 = this.sizeToIntrinsics;
        boolean z9 = sizeToIntrinsics != z8 || (z8 && !Size.m2777equalsimpl0(painterNode.getPainter().mo3485getIntrinsicSizeNHjbRc(), this.painter.mo3485getIntrinsicSizeNHjbRc()));
        painterNode.setPainter(this.painter);
        painterNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterNode.setAlignment(this.alignment);
        painterNode.setContentScale(this.contentScale);
        painterNode.setAlpha(this.alpha);
        painterNode.setColorFilter(this.colorFilter);
        if (z9) {
            LayoutModifierNodeKt.invalidateMeasurement(painterNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterNode);
    }
}
