package androidx.activity;

import Q5.InterfaceC1416k;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1416k viewModels(ComponentActivity componentActivity, Function0 function0) {
        if (function0 == null) {
            function0 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC3292y.n(4, "VM");
        return new ViewModelLazy(U.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ InterfaceC1416k viewModels$default(ComponentActivity componentActivity, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        if (function0 == null) {
            function0 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC3292y.n(4, "VM");
        return new ViewModelLazy(U.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1416k viewModels(ComponentActivity componentActivity, Function0 function0, Function0 function02) {
        if (function02 == null) {
            function02 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC3292y.n(4, "VM");
        return new ViewModelLazy(U.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }

    public static /* synthetic */ InterfaceC1416k viewModels$default(ComponentActivity componentActivity, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        if ((i8 & 2) != 0) {
            function02 = null;
        }
        if (function02 == null) {
            function02 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC3292y.n(4, "VM");
        return new ViewModelLazy(U.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }
}
