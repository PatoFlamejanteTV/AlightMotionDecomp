package androidx.leanback.graphics;

import android.graphics.Rect;

/* loaded from: classes3.dex */
public class BoundsRule {
    public ValueRule bottom;
    public ValueRule left;
    public ValueRule right;
    public ValueRule top;

    public BoundsRule() {
    }

    private int doCalculate(int i8, ValueRule valueRule, int i9) {
        return i8 + valueRule.mAbsoluteValue + ((int) (valueRule.mFraction * i9));
    }

    public void calculateBounds(Rect rect, Rect rect2) {
        ValueRule valueRule = this.left;
        if (valueRule == null) {
            rect2.left = rect.left;
        } else {
            rect2.left = doCalculate(rect.left, valueRule, rect.width());
        }
        ValueRule valueRule2 = this.right;
        if (valueRule2 == null) {
            rect2.right = rect.right;
        } else {
            rect2.right = doCalculate(rect.left, valueRule2, rect.width());
        }
        ValueRule valueRule3 = this.top;
        if (valueRule3 == null) {
            rect2.top = rect.top;
        } else {
            rect2.top = doCalculate(rect.top, valueRule3, rect.height());
        }
        ValueRule valueRule4 = this.bottom;
        if (valueRule4 == null) {
            rect2.bottom = rect.bottom;
        } else {
            rect2.bottom = doCalculate(rect.top, valueRule4, rect.height());
        }
    }

    public BoundsRule(BoundsRule boundsRule) {
        ValueRule valueRule = boundsRule.left;
        this.left = valueRule != null ? new ValueRule(valueRule) : null;
        ValueRule valueRule2 = boundsRule.right;
        this.right = valueRule2 != null ? new ValueRule(valueRule2) : null;
        ValueRule valueRule3 = boundsRule.top;
        this.top = valueRule3 != null ? new ValueRule(valueRule3) : null;
        ValueRule valueRule4 = boundsRule.bottom;
        this.bottom = valueRule4 != null ? new ValueRule(valueRule4) : null;
    }

    /* loaded from: classes3.dex */
    public static final class ValueRule {
        int mAbsoluteValue;
        float mFraction;

        ValueRule(int i8, float f8) {
            this.mAbsoluteValue = i8;
            this.mFraction = f8;
        }

        public static ValueRule absoluteValue(int i8) {
            return new ValueRule(i8, 0.0f);
        }

        public static ValueRule inheritFromParent(float f8) {
            return new ValueRule(0, f8);
        }

        public static ValueRule inheritFromParentWithOffset(float f8, int i8) {
            return new ValueRule(i8, f8);
        }

        public int getAbsoluteValue() {
            return this.mAbsoluteValue;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public void setAbsoluteValue(int i8) {
            this.mAbsoluteValue = i8;
        }

        public void setFraction(float f8) {
            this.mFraction = f8;
        }

        ValueRule(ValueRule valueRule) {
            this.mFraction = valueRule.mFraction;
            this.mAbsoluteValue = valueRule.mAbsoluteValue;
        }
    }
}
