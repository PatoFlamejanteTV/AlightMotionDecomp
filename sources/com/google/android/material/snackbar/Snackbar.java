package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS;

    @Nullable
    private final AccessibilityManager accessibilityManager;

    @Nullable
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    /* loaded from: classes3.dex */
    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i8) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i8 = R.attr.snackbarButtonStyle;
        SNACKBAR_BUTTON_STYLE_ATTR = new int[]{i8};
        SNACKBAR_CONTENT_STYLE_ATTRS = new int[]{i8, R.attr.snackbarTextViewStyle};
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.accessibilityManager = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Nullable
    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.view.getChildAt(0);
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    @Deprecated
    protected static boolean hasSnackbarButtonStyleAttr(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    private static boolean hasSnackbarContentStyleAttrs(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @NonNull CharSequence charSequence, int i8) {
        return makeInternal(null, view, charSequence, i8);
    }

    @NonNull
    private static Snackbar makeInternal(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i8) {
        int i9;
        ViewGroup findSuitableParent = findSuitableParent(view);
        if (findSuitableParent != null) {
            if (context == null) {
                context = findSuitableParent.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (hasSnackbarContentStyleAttrs(context)) {
                i9 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i9 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i9, findSuitableParent, false);
            Snackbar snackbar = new Snackbar(context, findSuitableParent, snackbarContentLayout, snackbarContentLayout);
            snackbar.setText(charSequence);
            snackbar.setDuration(i8);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int i8;
        int recommendedTimeoutMillis;
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.hasAction) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            recommendedTimeoutMillis = this.accessibilityManager.getRecommendedTimeoutMillis(duration, i8 | 3);
            return recommendedTimeoutMillis;
        }
        if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    @NonNull
    public Snackbar setAction(@StringRes int i8, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i8), onClickListener);
    }

    @NonNull
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    public Snackbar setBackgroundTint(@ColorInt int i8) {
        return setBackgroundTintList(ColorStateList.valueOf(i8));
    }

    @NonNull
    public Snackbar setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    @NonNull
    public Snackbar setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @NonNull
    @Deprecated
    public Snackbar setCallback(@Nullable Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    @NonNull
    public Snackbar setMaxInlineActionWidth(@Dimension int i8) {
        getContentLayout().setMaxInlineActionWidth(i8);
        return this;
    }

    @NonNull
    public Snackbar setText(@NonNull CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    @NonNull
    public Snackbar setTextColor(ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    public Snackbar setTextMaxLines(int i8) {
        getMessageView().setMaxLines(i8);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @NonNull
    public static Snackbar make(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i8) {
        return makeInternal(context, view, charSequence, i8);
    }

    @NonNull
    public Snackbar setAction(@Nullable CharSequence charSequence, @Nullable final View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.this.lambda$setAction$0(onClickListener, view);
                }
            });
        } else {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        }
        return this;
    }

    @NonNull
    public Snackbar setActionTextColor(@ColorInt int i8) {
        getActionView().setTextColor(i8);
        return this;
    }

    @NonNull
    public Snackbar setText(@StringRes int i8) {
        return setText(getContext().getText(i8));
    }

    @NonNull
    public Snackbar setTextColor(@ColorInt int i8) {
        getMessageView().setTextColor(i8);
        return this;
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @StringRes int i8, int i9) {
        return make(view, view.getResources().getText(i8), i9);
    }
}
