package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(SelectionRegistrar selectionRegistrar, long j8, StaticTextSelectionParams staticTextSelectionParams, AbstractC3284p abstractC3284p) {
        this(selectionRegistrar, j8, staticTextSelectionParams);
    }

    public final void draw(DrawScope drawScope) {
        int offset;
        int offset2;
        int i8;
        AbstractC3292y.i(drawScope, "drawScope");
        Selection selection = this.selectionRegistrar.getSubselections().get(Long.valueOf(this.selectableId));
        if (selection == null) {
            return;
        }
        if (!selection.getHandlesCrossed()) {
            offset = selection.getStart().getOffset();
        } else {
            offset = selection.getEnd().getOffset();
        }
        if (!selection.getHandlesCrossed()) {
            offset2 = selection.getEnd().getOffset();
        } else {
            offset2 = selection.getStart().getOffset();
        }
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        if (selectable != null) {
            i8 = selectable.getLastVisibleOffset();
        } else {
            i8 = 0;
        }
        Path pathForRange = this.params.getPathForRange(m.g(offset, i8), m.g(offset2, i8));
        if (pathForRange == null) {
            return;
        }
        if (this.params.getShouldClip()) {
            float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc());
            float m2778getHeightimpl = Size.m2778getHeightimpl(drawScope.mo3391getSizeNHjbRc());
            int m2937getIntersectrtfAjoo = ClipOp.Companion.m2937getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3400clipRectN_I0leg(0.0f, 0.0f, m2781getWidthimpl, m2778getHeightimpl, m2937getIntersectrtfAjoo);
            c.G(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            drawContext.getCanvas().restore();
            drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
            return;
        }
        c.G(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new SelectionController$onRemembered$1(this), new SelectionController$onRemembered$2(this)));
    }

    public final void updateGlobalPosition(LayoutCoordinates coordinates) {
        AbstractC3292y.i(coordinates, "coordinates");
        this.params = StaticTextSelectionParams.copy$default(this.params, coordinates, null, 2, null);
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        AbstractC3292y.i(textLayoutResult, "textLayoutResult");
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    private SelectionController(SelectionRegistrar selectionRegistrar, long j8, StaticTextSelectionParams params) {
        Modifier makeSelectionModifier;
        AbstractC3292y.i(selectionRegistrar, "selectionRegistrar");
        AbstractC3292y.i(params, "params");
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j8;
        this.params = params;
        long nextSelectableId = selectionRegistrar.nextSelectableId();
        this.selectableId = nextSelectableId;
        makeSelectionModifier = SelectionControllerKt.makeSelectionModifier(selectionRegistrar, nextSelectableId, new SelectionController$modifier$1(this), new SelectionController$modifier$2(this), TouchMode_androidKt.isInTouchMode());
        this.modifier = BasicText_androidKt.textPointerHoverIcon(makeSelectionModifier, selectionRegistrar);
    }

    public /* synthetic */ SelectionController(SelectionRegistrar selectionRegistrar, long j8, StaticTextSelectionParams staticTextSelectionParams, int i8, AbstractC3284p abstractC3284p) {
        this(selectionRegistrar, j8, (i8 & 4) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
