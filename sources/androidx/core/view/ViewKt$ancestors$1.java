package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;

/* loaded from: classes3.dex */
/* synthetic */ class ViewKt$ancestors$1 extends C3289v implements Function1 {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
