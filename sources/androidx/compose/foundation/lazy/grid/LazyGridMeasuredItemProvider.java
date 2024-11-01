package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider {
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    @ExperimentalFoundationApi
    public LazyGridMeasuredItemProvider(LazyGridItemProvider itemProvider, LazyLayoutMeasureScope measureScope, int i8) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(measureScope, "measureScope");
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.defaultMainAxisSpacing = i8;
    }

    /* renamed from: getAndMeasure-3p2s80s$default, reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m713getAndMeasure3p2s80s$default(LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i8, int i9, long j8, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                i9 = lazyGridMeasuredItemProvider.defaultMainAxisSpacing;
            }
            return lazyGridMeasuredItemProvider.m714getAndMeasure3p2s80s(i8, i9, j8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
    }

    public abstract LazyGridMeasuredItem createItem(int i8, Object obj, Object obj2, int i9, int i10, List<? extends Placeable> list);

    /* renamed from: getAndMeasure-3p2s80s, reason: not valid java name */
    public final LazyGridMeasuredItem m714getAndMeasure3p2s80s(int i8, int i9, long j8) {
        int m5124getMinHeightimpl;
        Object key = this.itemProvider.getKey(i8);
        Object contentType = this.itemProvider.getContentType(i8);
        List<Placeable> mo733measure0kLqBqw = this.measureScope.mo733measure0kLqBqw(i8, j8);
        if (Constraints.m5121getHasFixedWidthimpl(j8)) {
            m5124getMinHeightimpl = Constraints.m5125getMinWidthimpl(j8);
        } else if (Constraints.m5120getHasFixedHeightimpl(j8)) {
            m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return createItem(i8, key, contentType, m5124getMinHeightimpl, i9, mo733measure0kLqBqw);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
