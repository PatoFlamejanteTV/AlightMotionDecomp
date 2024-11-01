package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private Runnable mRunnable;
    final View mTarget;
    final ClampedScroller mScroller = new ClampedScroller();
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ClampedScroller {
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;
        private long mStartTime = Long.MIN_VALUE;
        private long mStopTime = -1;
        private long mDeltaTime = 0;
        private int mDeltaX = 0;
        private int mDeltaY = 0;

        ClampedScroller() {
        }

        private float getValueAt(long j8) {
            long j9 = this.mStartTime;
            if (j8 < j9) {
                return 0.0f;
            }
            long j10 = this.mStopTime;
            if (j10 >= 0 && j8 >= j10) {
                float f8 = this.mStopValue;
                return (1.0f - f8) + (f8 * AutoScrollHelper.constrain(((float) (j8 - j10)) / this.mEffectiveRampDown, 0.0f, 1.0f));
            }
            return AutoScrollHelper.constrain(((float) (j8 - j9)) / this.mRampUpDuration, 0.0f, 1.0f) * 0.5f;
        }

        private float interpolateValue(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public void computeScrollDelta() {
            if (this.mDeltaTime != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float interpolateValue = interpolateValue(getValueAt(currentAnimationTimeMillis));
                long j8 = currentAnimationTimeMillis - this.mDeltaTime;
                this.mDeltaTime = currentAnimationTimeMillis;
                float f8 = ((float) j8) * interpolateValue;
                this.mDeltaX = (int) (this.mTargetVelocityX * f8);
                this.mDeltaY = (int) (f8 * this.mTargetVelocityY);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }

        public int getHorizontalDirection() {
            float f8 = this.mTargetVelocityX;
            return (int) (f8 / Math.abs(f8));
        }

        public int getVerticalDirection() {
            float f8 = this.mTargetVelocityY;
            return (int) (f8 / Math.abs(f8));
        }

        public boolean isFinished() {
            if (this.mStopTime > 0 && AnimationUtils.currentAnimationTimeMillis() > this.mStopTime + this.mEffectiveRampDown) {
                return true;
            }
            return false;
        }

        public void requestStop() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentAnimationTimeMillis);
            this.mStopTime = currentAnimationTimeMillis;
        }

        public void setRampDownDuration(int i8) {
            this.mRampDownDuration = i8;
        }

        public void setRampUpDuration(int i8) {
            this.mRampUpDuration = i8;
        }

        public void setTargetVelocity(float f8, float f9) {
            this.mTargetVelocityX = f8;
            this.mTargetVelocityY = f9;
        }

        public void start() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = currentAnimationTimeMillis;
            this.mStopTime = -1L;
            this.mDeltaTime = currentAnimationTimeMillis;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ScrollAnimationRunnable implements Runnable {
        ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (!autoScrollHelper.mAnimating) {
                return;
            }
            if (autoScrollHelper.mNeedsReset) {
                autoScrollHelper.mNeedsReset = false;
                autoScrollHelper.mScroller.start();
            }
            ClampedScroller clampedScroller = AutoScrollHelper.this.mScroller;
            if (!clampedScroller.isFinished() && AutoScrollHelper.this.shouldAnimate()) {
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.mNeedsCancel) {
                    autoScrollHelper2.mNeedsCancel = false;
                    autoScrollHelper2.cancelTargetTouch();
                }
                clampedScroller.computeScrollDelta();
                AutoScrollHelper.this.scrollTargetBy(clampedScroller.getDeltaX(), clampedScroller.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
                return;
            }
            AutoScrollHelper.this.mAnimating = false;
        }
    }

    public AutoScrollHelper(@NonNull View view) {
        this.mTarget = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        setMaximumVelocity(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        setMinimumVelocity(f10, f10);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    private float computeTargetVelocity(int i8, float f8, float f9, float f10) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i8], f9, this.mMaximumEdges[i8], f8);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f11 = this.mRelativeVelocity[i8];
        float f12 = this.mMinimumVelocity[i8];
        float f13 = this.mMaximumVelocity[i8];
        float f14 = f11 * f10;
        if (edgeValue > 0.0f) {
            return constrain(edgeValue * f14, f12, f13);
        }
        return -constrain((-edgeValue) * f14, f12, f13);
    }

    static float constrain(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    private float constrainEdgeValue(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.mEdgeType;
        if (i8 != 0 && i8 != 1) {
            if (i8 == 2 && f8 < 0.0f) {
                return f8 / (-f9);
            }
        } else if (f8 < f9) {
            if (f8 >= 0.0f) {
                return 1.0f - (f8 / f9);
            }
            if (this.mAnimating && i8 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private float getEdgeValue(float f8, float f9, float f10, float f11) {
        float interpolation;
        float constrain = constrain(f8 * f9, 0.0f, f10);
        float constrainEdgeValue = constrainEdgeValue(f9 - f11, constrain) - constrainEdgeValue(f11, constrain);
        if (constrainEdgeValue < 0.0f) {
            interpolation = -this.mEdgeInterpolator.getInterpolation(-constrainEdgeValue);
        } else {
            if (constrainEdgeValue <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.mEdgeInterpolator.getInterpolation(constrainEdgeValue);
        }
        return constrain(interpolation, -1.0f, 1.0f);
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
        } else {
            this.mScroller.requestStop();
        }
    }

    private void startAnimating() {
        int i8;
        if (this.mRunnable == null) {
            this.mRunnable = new ScrollAnimationRunnable();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (!this.mAlreadyDelayed && (i8 = this.mActivationDelay) > 0) {
            ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, i8);
        } else {
            this.mRunnable.run();
        }
        this.mAlreadyDelayed = true;
    }

    public abstract boolean canTargetScrollHorizontally(int i8);

    public abstract boolean canTargetScrollVertically(int i8);

    void cancelTargetTouch() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isExclusive() {
        return this.mExclusive;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 3) goto L20;     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.mEnabled
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.requestStop()
            goto L58
        L1a:
            r5.mNeedsCancel = r2
            r5.mAlreadyDelayed = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.mTarget
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.computeTargetVelocity(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.mTarget
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.computeTargetVelocity(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r7 = r5.mScroller
            r7.setTargetVelocity(r0, r6)
            boolean r6 = r5.mAnimating
            if (r6 != 0) goto L58
            boolean r6 = r5.shouldAnimate()
            if (r6 == 0) goto L58
            r5.startAnimating()
        L58:
            boolean r6 = r5.mExclusive
            if (r6 == 0) goto L61
            boolean r6 = r5.mAnimating
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i8, int i9);

    @NonNull
    public AutoScrollHelper setActivationDelay(int i8) {
        this.mActivationDelay = i8;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i8) {
        this.mEdgeType = i8;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z8) {
        if (this.mEnabled && !z8) {
            requestStop();
        }
        this.mEnabled = z8;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z8) {
        this.mExclusive = z8;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f8, float f9) {
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f8, float f9) {
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f8, float f9) {
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i8) {
        this.mScroller.setRampDownDuration(i8);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i8) {
        this.mScroller.setRampUpDuration(i8);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f8, float f9) {
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f8, float f9) {
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    boolean shouldAnimate() {
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        if ((verticalDirection != 0 && canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection))) {
            return true;
        }
        return false;
    }

    static int constrain(int i8, int i9, int i10) {
        return i8 > i10 ? i10 : i8 < i9 ? i9 : i8;
    }
}
