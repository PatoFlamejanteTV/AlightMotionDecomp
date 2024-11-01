package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final String TAG = "ACTVAutoSizeHelper";
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private final Context mContext;
    private final Impl mImpl;
    private TextPaint mTempTextPaint;

    @NonNull
    private final TextView mTextView;
    private static final RectF TEMP_RECTF = new RectF();

    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> sTextViewMethodByNameCache = new ConcurrentHashMap<>();
    private int mAutoSizeTextType = 0;
    private boolean mNeedsAutoSizeText = false;
    private float mAutoSizeStepGranularityInPx = -1.0f;
    private float mAutoSizeMinTextSizeInPx = -1.0f;
    private float mAutoSizeMaxTextSizeInPx = -1.0f;
    private int[] mAutoSizeTextSizesInPx = new int[0];
    private boolean mHasPresetAutoSizeValues = false;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static final class Api23Impl {
        private Api23Impl() {
        }

        @NonNull
        @DoNotInline
        static StaticLayout createStaticLayoutForMeasuring(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i8, int i9, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull Impl impl) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i8);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i9 == -1) {
                i9 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i9);
            try {
                impl.computeAndSetTextDirection(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w(AppCompatTextViewAutoSizeHelper.TAG, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Impl {
        Impl() {
        }

        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
        }

        boolean isHorizontallyScrollable(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    @RequiresApi(23)
    /* loaded from: classes.dex */
    private static class Impl23 extends Impl {
        Impl23() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    private static class Impl29 extends Impl23 {
        Impl29() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void computeAndSetTextDirection(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean isHorizontallyScrollable(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextViewAutoSizeHelper(@NonNull TextView textView) {
        this.mTextView = textView;
        this.mContext = textView.getContext();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            this.mImpl = new Impl29();
        } else if (i8 >= 23) {
            this.mImpl = new Impl23();
        } else {
            this.mImpl = new Impl();
        }
    }

    private int[] cleanupAutoSizePresetSizes(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    private void clearAutoSizeConfiguration() {
        this.mAutoSizeTextType = 0;
        this.mAutoSizeMinTextSizeInPx = -1.0f;
        this.mAutoSizeMaxTextSizeInPx = -1.0f;
        this.mAutoSizeStepGranularityInPx = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mNeedsAutoSizeText = false;
    }

    private int findLargestTextSizeWhichFits(RectF rectF) {
        int length = this.mAutoSizeTextSizesInPx.length;
        if (length != 0) {
            int i8 = 1;
            int i9 = length - 1;
            int i10 = 0;
            while (i8 <= i9) {
                int i11 = (i8 + i9) / 2;
                if (suggestedSizeFitsInSpace(this.mAutoSizeTextSizesInPx[i11], rectF)) {
                    int i12 = i11 + 1;
                    i10 = i8;
                    i8 = i12;
                } else {
                    i10 = i11 - 1;
                    i9 = i10;
                }
            }
            return this.mAutoSizeTextSizesInPx[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @Nullable
    private static Method getTextViewMethod(@NonNull String str) {
        try {
            Method method = sTextViewMethodByNameCache.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                sTextViewMethodByNameCache.put(str, method);
            }
            return method;
        } catch (Exception e8) {
            Log.w(TAG, "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static <T> T invokeAndReturnWithDefault(@NonNull Object obj, @NonNull String str, @NonNull T t8) {
        try {
            return (T) getTextViewMethod(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w(TAG, "Failed to invoke TextView#" + str + "() method", e8);
            return t8;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void setRawTextSize(float f8) {
        if (f8 != this.mTextView.getPaint().getTextSize()) {
            this.mTextView.getPaint().setTextSize(f8);
            boolean isInLayout = this.mTextView.isInLayout();
            if (this.mTextView.getLayout() != null) {
                this.mNeedsAutoSizeText = false;
                try {
                    Method textViewMethod = getTextViewMethod("nullLayouts");
                    if (textViewMethod != null) {
                        textViewMethod.invoke(this.mTextView, null);
                    }
                } catch (Exception e8) {
                    Log.w(TAG, "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (!isInLayout) {
                    this.mTextView.requestLayout();
                } else {
                    this.mTextView.forceLayout();
                }
                this.mTextView.invalidate();
            }
        }
    }

    private boolean setupAutoSizeText() {
        if (supportsAutoSizeText() && this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues || this.mAutoSizeTextSizesInPx.length == 0) {
                int floor = ((int) Math.floor((this.mAutoSizeMaxTextSizeInPx - this.mAutoSizeMinTextSizeInPx) / this.mAutoSizeStepGranularityInPx)) + 1;
                int[] iArr = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr[i8] = Math.round(this.mAutoSizeMinTextSizeInPx + (i8 * this.mAutoSizeStepGranularityInPx));
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            }
            this.mNeedsAutoSizeText = true;
        } else {
            this.mNeedsAutoSizeText = false;
        }
        return this.mNeedsAutoSizeText;
    }

    private void setupAutoSizeUniformPresetSizes(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            setupAutoSizeUniformPresetSizesConfiguration();
        }
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        boolean z8;
        if (this.mAutoSizeTextSizesInPx.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mHasPresetAutoSizeValues = z8;
        if (z8) {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = r0[0];
            this.mAutoSizeMaxTextSizeInPx = r0[r1 - 1];
            this.mAutoSizeStepGranularityInPx = -1.0f;
        }
        return z8;
    }

    private boolean suggestedSizeFitsInSpace(int i8, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.mTextView.getText();
        TransformationMethod transformationMethod = this.mTextView.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.mTextView)) != null) {
            text = transformation;
        }
        int maxLines = this.mTextView.getMaxLines();
        initTempTextPaint(i8);
        StaticLayout createLayout = createLayout(text, (Layout.Alignment) invokeAndReturnWithDefault(this.mTextView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if ((maxLines != -1 && (createLayout.getLineCount() > maxLines || createLayout.getLineEnd(createLayout.getLineCount() - 1) != text.length())) || createLayout.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    private boolean supportsAutoSizeText() {
        return !(this.mTextView instanceof AppCompatEditText);
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f8, float f9, float f10) throws IllegalArgumentException {
        if (f8 > 0.0f) {
            if (f9 > f8) {
                if (f10 > 0.0f) {
                    this.mAutoSizeTextType = 1;
                    this.mAutoSizeMinTextSizeInPx = f8;
                    this.mAutoSizeMaxTextSizeInPx = f9;
                    this.mAutoSizeStepGranularityInPx = f10;
                    this.mHasPresetAutoSizeValues = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        int measuredWidth;
        if (!isAutoSizeEnabled()) {
            return;
        }
        if (this.mNeedsAutoSizeText) {
            if (this.mTextView.getMeasuredHeight() > 0 && this.mTextView.getMeasuredWidth() > 0) {
                if (this.mImpl.isHorizontallyScrollable(this.mTextView)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.mTextView.getMeasuredWidth() - this.mTextView.getTotalPaddingLeft()) - this.mTextView.getTotalPaddingRight();
                }
                int height = (this.mTextView.getHeight() - this.mTextView.getCompoundPaddingBottom()) - this.mTextView.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = TEMP_RECTF;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float findLargestTextSizeWhichFits = findLargestTextSizeWhichFits(rectF);
                            if (findLargestTextSizeWhichFits != this.mTextView.getTextSize()) {
                                setTextSizeInternal(0, findLargestTextSizeWhichFits);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.mNeedsAutoSizeText = true;
    }

    @NonNull
    @VisibleForTesting
    StaticLayout createLayout(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.createStaticLayoutForMeasuring(charSequence, alignment, i8, i9, this.mTextView, this.mTempTextPaint, this.mImpl);
        }
        return new StaticLayout(charSequence, this.mTempTextPaint, i8, alignment, this.mTextView.getLineSpacingMultiplier(), this.mTextView.getLineSpacingExtra(), this.mTextView.getIncludeFontPadding());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        return Math.round(this.mAutoSizeMaxTextSizeInPx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        return Math.round(this.mAutoSizeMinTextSizeInPx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        return Math.round(this.mAutoSizeStepGranularityInPx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextSizesInPx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        return this.mAutoSizeTextType;
    }

    @VisibleForTesting
    void initTempTextPaint(int i8) {
        TextPaint textPaint = this.mTempTextPaint;
        if (textPaint == null) {
            this.mTempTextPaint = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.mTempTextPaint.set(this.mTextView.getPaint());
        this.mTempTextPaint.setTextSize(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        if (supportsAutoSizeText() && this.mAutoSizeTextType != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i8) {
        float f8;
        float f9;
        float f10;
        int resourceId;
        Context context = this.mContext;
        int[] iArr = R.styleable.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, 0);
        TextView textView = this.mTextView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i8, 0);
        int i9 = R.styleable.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i9)) {
            this.mAutoSizeTextType = obtainStyledAttributes.getInt(i9, 0);
        }
        int i10 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
        if (obtainStyledAttributes.hasValue(i10)) {
            f8 = obtainStyledAttributes.getDimension(i10, -1.0f);
        } else {
            f8 = -1.0f;
        }
        int i11 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
        if (obtainStyledAttributes.hasValue(i11)) {
            f9 = obtainStyledAttributes.getDimension(i11, -1.0f);
        } else {
            f9 = -1.0f;
        }
        int i12 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        if (obtainStyledAttributes.hasValue(i12)) {
            f10 = obtainStyledAttributes.getDimension(i12, -1.0f);
        } else {
            f10 = -1.0f;
        }
        int i13 = R.styleable.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i13) && (resourceId = obtainStyledAttributes.getResourceId(i13, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            setupAutoSizeUniformPresetSizes(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (supportsAutoSizeText()) {
            if (this.mAutoSizeTextType == 1) {
                if (!this.mHasPresetAutoSizeValues) {
                    DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    if (f9 == -1.0f) {
                        f9 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f8 == -1.0f) {
                        f8 = 1.0f;
                    }
                    validateAndSetAutoSizeTextTypeUniformConfiguration(f9, f10, f8);
                }
                setupAutoSizeText();
                return;
            }
            return;
        }
        this.mAutoSizeTextType = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) throws IllegalArgumentException {
        if (supportsAutoSizeText()) {
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(i11, i8, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i8) throws IllegalArgumentException {
        if (supportsAutoSizeText()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i8 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArr2[i9] = Math.round(TypedValue.applyDimension(i8, iArr[i9], displayMetrics));
                    }
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr2);
                if (!setupAutoSizeUniformPresetSizesConfiguration()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.mHasPresetAutoSizeValues = false;
            }
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (supportsAutoSizeText()) {
            if (i8 != 0) {
                if (i8 == 1) {
                    DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (setupAutoSizeText()) {
                        autoSizeText();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i8);
            }
            clearAutoSizeConfiguration();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSizeInternal(int i8, float f8) {
        Resources resources;
        Context context = this.mContext;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        setRawTextSize(TypedValue.applyDimension(i8, f8, resources.getDisplayMetrics()));
    }
}
