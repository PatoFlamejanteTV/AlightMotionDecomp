package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.a;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer, AbstractC3284p abstractC3284p) {
        this(str, textStyle, resolver, i8, z8, i9, i10, colorProducer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (AbstractC3292y.d(this.color, textStringSimpleElement.color) && AbstractC3292y.d(this.text, textStringSimpleElement.text) && AbstractC3292y.d(this.style, textStringSimpleElement.style) && AbstractC3292y.d(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m5101equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int hashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + TextOverflow.m5102hashCodeimpl(this.overflow)) * 31) + a.a(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer colorProducer = this.color;
        if (colorProducer != null) {
            i8 = colorProducer.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer, int i11, AbstractC3284p abstractC3284p) {
        this(str, textStyle, resolver, (i11 & 8) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i8, (i11 & 16) != 0 ? true : z8, (i11 & 32) != 0 ? Integer.MAX_VALUE : i9, (i11 & 64) != 0 ? 1 : i10, (i11 & 128) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextStringSimpleNode node) {
        AbstractC3292y.i(node, "node");
        node.doInvalidations(node.updateDraw(this.color, this.style), node.updateText(this.text), node.m981updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    private TextStringSimpleElement(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        this.color = colorProducer;
    }
}
