package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean _rectIsValid(Rect rect) {
        if (!Float.isNaN(rect.getLeft())) {
            if (!Float.isNaN(rect.getTop())) {
                if (!Float.isNaN(rect.getRight())) {
                    if (!Float.isNaN(rect.getBottom())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(Rect rect, float f8, float f9) {
        if (_rectIsValid(rect)) {
            if (this.rectF == null) {
                this.rectF = new RectF();
            }
            RectF rectF = this.rectF;
            AbstractC3292y.f(rectF);
            rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            android.graphics.Path path = this.internalPath;
            RectF rectF2 = this.rectF;
            AbstractC3292y.f(rectF2);
            path.addArc(rectF2, f8, f9);
            return;
        }
        throw new IllegalStateException("invalid rect".toString());
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect rect, float f8, float f9) {
        addArc(rect, DegreesKt.degrees(f8), DegreesKt.degrees(f9));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC3292y.f(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC3292y.f(rectF2);
        path.addOval(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo2844addPathUv8p0NA(Path path, long j8) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        if (_rectIsValid(rect)) {
            if (this.rectF == null) {
                this.rectF = new RectF();
            }
            RectF rectF = this.rectF;
            AbstractC3292y.f(rectF);
            rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            android.graphics.Path path = this.internalPath;
            RectF rectF2 = this.rectF;
            AbstractC3292y.f(rectF2);
            path.addRect(rectF2, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("invalid rect".toString());
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC3292y.f(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        AbstractC3292y.f(fArr);
        fArr[0] = CornerRadius.m2687getXimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = CornerRadius.m2688getYimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = CornerRadius.m2687getXimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs());
        fArr[3] = CornerRadius.m2688getYimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs());
        fArr[4] = CornerRadius.m2687getXimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = CornerRadius.m2688getYimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = CornerRadius.m2687getXimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = CornerRadius.m2688getYimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC3292y.f(rectF2);
        float[] fArr2 = this.radii;
        AbstractC3292y.f(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect, float f8, float f9, boolean z8) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC3292y.f(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC3292y.f(rectF2);
        path.arcTo(rectF2, f8, f9, z8);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void arcToRad(Rect rect, float f8, float f9, boolean z8) {
        V0.a(this, rect, f8, f9, z8);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.internalPath.cubicTo(f8, f9, f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC3292y.f(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo2845getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m3208getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m3209getNonZeroRgk1Os();
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f8, float f9) {
        this.internalPath.lineTo(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f8, float f9) {
        this.internalPath.moveTo(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo2846opN5in7k0(Path path, Path path2, int i8) {
        Path.Op op;
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m3213equalsimpl0(i8, companion.m3217getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m3213equalsimpl0(i8, companion.m3218getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m3213equalsimpl0(i8, companion.m3219getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (PathOperation.m3213equalsimpl0(i8, companion.m3220getUnionb3I0S0c())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        android.graphics.Path path3 = this.internalPath;
        if (path instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f8, float f9, float f10, float f11) {
        this.internalPath.quadTo(f8, f9, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.internalPath.rCubicTo(f8, f9, f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f8, float f9) {
        this.internalPath.rLineTo(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f8, float f9) {
        this.internalPath.rMoveTo(f8, f9);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f8, float f9, float f10, float f11) {
        this.internalPath.rQuadTo(f8, f9, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo2847setFillTypeoQ8Xj4U(int i8) {
        Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m3204equalsimpl0(i8, PathFillType.Companion.m3208getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo2848transform58bKbWc(float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        AbstractC3292y.f(matrix);
        AndroidMatrixConversions_androidKt.m2824setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        AbstractC3292y.f(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo2849translatek4lQ0M(long j8) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            AbstractC3292y.f(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        AbstractC3292y.f(matrix2);
        matrix2.setTranslate(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        AbstractC3292y.f(matrix3);
        path.transform(matrix3);
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
