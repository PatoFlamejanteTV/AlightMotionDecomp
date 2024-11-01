package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i8, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i8;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i9;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i8 = this.mCount;
            for (int i9 = 0; i9 < i8 && this.mStartIndex + i9 < Flow.this.mDisplayedWidgetsCount; i9++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i9];
                if (this.mOrientation != 0) {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i10 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i10 = 0;
                    }
                    this.mHeight += widgetHeight + i10;
                    if (this.biggest == null || this.biggestDimension < widgetWidth) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                } else {
                    int width = constraintWidget.getWidth();
                    int i11 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i11 = 0;
                    }
                    this.mWidth += width + i11;
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < widgetHeight2) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetHeight2;
                        this.mHeight = widgetHeight2;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i8 = 0;
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                int i9 = Flow.this.mHorizontalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i8 = i9;
                }
                this.mWidth += widgetWidth + i8;
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                int i10 = Flow.this.mVerticalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i8 = i10;
                }
                this.mHeight += widgetHeight2 + i8;
                if (this.biggest == null || this.biggestDimension < widgetWidth2) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z8, int i8, boolean z9) {
            boolean z10;
            ConstraintWidget constraintWidget;
            int i9;
            float f8;
            float f9;
            int i10;
            int i11;
            int i12 = this.mCount;
            for (int i13 = 0; i13 < i12 && this.mStartIndex + i13 < Flow.this.mDisplayedWidgetsCount; i13++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i13];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i12 != 0 && this.biggest != null) {
                if (z9 && i8 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = -1;
                int i15 = -1;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (z8) {
                        i11 = (i12 - 1) - i16;
                    } else {
                        i11 = i16;
                    }
                    if (this.mStartIndex + i11 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i11];
                    if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                        if (i14 == -1) {
                            i14 = i16;
                        }
                        i15 = i16;
                    }
                }
                ConstraintWidget constraintWidget4 = null;
                if (this.mOrientation == 0) {
                    ConstraintWidget constraintWidget5 = this.biggest;
                    constraintWidget5.setVerticalChainStyle(Flow.this.mVerticalStyle);
                    int i17 = this.mPaddingTop;
                    if (i8 > 0) {
                        i17 += Flow.this.mVerticalGap;
                    }
                    constraintWidget5.mTop.connect(this.mTop, i17);
                    if (z9) {
                        constraintWidget5.mBottom.connect(this.mBottom, this.mPaddingBottom);
                    }
                    if (i8 > 0) {
                        this.mTop.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                    }
                    if (Flow.this.mVerticalAlign == 3 && !constraintWidget5.hasBaseline()) {
                        for (int i18 = 0; i18 < i12; i18++) {
                            if (z8) {
                                i10 = (i12 - 1) - i18;
                            } else {
                                i10 = i18;
                            }
                            if (this.mStartIndex + i10 >= Flow.this.mDisplayedWidgetsCount) {
                                break;
                            }
                            constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                            if (constraintWidget.hasBaseline()) {
                                break;
                            }
                        }
                    }
                    constraintWidget = constraintWidget5;
                    int i19 = 0;
                    while (i19 < i12) {
                        if (z8) {
                            i9 = (i12 - 1) - i19;
                        } else {
                            i9 = i19;
                        }
                        if (this.mStartIndex + i9 < Flow.this.mDisplayedWidgetsCount) {
                            ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i9];
                            if (constraintWidget6 == null) {
                                constraintWidget6 = constraintWidget4;
                            } else {
                                if (i19 == 0) {
                                    constraintWidget6.connect(constraintWidget6.mLeft, this.mLeft, this.mPaddingLeft);
                                }
                                if (i9 == 0) {
                                    int i20 = Flow.this.mHorizontalStyle;
                                    float f10 = Flow.this.mHorizontalBias;
                                    if (z8) {
                                        f10 = 1.0f - f10;
                                    }
                                    if (this.mStartIndex == 0 && Flow.this.mFirstHorizontalStyle != -1) {
                                        i20 = Flow.this.mFirstHorizontalStyle;
                                        if (z8) {
                                            f9 = Flow.this.mFirstHorizontalBias;
                                            f8 = 1.0f - f9;
                                            f10 = f8;
                                        } else {
                                            f8 = Flow.this.mFirstHorizontalBias;
                                            f10 = f8;
                                        }
                                    } else if (z9 && Flow.this.mLastHorizontalStyle != -1) {
                                        i20 = Flow.this.mLastHorizontalStyle;
                                        if (z8) {
                                            f9 = Flow.this.mLastHorizontalBias;
                                            f8 = 1.0f - f9;
                                            f10 = f8;
                                        } else {
                                            f8 = Flow.this.mLastHorizontalBias;
                                            f10 = f8;
                                        }
                                    }
                                    constraintWidget6.setHorizontalChainStyle(i20);
                                    constraintWidget6.setHorizontalBiasPercent(f10);
                                }
                                if (i19 == i12 - 1) {
                                    constraintWidget6.connect(constraintWidget6.mRight, this.mRight, this.mPaddingRight);
                                }
                                if (constraintWidget4 != null) {
                                    constraintWidget6.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                                    if (i19 == i14) {
                                        constraintWidget6.mLeft.setGoneMargin(this.mPaddingLeft);
                                    }
                                    constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                                    if (i19 == i15 + 1) {
                                        constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                                    }
                                }
                                if (constraintWidget6 != constraintWidget5) {
                                    if (Flow.this.mVerticalAlign != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                        int i21 = Flow.this.mVerticalAlign;
                                        if (i21 != 0) {
                                            if (i21 != 1) {
                                                if (z10) {
                                                    constraintWidget6.mTop.connect(this.mTop, this.mPaddingTop);
                                                    constraintWidget6.mBottom.connect(this.mBottom, this.mPaddingBottom);
                                                } else {
                                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                                }
                                            } else {
                                                constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                            }
                                        } else {
                                            constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                        }
                                    } else {
                                        constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                                    }
                                    i19++;
                                    constraintWidget4 = constraintWidget6;
                                }
                            }
                            i19++;
                            constraintWidget4 = constraintWidget6;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ConstraintWidget constraintWidget7 = this.biggest;
                constraintWidget7.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i22 = this.mPaddingLeft;
                if (i8 > 0) {
                    i22 += Flow.this.mHorizontalGap;
                }
                if (z8) {
                    constraintWidget7.mRight.connect(this.mRight, i22);
                    if (z9) {
                        constraintWidget7.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i8 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                    }
                } else {
                    constraintWidget7.mLeft.connect(this.mLeft, i22);
                    if (z9) {
                        constraintWidget7.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i8 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                    }
                }
                for (int i23 = 0; i23 < i12 && this.mStartIndex + i23 < Flow.this.mDisplayedWidgetsCount; i23++) {
                    ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i23];
                    if (constraintWidget8 != null) {
                        if (i23 == 0) {
                            constraintWidget8.connect(constraintWidget8.mTop, this.mTop, this.mPaddingTop);
                            int i24 = Flow.this.mVerticalStyle;
                            float f11 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i24 = Flow.this.mFirstVerticalStyle;
                                f11 = Flow.this.mFirstVerticalBias;
                            } else if (z9 && Flow.this.mLastVerticalStyle != -1) {
                                i24 = Flow.this.mLastVerticalStyle;
                                f11 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget8.setVerticalChainStyle(i24);
                            constraintWidget8.setVerticalBiasPercent(f11);
                        }
                        if (i23 == i12 - 1) {
                            constraintWidget8.connect(constraintWidget8.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget8.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i23 == i14) {
                                constraintWidget8.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                            if (i23 == i15 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget8 != constraintWidget7) {
                            if (z8) {
                                int i25 = Flow.this.mHorizontalAlign;
                                if (i25 != 0) {
                                    if (i25 != 1) {
                                        if (i25 == 2) {
                                            constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                            constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                        }
                                    } else {
                                        constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    }
                                } else {
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            } else {
                                int i26 = Flow.this.mHorizontalAlign;
                                if (i26 != 0) {
                                    if (i26 != 1) {
                                        if (i26 == 2) {
                                            if (z10) {
                                                constraintWidget8.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                                constraintWidget8.mRight.connect(this.mRight, this.mPaddingRight);
                                            } else {
                                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                            }
                                        }
                                    } else {
                                        constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                    }
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                }
                                constraintWidget4 = constraintWidget8;
                            }
                        }
                        constraintWidget4 = constraintWidget8;
                    }
                }
            }
        }

        public int getHeight() {
            if (this.mOrientation == 1) {
                return this.mHeight - Flow.this.mVerticalGap;
            }
            return this.mHeight;
        }

        public int getWidth() {
            if (this.mOrientation == 0) {
                return this.mWidth - Flow.this.mHorizontalGap;
            }
            return this.mWidth;
        }

        public void measureMatchConstraints(int i8) {
            int i9 = this.mNbMatchConstraintsWidgets;
            if (i9 == 0) {
                return;
            }
            int i10 = this.mCount;
            int i11 = i8 / i9;
            for (int i12 = 0; i12 < i10 && this.mStartIndex + i12 < Flow.this.mDisplayedWidgetsCount; i12++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i12];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i11, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i11);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i8) {
            this.mStartIndex = i8;
        }

        public void setup(int i8, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9, int i10, int i11, int i12, int i13) {
            this.mOrientation = i8;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i9;
            this.mPaddingTop = i10;
            this.mPaddingRight = i11;
            this.mPaddingBottom = i12;
            this.mMax = i13;
        }
    }

    private void createAlignedConstraints(boolean z8) {
        ConstraintWidget constraintWidget;
        float f8;
        int i8;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i9 = 0; i9 < this.mDisplayedWidgetsCount; i9++) {
                this.mDisplayedWidgets[i9].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float f9 = this.mHorizontalBias;
            ConstraintWidget constraintWidget2 = null;
            int i12 = 0;
            while (i12 < i10) {
                if (z8) {
                    i8 = (i10 - i12) - 1;
                    f8 = 1.0f - this.mHorizontalBias;
                } else {
                    f8 = f9;
                    i8 = i12;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i8];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                    if (i12 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f8);
                    }
                    if (i12 == i10 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i12 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i12++;
                f9 = f8;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i13];
                if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                    if (i13 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i13 == i11 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i13 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i14 = 0; i14 < i10; i14++) {
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = (i15 * i10) + i14;
                    if (this.mOrientation == 1) {
                        i16 = (i14 * i11) + i15;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (i16 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i16]) != null && constraintWidget.getVisibility() != 8) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i14];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i15];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i8) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i9 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.mMatchConstraintPercentHeight * i8);
                if (i10 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i10);
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.getHeight();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i8) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i9 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.mMatchConstraintPercentWidth * i8);
                if (i10 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i10, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.getWidth();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        boolean z8;
        int i12;
        boolean z9;
        int i13;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        boolean z10;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
        this.mChainList.add(widgetsList);
        if (i9 == 0) {
            i11 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i8) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i16];
                int widgetWidth = getWidgetWidth(constraintWidget, i10);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i17 = i11;
                if ((i15 == i10 || this.mHorizontalGap + i15 + widgetWidth > i10) && widgetsList.biggest != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && i16 > 0 && (i14 = this.mMaxElementsWrap) > 0 && i16 % i14 == 0) {
                    z10 = true;
                }
                if (z10) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i16);
                    this.mChainList.add(widgetsList);
                } else if (i16 > 0) {
                    i15 += this.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i16++;
                    i11 = i17;
                }
                i15 = widgetWidth;
                widgetsList.add(constraintWidget);
                i16++;
                i11 = i17;
            }
        } else {
            i11 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i8) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                int widgetHeight = getWidgetHeight(constraintWidget2, i10);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i20 = i11;
                if ((i18 == i10 || this.mVerticalGap + i18 + widgetHeight > i10) && widgetsList.biggest != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8 && i19 > 0 && (i12 = this.mMaxElementsWrap) > 0 && i19 % i12 == 0) {
                    z8 = true;
                }
                if (z8) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i19);
                    this.mChainList.add(widgetsList);
                } else if (i19 > 0) {
                    i18 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i19++;
                    i11 = i20;
                }
                i18 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i19++;
                i11 = i20;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i11 > 0 && z9) {
            for (int i21 = 0; i21 < size; i21++) {
                WidgetsList widgetsList2 = this.mChainList.get(i21);
                if (i9 == 0) {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getHeight());
                }
            }
        }
        int i22 = paddingTop;
        int i23 = paddingRight2;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i28 = paddingBottom2;
        while (i26 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i26);
            if (i9 == 0) {
                if (i26 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i26 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i29 = i24;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i30 = i25;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i13 = i26;
                widgetsList3.setup(i9, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i27, i22, i23, paddingBottom, i10);
                int max = Math.max(i30, widgetsList3.getWidth());
                i24 = i29 + widgetsList3.getHeight();
                if (i13 > 0) {
                    i24 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i25 = max;
                constraintAnchor7 = constraintAnchor9;
                i22 = 0;
                constraintAnchor = constraintAnchor14;
                int i31 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i28 = i31;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i32 = i24;
                int i33 = i25;
                i13 = i26;
                if (i13 < size - 1) {
                    constraintAnchor = this.mChainList.get(i13 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i9, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i27, i22, paddingRight, i28, i10);
                i25 = i33 + widgetsList3.getWidth();
                int max2 = Math.max(i32, widgetsList3.getHeight());
                if (i13 > 0) {
                    i25 += this.mHorizontalGap;
                }
                i24 = max2;
                i23 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i27 = 0;
            }
            i26 = i13 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i25;
        iArr[1] = i24;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        boolean z8;
        int i12;
        boolean z9;
        int i13;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        boolean z10;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
        this.mChainList.add(widgetsList);
        if (i9 == 0) {
            int i15 = 0;
            i11 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i8) {
                int i18 = i15 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i17];
                int widgetWidth = getWidgetWidth(constraintWidget, i10);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i19 = i11;
                if ((i16 == i10 || this.mHorizontalGap + i16 + widgetWidth > i10) && widgetsList.biggest != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && i17 > 0 && (i14 = this.mMaxElementsWrap) > 0 && i18 > i14) {
                    z10 = true;
                }
                if (z10) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i17);
                    this.mChainList.add(widgetsList);
                    i15 = i18;
                    i16 = widgetWidth;
                } else {
                    if (i17 > 0) {
                        i16 += this.mHorizontalGap + widgetWidth;
                    } else {
                        i16 = widgetWidth;
                    }
                    i15 = 0;
                }
                widgetsList.add(constraintWidget);
                i17++;
                i11 = i19;
            }
        } else {
            int i20 = 0;
            i11 = 0;
            int i21 = 0;
            while (i21 < i8) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i21];
                int widgetHeight = getWidgetHeight(constraintWidget2, i10);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i22 = i11;
                if ((i20 == i10 || this.mVerticalGap + i20 + widgetHeight > i10) && widgetsList.biggest != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8 && i21 > 0 && (i12 = this.mMaxElementsWrap) > 0 && i12 < 0) {
                    z8 = true;
                }
                if (z8) {
                    widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    widgetsList.setStartIndex(i21);
                    this.mChainList.add(widgetsList);
                } else if (i21 > 0) {
                    i20 += this.mVerticalGap + widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i21++;
                    i11 = i22;
                }
                i20 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i21++;
                i11 = i22;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i11 > 0 && z9) {
            for (int i23 = 0; i23 < size; i23++) {
                WidgetsList widgetsList2 = this.mChainList.get(i23);
                if (i9 == 0) {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i10 - widgetsList2.getHeight());
                }
            }
        }
        int i24 = paddingTop;
        int i25 = paddingRight2;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i30 = paddingBottom2;
        while (i28 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i28);
            if (i9 == 0) {
                if (i28 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i28 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i31 = i26;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i32 = i27;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i13 = i28;
                widgetsList3.setup(i9, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i29, i24, i25, paddingBottom, i10);
                int max = Math.max(i32, widgetsList3.getWidth());
                i26 = i31 + widgetsList3.getHeight();
                if (i13 > 0) {
                    i26 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i27 = max;
                constraintAnchor7 = constraintAnchor9;
                i24 = 0;
                constraintAnchor = constraintAnchor14;
                int i33 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i30 = i33;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i34 = i26;
                int i35 = i27;
                i13 = i28;
                if (i13 < size - 1) {
                    constraintAnchor = this.mChainList.get(i13 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i9, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i29, i24, paddingRight, i30, i10);
                i27 = i35 + widgetsList3.getWidth();
                int max2 = Math.max(i34, widgetsList3.getHeight());
                if (i13 > 0) {
                    i27 += this.mHorizontalGap;
                }
                i26 = max2;
                i25 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i29 = 0;
            }
            i28 = i13 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i27;
        iArr[1] = i26;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i8, int i9, int i10, int[] iArr) {
        WidgetsList widgetsList;
        if (i8 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i10);
        }
        for (int i11 = 0; i11 < i8; i11++) {
            widgetsList.add(constraintWidgetArr[i11]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        super.addToSolver(linearSystem, z8);
        if (getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl()) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i8 = this.mWrapMode;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        int size = this.mChainList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            WidgetsList widgetsList = this.mChainList.get(i9);
                            if (i9 == size - 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            widgetsList.createConstraints(z9, i9, z11);
                        }
                    }
                } else {
                    createAlignedConstraints(z9);
                }
            } else {
                int size2 = this.mChainList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i10);
                    if (i10 == size2 - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    widgetsList2.createConstraints(z9, i10, z10);
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z9, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f8) {
        this.mFirstHorizontalBias = f8;
    }

    public void setFirstHorizontalStyle(int i8) {
        this.mFirstHorizontalStyle = i8;
    }

    public void setFirstVerticalBias(float f8) {
        this.mFirstVerticalBias = f8;
    }

    public void setFirstVerticalStyle(int i8) {
        this.mFirstVerticalStyle = i8;
    }

    public void setHorizontalAlign(int i8) {
        this.mHorizontalAlign = i8;
    }

    public void setHorizontalBias(float f8) {
        this.mHorizontalBias = f8;
    }

    public void setHorizontalGap(int i8) {
        this.mHorizontalGap = i8;
    }

    public void setHorizontalStyle(int i8) {
        this.mHorizontalStyle = i8;
    }

    public void setLastHorizontalBias(float f8) {
        this.mLastHorizontalBias = f8;
    }

    public void setLastHorizontalStyle(int i8) {
        this.mLastHorizontalStyle = i8;
    }

    public void setLastVerticalBias(float f8) {
        this.mLastVerticalBias = f8;
    }

    public void setLastVerticalStyle(int i8) {
        this.mLastVerticalStyle = i8;
    }

    public void setMaxElementsWrap(int i8) {
        this.mMaxElementsWrap = i8;
    }

    public void setOrientation(int i8) {
        this.mOrientation = i8;
    }

    public void setVerticalAlign(int i8) {
        this.mVerticalAlign = i8;
    }

    public void setVerticalBias(float f8) {
        this.mVerticalBias = f8;
    }

    public void setVerticalGap(int i8) {
        this.mVerticalGap = i8;
    }

    public void setVerticalStyle(int i8) {
        this.mVerticalStyle = i8;
    }

    public void setWrapMode(int i8) {
        this.mWrapMode = i8;
    }
}
