package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f18291a;

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f18291a.highestSurface((DynamicScheme) obj);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
