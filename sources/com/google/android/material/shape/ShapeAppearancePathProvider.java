package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* loaded from: classes3.dex */
public class ShapeAppearancePathProvider {
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    /* loaded from: classes3.dex */
    private static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i8);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;

        @Nullable
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f8;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.cornerPaths[i8] = new ShapePath();
            this.cornerTransforms[i8] = new Matrix();
            this.edgeTransforms[i8] = new Matrix();
        }
    }

    private float angleOfEdge(int i8) {
        return ((i8 + 1) % 4) * 90;
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8) {
        this.scratch[0] = this.cornerPaths[i8].getStartX();
        this.scratch[1] = this.cornerPaths[i8].getStartY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        if (i8 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i8].applyToPath(this.cornerTransforms[i8], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i8], this.cornerTransforms[i8], i8);
        }
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8) {
        int i9 = (i8 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i8].getEndX();
        this.scratch[1] = this.cornerPaths[i8].getEndY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i9].getStartX();
        this.scratch2[1] = this.cornerPaths[i9].getStartY();
        this.cornerTransforms[i9].mapPoints(this.scratch2);
        float f8 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f8 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i8);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i8], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i8) || pathOverlapsCorner(this.edgePath, i9))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i8].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i8], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i8], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i8], i8);
        }
    }

    private void getCoordinatesOfCorner(int i8, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    private CornerSize getCornerSizeForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return shapeAppearanceModel.getTopRightCornerSize();
                }
                return shapeAppearanceModel.getTopLeftCornerSize();
            }
            return shapeAppearanceModel.getBottomLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomRightCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return shapeAppearanceModel.getTopRightCorner();
                }
                return shapeAppearanceModel.getTopLeftCorner();
            }
            return shapeAppearanceModel.getBottomLeftCorner();
        }
        return shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i8) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i8];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i8].mapPoints(fArr);
        if (i8 != 1 && i8 != 3) {
            return Math.abs(rectF.centerY() - this.scratch[1]);
        }
        return Math.abs(rectF.centerX() - this.scratch[0]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return shapeAppearanceModel.getRightEdge();
                }
                return shapeAppearanceModel.getTopEdge();
            }
            return shapeAppearanceModel.getLeftEdge();
        }
        return shapeAppearanceModel.getBottomEdge();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    @RequiresApi(19)
    private boolean pathOverlapsCorner(Path path, int i8) {
        this.cornerPath.reset();
        this.cornerPaths[i8].applyToPath(this.cornerTransforms[i8], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8) {
        getCornerTreatmentForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i8], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel));
        float angleOfEdge = angleOfEdge(i8);
        this.cornerTransforms[i8].reset();
        getCoordinatesOfCorner(i8, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i8];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i8].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i8) {
        this.scratch[0] = this.cornerPaths[i8].getEndX();
        this.scratch[1] = this.cornerPaths[i8].getEndY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i8);
        this.edgeTransforms[i8].reset();
        Matrix matrix = this.edgeTransforms[i8];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i8].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f8, rectF, null, path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEdgeIntersectionCheckEnable(boolean z8) {
        this.edgeIntersectionCheckEnabled = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f8, rectF, pathListener, path);
        for (int i8 = 0; i8 < 4; i8++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i8);
            setEdgePathAndTransform(i8);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            appendCornerPath(shapeAppearancePathSpec, i9);
            appendEdgePath(shapeAppearancePathSpec, i9);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
