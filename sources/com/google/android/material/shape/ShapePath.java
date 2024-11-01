package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i8, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i8, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    /* loaded from: classes3.dex */
    static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f8, float f9) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f8;
            this.startY = f9;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i8, Canvas canvas) {
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.operation1.f18354x - this.startX, this.operation1.f18355y - this.startY);
            double hypot2 = Math.hypot(this.operation2.f18354x - this.operation1.f18354x, this.operation2.f18355y - this.operation1.f18355y);
            float min = (float) Math.min(i8, Math.min(hypot, hypot2));
            double d8 = min;
            double tan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d8;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i8);
            }
            float f8 = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f8, f8);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.f18354x, this.operation1.f18355y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-tan) - d8), (-2.0f) * min);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) min, 450.0f, sweepAngle, new float[]{(float) (d8 + tan), f8});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.f18354x, this.operation1.f18355y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) tan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i8);
            }
        }

        float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.f18355y - this.operation1.f18355y) / (this.operation2.f18354x - this.operation1.f18354x)));
        }

        float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.f18355y - this.startY) / (this.operation1.f18354x - this.startX)));
        }

        float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            if (endAngle <= ShapePath.ANGLE_LEFT) {
                return endAngle;
            }
            return endAngle - 360.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f8, float f9) {
            this.operation = pathLineOperation;
            this.startX = f8;
            this.startY = f9;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i8, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f18355y - this.startY, this.operation.f18354x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i8);
        }

        float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f18355y - this.startY) / (this.operation.f18354x - this.startX)));
        }
    }

    /* loaded from: classes3.dex */
    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f8, float f9, float f10, float f11) {
            setLeft(f8);
            setTop(f9);
            setRight(f10);
            setBottom(f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        private void setBottom(float f8) {
            this.bottom = f8;
        }

        private void setLeft(float f8) {
            this.left = f8;
        }

        private void setRight(float f8) {
            this.right = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f8) {
            this.startAngle = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f8) {
            this.sweepAngle = f8;
        }

        private void setTop(float f8) {
            this.top = f8;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f8, float f9, float f10, float f11, float f12, float f13) {
            setControlX1(f8);
            setControlY1(f9);
            setControlX2(f10);
            setControlY2(f11);
            setEndX(f12);
            setEndY(f13);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f8) {
            this.controlX1 = f8;
        }

        private void setControlX2(float f8) {
            this.controlX2 = f8;
        }

        private void setControlY1(float f8) {
            this.controlY1 = f8;
        }

        private void setControlY2(float f8) {
            this.controlY2 = f8;
        }

        private void setEndX(float f8) {
            this.endX = f8;
        }

        private void setEndY(float f8) {
            this.endY = f8;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: x, reason: collision with root package name */
        private float f18354x;

        /* renamed from: y, reason: collision with root package name */
        private float f18355y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f18354x, this.f18355y);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* loaded from: classes3.dex */
    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f8) {
            this.controlX = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f8) {
            this.controlY = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f8) {
            this.endX = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f8) {
            this.endY = f8;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        ShadowCompatOperation() {
        }

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i8, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i8, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i8, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f8) {
        if (getCurrentShadowAngle() == f8) {
            return;
        }
        float currentShadowAngle = ((f8 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > ANGLE_LEFT) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f8);
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f8, float f9) {
        addConnectingShadowIfNecessary(f8);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f9);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f8) {
        this.currentShadowAngle = f8;
    }

    private void setEndShadowAngle(float f8) {
        this.endShadowAngle = f8;
    }

    private void setEndX(float f8) {
        this.endX = f8;
    }

    private void setEndY(float f8) {
        this.endY = f8;
    }

    private void setStartX(float f8) {
        this.startX = f8;
    }

    private void setStartY(float f8) {
        this.startY = f8;
    }

    public void addArc(float f8, float f9, float f10, float f11, float f12, float f13) {
        boolean z8;
        float f14;
        PathArcOperation pathArcOperation = new PathArcOperation(f8, f9, f10, f11);
        pathArcOperation.setStartAngle(f12);
        pathArcOperation.setSweepAngle(f13);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f15 = f12 + f13;
        if (f13 < 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f12 = (f12 + ANGLE_LEFT) % 360.0f;
        }
        if (z8) {
            f14 = (ANGLE_LEFT + f15) % 360.0f;
        } else {
            f14 = f15;
        }
        addShadowCompatOperation(arcShadowOperation, f12, f14);
        double d8 = f15;
        setEndX(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.cos(Math.toRadians(d8)))));
        setEndY(((f9 + f11) * 0.5f) + (((f11 - f9) / 2.0f) * ((float) Math.sin(Math.toRadians(d8)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.operations.get(i8).applyToPath(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i8, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i8, canvas);
                }
            }
        };
    }

    @RequiresApi(21)
    public void cubicToPoint(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.operations.add(new PathCubicOperation(f8, f9, f10, f11, f12, f13));
        this.containsIncompatibleShadowOp = true;
        setEndX(f12);
        setEndY(f13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getEndX() {
        return this.endX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getEndY() {
        return this.endY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getStartX() {
        return this.startX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f8, float f9) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f18354x = f8;
        pathLineOperation.f18355y = f9;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + ANGLE_UP, lineShadowOperation.getAngle() + ANGLE_UP);
        setEndX(f8);
        setEndY(f9);
    }

    @RequiresApi(21)
    public void quadToPoint(float f8, float f9, float f10, float f11) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f8);
        pathQuadOperation.setControlY(f9);
        pathQuadOperation.setEndX(f10);
        pathQuadOperation.setEndY(f11);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f10);
        setEndY(f11);
    }

    public void reset(float f8, float f9) {
        reset(f8, f9, ANGLE_UP, 0.0f);
    }

    public void reset(float f8, float f9, float f10, float f11) {
        setStartX(f8);
        setStartY(f9);
        setEndX(f8);
        setEndY(f9);
        setCurrentShadowAngle(f10);
        setEndShadowAngle((f10 + f11) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f8, float f9) {
        reset(f8, f9);
    }

    public void lineTo(float f8, float f9, float f10, float f11) {
        if ((Math.abs(f8 - getEndX()) < 0.001f && Math.abs(f9 - getEndY()) < 0.001f) || (Math.abs(f8 - f10) < 0.001f && Math.abs(f9 - f11) < 0.001f)) {
            lineTo(f10, f11);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f18354x = f8;
        pathLineOperation.f18355y = f9;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f18354x = f10;
        pathLineOperation2.f18355y = f11;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f8, f9);
            lineTo(f10, f11);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + ANGLE_UP, innerCornerShadowOperation.getEndAngle() + ANGLE_UP);
            setEndX(f10);
            setEndY(f11);
        }
    }
}
