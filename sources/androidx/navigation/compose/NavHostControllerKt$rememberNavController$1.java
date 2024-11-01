package androidx.navigation.compose;

import android.content.Context;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostControllerKt$rememberNavController$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$rememberNavController$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavHostController invoke() {
        NavHostController createNavController;
        createNavController = NavHostControllerKt.createNavController(this.$context);
        return createNavController;
    }
}
