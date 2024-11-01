package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class ViewGroupKt$descendants$1$1 extends AbstractC3293z implements Function1 {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<View> invoke(View view) {
        InterfaceC3255g children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
