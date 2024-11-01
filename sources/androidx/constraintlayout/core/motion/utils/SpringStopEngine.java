package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d8) {
        double d9 = this.mStiffness;
        double d10 = this.mDamping;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d9 / this.mMass) * d8) * 4.0d)) + 1.0d);
        double d11 = d8 / sqrt;
        int i8 = 0;
        while (i8 < sqrt) {
            float f8 = this.mPos;
            double d12 = this.mTargetPos;
            float f9 = this.mV;
            double d13 = d9;
            double d14 = ((-d9) * (f8 - d12)) - (f9 * d10);
            float f10 = this.mMass;
            double d15 = d10;
            double d16 = f9 + (((d14 / f10) * d11) / 2.0d);
            double d17 = ((((-((f8 + ((d11 * d16) / 2.0d)) - d12)) * d13) - (d16 * d15)) / f10) * d11;
            float f11 = (float) (f9 + d17);
            this.mV = f11;
            float f12 = (float) (f8 + ((f9 + (d17 / 2.0d)) * d11));
            this.mPos = f12;
            int i9 = this.mBoundaryMode;
            if (i9 > 0) {
                if (f12 < 0.0f && (i9 & 1) == 1) {
                    this.mPos = -f12;
                    this.mV = -f11;
                }
                float f13 = this.mPos;
                if (f13 > 1.0f && (i9 & 2) == 2) {
                    this.mPos = 2.0f - f13;
                    this.mV = -this.mV;
                }
            }
            i8++;
            d9 = d13;
            d10 = d15;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f8) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f8) {
        compute(f8 - this.mLastTime);
        this.mLastTime = f8;
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d8 = this.mPos - this.mTargetPos;
        double d9 = this.mStiffness;
        double d10 = this.mV;
        if (Math.sqrt((((d10 * d10) * this.mMass) + ((d9 * d8) * d8)) / d9) <= this.mStopThreshold) {
            return true;
        }
        return false;
    }

    void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i8) {
        this.mTargetPos = f9;
        this.mDamping = f13;
        this.mInitialized = false;
        this.mPos = f8;
        this.mLastVelocity = f10;
        this.mStiffness = f12;
        this.mMass = f11;
        this.mStopThreshold = f14;
        this.mBoundaryMode = i8;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f8) {
        return this.mV;
    }
}
