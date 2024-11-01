package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private static final Companion Companion = new Companion(null);
    private static final InterfaceC2072n DefaultSpan = LazyGridIntervalContent$Companion$DefaultSpan$1.INSTANCE;
    private boolean hasCustomSpans;
    private final MutableIntervalList<LazyGridInterval> intervals;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public final InterfaceC2072n getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public LazyGridIntervalContent(Function1 content) {
        AbstractC3292y.i(content, "content");
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
        this.intervals = new MutableIntervalList<>();
        content.invoke(this);
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(Object obj, Function1 function1, Object obj2, InterfaceC2073o content) {
        LazyGridIntervalContent$item$1$1 lazyGridIntervalContent$item$1$1;
        InterfaceC2072n interfaceC2072n;
        AbstractC3292y.i(content, "content");
        ?? intervals = getIntervals();
        if (obj != null) {
            lazyGridIntervalContent$item$1$1 = new LazyGridIntervalContent$item$1$1(obj);
        } else {
            lazyGridIntervalContent$item$1$1 = null;
        }
        if (function1 != null) {
            interfaceC2072n = new LazyGridIntervalContent$item$2$1(function1);
        } else {
            interfaceC2072n = DefaultSpan;
        }
        intervals.addInterval(1, new LazyGridInterval(lazyGridIntervalContent$item$1$1, interfaceC2072n, new LazyGridIntervalContent$item$3(obj2), ComposableLambdaKt.composableLambdaInstance(-34608120, true, new LazyGridIntervalContent$item$4(content))));
        if (function1 != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i8, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 contentType, InterfaceC2074p itemContent) {
        InterfaceC2072n interfaceC2072n2;
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        ?? intervals = getIntervals();
        if (interfaceC2072n == null) {
            interfaceC2072n2 = DefaultSpan;
        } else {
            interfaceC2072n2 = interfaceC2072n;
        }
        intervals.addInterval(i8, new LazyGridInterval(function1, interfaceC2072n2, contentType, itemContent));
        if (interfaceC2072n != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z8) {
        this.hasCustomSpans = z8;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }
}
