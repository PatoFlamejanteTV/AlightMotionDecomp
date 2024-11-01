package n5;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.ErrorSupportFragment;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvMainActivity;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* renamed from: n5.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3426l extends ErrorSupportFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3426l c3426l, View view) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        FragmentActivity activity;
        FragmentManager supportFragmentManager3;
        FragmentTransaction beginTransaction2;
        FragmentTransaction replace;
        FragmentTransaction addToBackStack;
        if (c3426l.getActivity() instanceof TvMainActivity) {
            FragmentActivity activity2 = c3426l.getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.tv.ui.activity.TvMainActivity");
            fragment = ((TvMainActivity) activity2).v();
        } else {
            fragment = null;
        }
        if (fragment != null && (activity = c3426l.getActivity()) != null && (supportFragmentManager3 = activity.getSupportFragmentManager()) != null && (beginTransaction2 = supportFragmentManager3.beginTransaction()) != null && (replace = beginTransaction2.replace(R.id.fragmentContainer, fragment)) != null && (addToBackStack = replace.addToBackStack(null)) != null) {
            addToBackStack.commit();
        }
        FragmentActivity activity3 = c3426l.getActivity();
        if (activity3 != null && (supportFragmentManager2 = activity3.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager2.beginTransaction()) != null && (remove = beginTransaction.remove(c3426l)) != null) {
            remove.commit();
        }
        FragmentActivity activity4 = c3426l.getActivity();
        if (activity4 != null && (supportFragmentManager = activity4.getSupportFragmentManager()) != null) {
            supportFragmentManager.popBackStack();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = C3426l.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
    }

    @Override // androidx.leanback.app.ErrorSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.lb_ic_sad_cloud));
        setMessage(getString(R.string.error_no_connection));
        setButtonText(getString(R.string.refresh_enc));
        setButtonClickListener(new View.OnClickListener() { // from class: n5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3426l.i(C3426l.this, view);
            }
        });
    }
}
