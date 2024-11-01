package androidx.leanback.app;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.leanback.R;
import androidx.leanback.widget.BackgroundHelper;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class BackgroundManager {
    private static final int CHANGE_BG_DELAY_MS = 500;
    static final boolean DEBUG = false;
    private static final int FADE_DURATION = 500;
    private static final String FRAGMENT_TAG = "androidx.leanback.app.BackgroundManager";
    static final int FULL_ALPHA = 255;
    static final String TAG = "BackgroundManager";
    private final Interpolator mAccelerateInterpolator;
    private final Animator.AnimatorListener mAnimationListener;
    private final ValueAnimator.AnimatorUpdateListener mAnimationUpdateListener;
    final ValueAnimator mAnimator;
    boolean mAttached;
    private boolean mAutoReleaseOnStop = true;
    int mBackgroundColor;
    Drawable mBackgroundDrawable;
    private View mBgView;
    ChangeBackgroundRunnable mChangeRunnable;
    private boolean mChangeRunnablePending;
    Activity mContext;
    private final Interpolator mDecelerateInterpolator;
    private BackgroundFragment mFragmentState;
    Handler mHandler;
    private int mHeightPx;
    int mImageInWrapperIndex;
    int mImageOutWrapperIndex;
    private long mLastSetTime;
    TranslucentLayerDrawable mLayerDrawable;
    private BackgroundContinuityService mService;
    private int mThemeDrawableResourceId;
    private int mWidthPx;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BackgroundContinuityService {
        private static final boolean DEBUG = false;
        private static final String TAG = "BackgroundContinuity";
        private static BackgroundContinuityService sService = new BackgroundContinuityService();
        private int mColor;
        private int mCount;
        private Drawable mDrawable;
        private int mLastThemeDrawableId;
        private WeakReference<Drawable.ConstantState> mLastThemeDrawableState;

        private BackgroundContinuityService() {
            reset();
        }

        public static BackgroundContinuityService getInstance() {
            BackgroundContinuityService backgroundContinuityService = sService;
            backgroundContinuityService.mCount++;
            return backgroundContinuityService;
        }

        private void reset() {
            this.mColor = 0;
            this.mDrawable = null;
        }

        public int getColor() {
            return this.mColor;
        }

        public Drawable getDrawable() {
            return this.mDrawable;
        }

        public Drawable getThemeDrawable(Context context, int i8) {
            Drawable drawable;
            Drawable.ConstantState constantState;
            WeakReference<Drawable.ConstantState> weakReference = this.mLastThemeDrawableState;
            if (weakReference != null && this.mLastThemeDrawableId == i8 && (constantState = weakReference.get()) != null) {
                drawable = constantState.newDrawable();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Drawable drawable2 = ContextCompat.getDrawable(context, i8);
                this.mLastThemeDrawableState = new WeakReference<>(drawable2.getConstantState());
                this.mLastThemeDrawableId = i8;
                return drawable2;
            }
            return drawable;
        }

        public void setColor(int i8) {
            this.mColor = i8;
            this.mDrawable = null;
        }

        public void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
        }

        public void unref() {
            int i8 = this.mCount;
            if (i8 > 0) {
                int i9 = i8 - 1;
                this.mCount = i9;
                if (i9 == 0) {
                    reset();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Can't unref, count " + this.mCount);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class BitmapDrawable extends Drawable {
        boolean mMutated;
        ConstantState mState;

        BitmapDrawable(Resources resources, Bitmap bitmap) {
            this(resources, bitmap, null);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            ConstantState constantState = this.mState;
            if (constantState.mBitmap == null) {
                return;
            }
            if (constantState.mPaint.getAlpha() < 255 && this.mState.mPaint.getColorFilter() != null) {
                throw new IllegalStateException("Can't draw with translucent alpha and color filter");
            }
            ConstantState constantState2 = this.mState;
            canvas.drawBitmap(constantState2.mBitmap, constantState2.mMatrix, constantState2.mPaint);
        }

        Bitmap getBitmap() {
            return this.mState.mBitmap;
        }

        @Override // android.graphics.drawable.Drawable
        public ColorFilter getColorFilter() {
            return this.mState.mPaint.getColorFilter();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        @NonNull
        public Drawable mutate() {
            if (!this.mMutated) {
                this.mMutated = true;
                this.mState = new ConstantState(this.mState);
            }
            return this;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i8) {
            mutate();
            if (this.mState.mPaint.getAlpha() != i8) {
                this.mState.mPaint.setAlpha(i8);
                invalidateSelf();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            mutate();
            this.mState.mPaint.setColorFilter(colorFilter);
            invalidateSelf();
        }

        BitmapDrawable(Resources resources, Bitmap bitmap, Matrix matrix) {
            this.mState = new ConstantState(bitmap, matrix);
        }

        @Override // android.graphics.drawable.Drawable
        public ConstantState getConstantState() {
            return this.mState;
        }

        BitmapDrawable(ConstantState constantState) {
            this.mState = constantState;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class ConstantState extends Drawable.ConstantState {
            final Bitmap mBitmap;
            final Matrix mMatrix;
            final Paint mPaint;

            ConstantState(Bitmap bitmap, Matrix matrix) {
                Paint paint = new Paint();
                this.mPaint = paint;
                this.mBitmap = bitmap;
                this.mMatrix = matrix == null ? new Matrix() : matrix;
                paint.setFilterBitmap(true);
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public int getChangingConfigurations() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public Drawable newDrawable() {
                return new BitmapDrawable(this);
            }

            ConstantState(ConstantState constantState) {
                Paint paint = new Paint();
                this.mPaint = paint;
                this.mBitmap = constantState.mBitmap;
                this.mMatrix = constantState.mMatrix != null ? new Matrix(constantState.mMatrix) : new Matrix();
                if (constantState.mPaint.getAlpha() != 255) {
                    paint.setAlpha(constantState.mPaint.getAlpha());
                }
                if (constantState.mPaint.getColorFilter() != null) {
                    paint.setColorFilter(constantState.mPaint.getColorFilter());
                }
                paint.setFilterBitmap(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class ChangeBackgroundRunnable implements Runnable {
        final Drawable mDrawable;

        ChangeBackgroundRunnable(Drawable drawable) {
            this.mDrawable = drawable;
        }

        private void runTask() {
            BackgroundManager backgroundManager = BackgroundManager.this;
            if (backgroundManager.mLayerDrawable == null) {
                return;
            }
            DrawableWrapper imageInWrapper = backgroundManager.getImageInWrapper();
            if (imageInWrapper != null) {
                if (BackgroundManager.this.sameDrawable(this.mDrawable, imageInWrapper.getDrawable())) {
                    return;
                }
                BackgroundManager backgroundManager2 = BackgroundManager.this;
                backgroundManager2.mLayerDrawable.clearDrawable(R.id.background_imagein, backgroundManager2.mContext);
                BackgroundManager.this.mLayerDrawable.updateDrawable(R.id.background_imageout, imageInWrapper.getDrawable());
            }
            applyBackgroundChanges();
        }

        void applyBackgroundChanges() {
            Drawable drawable;
            BackgroundManager backgroundManager = BackgroundManager.this;
            if (!backgroundManager.mAttached) {
                return;
            }
            if (backgroundManager.getImageInWrapper() == null && (drawable = this.mDrawable) != null) {
                BackgroundManager.this.mLayerDrawable.updateDrawable(R.id.background_imagein, drawable);
                BackgroundManager backgroundManager2 = BackgroundManager.this;
                backgroundManager2.mLayerDrawable.setWrapperAlpha(backgroundManager2.mImageInWrapperIndex, 0);
            }
            BackgroundManager.this.mAnimator.setDuration(500L);
            BackgroundManager.this.mAnimator.start();
        }

        @Override // java.lang.Runnable
        public void run() {
            runTask();
            BackgroundManager.this.mChangeRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class EmptyDrawable extends BitmapDrawable {
        EmptyDrawable(Resources resources) {
            super(resources, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class TranslucentLayerDrawable extends LayerDrawable {
        int mAlpha;
        WeakReference<BackgroundManager> mManagerWeakReference;
        boolean mSuspendInvalidation;
        DrawableWrapper[] mWrapper;

        TranslucentLayerDrawable(BackgroundManager backgroundManager, Drawable[] drawableArr) {
            super(drawableArr);
            this.mAlpha = 255;
            this.mManagerWeakReference = new WeakReference<>(backgroundManager);
            int length = drawableArr.length;
            this.mWrapper = new DrawableWrapper[length];
            for (int i8 = 0; i8 < length; i8++) {
                this.mWrapper[i8] = new DrawableWrapper(drawableArr[i8]);
            }
        }

        public void clearDrawable(int i8, Context context) {
            for (int i9 = 0; i9 < getNumberOfLayers(); i9++) {
                if (getId(i9) == i8) {
                    this.mWrapper[i9] = null;
                    if (!(getDrawable(i9) instanceof EmptyDrawable)) {
                        super.setDrawableByLayerId(i8, BackgroundManager.createEmptyDrawable(context));
                        return;
                    }
                    return;
                }
            }
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Drawable drawable;
            int i8;
            int i9;
            int i10 = 0;
            while (true) {
                DrawableWrapper[] drawableWrapperArr = this.mWrapper;
                if (i10 < drawableWrapperArr.length) {
                    DrawableWrapper drawableWrapper = drawableWrapperArr[i10];
                    if (drawableWrapper != null && (drawable = drawableWrapper.getDrawable()) != null) {
                        int alpha = DrawableCompat.getAlpha(drawable);
                        int i11 = this.mAlpha;
                        if (i11 < 255) {
                            i8 = i11 * alpha;
                            i9 = 1;
                        } else {
                            i8 = alpha;
                            i9 = 0;
                        }
                        int i12 = this.mWrapper[i10].mAlpha;
                        if (i12 < 255) {
                            i8 *= i12;
                            i9++;
                        }
                        if (i9 == 0) {
                            drawable.draw(canvas);
                        } else {
                            if (i9 == 1) {
                                i8 /= 255;
                            } else if (i9 == 2) {
                                i8 /= OggPageHeader.MAX_PAGE_PAYLOAD;
                            }
                            try {
                                this.mSuspendInvalidation = true;
                                drawable.setAlpha(i8);
                                drawable.draw(canvas);
                                drawable.setAlpha(alpha);
                            } finally {
                                this.mSuspendInvalidation = false;
                            }
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public int findWrapperIndexById(int i8) {
            for (int i9 = 0; i9 < getNumberOfLayers(); i9++) {
                if (getId(i9) == i8) {
                    return i9;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
            return this.mAlpha;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            if (!this.mSuspendInvalidation) {
                super.invalidateDrawable(drawable);
            }
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public Drawable mutate() {
            Drawable mutate = super.mutate();
            int numberOfLayers = getNumberOfLayers();
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                DrawableWrapper[] drawableWrapperArr = this.mWrapper;
                DrawableWrapper drawableWrapper = drawableWrapperArr[i8];
                if (drawableWrapper != null) {
                    drawableWrapperArr[i8] = new DrawableWrapper(drawableWrapper, getDrawable(i8));
                }
            }
            return mutate;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i8) {
            if (this.mAlpha != i8) {
                this.mAlpha = i8;
                invalidateSelf();
                BackgroundManager backgroundManager = this.mManagerWeakReference.get();
                if (backgroundManager != null) {
                    backgroundManager.postChangeRunnable();
                }
            }
        }

        @Override // android.graphics.drawable.LayerDrawable
        public boolean setDrawableByLayerId(int i8, Drawable drawable) {
            if (updateDrawable(i8, drawable) != null) {
                return true;
            }
            return false;
        }

        void setWrapperAlpha(int i8, int i9) {
            DrawableWrapper drawableWrapper = this.mWrapper[i8];
            if (drawableWrapper != null) {
                drawableWrapper.mAlpha = i9;
                invalidateSelf();
            }
        }

        public DrawableWrapper updateDrawable(int i8, Drawable drawable) {
            super.setDrawableByLayerId(i8, drawable);
            for (int i9 = 0; i9 < getNumberOfLayers(); i9++) {
                if (getId(i9) == i8) {
                    this.mWrapper[i9] = new DrawableWrapper(drawable);
                    invalidateSelf();
                    return this.mWrapper[i9];
                }
            }
            return null;
        }
    }

    private BackgroundManager(Activity activity) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.leanback.app.BackgroundManager.1
            final Runnable mRunnable = new Runnable() { // from class: androidx.leanback.app.BackgroundManager.1.1
                @Override // java.lang.Runnable
                public void run() {
                    BackgroundManager.this.postChangeRunnable();
                }
            };

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BackgroundManager backgroundManager = BackgroundManager.this;
                TranslucentLayerDrawable translucentLayerDrawable = backgroundManager.mLayerDrawable;
                if (translucentLayerDrawable != null) {
                    translucentLayerDrawable.clearDrawable(R.id.background_imageout, backgroundManager.mContext);
                }
                BackgroundManager.this.mHandler.post(this.mRunnable);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        };
        this.mAnimationListener = animatorListener;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.app.BackgroundManager.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BackgroundManager backgroundManager = BackgroundManager.this;
                int i8 = backgroundManager.mImageInWrapperIndex;
                if (i8 != -1) {
                    backgroundManager.mLayerDrawable.setWrapperAlpha(i8, intValue);
                }
            }
        };
        this.mAnimationUpdateListener = animatorUpdateListener;
        this.mContext = activity;
        this.mService = BackgroundContinuityService.getInstance();
        this.mHeightPx = this.mContext.getResources().getDisplayMetrics().heightPixels;
        this.mWidthPx = this.mContext.getResources().getDisplayMetrics().widthPixels;
        this.mHandler = new Handler();
        FastOutLinearInInterpolator fastOutLinearInInterpolator = new FastOutLinearInInterpolator();
        this.mAccelerateInterpolator = AnimationUtils.loadInterpolator(this.mContext, android.R.anim.accelerate_interpolator);
        this.mDecelerateInterpolator = AnimationUtils.loadInterpolator(this.mContext, android.R.anim.decelerate_interpolator);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.mAnimator = ofInt;
        ofInt.addListener(animatorListener);
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.setInterpolator(fastOutLinearInInterpolator);
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowBackground});
        this.mThemeDrawableResourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        createFragment(activity);
    }

    static Drawable createEmptyDrawable(Context context) {
        return new EmptyDrawable(context.getResources());
    }

    private void createFragment(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = FRAGMENT_TAG;
        BackgroundFragment backgroundFragment = (BackgroundFragment) fragmentManager.findFragmentByTag(str);
        if (backgroundFragment == null) {
            backgroundFragment = new BackgroundFragment();
            activity.getFragmentManager().beginTransaction().add(backgroundFragment, str).commit();
        } else if (backgroundFragment.getBackgroundManager() != null) {
            throw new IllegalStateException("Created duplicated BackgroundManager for same activity, please use getInstance() instead");
        }
        backgroundFragment.setBackgroundManager(this);
        this.mFragmentState = backgroundFragment;
    }

    public static BackgroundManager getInstance(Activity activity) {
        BackgroundManager backgroundManager;
        BackgroundFragment backgroundFragment = (BackgroundFragment) activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if (backgroundFragment != null && (backgroundManager = backgroundFragment.getBackgroundManager()) != null) {
            return backgroundManager;
        }
        return new BackgroundManager(activity);
    }

    private long getRunnableDelay() {
        return Math.max(0L, (this.mLastSetTime + 500) - System.currentTimeMillis());
    }

    private Drawable getThemeDrawable() {
        Drawable drawable;
        int i8 = this.mThemeDrawableResourceId;
        if (i8 != -1) {
            drawable = this.mService.getThemeDrawable(this.mContext, i8);
        } else {
            drawable = null;
        }
        if (drawable == null) {
            return createEmptyDrawable(this.mContext);
        }
        return drawable;
    }

    private void lazyInit() {
        if (this.mLayerDrawable != null) {
            return;
        }
        TranslucentLayerDrawable createTranslucentLayerDrawable = createTranslucentLayerDrawable((LayerDrawable) ContextCompat.getDrawable(this.mContext, R.drawable.lb_background).mutate());
        this.mLayerDrawable = createTranslucentLayerDrawable;
        this.mImageInWrapperIndex = createTranslucentLayerDrawable.findWrapperIndexById(R.id.background_imagein);
        this.mImageOutWrapperIndex = this.mLayerDrawable.findWrapperIndexById(R.id.background_imageout);
        BackgroundHelper.setBackgroundPreservingAlpha(this.mBgView, this.mLayerDrawable);
    }

    private void setDrawableInternal(Drawable drawable) {
        if (this.mAttached) {
            ChangeBackgroundRunnable changeBackgroundRunnable = this.mChangeRunnable;
            if (changeBackgroundRunnable != null) {
                if (sameDrawable(drawable, changeBackgroundRunnable.mDrawable)) {
                    return;
                }
                this.mHandler.removeCallbacks(this.mChangeRunnable);
                this.mChangeRunnable = null;
            }
            this.mChangeRunnable = new ChangeBackgroundRunnable(drawable);
            this.mChangeRunnablePending = true;
            postChangeRunnable();
            return;
        }
        throw new IllegalStateException("Must attach before setting background drawable");
    }

    private void syncWithService() {
        Drawable mutate;
        int color = this.mService.getColor();
        Drawable drawable = this.mService.getDrawable();
        this.mBackgroundColor = color;
        if (drawable == null) {
            mutate = null;
        } else {
            mutate = drawable.getConstantState().newDrawable().mutate();
        }
        this.mBackgroundDrawable = mutate;
        updateImmediate();
    }

    private void updateImmediate() {
        if (!this.mAttached) {
            return;
        }
        lazyInit();
        Drawable drawable = this.mBackgroundDrawable;
        if (drawable == null) {
            this.mLayerDrawable.updateDrawable(R.id.background_imagein, getDefaultDrawable());
        } else {
            this.mLayerDrawable.updateDrawable(R.id.background_imagein, drawable);
        }
        this.mLayerDrawable.clearDrawable(R.id.background_imageout, this.mContext);
    }

    public void attach(Window window) {
        attachToViewInternal(window.getDecorView());
    }

    public void attachToView(View view) {
        ColorDrawable colorDrawable;
        attachToViewInternal(view);
        View decorView = this.mContext.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 26) {
            colorDrawable = null;
        } else {
            colorDrawable = new ColorDrawable(0);
        }
        decorView.setBackground(colorDrawable);
    }

    void attachToViewInternal(View view) {
        if (!this.mAttached) {
            this.mBgView = view;
            this.mAttached = true;
            syncWithService();
        } else {
            throw new IllegalStateException("Already attached to " + this.mBgView);
        }
    }

    public void clearDrawable() {
        setDrawable(null);
    }

    TranslucentLayerDrawable createTranslucentLayerDrawable(LayerDrawable layerDrawable) {
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i8 = 0; i8 < numberOfLayers; i8++) {
            drawableArr[i8] = layerDrawable.getDrawable(i8);
        }
        TranslucentLayerDrawable translucentLayerDrawable = new TranslucentLayerDrawable(this, drawableArr);
        for (int i9 = 0; i9 < numberOfLayers; i9++) {
            translucentLayerDrawable.setId(i9, layerDrawable.getId(i9));
        }
        return translucentLayerDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void detach() {
        release();
        this.mBgView = null;
        this.mAttached = false;
        BackgroundContinuityService backgroundContinuityService = this.mService;
        if (backgroundContinuityService != null) {
            backgroundContinuityService.unref();
            this.mService = null;
        }
    }

    @ColorInt
    public final int getColor() {
        return this.mBackgroundColor;
    }

    @Deprecated
    public Drawable getDefaultDimLayer() {
        return ContextCompat.getDrawable(this.mContext, R.color.lb_background_protection);
    }

    Drawable getDefaultDrawable() {
        if (this.mBackgroundColor != 0) {
            return new ColorDrawable(this.mBackgroundColor);
        }
        return getThemeDrawable();
    }

    @Deprecated
    public Drawable getDimLayer() {
        return null;
    }

    public Drawable getDrawable() {
        return this.mBackgroundDrawable;
    }

    DrawableWrapper getImageInWrapper() {
        TranslucentLayerDrawable translucentLayerDrawable = this.mLayerDrawable;
        if (translucentLayerDrawable == null) {
            return null;
        }
        return translucentLayerDrawable.mWrapper[this.mImageInWrapperIndex];
    }

    DrawableWrapper getImageOutWrapper() {
        TranslucentLayerDrawable translucentLayerDrawable = this.mLayerDrawable;
        if (translucentLayerDrawable == null) {
            return null;
        }
        return translucentLayerDrawable.mWrapper[this.mImageOutWrapperIndex];
    }

    public boolean isAttached() {
        return this.mAttached;
    }

    public boolean isAutoReleaseOnStop() {
        return this.mAutoReleaseOnStop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onActivityStart() {
        updateImmediate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onResume() {
        postChangeRunnable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onStop() {
        if (isAutoReleaseOnStop()) {
            release();
        }
    }

    void postChangeRunnable() {
        if (this.mChangeRunnable != null && this.mChangeRunnablePending && !this.mAnimator.isStarted() && this.mFragmentState.isResumed() && this.mLayerDrawable.getAlpha() >= 255) {
            long runnableDelay = getRunnableDelay();
            this.mLastSetTime = System.currentTimeMillis();
            this.mHandler.postDelayed(this.mChangeRunnable, runnableDelay);
            this.mChangeRunnablePending = false;
        }
    }

    public void release() {
        ChangeBackgroundRunnable changeBackgroundRunnable = this.mChangeRunnable;
        if (changeBackgroundRunnable != null) {
            this.mHandler.removeCallbacks(changeBackgroundRunnable);
            this.mChangeRunnable = null;
        }
        if (this.mAnimator.isStarted()) {
            this.mAnimator.cancel();
        }
        TranslucentLayerDrawable translucentLayerDrawable = this.mLayerDrawable;
        if (translucentLayerDrawable != null) {
            translucentLayerDrawable.clearDrawable(R.id.background_imagein, this.mContext);
            this.mLayerDrawable.clearDrawable(R.id.background_imageout, this.mContext);
            this.mLayerDrawable = null;
        }
        this.mBackgroundDrawable = null;
    }

    boolean sameDrawable(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable2 != null) {
            if (drawable == drawable2) {
                return true;
            }
            if ((drawable instanceof BitmapDrawable) && (drawable2 instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap().sameAs(((BitmapDrawable) drawable2).getBitmap())) {
                return true;
            }
            if ((drawable instanceof ColorDrawable) && (drawable2 instanceof ColorDrawable) && ((ColorDrawable) drawable).getColor() == ((ColorDrawable) drawable2).getColor()) {
                return true;
            }
        }
        return false;
    }

    public void setAutoReleaseOnStop(boolean z8) {
        this.mAutoReleaseOnStop = z8;
    }

    public void setBitmap(Bitmap bitmap) {
        float f8;
        Matrix matrix = null;
        if (bitmap == null) {
            setDrawable(null);
            return;
        }
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            if (bitmap.getWidth() != this.mWidthPx || bitmap.getHeight() != this.mHeightPx) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i8 = this.mHeightPx;
                int i9 = width * i8;
                int i10 = this.mWidthPx;
                if (i9 > i10 * height) {
                    f8 = i8 / height;
                } else {
                    f8 = i10 / width;
                }
                int max = Math.max(0, (width - Math.min((int) (i10 / f8), width)) / 2);
                Matrix matrix2 = new Matrix();
                matrix2.setScale(f8, f8);
                matrix2.preTranslate(-max, 0.0f);
                matrix = matrix2;
            }
            setDrawable(new BitmapDrawable(this.mContext.getResources(), bitmap, matrix));
        }
    }

    public void setColor(@ColorInt int i8) {
        this.mService.setColor(i8);
        this.mBackgroundColor = i8;
        this.mBackgroundDrawable = null;
        if (this.mLayerDrawable == null) {
            return;
        }
        setDrawableInternal(getDefaultDrawable());
    }

    @Deprecated
    public void setDimLayer(Drawable drawable) {
    }

    public void setDrawable(Drawable drawable) {
        this.mService.setDrawable(drawable);
        this.mBackgroundDrawable = drawable;
        if (this.mLayerDrawable == null) {
            return;
        }
        if (drawable == null) {
            setDrawableInternal(getDefaultDrawable());
        } else {
            setDrawableInternal(drawable);
        }
    }

    public void setThemeDrawableResourceId(int i8) {
        this.mThemeDrawableResourceId = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class DrawableWrapper {
        int mAlpha;
        final Drawable mDrawable;

        public DrawableWrapper(Drawable drawable) {
            this.mAlpha = 255;
            this.mDrawable = drawable;
        }

        public Drawable getDrawable() {
            return this.mDrawable;
        }

        public void setColor(int i8) {
            ((ColorDrawable) this.mDrawable).setColor(i8);
        }

        public DrawableWrapper(DrawableWrapper drawableWrapper, Drawable drawable) {
            this.mAlpha = 255;
            this.mDrawable = drawable;
            this.mAlpha = drawableWrapper.mAlpha;
        }
    }
}
