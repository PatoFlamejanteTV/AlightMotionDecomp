package n5;

import R5.AbstractC1435t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2043h;
import c5.C2046k;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppsListActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* renamed from: n5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3430p extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private C2043h f35590a;

    /* renamed from: b, reason: collision with root package name */
    private C2043h f35591b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f35592c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f35593d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f35594e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayObjectAdapter f35595f;

    /* renamed from: g, reason: collision with root package name */
    private int f35596g;

    public C3430p() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f35595f = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void q(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                int i10 = i9 + 1;
                c5.P p8 = (c5.P) it.next();
                if (p8.b().b() == i8) {
                    u(p8);
                    break;
                }
                i9 = i10;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            arrayList.remove(i9);
        }
    }

    private final void r(C2043h c2043h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.d(requireContext));
            arrayObjectAdapter.add(c2043h);
            this.f35595f.add(new ListRow(arrayObjectAdapter));
        }
    }

    private final void s(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.h(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35595f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(C2043h c2043h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.q());
        arrayObjectAdapter.add(c2043h);
        this.f35595f.add(new ListRow(arrayObjectAdapter));
    }

    private final void u(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.i(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35595f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void v(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.f(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35595f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void w() {
        if (!this.f35594e.isEmpty()) {
            Object obj = this.f35594e.get(0);
            AbstractC3292y.h(obj, "get(...)");
            s((c5.P) obj);
        }
        if (!this.f35593d.isEmpty()) {
            q(this.f35593d, -2);
        }
        C2043h c2043h = this.f35591b;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            r(c2043h);
        }
        if ((!this.f35594e.isEmpty()) && this.f35594e.size() > 1) {
            Object obj2 = this.f35594e.get(1);
            AbstractC3292y.h(obj2, "get(...)");
            s((c5.P) obj2);
        }
        if (!this.f35593d.isEmpty()) {
            q(this.f35593d, -1);
        }
        if ((!this.f35594e.isEmpty()) && this.f35594e.size() > 2) {
            Object obj3 = this.f35594e.get(2);
            AbstractC3292y.h(obj3, "get(...)");
            s((c5.P) obj3);
        }
        if (!this.f35593d.isEmpty()) {
            q(this.f35593d, 521);
        }
        if (!this.f35593d.isEmpty()) {
            q(this.f35593d, 523);
        }
        if (!this.f35593d.isEmpty()) {
            q(this.f35593d, 524);
        }
        if (!this.f35593d.isEmpty()) {
            Iterator it = this.f35593d.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                v((c5.P) next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        int i8 = this.f35596g;
        if (i8 < 4) {
            this.f35596g = i8 + 1;
        } else {
            w();
        }
    }

    private final void y() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC3292y.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            new X4.c(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(C3430p c3430p, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        if (obj instanceof C2043h) {
            if (viewHolder != null) {
                Context requireContext = c3430p.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                new X4.i(requireContext, ((C2043h) obj).h(), new b(viewHolder), LifecycleOwnerKt.getLifecycleScope(c3430p));
                return;
            }
            return;
        }
        if (obj instanceof j5.b) {
            int b9 = ((j5.b) obj).b();
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 2) {
                        if (b9 != 3) {
                            if (b9 == 4) {
                                c3430p.startActivity(new Intent(c3430p.getContext(), (Class<?>) SettingsPreferences.class));
                                return;
                            }
                            return;
                        }
                        c3430p.startActivity(new Intent(c3430p.getContext(), (Class<?>) TvMyDownloadsActivity.class));
                        return;
                    }
                    Intent intent = new Intent(c3430p.getContext(), (Class<?>) TvMyAppsActivity.class);
                    intent.putExtra("rollback", true);
                    c3430p.startActivity(intent);
                    return;
                }
                c3430p.startActivity(new Intent(c3430p.getContext(), (Class<?>) TvMyAppsActivity.class));
                return;
            }
            Intent intent2 = new Intent(c3430p.getContext(), (Class<?>) TvMyAppsActivity.class);
            intent2.putExtra("updates", true);
            c3430p.startActivity(intent2);
            return;
        }
        if (obj instanceof j5.c) {
            Intent intent3 = new Intent(c3430p.getContext(), (Class<?>) TvAppsListActivity.class);
            intent3.putExtra("category", ((j5.c) obj).a());
            c3430p.startActivity(intent3);
        } else if (obj instanceof C2046k) {
            Intent intent4 = new Intent(c3430p.getContext(), (Class<?>) TvAppsListActivity.class);
            intent4.putExtra("category", (Parcelable) obj);
            c3430p.startActivity(intent4);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = C3430p.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f35590a == null || this.f35592c.isEmpty()) {
            y();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: n5.o
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3430p.z(C3430p.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    /* renamed from: n5.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements b5.n {
        a() {
        }

        @Override // b5.n
        public void a(c5.P topHorizontalTopReceived) {
            AbstractC3292y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C3430p.this.f35593d.add(topHorizontalTopReceived);
            C3430p.this.x();
        }

        @Override // b5.n
        public void b(ArrayList miniTopsReceived) {
            AbstractC3292y.i(miniTopsReceived, "miniTopsReceived");
            C3430p.this.f35593d.addAll(miniTopsReceived);
            C3430p.this.x();
        }

        @Override // b5.n
        public void c(C2043h appInfoReceived) {
            AbstractC3292y.i(appInfoReceived, "appInfoReceived");
        }

        @Override // b5.n
        public void d(c5.P topHorizontalLatestReceived) {
            AbstractC3292y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C3430p.this.f35593d.add(topHorizontalLatestReceived);
            C3430p.this.x();
        }

        @Override // b5.n
        public void e(ArrayList homeFeaturesReceived) {
            AbstractC3292y.i(homeFeaturesReceived, "homeFeaturesReceived");
            if (homeFeaturesReceived.size() > 0) {
                C3430p.this.f35590a = (C2043h) AbstractC1435t.m0(homeFeaturesReceived);
                C3430p c3430p = C3430p.this;
                C2043h c2043h = c3430p.f35590a;
                AbstractC3292y.f(c2043h);
                c3430p.t(c2043h);
            }
            C3430p.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3430p.this.getMainFragmentAdapter());
        }

        @Override // b5.n
        public void g(C2043h appReplacement) {
            AbstractC3292y.i(appReplacement, "appReplacement");
        }

        @Override // b5.n
        public void h(ArrayList recentFeaturedReceived) {
            AbstractC3292y.i(recentFeaturedReceived, "recentFeaturedReceived");
            C3430p.this.f35591b = (C2043h) AbstractC1435t.m0(recentFeaturedReceived);
            C3430p.this.x();
        }

        @Override // b5.n
        public void i(ArrayList floatingMiniTopsReceived) {
            AbstractC3292y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            C3430p.this.f35594e.addAll(floatingMiniTopsReceived);
            C3430p.this.x();
        }

        @Override // b5.n
        public void j(c5.P topHorizontalNewReleasesReceived) {
            AbstractC3292y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            C3430p.this.f35593d.add(topHorizontalNewReleasesReceived);
        }

        @Override // b5.n
        public void k(ArrayList categoriesReceived) {
            AbstractC3292y.i(categoriesReceived, "categoriesReceived");
            C3430p.this.f35592c = categoriesReceived;
        }

        @Override // b5.n
        public void l(c5.P topByCategory) {
            AbstractC3292y.i(topByCategory, "topByCategory");
            C3430p.this.f35594e.add(topByCategory);
        }

        @Override // b5.n
        public void f() {
        }
    }

    /* renamed from: n5.p$b */
    /* loaded from: classes5.dex */
    public static final class b implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f35599b;

        b(Presenter.ViewHolder viewHolder) {
            this.f35599b = viewHolder;
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C3430p.this.getActivity() != null && (C3430p.this.getActivity() instanceof m5.b)) {
                try {
                    m5.b bVar = (m5.b) C3430p.this.getActivity();
                    AbstractC3292y.f(bVar);
                    bVar.l(appInfo, this.f35599b);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }

        @Override // b5.r
        public void b(int i8) {
        }
    }
}
