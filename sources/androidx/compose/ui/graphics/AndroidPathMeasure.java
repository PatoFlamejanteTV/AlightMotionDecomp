package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo2852getPositiontuRUvjQ(float f8) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (this.internalPathMeasure.getPosTan(f8, this.positionArray, this.tangentArray)) {
            float[] fArr = this.positionArray;
            AbstractC3292y.f(fArr);
            float f9 = fArr[0];
            float[] fArr2 = this.positionArray;
            AbstractC3292y.f(fArr2);
            return OffsetKt.Offset(f9, fArr2[1]);
        }
        return Offset.Companion.m2727getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f8, float f9, Path path, boolean z8) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f8, f9, ((AndroidPath) path).getInternalPath(), z8);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo2853getTangenttuRUvjQ(float f8) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (this.internalPathMeasure.getPosTan(f8, this.positionArray, this.tangentArray)) {
            float[] fArr = this.tangentArray;
            AbstractC3292y.f(fArr);
            float f9 = fArr[0];
            float[] fArr2 = this.tangentArray;
            AbstractC3292y.f(fArr2);
            return OffsetKt.Offset(f9, fArr2[1]);
        }
        return Offset.Companion.m2727getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z8) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path != null) {
            if (path instanceof AndroidPath) {
                path2 = ((AndroidPath) path).getInternalPath();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path2 = null;
        }
        pathMeasure.setPath(path2, z8);
    }
}
