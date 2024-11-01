package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void findIntersectingTextView() {
        boolean z8;
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i8 = 0; i8 < this.textViewPool.size(); i8++) {
            TextView textView = this.textViewPool.get(i8);
            if (textView != null) {
                if (textView == selectedTextView) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                textView.setSelected(z8);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    @Nullable
    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (!RectF.intersects(rectF, this.scratch)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
    }

    @Nullable
    private TextView getSelectedTextView(RectF rectF) {
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i8 = 0; i8 < this.textViewPool.size(); i8++) {
            TextView textView2 = this.textViewPool.get(i8);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float width = this.scratch.width() * this.scratch.height();
                if (width < f8) {
                    textView = textView2;
                    f8 = width;
                }
            }
        }
        return textView;
    }

    private static float max3(float f8, float f9, float f10) {
        return Math.max(Math.max(f8, f9), f10);
    }

    private void updateTextViews(@StringRes int i8) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < Math.max(this.values.length, size); i9++) {
            TextView textView = this.textViewPool.get(i9);
            if (i9 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i9, textView);
                    addView(textView);
                }
                textView.setText(this.values[i9]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i9));
                int i10 = (i9 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                if (i10 > 1) {
                    z8 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i8 != 0) {
                    textView.setContentDescription(getResources().getString(i8, this.values[i9]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.values.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        findIntersectingTextView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max3, 1073741824);
        setMeasuredDimension(max3, max3);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f8, boolean z8) {
        if (Math.abs(this.currentHandRotation - f8) > EPSILON) {
            this.currentHandRotation = f8;
            findIntersectingTextView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCurrentLevel(int i8) {
        this.clockHandView.setCurrentLevel(i8);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f8) {
        this.clockHandView.setHandRotation(f8);
        findIntersectingTextView();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i8) {
        if (i8 != getRadius()) {
            super.setRadius(i8);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, @StringRes int i8) {
        this.values = strArr;
        updateTextViews(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i8 = 0; i8 < this.textViewPool.size(); i8++) {
            this.textViewPool.get(i8).setVisibility(0);
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i8, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(intValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
                if (i9 == 16) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(ClockFaceView.this.textViewRect);
                    float centerX = ClockFaceView.this.textViewRect.centerX();
                    float centerY = ClockFaceView.this.textViewRect.centerY();
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    return true;
                }
                return super.performAccessibilityAction(view, i9, bundle);
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
