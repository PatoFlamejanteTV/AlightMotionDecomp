package androidx.compose.foundation.lazy;

import R5.AbstractC1435t;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    private List<Integer> _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals;

    public LazyListIntervalContent(Function1 content) {
        AbstractC3292y.i(content, "content");
        this.intervals = new MutableIntervalList<>();
        content.invoke(this);
    }

    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void item(Object obj, InterfaceC2073o interfaceC2073o) {
        LazyListScope.CC.a(this, obj, interfaceC2073o);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public /* synthetic */ void items(int i8, Function1 function1, InterfaceC2074p interfaceC2074p) {
        LazyListScope.CC.c(this, i8, function1, interfaceC2074p);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(Object obj, Object obj2, InterfaceC2073o content) {
        AbstractC3292y.i(content, "content");
        List list = this._headerIndexes;
        if (list == null) {
            list = new ArrayList();
            this._headerIndexes = list;
        }
        list.add(Integer.valueOf(getIntervals().getSize()));
        item(obj, obj2, content);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(Object obj, Object obj2, InterfaceC2073o content) {
        AbstractC3292y.i(content, "content");
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new LazyListIntervalContent$item$1(obj) : null, new LazyListIntervalContent$item$2(obj2), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new LazyListIntervalContent$item$3(content))));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i8, Function1 function1, Function1 contentType, InterfaceC2074p itemContent) {
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        getIntervals().addInterval(i8, new LazyListInterval(function1, contentType, itemContent));
    }
}
