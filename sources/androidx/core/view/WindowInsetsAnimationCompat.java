package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.google.android.material.color.utilities.Contrast;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class WindowInsetsAnimationCompat {
    private static final boolean DEBUG = false;
    private static final String TAG = "WindowInsetsAnimCompat";
    private Impl mImpl;

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface DispatchMode {
        }

        public Callback(int i8) {
            this.mDispatchMode = i8;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Impl {
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;

        @Nullable
        private final Interpolator mInterpolator;
        private final int mTypeMask;

        Impl(int i8, @Nullable Interpolator interpolator, long j8) {
            this.mTypeMask = i8;
            this.mInterpolator = interpolator;
            this.mDurationMillis = j8;
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public long getDurationMillis() {
            return this.mDurationMillis;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public float getInterpolatedFraction() {
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.mFraction);
            }
            return this.mFraction;
        }

        @Nullable
        public Interpolator getInterpolator() {
            return this.mInterpolator;
        }

        public int getTypeMask() {
            return this.mTypeMask;
        }

        public void setAlpha(float f8) {
            this.mAlpha = f8;
        }

        public void setFraction(float f8) {
            this.mFraction = f8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Impl21 extends Impl {
        private static final Interpolator SHOW_IME_INTERPOLATOR = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator HIDE_IME_INTERPOLATOR = new FastOutLinearInInterpolator();
        private static final Interpolator DEFAULT_INSET_INTERPOLATOR = new DecelerateInterpolator();

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresApi(21)
        /* loaded from: classes3.dex */
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            private static final int COMPAT_ANIMATION_DURATION = 160;
            final Callback mCallback;
            private WindowInsetsCompat mLastInsets;

            Impl21OnApplyWindowInsetsListener(@NonNull View view, @NonNull Callback callback) {
                WindowInsetsCompat windowInsetsCompat;
                this.mCallback = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                if (rootWindowInsets != null) {
                    windowInsetsCompat = new WindowInsetsCompat.Builder(rootWindowInsets).build();
                } else {
                    windowInsetsCompat = null;
                }
                this.mLastInsets = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.mLastInsets == null) {
                    this.mLastInsets = ViewCompat.getRootWindowInsets(view);
                }
                if (this.mLastInsets == null) {
                    this.mLastInsets = windowInsetsCompat;
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                Callback callback = Impl21.getCallback(view);
                if (callback != null && Objects.equals(callback.mDispachedInsets, windowInsets)) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final int buildAnimationMask = Impl21.buildAnimationMask(windowInsetsCompat, this.mLastInsets);
                if (buildAnimationMask == 0) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.mLastInsets;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(buildAnimationMask, Impl21.createInsetInterpolator(buildAnimationMask, windowInsetsCompat, windowInsetsCompat2), 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                final BoundsCompat computeAnimationBounds = Impl21.computeAnimationBounds(windowInsetsCompat, windowInsetsCompat2, buildAnimationMask);
                Impl21.dispatchOnPrepare(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                        Impl21.dispatchOnProgress(view, Impl21.interpolateInsets(windowInsetsCompat, windowInsetsCompat2, windowInsetsAnimationCompat.getInterpolatedFraction(), buildAnimationMask), Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        windowInsetsAnimationCompat.setFraction(1.0f);
                        Impl21.dispatchOnEnd(view, windowInsetsAnimationCompat);
                    }
                });
                OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Impl21.dispatchOnStart(view, windowInsetsAnimationCompat, computeAnimationBounds);
                        duration.start();
                    }
                });
                this.mLastInsets = windowInsetsCompat;
                return Impl21.forwardToViewIfNeeded(view, windowInsets);
            }
        }

        Impl21(int i8, @Nullable Interpolator interpolator, long j8) {
            super(i8, interpolator, j8);
        }

        @SuppressLint({"WrongConstant"})
        static int buildAnimationMask(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsetsCompat windowInsetsCompat2) {
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if (!windowInsetsCompat.getInsets(i9).equals(windowInsetsCompat2.getInsets(i9))) {
                    i8 |= i9;
                }
            }
            return i8;
        }

        @NonNull
        static BoundsCompat computeAnimationBounds(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsetsCompat windowInsetsCompat2, int i8) {
            Insets insets = windowInsetsCompat.getInsets(i8);
            Insets insets2 = windowInsetsCompat2.getInsets(i8);
            return new BoundsCompat(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        static Interpolator createInsetInterpolator(int i8, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            if ((i8 & 8) != 0) {
                if (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.ime()).bottom) {
                    return SHOW_IME_INTERPOLATOR;
                }
                return HIDE_IME_INTERPOLATOR;
            }
            return DEFAULT_INSET_INTERPOLATOR;
        }

        @NonNull
        private static View.OnApplyWindowInsetsListener createProxyListener(@NonNull View view, @NonNull Callback callback) {
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        static void dispatchOnEnd(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onEnd(windowInsetsAnimationCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    dispatchOnEnd(viewGroup.getChildAt(i8), windowInsetsAnimationCompat);
                }
            }
        }

        static void dispatchOnPrepare(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z8) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.mDispachedInsets = windowInsets;
                if (!z8) {
                    callback.onPrepare(windowInsetsAnimationCompat);
                    if (callback.getDispatchMode() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    dispatchOnPrepare(viewGroup.getChildAt(i8), windowInsetsAnimationCompat, windowInsets, z8);
                }
            }
        }

        static void dispatchOnProgress(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            Callback callback = getCallback(view);
            if (callback != null) {
                windowInsetsCompat = callback.onProgress(windowInsetsCompat, list);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    dispatchOnProgress(viewGroup.getChildAt(i8), windowInsetsCompat, list);
                }
            }
        }

        static void dispatchOnStart(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    dispatchOnStart(viewGroup.getChildAt(i8), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        @NonNull
        static WindowInsets forwardToViewIfNeeded(@NonNull View view, @NonNull WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        static Callback getCallback(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).mCallback;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static WindowInsetsCompat interpolateInsets(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f8, int i8) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) == 0) {
                    builder.setInsets(i9, windowInsetsCompat.getInsets(i9));
                } else {
                    Insets insets = windowInsetsCompat.getInsets(i9);
                    Insets insets2 = windowInsetsCompat2.getInsets(i9);
                    float f9 = 1.0f - f8;
                    builder.setInsets(i9, WindowInsetsCompat.insetInsets(insets, (int) (((insets.left - insets2.left) * f9) + 0.5d), (int) (((insets.top - insets2.top) * f9) + 0.5d), (int) (((insets.right - insets2.right) * f9) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f9) + 0.5d)));
                }
            }
            return builder.build();
        }

        static void setCallback(@NonNull View view, @Nullable Callback callback) {
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener createProxyListener = createProxyListener(view, callback);
            view.setTag(R.id.tag_window_insets_animation_callback, createProxyListener);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(createProxyListener);
            }
        }
    }

    public WindowInsetsAnimationCompat(int i8, @Nullable Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(i8, interpolator, j8);
        } else {
            this.mImpl = new Impl21(i8, interpolator, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setCallback(@NonNull View view, @Nullable Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.setCallback(view, callback);
        } else {
            Impl21.setCallback(view, callback);
        }
    }

    @RequiresApi(30)
    static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getAlpha() {
        return this.mImpl.getAlpha();
    }

    public long getDurationMillis() {
        return this.mImpl.getDurationMillis();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getFraction() {
        return this.mImpl.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.mImpl.getInterpolatedFraction();
    }

    @Nullable
    public Interpolator getInterpolator() {
        return this.mImpl.getInterpolator();
    }

    public int getTypeMask() {
        return this.mImpl.getTypeMask();
    }

    public void setAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.mImpl.setAlpha(f8);
    }

    public void setFraction(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.mImpl.setFraction(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static class Impl30 extends Impl {

        @NonNull
        private final WindowInsetsAnimation mWrapped;

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresApi(30)
        /* loaded from: classes3.dex */
        public static class ProxyCallback extends WindowInsetsAnimation.Callback {
            private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations;
            private final Callback mCompat;
            private List<WindowInsetsAnimationCompat> mRORunningAnimations;
            private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;

            ProxyCallback(@NonNull Callback callback) {
                super(callback.getDispatchMode());
                this.mAnimations = new HashMap<>();
                this.mCompat = callback;
            }

            @NonNull
            private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.mAnimations.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(windowInsetsAnimation);
                    this.mAnimations.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                    return windowInsetsAnimationCompat2;
                }
                return windowInsetsAnimationCompat;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.mAnimations.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.mTmpRunningAnimations;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.mTmpRunningAnimations = arrayList2;
                    this.mRORunningAnimations = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a9 = Z.a(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(a9);
                    fraction = a9.getFraction();
                    windowInsetsAnimationCompat.setFraction(fraction);
                    this.mTmpRunningAnimations.add(windowInsetsAnimationCompat);
                }
                return this.mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.mRORunningAnimations).toWindowInsets();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.mCompat.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }
        }

        Impl30(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.mWrapped = windowInsetsAnimation;
        }

        @NonNull
        public static WindowInsetsAnimation.Bounds createPlatformBounds(@NonNull BoundsCompat boundsCompat) {
            O.a();
            return N.a(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        @NonNull
        public static Insets getHigherBounds(@NonNull WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets upperBound;
            upperBound = bounds.getUpperBound();
            return Insets.toCompatInsets(upperBound);
        }

        @NonNull
        public static Insets getLowerBounds(@NonNull WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return Insets.toCompatInsets(lowerBound);
        }

        public static void setCallback(@NonNull View view, @Nullable Callback callback) {
            ProxyCallback proxyCallback;
            if (callback != null) {
                proxyCallback = new ProxyCallback(callback);
            } else {
                proxyCallback = null;
            }
            view.setWindowInsetsAnimationCallback(proxyCallback);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
            long durationMillis;
            durationMillis = this.mWrapped.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
            float fraction;
            fraction = this.mWrapped.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
            float interpolatedFraction;
            interpolatedFraction = this.mWrapped.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        @Nullable
        public Interpolator getInterpolator() {
            Interpolator interpolator;
            interpolator = this.mWrapped.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
            int typeMask;
            typeMask = this.mWrapped.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float f8) {
            this.mWrapped.setFraction(f8);
        }

        Impl30(int i8, Interpolator interpolator, long j8) {
            this(Y.a(i8, interpolator, j8));
        }
    }

    /* loaded from: classes3.dex */
    public static final class BoundsCompat {
        private final Insets mLowerBound;
        private final Insets mUpperBound;

        public BoundsCompat(@NonNull Insets insets, @NonNull Insets insets2) {
            this.mLowerBound = insets;
            this.mUpperBound = insets2;
        }

        @NonNull
        @RequiresApi(30)
        public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        @NonNull
        public Insets getLowerBound() {
            return this.mLowerBound;
        }

        @NonNull
        public Insets getUpperBound() {
            return this.mUpperBound;
        }

        @NonNull
        public BoundsCompat inset(@NonNull Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.insetInsets(this.mLowerBound, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.insetInsets(this.mUpperBound, insets.left, insets.top, insets.right, insets.bottom));
        }

        @NonNull
        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds toBounds() {
            return Impl30.createPlatformBounds(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.mLowerBound + " upper=" + this.mUpperBound + "}";
        }

        @RequiresApi(30)
        private BoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.mLowerBound = Impl30.getLowerBounds(bounds);
            this.mUpperBound = Impl30.getHigherBounds(bounds);
        }
    }

    @RequiresApi(30)
    private WindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(windowInsetsAnimation);
        }
    }
}