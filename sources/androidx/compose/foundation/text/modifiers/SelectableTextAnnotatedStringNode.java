package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.b;
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
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    private final TextAnnotatedStringNode delegate;
    private final SelectionController selectionController;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        AbstractC3292y.i(contentDrawScope, "<this>");
        this.delegate.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return this.delegate.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return this.delegate.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        return this.delegate.m979measureNonExtension3p2s80s(measure, measurable, j8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return this.delegate.minIntrinsicHeightNonExtension(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return this.delegate.minIntrinsicWidthNonExtension(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        AbstractC3292y.i(coordinates, "coordinates");
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        b.a(this);
    }

    /* renamed from: update-L09Iy8E, reason: not valid java name */
    public final void m972updateL09Iy8E(AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> list, int i8, int i9, boolean z8, FontFamily.Resolver fontFamilyResolver, int i10, Function1 function1, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        TextAnnotatedStringNode textAnnotatedStringNode = this.delegate;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, style), this.delegate.updateText(text), this.delegate.m980updateLayoutRelatedArgsMPT68mk(style, list, i8, i9, z8, fontFamilyResolver, i10), this.delegate.updateCallbacks(function1, function12, selectionController));
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i11, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, resolver, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i8, (i11 & 32) != 0 ? true : z8, (i11 & 64) != 0 ? Integer.MAX_VALUE : i9, (i11 & 128) != 0 ? 1 : i10, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : function12, (i11 & 1024) != 0 ? null : selectionController, (i11 & 2048) != 0 ? null : colorProducer, null);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        this.selectionController = selectionController;
        this.delegate = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(text, style, fontFamilyResolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer, null));
        if (selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }
}
