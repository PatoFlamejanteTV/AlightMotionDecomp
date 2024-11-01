package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private Function1 invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final Function1 wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m2984getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new GroupComponent$wrappedListener$1(this);
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m2984getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m3493markTintForColor8_81llA(((SolidColor) brush).m3260getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m3493markTintForColor8_81llA(long j8) {
        if (!this.isTintable) {
            return;
        }
        Color.Companion companion = Color.Companion;
        if (j8 != companion.m2984getUnspecified0d7_KjU()) {
            if (this.tintColor == companion.m2984getUnspecified0d7_KjU()) {
                this.tintColor = j8;
            } else if (!VectorKt.m3517rgbEqualOWjLjI(this.tintColor, j8)) {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m3493markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            }
            PathParserKt.toPath(this.clipPathData, path);
        }
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m3159constructorimpl$default(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m3168resetimpl(fArr);
        }
        Matrix.m3179translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m3171rotateZimpl(fArr, this.rotation);
        Matrix.m3172scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m3179translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.mo3405transform58bKbWc(Matrix.m3157boximpl(fArr).m3180unboximpl());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            d.c(transform, path, 0, 2, null);
        }
        List<VNode> list = this.children;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public Function1 getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m3494getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i8, VNode vNode) {
        if (i8 < getNumChildren()) {
            this.children.set(i8, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    public final void move(int i8, int i9, int i10) {
        int i11 = 0;
        if (i8 > i9) {
            while (i11 < i10) {
                VNode vNode = this.children.get(i8);
                this.children.remove(i8);
                this.children.add(i9, vNode);
                i9++;
                i11++;
            }
        } else {
            while (i11 < i10) {
                VNode vNode2 = this.children.get(i8);
                this.children.remove(i8);
                this.children.add(i9 - 1, vNode2);
                i11++;
            }
        }
        invalidate();
    }

    public final void remove(int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (i8 < this.children.size()) {
                this.children.get(i8).setInvalidateListener$ui_release(null);
                this.children.remove(i8);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function1 function1) {
        this.invalidateListener = function1;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f8) {
        this.pivotX = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f8) {
        this.pivotY = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f8) {
        this.rotation = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f8) {
        this.scaleX = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f8) {
        this.scaleY = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f8) {
        this.translationX = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f8) {
        this.translationY = f8;
        this.isMatrixDirty = true;
        invalidate();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            VNode vNode = list.get(i8);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
