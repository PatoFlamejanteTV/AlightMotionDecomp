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
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
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

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final Function1 component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final Function1 component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m969component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* renamed from: copy-VhcvRP8, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m971copyVhcvRP8(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        return new SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (AbstractC3292y.d(this.color, selectableTextAnnotatedStringElement.color) && AbstractC3292y.d(this.text, selectableTextAnnotatedStringElement.text) && AbstractC3292y.d(this.style, selectableTextAnnotatedStringElement.style) && AbstractC3292y.d(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC3292y.d(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && AbstractC3292y.d(this.onTextLayout, selectableTextAnnotatedStringElement.onTextLayout) && TextOverflow.m5101equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && AbstractC3292y.d(this.onPlaceholderLayout, selectableTextAnnotatedStringElement.onPlaceholderLayout) && AbstractC3292y.d(this.selectionController, selectableTextAnnotatedStringElement.selectionController)) {
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

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m5103toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i11, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i8, (i11 & 32) != 0 ? true : z8, (i11 & 64) != 0 ? Integer.MAX_VALUE : i9, (i11 & 128) != 0 ? 1 : i10, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : function12, (i11 & 1024) != 0 ? null : selectionController, (i11 & 2048) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SelectableTextAnnotatedStringNode node) {
        AbstractC3292y.i(node, "node");
        node.m972updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    private SelectableTextAnnotatedStringElement(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
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
