package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals;
    private final LazyStaggeredGridSpanProvider spanProvider;

    public LazyStaggeredGridIntervalContent(Function1 content) {
        AbstractC3292y.i(content, "content");
        this.intervals = new MutableIntervalList<>();
        this.spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());
        content.invoke(this);
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC2073o content) {
        LazyStaggeredGridIntervalContent$item$1$1 lazyStaggeredGridIntervalContent$item$1$1;
        AbstractC3292y.i(content, "content");
        LazyStaggeredGridIntervalContent$item$3$1 lazyStaggeredGridIntervalContent$item$3$1 = null;
        if (obj != null) {
            lazyStaggeredGridIntervalContent$item$1$1 = new LazyStaggeredGridIntervalContent$item$1$1(obj);
        } else {
            lazyStaggeredGridIntervalContent$item$1$1 = null;
        }
        LazyStaggeredGridIntervalContent$item$2 lazyStaggeredGridIntervalContent$item$2 = new LazyStaggeredGridIntervalContent$item$2(obj2);
        if (staggeredGridItemSpan != null) {
            lazyStaggeredGridIntervalContent$item$3$1 = new LazyStaggeredGridIntervalContent$item$3$1(staggeredGridItemSpan);
        }
        items(1, lazyStaggeredGridIntervalContent$item$1$1, lazyStaggeredGridIntervalContent$item$2, lazyStaggeredGridIntervalContent$item$3$1, ComposableLambdaKt.composableLambdaInstance(657818596, true, new LazyStaggeredGridIntervalContent$item$4(content)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i8, Function1 function1, Function1 contentType, Function1 function12, InterfaceC2074p itemContent) {
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        getIntervals().addInterval(i8, new LazyStaggeredGridInterval(function1, contentType, function12, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }
}
