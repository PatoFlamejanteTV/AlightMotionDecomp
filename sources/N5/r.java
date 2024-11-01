package n5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import c5.C2046k;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvSearchActivity;
import j5.C3211a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class r extends BrowseSupportFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final a f35601c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static C3430p f35602d;

    /* renamed from: e, reason: collision with root package name */
    private static C3428n f35603e;

    /* renamed from: f, reason: collision with root package name */
    private static U f35604f;

    /* renamed from: a, reason: collision with root package name */
    private BackgroundManager f35605a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f35606b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class b extends BrowseSupportFragment.FragmentFactory {
        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentFactory
        public Fragment createFragment(Object obj) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.leanback.widget.Row");
            long id = ((Row) obj).getHeaderItem().getId();
            if (id == 1) {
                if (r.f35602d == null) {
                    r.f35602d = new C3430p();
                }
                return r.f35602d;
            }
            if (id == 2) {
                if (r.f35603e == null) {
                    r.f35603e = new C3428n();
                }
                return r.f35603e;
            }
            if (id == 3) {
                if (r.f35604f == null) {
                    r.f35604f = U.f35560f.a(new C2046k(-1, "Top", null, 4, null));
                }
                return r.f35604f;
            }
            if (id == 4) {
                return new C3433t();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends PresenterSelector {
        c() {
        }

        @Override // androidx.leanback.widget.PresenterSelector
        public Presenter getPresenter(Object o8) {
            AbstractC3292y.i(o8, "o");
            return new l5.j();
        }
    }

    private final void o() {
        PageRow pageRow = new PageRow(new C3211a(1L, "Home", R.drawable.vector_tv_header_home));
        ArrayObjectAdapter arrayObjectAdapter = this.f35606b;
        AbstractC3292y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(pageRow);
        PageRow pageRow2 = new PageRow(new C3211a(2L, "Games", R.drawable.vector_tv_header_games));
        ArrayObjectAdapter arrayObjectAdapter2 = this.f35606b;
        AbstractC3292y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(pageRow2);
        PageRow pageRow3 = new PageRow(new C3211a(3L, "Top", R.drawable.vector_tv_header_top));
        ArrayObjectAdapter arrayObjectAdapter3 = this.f35606b;
        AbstractC3292y.f(arrayObjectAdapter3);
        arrayObjectAdapter3.add(pageRow3);
        PageRow pageRow4 = new PageRow(new C3211a(4L, "Management", R.drawable.vector_tv_header_management));
        ArrayObjectAdapter arrayObjectAdapter4 = this.f35606b;
        AbstractC3292y.f(arrayObjectAdapter4);
        arrayObjectAdapter4.add(pageRow4);
    }

    private final void p() {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        this.f35606b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        o();
        startEntranceTransition();
    }

    private final void q() {
        setHeadersState(1);
        setHeaderPresenterSelector(new c());
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setHeadersTransitionOnBackEnabled(true);
        setBrandColor(ContextCompat.getColor(requireContext(), R.color.tv_background_gradient_end));
        setSearchAffordanceColor(ContextCompat.getColor(requireContext(), R.color.transparent));
        setOnSearchClickedListener(new View.OnClickListener() { // from class: n5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.r(r.this, view);
            }
        });
        prepareEntranceTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(r rVar, View view) {
        rVar.startActivity(new Intent(rVar.getActivity(), (Class<?>) TvSearchActivity.class));
    }

    @Override // androidx.leanback.app.BrowseSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = r.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        q();
        p();
        BackgroundManager backgroundManager = BackgroundManager.getInstance(getActivity());
        this.f35605a = backgroundManager;
        if (backgroundManager != null) {
            backgroundManager.attach(requireActivity().getWindow());
        }
        getMainFragmentRegistry().registerFragment(PageRow.class, new b());
    }
}
