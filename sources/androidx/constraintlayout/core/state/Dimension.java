package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Dimension {
    private final int WRAP_CONTENT;
    Object mInitialValue;
    boolean mIsSuggested;
    int mMax;
    int mMin;
    float mPercent;
    String mRatioString;
    int mValue;
    public static final Object FIXED_DIMENSION = new Object();
    public static final Object WRAP_DIMENSION = new Object();
    public static final Object SPREAD_DIMENSION = new Object();
    public static final Object PARENT_DIMENSION = new Object();
    public static final Object PERCENT_DIMENSION = new Object();
    public static final Object RATIO_DIMENSION = new Object();

    /* loaded from: classes.dex */
    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private Dimension() {
        this.WRAP_CONTENT = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mInitialValue = WRAP_DIMENSION;
        this.mIsSuggested = false;
    }

    public static Dimension Fixed(int i8) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(i8);
        return dimension;
    }

    public static Dimension Parent() {
        return new Dimension(PARENT_DIMENSION);
    }

    public static Dimension Percent(Object obj, float f8) {
        Dimension dimension = new Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f8);
        return dimension;
    }

    public static Dimension Ratio(String str) {
        Dimension dimension = new Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public static Dimension Spread() {
        return new Dimension(SPREAD_DIMENSION);
    }

    public static Dimension Suggested(int i8) {
        Dimension dimension = new Dimension();
        dimension.suggested(i8);
        return dimension;
    }

    public static Dimension Wrap() {
        return new Dimension(WRAP_DIMENSION);
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i8) {
        String str = this.mRatioString;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        int i9 = 2;
        if (i8 == 0) {
            if (this.mIsSuggested) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.mInitialValue;
                if (obj == WRAP_DIMENSION) {
                    i9 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i9 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i9, this.mMin, this.mMax, this.mPercent);
                return;
            }
            int i10 = this.mMin;
            if (i10 > 0) {
                constraintWidget.setMinWidth(i10);
            }
            int i11 = this.mMax;
            if (i11 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i11);
            }
            Object obj2 = this.mInitialValue;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.setWidth(this.mValue);
                    return;
                }
                return;
            }
        }
        if (this.mIsSuggested) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.mInitialValue;
            if (obj3 == WRAP_DIMENSION) {
                i9 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i9 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i9, this.mMin, this.mMax, this.mPercent);
            return;
        }
        int i12 = this.mMin;
        if (i12 > 0) {
            constraintWidget.setMinHeight(i12);
        }
        int i13 = this.mMax;
        if (i13 < Integer.MAX_VALUE) {
            constraintWidget.setMaxHeight(i13);
        }
        Object obj4 = this.mInitialValue;
        if (obj4 == WRAP_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == PARENT_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(this.mValue);
        }
    }

    public boolean equalsFixedValue(int i8) {
        if (this.mInitialValue == null && this.mValue == i8) {
            return true;
        }
        return false;
    }

    public Dimension fixed(Object obj) {
        this.mInitialValue = obj;
        if (obj instanceof Integer) {
            this.mValue = ((Integer) obj).intValue();
            this.mInitialValue = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getValue() {
        return this.mValue;
    }

    public Dimension max(int i8) {
        if (this.mMax >= 0) {
            this.mMax = i8;
        }
        return this;
    }

    public Dimension min(int i8) {
        if (i8 >= 0) {
            this.mMin = i8;
        }
        return this;
    }

    public Dimension percent(Object obj, float f8) {
        this.mPercent = f8;
        return this;
    }

    public Dimension ratio(String str) {
        this.mRatioString = str;
        return this;
    }

    void setValue(int i8) {
        this.mIsSuggested = false;
        this.mInitialValue = null;
        this.mValue = i8;
    }

    public Dimension suggested(int i8) {
        this.mIsSuggested = true;
        if (i8 >= 0) {
            this.mMax = i8;
        }
        return this;
    }

    public Dimension min(Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.mMin = -2;
        }
        return this;
    }

    public static Dimension Fixed(Object obj) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static Dimension Suggested(Object obj) {
        Dimension dimension = new Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public Dimension max(Object obj) {
        Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.mIsSuggested) {
            this.mInitialValue = obj2;
            this.mMax = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension suggested(Object obj) {
        this.mInitialValue = obj;
        this.mIsSuggested = true;
        return this;
    }

    public Dimension fixed(int i8) {
        this.mInitialValue = null;
        this.mValue = i8;
        return this;
    }

    private Dimension(Object obj) {
        this.WRAP_CONTENT = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mIsSuggested = false;
        this.mInitialValue = obj;
    }
}
