package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;

    @Dimension(unit = 0)
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;

    @NonNull
    private final Paint activeTicksPaint;

    @NonNull
    private final Paint activeTrackPaint;

    @NonNull
    private final List<L> changeListeners;

    @NonNull
    private final RectF cornerRect;

    @Nullable
    private Drawable customThumbDrawable;

    @NonNull
    private List<Drawable> customThumbDrawablesForValues;

    @NonNull
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;

    @NonNull
    private ColorStateList haloColor;

    @NonNull
    private final Paint haloPaint;
    private int haloRadius;

    @NonNull
    private final Paint inactiveTicksPaint;

    @NonNull
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;

    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;

    @Px
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;

    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;

    @NonNull
    private final Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;

    @NonNull
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;

    @NonNull
    private ColorStateList tickColorActive;

    @NonNull
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;

    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;

    @NonNull
    private ColorStateList trackColorActive;

    @NonNull
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;

    @NonNull
    private final Path trackPath;

    @NonNull
    private final RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection = iArr;
            try {
                iArr[FullCornerDirection.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection[FullCornerDirection.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        void setVirtualViewId(int i8) {
            this.virtualViewId = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        @NonNull
        private String startOrEndDescription(int i8) {
            if (i8 == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(R.string.material_slider_range_end);
            }
            if (i8 == 0) {
                return this.slider.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f8, float f9) {
            for (int i8 = 0; i8 < this.slider.getValues().size(); i8++) {
                this.slider.updateBoundsForVirtualViewId(i8, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f8, (int) f9)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List<Integer> list) {
            for (int i8 = 0; i8 < this.slider.getValues().size(); i8++) {
                list.add(Integer.valueOf(i8));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i8, int i9, Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i9 == 4096 || i9 == 8192) {
                float calculateStepIncrement = this.slider.calculateStepIncrement(20);
                if (i9 == 8192) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (this.slider.isRtl()) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (this.slider.snapThumbToValue(i8, MathUtils.clamp(this.slider.getValues().get(i8).floatValue() + calculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                    this.slider.updateHaloHotspot();
                    this.slider.postInvalidate();
                    invalidateVirtualView(i8);
                    return true;
                }
                return false;
            }
            if (i9 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.slider.snapThumbToValue(i8, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.slider.updateHaloHotspot();
                    this.slider.postInvalidate();
                    invalidateVirtualView(i8);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i8, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            float floatValue = values.get(i8).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            String formatValue = this.slider.formatValue(floatValue);
            String string = this.slider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i8);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, formatValue));
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirtualViewId(i8, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i8) {
                return new SliderState[i8];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float max = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    @Nullable
    private Float calculateIncrementForKey(int i8) {
        float calculateStepIncrement;
        if (this.isLongPress) {
            calculateStepIncrement = calculateStepIncrement(20);
        } else {
            calculateStepIncrement = calculateStepIncrement();
        }
        if (i8 != 21) {
            if (i8 != 22) {
                if (i8 != 69) {
                    if (i8 != 70 && i8 != 81) {
                        return null;
                    }
                    return Float.valueOf(calculateStepIncrement);
                }
                return Float.valueOf(-calculateStepIncrement);
            }
            if (isRtl()) {
                calculateStepIncrement = -calculateStepIncrement;
            }
            return Float.valueOf(calculateStepIncrement);
        }
        if (!isRtl()) {
            calculateStepIncrement = -calculateStepIncrement;
        }
        return Float.valueOf(calculateStepIncrement);
    }

    private float calculateStepIncrement() {
        float f8 = this.stepSize;
        if (f8 == 0.0f) {
            return 1.0f;
        }
        return f8;
    }

    private int calculateTrackCenter() {
        int i8 = this.widgetHeight / 2;
        int i9 = 0;
        if (this.labelBehavior == 1 || shouldAlwaysShowLabel()) {
            i9 = this.labels.get(0).getIntrinsicHeight();
        }
        return i8 + i9;
    }

    private ValueAnimator createLabelAnimator(boolean z8) {
        float f8;
        ValueAnimator valueAnimator;
        int resolveThemeDuration;
        TimeInterpolator resolveThemeInterpolator;
        float f9 = 1.0f;
        if (z8) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        if (z8) {
            valueAnimator = this.labelsOutAnimator;
        } else {
            valueAnimator = this.labelsInAnimator;
        }
        float animatorCurrentValueOrDefault = getAnimatorCurrentValueOrDefault(valueAnimator, f8);
        if (!z8) {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(animatorCurrentValueOrDefault, f9);
        if (z8) {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        ofFloat.setDuration(resolveThemeDuration);
        ofFloat.setInterpolator(resolveThemeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                Iterator it = BaseSlider.this.labels.iterator();
                while (it.hasNext()) {
                    ((TooltipDrawable) it.next()).setRevealFraction(floatValue);
                }
                ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
            }
        });
        return ofFloat;
    }

    private void createLabelPool() {
        int i8;
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (true) {
            i8 = 0;
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable createFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(createFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                attachLabelToContentView(createFromAttributes);
            }
        }
        if (this.labels.size() != 1) {
            i8 = 1;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i8);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    private float dimenToValue(float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        float f9 = (f8 - this.trackSidePadding) / this.trackWidth;
        float f10 = this.valueFrom;
        return (f9 * (f10 - this.valueTo)) + f10;
    }

    private void dispatchOnChangedFromUser(int i8) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i8).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            scheduleAccessibilityEventSender(i8);
        }
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l8 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l8.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawActiveTrack(@androidx.annotation.NonNull android.graphics.Canvas r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.drawActiveTrack(android.graphics.Canvas, int, int):void");
    }

    private void drawInactiveTrack(@NonNull Canvas canvas, int i8, int i9) {
        float[] activeRange = getActiveRange();
        float f8 = i8;
        float f9 = this.trackSidePadding + (activeRange[1] * f8);
        if (f9 < r1 + i8) {
            if (hasGapBetweenThumbAndTrack()) {
                float f10 = i9;
                int i10 = this.trackHeight;
                this.trackRect.set(f9 + this.thumbTrackGapSize, f10 - (i10 / 2.0f), this.trackSidePadding + i8 + (i10 / 2.0f), f10 + (i10 / 2.0f));
                updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, FullCornerDirection.RIGHT);
            } else {
                this.inactiveTrackPaint.setStyle(Paint.Style.STROKE);
                this.inactiveTrackPaint.setStrokeCap(Paint.Cap.ROUND);
                float f11 = i9;
                canvas.drawLine(f9, f11, this.trackSidePadding + i8, f11, this.inactiveTrackPaint);
            }
        }
        int i11 = this.trackSidePadding;
        float f12 = i11 + (activeRange[0] * f8);
        if (f12 > i11) {
            if (hasGapBetweenThumbAndTrack()) {
                RectF rectF = this.trackRect;
                float f13 = this.trackSidePadding;
                int i12 = this.trackHeight;
                float f14 = i9;
                rectF.set(f13 - (i12 / 2.0f), f14 - (i12 / 2.0f), f12 - this.thumbTrackGapSize, f14 + (i12 / 2.0f));
                updateTrack(canvas, this.inactiveTrackPaint, this.trackRect, FullCornerDirection.LEFT);
                return;
            }
            this.inactiveTrackPaint.setStyle(Paint.Style.STROKE);
            this.inactiveTrackPaint.setStrokeCap(Paint.Cap.ROUND);
            float f15 = i9;
            canvas.drawLine(this.trackSidePadding, f15, f12, f15, this.inactiveTrackPaint);
        }
    }

    private void drawThumbDrawable(@NonNull Canvas canvas, int i8, int i9, float f8, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f8) * i8))) - (drawable.getBounds().width() / 2.0f), i9 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(@NonNull Canvas canvas, int i8, int i9) {
        for (int i10 = 0; i10 < this.values.size(); i10++) {
            float floatValue = this.values.get(i10).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                drawThumbDrawable(canvas, i8, i9, floatValue, drawable);
            } else if (i10 < this.customThumbDrawablesForValues.size()) {
                drawThumbDrawable(canvas, i8, i9, floatValue, this.customThumbDrawablesForValues.get(i10));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.trackSidePadding + (normalizeValue(floatValue) * i8), i9, getThumbRadius(), this.thumbPaint);
                }
                drawThumbDrawable(canvas, i8, i9, floatValue, this.defaultThumbDrawable);
            }
        }
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator createLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = createLabelAnimator;
            this.labelsOutAnimator = null;
            createLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i8 = 0; i8 < this.values.size() && it.hasNext(); i8++) {
            if (i8 != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i8).floatValue());
            }
        }
        if (it.hasNext()) {
            setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator createLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = createLabelAnimator;
            this.labelsInAnimator = null;
            createLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(BaseSlider.this);
                    Iterator it = BaseSlider.this.labels.iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 17) {
                    if (i8 == 66) {
                        moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
                return;
            }
            moveFocus(Integer.MIN_VALUE);
            return;
        }
        moveFocus(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f8) {
        String str;
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f8);
        }
        if (((int) f8) == f8) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f8));
    }

    private float[] getActiveRange() {
        float floatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            floatValue = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue);
        float normalizeValue2 = normalizeValue(floatValue2);
        if (isRtl()) {
            return new float[]{normalizeValue2, normalizeValue};
        }
        return new float[]{normalizeValue, normalizeValue2};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f8) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f8;
    }

    private float getClampedValue(int i8, float f8) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl()) {
            minSeparation = -minSeparation;
        }
        int i9 = i8 + 1;
        if (i9 >= this.values.size()) {
            floatValue = this.valueTo;
        } else {
            floatValue = this.values.get(i9).floatValue() - minSeparation;
        }
        int i10 = i8 - 1;
        if (i10 < 0) {
            floatValue2 = this.valueFrom;
        } else {
            floatValue2 = this.values.get(i10).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f8, floatValue2, floatValue);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float[] getCornerRadii(float f8, float f9) {
        return new float[]{f8, f8, f9, f9, f9, f9, f8, f8};
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f8 = this.valueTo;
        return (float) ((snapPosition * (f8 - r3)) + this.valueFrom);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f8 = this.touchPosition;
        if (isRtl()) {
            f8 = 1.0f - f8;
        }
        float f9 = this.valueTo;
        float f10 = this.valueFrom;
        return (f8 * (f9 - f10)) + f10;
    }

    private boolean hasGapBetweenThumbAndTrack() {
        if (this.thumbTrackGapSize > 0) {
            return true;
        }
        return false;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(newDrawable);
        return newDrawable;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        this.activeTrackPaint.setStrokeWidth(this.trackHeight);
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        return true;
    }

    private boolean isMultipleOfStepSize(double d8) {
        if (Math.abs(Math.round(r4) - new BigDecimal(Double.toString(d8)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue()) < THRESHOLD) {
            return true;
        }
        return false;
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        if (!isMouseEvent(motionEvent) && isInVerticalScrollingContainer()) {
            return true;
        }
        return false;
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    private void loadResources(@NonNull Resources resources) {
        this.minWidgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i8 = R.dimen.mtrl_slider_tick_radius;
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(i8);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(i8);
        this.minTickSpacing = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void maybeCalculateTicksCoordinates() {
        if (this.stepSize <= 0.0f) {
            return;
        }
        validateConfigurationIfDirty();
        int min = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / this.minTickSpacing) + 1);
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != min * 2) {
            this.ticksCoordinates = new float[min * 2];
        }
        float f8 = this.trackWidth / (min - 1);
        for (int i8 = 0; i8 < min * 2; i8 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i8] = this.trackSidePadding + ((i8 / 2.0f) * f8);
            fArr2[i8 + 1] = calculateTrackCenter();
        }
    }

    private void maybeDrawCompatHalo(@NonNull Canvas canvas, int i8, int i9) {
        if (shouldDrawCompatHalo()) {
            int normalizeValue = (int) (this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i8));
            if (Build.VERSION.SDK_INT < 28) {
                int i10 = this.haloRadius;
                canvas.clipRect(normalizeValue - i10, i9 - i10, normalizeValue + i10, i10 + i9, Region.Op.UNION);
            }
            canvas.drawCircle(normalizeValue, i9, this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawStopIndicator(@NonNull Canvas canvas, int i8) {
        if (this.trackStopIndicatorSize <= 0) {
            return;
        }
        if (this.values.size() >= 1) {
            ArrayList<Float> arrayList = this.values;
            float floatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f8 = this.valueTo;
            if (floatValue < f8) {
                canvas.drawPoint(valueToX(f8), i8, this.stopIndicatorPaint);
            }
        }
        if (this.values.size() > 1) {
            float floatValue2 = this.values.get(0).floatValue();
            float f9 = this.valueFrom;
            if (floatValue2 > f9) {
                canvas.drawPoint(valueToX(f9), i8, this.stopIndicatorPaint);
            }
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        if (this.tickVisible && this.stepSize > 0.0f) {
            float[] activeRange = getActiveRange();
            int ceil = (int) Math.ceil(activeRange[0] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
            int floor = (int) Math.floor(activeRange[1] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
            if (ceil > 0) {
                canvas.drawPoints(this.ticksCoordinates, 0, ceil * 2, this.inactiveTicksPaint);
            }
            if (ceil <= floor) {
                canvas.drawPoints(this.ticksCoordinates, ceil * 2, ((floor - ceil) + 1) * 2, this.activeTicksPaint);
            }
            int i8 = (floor + 1) * 2;
            float[] fArr = this.ticksCoordinates;
            if (i8 < fArr.length) {
                canvas.drawPoints(fArr, i8, fArr.length - i8, this.inactiveTicksPaint);
            }
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int max = this.minTrackSidePadding + Math.max(Math.max(Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), Math.max((this.trackHeight - this.defaultTrackHeight) / 2, 0)), Math.max(Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0)));
        if (this.trackSidePadding == max) {
            return false;
        }
        this.trackSidePadding = max;
        if (ViewCompat.isLaidOut(this)) {
            updateTrackWidth(getWidth());
            return true;
        }
        return true;
    }

    private boolean maybeIncreaseWidgetHeight() {
        int max = Math.max(this.minWidgetHeight, Math.max(this.trackHeight + getPaddingTop() + getPaddingBottom(), this.thumbHeight + getPaddingTop() + getPaddingBottom()));
        if (max == this.widgetHeight) {
            return false;
        }
        this.widgetHeight = max;
        return true;
    }

    private boolean moveFocus(int i8) {
        int i9 = this.focusedThumbIdx;
        int clamp = (int) MathUtils.clamp(i9 + i8, 0L, this.values.size() - 1);
        this.focusedThumbIdx = clamp;
        if (clamp == i9) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = clamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i8) {
        if (isRtl()) {
            if (i8 == Integer.MIN_VALUE) {
                i8 = Integer.MAX_VALUE;
            } else {
                i8 = -i8;
            }
        }
        return moveFocus(i8);
    }

    private float normalizeValue(float f8) {
        float f9 = this.valueFrom;
        float f10 = (f8 - f9) / (this.valueTo - f9);
        if (isRtl()) {
            return 1.0f - f10;
        }
        return f10;
    }

    @Nullable
    private Boolean onKeyDownNoActiveThumb(int i8, @NonNull KeyEvent keyEvent) {
        if (i8 != 61) {
            if (i8 != 66) {
                if (i8 != 81) {
                    if (i8 != 69) {
                        if (i8 != 70) {
                            switch (i8) {
                                case 21:
                                    moveFocusInAbsoluteDirection(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    moveFocusInAbsoluteDirection(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        moveFocus(-1);
                        return Boolean.TRUE;
                    }
                }
                moveFocus(1);
                return Boolean.TRUE;
            }
            this.activeThumbIdx = this.focusedThumbIdx;
            postInvalidate();
            return Boolean.TRUE;
        }
        if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(moveFocus(1));
        }
        if (keyEvent.isShiftPressed()) {
            return Boolean.valueOf(moveFocus(-1));
        }
        return Boolean.FALSE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f8) {
        int normalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f8) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int calculateTrackCenter = calculateTrackCenter() - (this.labelPadding + (this.thumbHeight / 2));
        tooltipDrawable.setBounds(normalizeValue, calculateTrackCenter - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + normalizeValue, calculateTrackCenter);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i8) {
        int i9;
        int i10;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i8, DEF_STYLE_RES, new int[0]);
        this.labelStyle = obtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = obtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(obtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        int i11 = R.styleable.Slider_trackColor;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        if (hasValue) {
            i9 = i11;
        } else {
            i9 = R.styleable.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i11 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, i9);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i11);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbColor));
        int i12 = R.styleable.Slider_thumbStrokeColor;
        if (obtainStyledAttributes.hasValue(i12)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, i12));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.tickVisible = obtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        int i13 = R.styleable.Slider_tickColor;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i13);
        if (hasValue2) {
            i10 = i13;
        } else {
            i10 = R.styleable.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i13 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i10);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i13);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i8) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i8);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f8) {
        tooltipDrawable.setText(formatValue(f8));
        positionLabel(tooltipDrawable, f8);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
                return;
            }
            this.values = arrayList;
            this.dirtyConfig = true;
            this.focusedThumbIdx = 0;
            updateHaloHotspot();
            createLabelPool();
            dispatchOnChangedProgrammatically();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean shouldAlwaysShowLabel() {
        if (this.labelBehavior == 3) {
            return true;
        }
        return false;
    }

    private boolean shouldDrawCompatHalo() {
        if (!this.forceDrawCompatHalo && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    private boolean snapActiveThumbToValue(float f8) {
        return snapThumbToValue(this.activeThumbIdx, f8);
    }

    private double snapPosition(float f8) {
        float f9 = this.stepSize;
        if (f9 > 0.0f) {
            return Math.round(f8 * r0) / ((int) ((this.valueTo - this.valueFrom) / f9));
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i8, float f8) {
        this.focusedThumbIdx = i8;
        if (Math.abs(f8 - this.values.get(i8).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i8, Float.valueOf(getClampedValue(i8, f8)));
        dispatchOnChangedFromUser(i8);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
                int calculateTrackCenter = calculateTrackCenter();
                int i8 = this.haloRadius;
                DrawableCompat.setHotspotBounds(background, normalizeValue - i8, calculateTrackCenter - i8, normalizeValue + i8, calculateTrackCenter + i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        int i8 = this.labelBehavior;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    if (isEnabled() && isSliderVisibleOnScreen()) {
                        ensureLabelsAdded();
                        return;
                    } else {
                        ensureLabelsRemoved();
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.labelBehavior);
            }
            ensureLabelsRemoved();
            return;
        }
        if (this.activeThumbIdx != -1 && isEnabled()) {
            ensureLabelsAdded();
        } else {
            ensureLabelsRemoved();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateTrack(android.graphics.Canvas r9, android.graphics.Paint r10, android.graphics.RectF r11, com.google.android.material.slider.BaseSlider.FullCornerDirection r12) {
        /*
            r8 = this;
            int r0 = r8.trackHeight
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            int[] r3 = com.google.android.material.slider.BaseSlider.AnonymousClass3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection
            int r4 = r12.ordinal()
            r4 = r3[r4]
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L22
            if (r4 == r6) goto L1e
            if (r4 == r5) goto L1a
            goto L26
        L1a:
            int r1 = r8.trackInsideCornerSize
            float r1 = (float) r1
            goto L26
        L1e:
            int r0 = r8.trackInsideCornerSize
        L20:
            float r0 = (float) r0
            goto L26
        L22:
            int r0 = r8.trackInsideCornerSize
            float r1 = (float) r0
            goto L20
        L26:
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
            r10.setStrokeCap(r4)
            r10.setAntiAlias(r7)
            android.graphics.Path r4 = r8.trackPath
            r4.reset()
            float r4 = r11.width()
            float r7 = r1 + r0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L53
            android.graphics.Path r12 = r8.trackPath
            float[] r0 = r8.getCornerRadii(r1, r0)
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r12.addRoundRect(r11, r0, r1)
            android.graphics.Path r11 = r8.trackPath
            r9.drawPath(r11, r10)
            goto Lae
        L53:
            float r4 = java.lang.Math.min(r1, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r9.save()
            android.graphics.Path r1 = r8.trackPath
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r11, r4, r4, r7)
            android.graphics.Path r1 = r8.trackPath
            r9.clipPath(r1)
            int r12 = r12.ordinal()
            r12 = r3[r12]
            if (r12 == r6) goto L98
            if (r12 == r5) goto L88
            android.graphics.RectF r12 = r8.cornerRect
            float r1 = r11.centerX()
            float r1 = r1 - r0
            float r2 = r11.top
            float r3 = r11.centerX()
            float r3 = r3 + r0
            float r11 = r11.bottom
            r12.set(r1, r2, r3, r11)
            goto La6
        L88:
            android.graphics.RectF r12 = r8.cornerRect
            float r1 = r11.right
            float r2 = r2 * r0
            float r2 = r1 - r2
            float r3 = r11.top
            float r11 = r11.bottom
            r12.set(r2, r3, r1, r11)
            goto La6
        L98:
            android.graphics.RectF r12 = r8.cornerRect
            float r1 = r11.left
            float r3 = r11.top
            float r2 = r2 * r0
            float r2 = r2 + r1
            float r11 = r11.bottom
            r12.set(r1, r3, r2, r11)
        La6:
            android.graphics.RectF r11 = r8.cornerRect
            r9.drawRoundRect(r11, r0, r0, r10)
            r9.restore()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.updateTrack(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, com.google.android.material.slider.BaseSlider$FullCornerDirection):void");
    }

    private void updateTrackWidth(int i8) {
        this.trackWidth = Math.max(i8 - (this.trackSidePadding * 2), 0);
        maybeCalculateTicksCoordinates();
    }

    private void updateWidgetLayout() {
        boolean maybeIncreaseWidgetHeight = maybeIncreaseWidgetHeight();
        boolean maybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (maybeIncreaseWidgetHeight) {
            requestLayout();
        } else if (maybeIncreaseTrackSidePadding) {
            postInvalidate();
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f8 = this.stepSize;
            if (f8 > 0.0f && minSeparation > 0.0f) {
                if (this.separationUnit == 1) {
                    if (minSeparation < f8 || !isMultipleOfStepSize(minSeparation)) {
                        throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE, Float.valueOf(minSeparation), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT, Float.valueOf(minSeparation), Float.valueOf(this.stepSize)));
            }
            return;
        }
        throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION, Float.valueOf(minSeparation)));
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(this.stepSize), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
    }

    private void validateValueFrom() {
        if (this.valueFrom < this.valueTo) {
        } else {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
    }

    private void validateValueTo() {
        if (this.valueTo > this.valueFrom) {
        } else {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_TO, Float.valueOf(this.valueTo), Float.valueOf(this.valueFrom)));
        }
    }

    private void validateValues() {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.valueFrom && next.floatValue() <= this.valueTo) {
                if (this.stepSize > 0.0f && !valueLandsOnTick(next.floatValue())) {
                    throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, next, Float.valueOf(this.valueFrom), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)));
                }
            } else {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, next, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
            }
        }
    }

    private boolean valueLandsOnTick(float f8) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f8)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private float valueToX(float f8) {
        return (normalizeValue(f8) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f8 = this.stepSize;
        if (f8 == 0.0f) {
            return;
        }
        if (((int) f8) != f8) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "stepSize", Float.valueOf(f8)));
        }
        float f9 = this.valueFrom;
        if (((int) f9) != f9) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "valueFrom", Float.valueOf(f9)));
        }
        float f10 = this.valueTo;
        if (((int) f10) != f10) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "valueTo", Float.valueOf(f10)));
        }
    }

    public void addOnChangeListener(@NonNull L l8) {
        this.changeListeners.add(l8);
    }

    public void addOnSliderTouchListener(@NonNull T t8) {
        this.touchListeners.add(t8);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.accessibilityHelper.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    @VisibleForTesting
    void forceDrawCompatHalo(boolean z8) {
        this.forceDrawCompatHalo = z8;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Px
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.thumbHeight;
    }

    @Px
    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    @Px
    public int getThumbWidth() {
        return this.thumbWidth;
    }

    @Px
    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Px
    public int getTrackHeight() {
        return this.trackHeight;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    @Px
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        if (this.formatter != null) {
            return true;
        }
        return false;
    }

    final boolean isRtl() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        int calculateTrackCenter = calculateTrackCenter();
        float floatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (floatValue2 < this.valueTo || (this.values.size() > 1 && floatValue > this.valueFrom)) {
            drawInactiveTrack(canvas, this.trackWidth, calculateTrackCenter);
        }
        if (floatValue2 > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, calculateTrackCenter);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, calculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, calculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, calculateTrackCenter);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z8, int i8, @Nullable Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        if (!z8) {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            focusThumbOnFocusGained(i8);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i8, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i8, keyEvent);
            if (onKeyDownNoActiveThumb != null) {
                return onKeyDownNoActiveThumb.booleanValue();
            }
            return super.onKeyDown(i8, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float calculateIncrementForKey = calculateIncrementForKey(i8);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + calculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i8 != 23) {
            if (i8 != 61) {
                if (i8 != 66) {
                    return super.onKeyDown(i8, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return moveFocus(-1);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i8, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10 = this.widgetHeight;
        int i11 = 0;
        if (this.labelBehavior == 1 || shouldAlwaysShowLabel()) {
            i11 = this.labels.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(i10 + i11, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        updateTrackWidth(i8);
        updateHaloHotspot();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:            if (r2 != 3) goto L56;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i8) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i8);
        if (i8 == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
        }
    }

    protected boolean pickActiveThumb() {
        boolean z8;
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i8 = 1; i8 < this.values.size(); i8++) {
            float abs2 = Math.abs(this.values.get(i8).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i8).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            if (!isRtl() ? valueToX2 - valueToX < 0.0f : valueToX2 - valueToX > 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.activeThumbIdx = i8;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(valueToX2 - valueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z8) {
                        this.activeThumbIdx = i8;
                    }
                }
            }
            abs = abs2;
        }
        if (this.activeThumbIdx != -1) {
            return true;
        }
        return false;
    }

    public void removeOnChangeListener(@NonNull L l8) {
        this.changeListeners.remove(l8);
    }

    public void removeOnSliderTouchListener(@NonNull T t8) {
        this.touchListeners.remove(t8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setActiveThumbIndex(int i8) {
        this.activeThumbIdx = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@DrawableRes int i8) {
        setCustomThumbDrawable(getResources().getDrawable(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            drawableArr[i8] = getResources().getDrawable(iArr[i8]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        int i8;
        super.setEnabled(z8);
        if (z8) {
            i8 = 0;
        } else {
            i8 = 2;
        }
        setLayerType(i8, null);
    }

    public void setFocusedThumbIndex(int i8) {
        if (i8 >= 0 && i8 < this.values.size()) {
            this.focusedThumbIdx = i8;
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(i8);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i8) {
        if (i8 == this.haloRadius) {
            return;
        }
        this.haloRadius = i8;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@DimenRes int i8) {
        setHaloRadius(getResources().getDimensionPixelSize(i8));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i8) {
        if (this.labelBehavior != i8) {
            this.labelBehavior = i8;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSeparationUnit(int i8) {
        this.separationUnit = i8;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f8) {
        if (f8 >= 0.0f) {
            if (this.stepSize != f8) {
                this.stepSize = f8;
                this.dirtyConfig = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(f8), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
    }

    public void setThumbElevation(float f8) {
        this.defaultThumbDrawable.setElevation(f8);
    }

    public void setThumbElevationResource(@DimenRes int i8) {
        setThumbElevation(getResources().getDimension(i8));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i8) {
        if (i8 == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i8;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i8);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbHeightResource(@DimenRes int i8) {
        setThumbHeight(getResources().getDimensionPixelSize(i8));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i8) {
        int i9 = i8 * 2;
        setThumbWidth(i9);
        setThumbHeight(i9);
    }

    public void setThumbRadiusResource(@DimenRes int i8) {
        setThumbRadius(getResources().getDimensionPixelSize(i8));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i8) {
        if (i8 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i8));
        }
    }

    public void setThumbStrokeWidth(float f8) {
        this.defaultThumbDrawable.setStrokeWidth(f8);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i8) {
        if (i8 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i8));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i8) {
        if (this.thumbTrackGapSize == i8) {
            return;
        }
        this.thumbTrackGapSize = i8;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i8) {
        if (i8 == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i8;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout();
    }

    public void setThumbWidthResource(@DimenRes int i8) {
        setThumbWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i8) {
        if (this.tickActiveRadius != i8) {
            this.tickActiveRadius = i8;
            this.activeTicksPaint.setStrokeWidth(i8 * 2);
            updateWidgetLayout();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i8) {
        if (this.tickInactiveRadius != i8) {
            this.tickInactiveRadius = i8;
            this.inactiveTicksPaint.setStrokeWidth(i8 * 2);
            updateWidgetLayout();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z8) {
        if (this.tickVisible != z8) {
            this.tickVisible = z8;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        this.stopIndicatorPaint.setColor(getColorForState(this.trackColorActive));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i8) {
        if (this.trackHeight != i8) {
            this.trackHeight = i8;
            invalidateTrack();
            updateWidgetLayout();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i8) {
        if (this.trackInsideCornerSize == i8) {
            return;
        }
        this.trackInsideCornerSize = i8;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i8) {
        if (this.trackStopIndicatorSize == i8) {
            return;
        }
        this.trackStopIndicatorSize = i8;
        this.stopIndicatorPaint.setStrokeWidth(i8);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f8) {
        this.valueFrom = f8;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f8) {
        this.valueTo = f8;
        this.dirtyConfig = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    void updateBoundsForVirtualViewId(int i8, Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i8).floatValue()) * this.trackWidth));
        int calculateTrackCenter = calculateTrackCenter();
        int max = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int max2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        rect.set(normalizeValue - max, calculateTrackCenter - max2, normalizeValue + max, calculateTrackCenter + max2);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i8) {
        float calculateStepIncrement = calculateStepIncrement();
        return (this.valueTo - this.valueFrom) / calculateStepIncrement <= i8 ? calculateStepIncrement : Math.round(r1 / r4) * calculateStepIncrement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i8, DEF_STYLE_RES), attributeSet, i8);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.tickVisible = true;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.trackRect = new RectF();
        this.cornerRect = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.emptyList();
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseSlider.this.updateLabels();
            }
        };
        Context context2 = getContext();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i8);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }
}
