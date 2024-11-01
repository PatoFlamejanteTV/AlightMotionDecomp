package androidx.leanback.widget;

/* loaded from: classes3.dex */
class WindowAlignment {
    public final Axis horizontal;
    private Axis mMainAxis;
    private int mOrientation = 0;
    private Axis mSecondAxis;
    public final Axis vertical;

    /* loaded from: classes3.dex */
    public static class Axis {
        static final int PF_KEYLINE_OVER_HIGH_EDGE = 2;
        static final int PF_KEYLINE_OVER_LOW_EDGE = 1;
        private int mMaxEdge;
        private int mMaxScroll;
        private int mMinEdge;
        private int mMinScroll;
        private String mName;
        private int mPaddingMax;
        private int mPaddingMin;
        private boolean mReversedFlow;
        private int mSize;
        private int mPreferredKeyLine = 2;
        private int mWindowAlignment = 3;
        private int mWindowAlignmentOffset = 0;
        private float mWindowAlignmentOffsetPercent = 50.0f;

        public Axis(String str) {
            reset();
            this.mName = str;
        }

        final int calculateKeyline() {
            int i8;
            if (!this.mReversedFlow) {
                int i9 = this.mWindowAlignmentOffset;
                if (i9 < 0) {
                    i9 += this.mSize;
                }
                float f8 = this.mWindowAlignmentOffsetPercent;
                if (f8 != -1.0f) {
                    return i9 + ((int) ((this.mSize * f8) / 100.0f));
                }
                return i9;
            }
            int i10 = this.mWindowAlignmentOffset;
            if (i10 >= 0) {
                i8 = this.mSize - i10;
            } else {
                i8 = -i10;
            }
            float f9 = this.mWindowAlignmentOffsetPercent;
            if (f9 != -1.0f) {
                return i8 - ((int) ((this.mSize * f9) / 100.0f));
            }
            return i8;
        }

        final int calculateScrollToKeyLine(int i8, int i9) {
            return i8 - i9;
        }

        public final int getClientSize() {
            return (this.mSize - this.mPaddingMin) - this.mPaddingMax;
        }

        public final int getMaxScroll() {
            return this.mMaxScroll;
        }

        public final int getMinScroll() {
            return this.mMinScroll;
        }

        public final int getPaddingMax() {
            return this.mPaddingMax;
        }

        public final int getPaddingMin() {
            return this.mPaddingMin;
        }

        public final int getScroll(int i8) {
            int i9;
            int i10;
            int size = getSize();
            int calculateKeyline = calculateKeyline();
            boolean isMinUnknown = isMinUnknown();
            boolean isMaxUnknown = isMaxUnknown();
            if (!isMinUnknown) {
                int i11 = this.mPaddingMin;
                int i12 = calculateKeyline - i11;
                if (this.mReversedFlow ? (this.mWindowAlignment & 2) != 0 : (this.mWindowAlignment & 1) != 0) {
                    int i13 = this.mMinEdge;
                    if (i8 - i13 <= i12) {
                        int i14 = i13 - i11;
                        if (!isMaxUnknown && i14 > (i10 = this.mMaxScroll)) {
                            return i10;
                        }
                        return i14;
                    }
                }
            }
            if (!isMaxUnknown) {
                int i15 = this.mPaddingMax;
                int i16 = (size - calculateKeyline) - i15;
                if (this.mReversedFlow ? (this.mWindowAlignment & 1) != 0 : (this.mWindowAlignment & 2) != 0) {
                    int i17 = this.mMaxEdge;
                    if (i17 - i8 <= i16) {
                        int i18 = i17 - (size - i15);
                        if (!isMinUnknown && i18 < (i9 = this.mMinScroll)) {
                            return i9;
                        }
                        return i18;
                    }
                }
            }
            return calculateScrollToKeyLine(i8, calculateKeyline);
        }

        public final int getSize() {
            return this.mSize;
        }

        public final int getWindowAlignment() {
            return this.mWindowAlignment;
        }

        public final int getWindowAlignmentOffset() {
            return this.mWindowAlignmentOffset;
        }

        public final float getWindowAlignmentOffsetPercent() {
            return this.mWindowAlignmentOffsetPercent;
        }

        public final void invalidateScrollMax() {
            this.mMaxEdge = Integer.MAX_VALUE;
            this.mMaxScroll = Integer.MAX_VALUE;
        }

        public final void invalidateScrollMin() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMinScroll = Integer.MIN_VALUE;
        }

        public final boolean isMaxUnknown() {
            if (this.mMaxEdge == Integer.MAX_VALUE) {
                return true;
            }
            return false;
        }

