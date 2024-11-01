package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC2074p item;
    private final Function1 key;

    public PagerIntervalContent(Function1 function1, InterfaceC2074p item) {
        AbstractC3292y.i(item, "item");
        this.key = function1;
        this.item = item;
    }

    public final InterfaceC2074p getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public /* synthetic */ Function1 getType() {
        return LazyLayoutIntervalContent.Interval.CC.b(this);
    }
}
