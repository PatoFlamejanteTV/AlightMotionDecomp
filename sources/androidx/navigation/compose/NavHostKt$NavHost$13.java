package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavHostKt$NavHost$13 extends AbstractC3293z implements Function1 {
    public static final NavHostKt$NavHost$13 INSTANCE = new NavHostKt$NavHost$13();

    NavHostKt$NavHost$13() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.getId();
    }
}