        public final boolean isMinUnknown() {
            if (this.mMinEdge == Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean isPreferKeylineOverHighEdge() {
            if ((this.mPreferredKeyLine & 2) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean isPreferKeylineOverLowEdge() {
            if ((this.mPreferredKeyLine & 1) != 0) {
                return true;
            }
            return false;
        }

        void reset() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMaxEdge = Integer.MAX_VALUE;
        }

        public final void setPadding(int i8, int i9) {
            this.mPaddingMin = i8;
            this.mPaddingMax = i9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void setPreferKeylineOverHighEdge(boolean z8) {
            int i8;
            if (z8) {
                i8 = this.mPreferredKeyLine | 2;
            } else {
                i8 = this.mPreferredKeyLine & (-3);
            }
            this.mPreferredKeyLine = i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void setPreferKeylineOverLowEdge(boolean z8) {
            int i8;
            if (z8) {
                i8 = this.mPreferredKeyLine | 1;
            } else {
                i8 = this.mPreferredKeyLine & (-2);
            }
            this.mPreferredKeyLine = i8;
        }

        public final void setReversedFlow(boolean z8) {
            this.mReversedFlow = z8;
        }

        public final void setSize(int i8) {
            this.mSize = i8;
        }

        public final void setWindowAlignment(int i8) {
            this.mWindowAlignment = i8;
        }

        public final void setWindowAlignmentOffset(int i8) {
            this.mWindowAlignmentOffset = i8;
        }

        public final void setWindowAlignmentOffsetPercent(float f8) {
            if ((f8 >= 0.0f && f8 <= 100.0f) || f8 == -1.0f) {
                this.mWindowAlignmentOffsetPercent = f8;
                return;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            return " min:" + this.mMinEdge + " " + this.mMinScroll + " max:" + this.mMaxEdge + " " + this.mMaxScroll;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:            r4.mMaxScroll = (r4.mMaxEdge - r4.mPaddingMin) - r5;     */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:            r4.mMinScroll = r4.mMinEdge - r4.mPaddingMin;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void updateMinMax(int r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                r4.mMinEdge = r5
                r4.mMaxEdge = r6
                int r5 = r4.getClientSize()
                int r6 = r4.calculateKeyline()
                boolean r0 = r4.isMinUnknown()
                boolean r1 = r4.isMaxUnknown()
                if (r0 != 0) goto L35
                boolean r2 = r4.mReversedFlow
                if (r2 != 0) goto L21
                int r2 = r4.mWindowAlignment
                r2 = r2 & 1
                if (r2 == 0) goto L2f
                goto L27
            L21:
                int r2 = r4.mWindowAlignment
                r2 = r2 & 2
                if (r2 == 0) goto L2f
            L27:
                int r2 = r4.mMinEdge
                int r3 = r4.mPaddingMin
                int r2 = r2 - r3
                r4.mMinScroll = r2
                goto L35
            L2f:
                int r2 = r4.calculateScrollToKeyLine(r7, r6)
                r4.mMinScroll = r2
            L35:
                if (r1 != 0) goto L57
                boolean r2 = r4.mReversedFlow
                if (r2 != 0) goto L42
                int r2 = r4.mWindowAlignment
                r2 = r2 & 2
                if (r2 == 0) goto L51
                goto L48
            L42:
                int r2 = r4.mWindowAlignment
                r2 = r2 & 1
                if (r2 == 0) goto L51
            L48:
                int r2 = r4.mMaxEdge
                int r3 = r4.mPaddingMin
                int r2 = r2 - r3
                int r2 = r2 - r5
                r4.mMaxScroll = r2
                goto L57
            L51:
                int r5 = r4.calculateScrollToKeyLine(r8, r6)
                r4.mMaxScroll = r5
            L57:
                if (r1 != 0) goto Le6
                if (r0 != 0) goto Le6
                boolean r5 = r4.mReversedFlow
                if (r5 != 0) goto La3
                int r5 = r4.mWindowAlignment
                r0 = r5 & 1
                if (r0 == 0) goto L82
                boolean r5 = r4.isPreferKeylineOverLowEdge()
                if (r5 == 0) goto L77
                int r5 = r4.mMinScroll
                int r6 = r4.calculateScrollToKeyLine(r8, r6)
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
            L77:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
                goto Le6
            L82:
                r5 = r5 & 2
                if (r5 == 0) goto Le6
                boolean r5 = r4.isPreferKeylineOverHighEdge()
                if (r5 == 0) goto L98
                int r5 = r4.mMaxScroll
                int r6 = r4.calculateScrollToKeyLine(r7, r6)
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
            L98:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
                goto Le6
            La3:
                int r5 = r4.mWindowAlignment
                r0 = r5 & 1
                if (r0 == 0) goto Lc6
                boolean r5 = r4.isPreferKeylineOverLowEdge()
                if (r5 == 0) goto Lbb
                int r5 = r4.mMaxScroll
                int r6 = r4.calculateScrollToKeyLine(r7, r6)
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
            Lbb:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
                goto Le6
            Lc6:
                r5 = r5 & 2
                if (r5 == 0) goto Le6
                boolean r5 = r4.isPreferKeylineOverHighEdge()
                if (r5 == 0) goto Ldc
                int r5 = r4.mMinScroll
                int r6 = r4.calculateScrollToKeyLine(r8, r6)
                int r5 = java.lang.Math.min(r5, r6)
                r4.mMinScroll = r5
            Ldc:
                int r5 = r4.mMinScroll
                int r6 = r4.mMaxScroll
                int r5 = java.lang.Math.max(r5, r6)
                r4.mMaxScroll = r5
            Le6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.WindowAlignment.Axis.updateMinMax(int, int, int, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowAlignment() {
        Axis axis = new Axis("vertical");
        this.vertical = axis;
        Axis axis2 = new Axis("horizontal");
        this.horizontal = axis2;
        this.mMainAxis = axis2;
        this.mSecondAxis = axis;
    }

    public final int getOrientation() {
        return this.mOrientation;
    }

    public final Axis mainAxis() {
        return this.mMainAxis;
    }

    public final void reset() {
        mainAxis().reset();
    }

    public final Axis secondAxis() {
        return this.mSecondAxis;
    }

    public final void setOrientation(int i8) {
        this.mOrientation = i8;
        if (i8 == 0) {
            this.mMainAxis = this.horizontal;
            this.mSecondAxis = this.vertical;
        } else {
            this.mMainAxis = this.vertical;
            this.mSecondAxis = this.horizontal;
        }
    }

    public String toString() {
        return "horizontal=" + this.horizontal + "; vertical=" + this.vertical;
    }
}
