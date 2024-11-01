package androidx.leanback.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public interface MultiActionsProvider {

    /* loaded from: classes3.dex */
    public static class MultiAction {
        private Drawable[] mDrawables;
        private long mId;
        private int mIndex = 0;

        public MultiAction(long j8) {
            this.mId = j8;
        }

        public Drawable getCurrentDrawable() {
            return this.mDrawables[this.mIndex];
        }

        public Drawable[] getDrawables() {
            return this.mDrawables;
        }

        public long getId() {
            return this.mId;
        }

        public int getIndex() {
            return this.mIndex;
        }

        public void incrementIndex() {
            int i8;
            int i9 = this.mIndex;
            if (i9 < this.mDrawables.length - 1) {
                i8 = i9 + 1;
            } else {
                i8 = 0;
            }
            setIndex(i8);
        }

        public void setDrawables(Drawable[] drawableArr) {
            this.mDrawables = drawableArr;
            if (this.mIndex > drawableArr.length - 1) {
                this.mIndex = drawableArr.length - 1;
            }
        }

        public void setIndex(int i8) {
            this.mIndex = i8;
        }
    }

    MultiAction[] getActions();
}
