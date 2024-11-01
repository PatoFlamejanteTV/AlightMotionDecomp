package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i8) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i8, float f8, int i9) {
        if (this.mPageTransformer == null) {
            return;
        }
        float f9 = -f8;
        for (int i10 = 0; i10 < this.mLayoutManager.getChildCount(); i10++) {
            View childAt = this.mLayoutManager.getChildAt(i10);
            if (childAt != null) {
                this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i8) + f9);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i10), Integer.valueOf(this.mLayoutManager.getChildCount())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i8) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }
}
