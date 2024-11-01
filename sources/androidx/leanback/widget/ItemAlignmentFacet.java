package androidx.leanback.widget;

/* loaded from: classes3.dex */
public final class ItemAlignmentFacet {
    public static final float ITEM_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    private ItemAlignmentDef[] mAlignmentDefs = {new ItemAlignmentDef()};

    /* loaded from: classes3.dex */
    public static class ItemAlignmentDef {
        private boolean mAlignToBaseline;
        int mViewId = -1;
        int mFocusViewId = -1;
        int mOffset = 0;
        float mOffsetPercent = 50.0f;
        boolean mOffsetWithPadding = false;

        public final int getItemAlignmentFocusViewId() {
            int i8 = this.mFocusViewId;
            if (i8 == -1) {
                return this.mViewId;
            }
            return i8;
        }

        public final int getItemAlignmentOffset() {
            return this.mOffset;
        }

        public final float getItemAlignmentOffsetPercent() {
            return this.mOffsetPercent;
        }

        public final int getItemAlignmentViewId() {
            return this.mViewId;
        }

        public boolean isAlignedToTextViewBaseLine() {
            return this.mAlignToBaseline;
        }

        public final boolean isItemAlignmentOffsetWithPadding() {
            return this.mOffsetWithPadding;
        }

        public final void setAlignedToTextViewBaseline(boolean z8) {
            this.mAlignToBaseline = z8;
        }

        public final void setItemAlignmentFocusViewId(int i8) {
            this.mFocusViewId = i8;
        }

        public final void setItemAlignmentOffset(int i8) {
            this.mOffset = i8;
        }

        public final void setItemAlignmentOffsetPercent(float f8) {
            if ((f8 >= 0.0f && f8 <= 100.0f) || f8 == -1.0f) {
                this.mOffsetPercent = f8;
                return;
            }
            throw new IllegalArgumentException();
        }

        public final void setItemAlignmentOffsetWithPadding(boolean z8) {
            this.mOffsetWithPadding = z8;
        }

        public final void setItemAlignmentViewId(int i8) {
            this.mViewId = i8;
        }
    }

    public ItemAlignmentDef[] getAlignmentDefs() {
        return this.mAlignmentDefs;
    }

    public boolean isMultiAlignment() {
        if (this.mAlignmentDefs.length > 1) {
            return true;
        }
        return false;
    }

    public void setAlignmentDefs(ItemAlignmentDef[] itemAlignmentDefArr) {
        if (itemAlignmentDefArr != null && itemAlignmentDefArr.length >= 1) {
            this.mAlignmentDefs = itemAlignmentDefArr;
            return;
        }
        throw new IllegalArgumentException();
    }
}
