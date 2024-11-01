package androidx.navigation.compose;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$6 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $builder;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Function1 $enterTransition;
    final /* synthetic */ Function1 $exitTransition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function1 $popEnterTransition;
    final /* synthetic */ Function1 $popExitTransition;
    final /* synthetic */ String $route;
    final /* synthetic */ String $startDestination;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$6(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i8, int i9) {
        super(2);
        this.$navController = navHostController;
        this.$startDestination = str;
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$route = str2;
        this.$enterTransition = function1;
        this.$exitTransition = function12;
        this.$popEnterTransition = function13;
        this.$popExitTransition = function14;
        this.$builder = function15;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        NavHostKt.NavHost(this.$navController, this.$startDestination, this.$modifier, this.$contentAlignment, this.$route, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$builder, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
