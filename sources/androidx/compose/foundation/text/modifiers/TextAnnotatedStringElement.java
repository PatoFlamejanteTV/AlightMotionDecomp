package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.a;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1 onPlaceholderLayout;
    private final Function1 onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (AbstractC3292y.d(this.color, textAnnotatedStringElement.color) && AbstractC3292y.d(this.text, textAnnotatedStringElement.text) && AbstractC3292y.d(this.style, textAnnotatedStringElement.style) && AbstractC3292y.d(this.placeholders, textAnnotatedStringElement.placeholders) && AbstractC3292y.d(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && AbstractC3292y.d(this.onTextLayout, textAnnotatedStringElement.onTextLayout) && TextOverflow.m5101equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && AbstractC3292y.d(this.onPlaceholderLayout, textAnnotatedStringElement.onPlaceholderLayout) && AbstractC3292y.d(this.selectionController, textAnnotatedStringElement.selectionController)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int hashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1 function1 = this.onTextLayout;
        int i12 = 0;
        if (function1 != null) {
            i8 = function1.hashCode();
        } else {
            i8 = 0;
        }
        int m5102hashCodeimpl = (((((((((hashCode + i8) * 31) + TextOverflow.m5102hashCodeimpl(this.overflow)) * 31) + a.a(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list != null) {
            i9 = list.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (m5102hashCodeimpl + i9) * 31;
        Function1 function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            i10 = function12.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            i11 = selectionController.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        ColorProducer colorProducer = this.color;
        if (colorProducer != null) {
            i12 = colorProducer.hashCode();
        }
        return i15 + i12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i11, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i8, (i11 & 32) != 0 ? true : z8, (i11 & 64) != 0 ? Integer.MAX_VALUE : i9, (i11 & 128) != 0 ? 1 : i10, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : function12, (i11 & 1024) != 0 ? null : selectionController, (i11 & 2048) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextAnnotatedStringNode node) {
        AbstractC3292y.i(node, "node");
        node.doInvalidations(node.updateDraw(this.color, this.style), node.updateText(this.text), node.m980updateLayoutRelatedArgsMPT68mk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController));
    }

    private TextAnnotatedStringElement(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.onTextLayout = function1;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.color = colorProducer;
    }
}
