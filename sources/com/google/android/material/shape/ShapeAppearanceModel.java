package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* loaded from: classes3.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    /* loaded from: classes3.dex */
    public static final class Builder {

        @NonNull
        private EdgeTreatment bottomEdge;

        @NonNull
        private CornerTreatment bottomLeftCorner;

        @NonNull
        private CornerSize bottomLeftCornerSize;

        @NonNull
        private CornerTreatment bottomRightCorner;

        @NonNull
        private CornerSize bottomRightCornerSize;

        @NonNull
        private EdgeTreatment leftEdge;

        @NonNull
        private EdgeTreatment rightEdge;

        @NonNull
        private EdgeTreatment topEdge;

        @NonNull
        private CornerTreatment topLeftCorner;

        @NonNull
        private CornerSize topLeftCornerSize;

        @NonNull
        private CornerTreatment topRightCorner;

        @NonNull
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setAllCorners(int i8, @Dimension float f8) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i8)).setAllCornerSizes(f8);
        }

        @NonNull
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setBottomLeftCorner(int i8, @Dimension float f8) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i8)).setBottomLeftCornerSize(f8);
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@Dimension float f8) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f8);
            return this;
        }

        @NonNull
        public Builder setBottomRightCorner(int i8, @Dimension float f8) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i8)).setBottomRightCornerSize(f8);
        }

        @NonNull
        public Builder setBottomRightCornerSize(@Dimension float f8) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f8);
            return this;
        }

        @NonNull
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setTopLeftCorner(int i8, @Dimension float f8) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i8)).setTopLeftCornerSize(f8);
        }

        @NonNull
        public Builder setTopLeftCornerSize(@Dimension float f8) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f8);
            return this;
        }

        @NonNull
        public Builder setTopRightCorner(int i8, @Dimension float f8) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i8)).setTopRightCornerSize(f8);
        }

        @NonNull
        public Builder setTopRightCornerSize(@Dimension float f8) {
            this.topRightCornerSize = new AbsoluteCornerSize(f8);
            return this;
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        public Builder setBottomLeftCorner(int i8, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i8)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setBottomRightCorner(int i8, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i8)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        public Builder setTopLeftCorner(int i8, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i8)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setTopRightCorner(int i8, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i8)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        public Builder setAllCornerSizes(@Dimension float f8) {
            return setTopLeftCornerSize(f8).setTopRightCornerSize(f8).setBottomRightCornerSize(f8).setBottomLeftCornerSize(f8);
        }

        @NonNull
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    private static CornerSize getCornerSize(TypedArray typedArray, int i8, @NonNull CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue == null) {
            return cornerSize;
        }
        int i9 = peekValue.type;
        if (i9 == 5) {
            return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i9 == 6) {
            return new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f));
        }
        return cornerSize;
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class)) {
            z8 = true;
        } else {
            z8 = false;
        }
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        if (this.topRightCornerSize.getCornerSize(rectF) == cornerSize && this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize && this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z9 || !z10) {
            return false;
        }
        return true;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f8) {
        return toBuilder().setAllCornerSizes(f8).build();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        return builder(context, attributeSet, i8, i9, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9, int i10) {
        return builder(context, attributeSet, i8, i9, new AbsoluteCornerSize(i10));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i8, @StyleRes int i9) {
        return builder(context, i8, i9, 0);
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i8, @StyleRes int i9, int i10) {
        return builder(context, i8, i9, new AbsoluteCornerSize(i10));
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i8, @StyleRes int i9, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
        if (i9 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i9);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i10 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i11 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i10);
            int i12 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i10);
            int i13 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i10);
            int i14 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i10);
            CornerSize cornerSize2 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i11, cornerSize3).setTopRightCorner(i12, cornerSize4).setBottomRightCorner(i13, cornerSize5).setBottomLeftCorner(i14, getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}
