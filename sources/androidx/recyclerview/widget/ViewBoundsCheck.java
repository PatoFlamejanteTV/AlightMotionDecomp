package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
class ViewBoundsCheck {
    static final int CVE_PVE_POS = 12;
    static final int CVE_PVS_POS = 8;
    static final int CVS_PVE_POS = 4;
    static final int CVS_PVS_POS = 0;
    static final int EQ = 2;
    static final int FLAG_CVE_EQ_PVE = 8192;
    static final int FLAG_CVE_EQ_PVS = 512;
    static final int FLAG_CVE_GT_PVE = 4096;
    static final int FLAG_CVE_GT_PVS = 256;
    static final int FLAG_CVE_LT_PVE = 16384;
    static final int FLAG_CVE_LT_PVS = 1024;
    static final int FLAG_CVS_EQ_PVE = 32;
    static final int FLAG_CVS_EQ_PVS = 2;
    static final int FLAG_CVS_GT_PVE = 16;
    static final int FLAG_CVS_GT_PVS = 1;
    static final int FLAG_CVS_LT_PVE = 64;
    static final int FLAG_CVS_LT_PVS = 4;
    static final int GT = 1;
    static final int LT = 4;
    static final int MASK = 7;
    BoundFlags mBoundFlags = new BoundFlags();
    final Callback mCallback;

    /* loaded from: classes3.dex */
    static class BoundFlags {
        int mBoundFlags = 0;
        int mChildEnd;
        int mChildStart;
        int mRvEnd;
        int mRvStart;

        BoundFlags() {
        }

        void addFlags(int i8) {
            this.mBoundFlags = i8 | this.mBoundFlags;
        }

        boolean boundsMatch() {
            int i8 = this.mBoundFlags;
            if ((i8 & 7) != 0 && (i8 & compare(this.mChildStart, this.mRvStart)) == 0) {
                return false;
            }
            int i9 = this.mBoundFlags;
            if ((i9 & 112) != 0 && (i9 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i10 = this.mBoundFlags;
            if ((i10 & 1792) != 0 && (i10 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i11 = this.mBoundFlags;
            if ((i11 & 28672) != 0 && (i11 & (compare(this.mChildEnd, this.mRvEnd) << 12)) == 0) {
                return false;
            }
            return true;
        }

        int compare(int i8, int i9) {
            if (i8 > i9) {
                return 1;
            }
            return i8 == i9 ? 2 : 4;
        }

        void resetFlags() {
            this.mBoundFlags = 0;
        }

        void setBounds(int i8, int i9, int i10, int i11) {
            this.mRvStart = i8;
            this.mRvEnd = i9;
            this.mChildStart = i10;
            this.mChildEnd = i11;
        }
    }

    /* loaded from: classes3.dex */
    interface Callback {
        View getChildAt(int i8);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ViewBounds {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findOneViewWithinBoundFlags(int i8, int i9, int i10, int i11) {
        int i12;
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        if (i9 > i8) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        while (i8 != i9) {
            View childAt = this.mCallback.getChildAt(i8);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i10 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i10);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i11 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i11);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i8 += i12;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isViewWithinBoundFlags(View view, int i8) {
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i8 != 0) {
            this.mBoundFlags.resetFlags();
            this.mBoundFlags.addFlags(i8);
            return this.mBoundFlags.boundsMatch();
        }
        return false;
    }
}
