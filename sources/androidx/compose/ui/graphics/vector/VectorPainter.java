package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private int drawCount;
    private final MutableIntState invalidateCount$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i8) {
        this.invalidateCount$delegate.setIntValue(i8);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f8) {
        this.currentAlpha = f8;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m3518getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m3509getCacheBitmapConfig_sVssgQ$ui_release();
    }

    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3485getIntrinsicSizeNHjbRc() {
        return m3519getSizeNHjbRc$ui_release();
    }

    public final String getName$ui_release() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3519getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m2786unboximpl();
    }

    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3520getViewportSizeNHjbRc$ui_release() {
        return this.vector.m3510getViewportSizeNHjbRc$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo3390getCenterF1C5BW0 = drawScope.mo3390getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3404scale0AR0LA0(-1.0f, 1.0f, mo3390getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        this.drawCount = getInvalidateCount();
    }

    public final void setAutoMirror$ui_release(boolean z8) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setComposition$ui_release(Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    public final void setName$ui_release(String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3521setSizeuvyYCjk$ui_release(long j8) {
        this.size$delegate.setValue(Size.m2769boximpl(j8));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3522setViewportSizeuvyYCjk$ui_release(long j8) {
        this.vector.m3511setViewportSizeuvyYCjk$ui_release(j8);
    }

    public VectorPainter(GroupComponent groupComponent) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2769boximpl(Size.Companion.m2790getZeroNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.autoMirror$delegate = mutableStateOf$default2;
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
