package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes3.dex */
class TransitionUtils {

    @AttrRes
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float calculateArea(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                CornerSize createFromCornerSize;
                createFromCornerSize = RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
                return createFromCornerSize;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader createColorShader(@ColorInt int i8) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i8, i8, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static <T> T defaultIfNull(@Nullable T t8, @NonNull T t9) {
        return t8 != null ? t8 : t9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View findAncestorById(View view, @IdRes int i8) {
        String resourceName = view.getResources().getResourceName(i8);
        while (view != null) {
            if (view.getId() == i8) {
                return view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View findDescendantOrAncestorById(View view, @IdRes int i8) {
        View findViewById = view.findViewById(i8);
        if (findViewById != null) {
            return findViewById;
        }
        return findAncestorById(view, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF getRelativeBounds(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float lerp(float f8, float f9, float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    static void maybeAddTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean maybeApplyThemeDuration(Transition transition, Context context, @AttrRes int i8) {
        int resolveThemeDuration;
        if (i8 != 0 && transition.getDuration() == -1 && (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i8, -1)) != -1) {
            transition.setDuration(resolveThemeDuration);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean maybeApplyThemeInterpolator(Transition transition, Context context, @AttrRes int i8, TimeInterpolator timeInterpolator) {
        if (i8 != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i8, timeInterpolator));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean maybeApplyThemePath(Transition transition, Context context, @AttrRes int i8) {
        PathMotion resolveThemePath;
        if (i8 != 0 && (resolveThemePath = resolveThemePath(context, i8)) != null) {
            transition.setPathMotion(resolveThemePath);
            return true;
        }
        return false;
    }

    static void maybeRemoveTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @Nullable
    static PathMotion resolveThemePath(Context context, @AttrRes int i8) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i8, typedValue, true)) {
            return null;
        }
        int i9 = typedValue.type;
        if (i9 == 16) {
            int i10 = typedValue.data;
            if (i10 == 0) {
                return null;
            }
            if (i10 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i10);
        }
        if (i9 == 3) {
            return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
        }
        throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i8) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void transform(Canvas canvas, Rect rect, float f8, float f9, float f10, int i8, CanvasCompat.CanvasOperation canvasOperation) {
        if (i8 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f8, f9);
        canvas.scale(f10, f10);
        if (i8 < 255) {
            saveLayerAlphaCompat(canvas, rect, i8);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        ShapeAppearanceModel shapeAppearanceModel3;
        if (isShapeAppearanceSignificant(shapeAppearanceModel, rectF)) {
            shapeAppearanceModel3 = shapeAppearanceModel;
        } else {
            shapeAppearanceModel3 = shapeAppearanceModel2;
        }
        return shapeAppearanceModel3.toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float lerp(float f8, float f9, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        return lerp(f8, f9, f10, f11, f12, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float lerp(float f8, float f9, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d) float f12, boolean z8) {
        if (!z8 || (f12 >= 0.0f && f12 <= 1.0f)) {
            return f12 < f10 ? f8 : f12 > f11 ? f9 : lerp(f8, f9, (f12 - f10) / (f11 - f10));
        }
        return lerp(f8, f9, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int lerp(int i8, int i9, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return f10 < f8 ? i8 : f10 > f9 ? i9 : (int) lerp(i8, i9, (f10 - f8) / (f9 - f8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, @FloatRange(from = 0.0d, to = 1.0d) final float f8, @FloatRange(from = 0.0d, to = 1.0d) final float f9, @FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        return f10 < f8 ? shapeAppearanceModel : f10 > f9 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f8, f9, f10));
            }
        });
    }
}
