package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f8) {
        this.mDone = false;
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            float f10 = this.mStage1Velocity;
            return (f10 * f8) + ((((this.mStage2Velocity - f10) * f8) * f8) / (f9 * 2.0f));
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return this.mStage1EndPosition;
        }
        float f11 = f8 - f9;
        float f12 = this.mStage2Duration;
        if (f11 < f12) {
            float f13 = this.mStage1EndPosition;
            float f14 = this.mStage2Velocity;
            return f13 + (f14 * f11) + ((((this.mStage3Velocity - f14) * f11) * f11) / (f12 * 2.0f));
        }
        if (i8 == 2) {
            return this.mStage2EndPosition;
        }
        float f15 = f11 - f12;
        float f16 = this.mStage3Duration;
        if (f15 <= f16) {
            float f17 = this.mStage2EndPosition;
            float f18 = this.mStage3Velocity;
            return (f17 + (f18 * f15)) - (((f18 * f15) * f15) / (f16 * 2.0f));
        }
        this.mDone = true;
        return this.mStage3EndPosition;
    }

    private void setup(float f8, float f9, float f10, float f11, float f12) {
        this.mDone = false;
        if (f8 == 0.0f) {
            f8 = 1.0E-4f;
        }
        this.mStage1Velocity = f8;
        float f13 = f8 / f10;
        float f14 = (f13 * f8) / 2.0f;
        if (f8 < 0.0f) {
            float sqrt = (float) Math.sqrt((f9 - ((((-f8) / f10) * f8) / 2.0f)) * f10);
            if (sqrt < f11) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f8;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f15 = (sqrt - f8) / f10;
                this.mStage1Duration = f15;
                this.mStage2Duration = sqrt / f10;
                this.mStage1EndPosition = ((f8 + sqrt) * f15) / 2.0f;
                this.mStage2EndPosition = f9;
                this.mStage3EndPosition = f9;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f11;
            this.mStage3Velocity = f11;
            float f16 = (f11 - f8) / f10;
            this.mStage1Duration = f16;
            float f17 = f11 / f10;
            this.mStage3Duration = f17;
            float f18 = ((f8 + f11) * f16) / 2.0f;
            float f19 = (f17 * f11) / 2.0f;
            this.mStage2Duration = ((f9 - f18) - f19) / f11;
            this.mStage1EndPosition = f18;
            this.mStage2EndPosition = f9 - f19;
            this.mStage3EndPosition = f9;
            return;
        }
        if (f14 >= f9) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f9;
            this.mStage1Duration = (2.0f * f9) / f8;
            return;
        }
        float f20 = f9 - f14;
        float f21 = f20 / f8;
        if (f21 + f13 < f12) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f8;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f20;
            this.mStage2EndPosition = f9;
            this.mStage1Duration = f21;
            this.mStage2Duration = f13;
            return;
        }
        float sqrt2 = (float) Math.sqrt((f10 * f9) + ((f8 * f8) / 2.0f));
        float f22 = (sqrt2 - f8) / f10;
        this.mStage1Duration = f22;
        float f23 = sqrt2 / f10;
        this.mStage2Duration = f23;
        if (sqrt2 < f11) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = sqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f22;
            this.mStage2Duration = f23;
            this.mStage1EndPosition = ((f8 + sqrt2) * f22) / 2.0f;
            this.mStage2EndPosition = f9;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f8;
        this.mStage2Velocity = f11;
        this.mStage3Velocity = f11;
        float f24 = (f11 - f8) / f10;
        this.mStage1Duration = f24;
        float f25 = f11 / f10;
        this.mStage3Duration = f25;
        float f26 = ((f8 + f11) * f24) / 2.0f;
        float f27 = (f25 * f11) / 2.0f;
        this.mStage2Duration = ((f9 - f26) - f27) / f11;
        this.mStage1EndPosition = f26;
        this.mStage2EndPosition = f9 - f27;
        this.mStage3EndPosition = f9;
    }

    public void config(float f8, float f9, float f10, float f11, float f12, float f13) {
        boolean z8 = false;
        this.mDone = false;
        this.mStartPosition = f8;
        if (f8 > f9) {
            z8 = true;
        }
        this.mBackwards = z8;
        if (z8) {
            setup(-f10, f8 - f9, f12, f13, f11);
        } else {
            setup(f10, f9 - f8, f12, f13, f11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f8) {
        String str2;
        String str3 = str + " ===== " + this.mType + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(str);
        if (this.mBackwards) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        sb.append(str2);
        sb.append(" time = ");
        sb.append(f8);
        sb.append("  stages ");
        sb.append(this.mNumberOfStages);
        sb.append("\n");
        String str4 = sb.toString() + str + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            str4 = str4 + str + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            str4 = str4 + str + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            return str4 + str + "stage 0\n";
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return str4 + str + "end stage 0\n";
        }
        float f10 = f8 - f9;
        float f11 = this.mStage2Duration;
        if (f10 < f11) {
            return str4 + str + " stage 1\n";
        }
        if (i8 == 2) {
            return str4 + str + "end stage 1\n";
        }
        if (f10 - f11 < this.mStage3Duration) {
            return str4 + str + " stage 2\n";
        }
        return str4 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f8) {
        float calcY = calcY(f8);
        this.mLastPosition = f8;
        if (this.mBackwards) {
            return this.mStartPosition - calcY;
        }
        return this.mStartPosition + calcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f8) {
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            float f10 = this.mStage1Velocity;
            return f10 + (((this.mStage2Velocity - f10) * f8) / f9);
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return 0.0f;
        }
        float f11 = f8 - f9;
        float f12 = this.mStage2Duration;
        if (f11 < f12) {
            float f13 = this.mStage2Velocity;
            return f13 + (((this.mStage3Velocity - f13) * f11) / f12);
        }
        if (i8 == 2) {
            return this.mStage2EndPosition;
        }
        float f14 = f11 - f12;
        float f15 = this.mStage3Duration;
        if (f14 < f15) {
            float f16 = this.mStage3Velocity;
            return f16 - ((f14 * f16) / f15);
        }
        return this.mStage3EndPosition;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        if (getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }
}
