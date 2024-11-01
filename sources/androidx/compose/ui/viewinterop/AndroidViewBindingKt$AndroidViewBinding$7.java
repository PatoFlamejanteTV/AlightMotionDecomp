package androidx.compose.ui.viewinterop;

import Q5.I;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$7 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Context $localContext;
    final /* synthetic */ Function1 $onRelease;
    final /* synthetic */ Fragment $parentFragment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$7(Function1 function1, Fragment fragment, Context context) {
        super(1);
        this.$onRelease = function1;
        this.$parentFragment = fragment;
        this.$localContext = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return I.f8786a;
    }

    public final void invoke(View view) {
        ViewBinding binding;
        FragmentManager childFragmentManager;
        Function1 function1 = this.$onRelease;
        binding = AndroidViewBindingKt.getBinding(view);
        function1.invoke(binding);
        FragmentManager fragmentManager = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Fragment fragment = this.$parentFragment;
            Context context = this.$localContext;
            if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    fragmentManager = fragmentActivity.getSupportFragmentManager();
                }
            } else {
                fragmentManager = childFragmentManager;
            }
            AndroidViewBindingKt.forEachFragmentContainerView(viewGroup, new AndroidViewBindingKt$AndroidViewBinding$7$1$1(fragmentManager));
        }
    }
}
