package n5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2043h;
import c5.C2046k;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppsListActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* renamed from: n5.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3428n extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35584a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f35585b;

    /* renamed from: n5.n$a */
    /* loaded from: classes5.dex */
    public static final class a implements b5.o {
        a() {
        }

        @Override // b5.o
        public void a(ArrayList featuredByCategory) {
            AbstractC3292y.i(featuredByCategory, "featuredByCategory");
            if (!featuredByCategory.isEmpty()) {
                C3428n c3428n = C3428n.this;
                Object obj = featuredByCategory.get(0);
                AbstractC3292y.h(obj, "get(...)");
                c3428n.q((C2043h) obj);
                C3428n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3428n.this.getMainFragmentAdapter());
            }
        }

        @Override // b5.o
        public void b(ArrayList categoryChildren) {
            AbstractC3292y.i(categoryChildren, "categoryChildren");
            C3428n.this.l(categoryChildren);
            C3428n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3428n.this.getMainFragmentAdapter());
        }

        @Override // b5.o
        public void c(ArrayList featuredByCategory, ArrayList categoryChildren, ArrayList miniTops, int i8) {
            FragmentManager supportFragmentManager;
            FragmentTransaction beginTransaction;
            FragmentTransaction replace;
            FragmentTransaction addToBackStack;
            AbstractC3292y.i(featuredByCategory, "featuredByCategory");
            AbstractC3292y.i(categoryChildren, "categoryChildren");
            AbstractC3292y.i(miniTops, "miniTops");
            if (i8 > 1) {
                C3428n.this.f35584a = false;
                C3426l c3426l = new C3426l();
                FragmentActivity activity = C3428n.this.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (replace = beginTransaction.replace(R.id.fragmentContainer, c3426l)) != null && (addToBackStack = replace.addToBackStack(null)) != null) {
                    addToBackStack.commit();
                    return;
                }
                return;
            }
            C3428n.this.t(featuredByCategory, categoryChildren, miniTops);
            C3428n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3428n.this.getMainFragmentAdapter());
        }
    }

    public C3428n() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f35585b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.g());
        arrayObjectAdapter.addAll(0, arrayList);
        this.f35585b.add(new ListRow(arrayObjectAdapter));
    }

    private final void m(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            c5.P p8 = (c5.P) next;
            if (p8.b().b() == i8) {
                r(p8);
                arrayList.remove(p8);
                return;
            }
        }
    }

    private final void n(C2043h c2043h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.d(requireContext));
            arrayObjectAdapter.add(c2043h);
            this.f35585b.add(new ListRow(arrayObjectAdapter));
            return;
        }
        this.f35584a = false;
    }

    private final void o(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            c5.P p8 = (c5.P) next;
            if (p8.b().b() == i8) {
                p(p8);
                arrayList.remove(p8);
                return;
            }
        }
    }

    private final void p(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.h(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35585b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f35584a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(C2043h c2043h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.q());
        arrayObjectAdapter.add(c2043h);
        this.f35585b.add(new ListRow(arrayObjectAdapter));
    }

    private final void r(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.i(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35585b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f35584a = false;
    }

    private final void s(c5.P p8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(p8.b().h());
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.f(requireContext));
            arrayObjectAdapter.addAll(0, p8.a());
            j5.c cVar = new j5.c();
            cVar.b(p8.b());
            arrayObjectAdapter.add(cVar);
            this.f35585b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f35584a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C3428n c3428n, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        if (obj instanceof C2043h) {
            if (viewHolder != null && c3428n.getContext() != null) {
                Context requireContext = c3428n.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                new X4.i(requireContext, ((C2043h) obj).h(), new b(viewHolder), LifecycleOwnerKt.getLifecycleScope(c3428n));
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
                                c3428n.startActivity(new Intent(c3428n.getContext(), (Class<?>) SettingsPreferences.class));
                                return;
                            }
                            return;
                        }
                        c3428n.startActivity(new Intent(c3428n.getContext(), (Class<?>) TvMyDownloadsActivity.class));
                        return;
                    }
                    Intent intent = new Intent(c3428n.getContext(), (Class<?>) TvMyAppsActivity.class);
                    intent.putExtra("rollback", true);
                    c3428n.startActivity(intent);
                    return;
                }
                c3428n.startActivity(new Intent(c3428n.getContext(), (Class<?>) TvMyAppsActivity.class));
                return;
            }
            Intent intent2 = new Intent(c3428n.getContext(), (Class<?>) TvMyAppsActivity.class);
            intent2.putExtra("updates", true);
            c3428n.startActivity(intent2);
            return;
        }
        if (obj instanceof j5.c) {
            Intent intent3 = new Intent(c3428n.getContext(), (Class<?>) TvAppsListActivity.class);
            intent3.putExtra("category", ((j5.c) obj).a());
            c3428n.startActivity(intent3);
        } else if (obj instanceof C2046k) {
            Intent intent4 = new Intent(c3428n.getContext(), (Class<?>) TvAppsListActivity.class);
            intent4.putExtra("category", (Parcelable) obj);
            c3428n.startActivity(intent4);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = C3428n.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f35584a) {
            this.f35585b.clear();
            u();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: n5.m
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3428n.v(C3428n.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    public final void t(ArrayList featuredByCategory, ArrayList categories, ArrayList miniTops) {
        AbstractC3292y.i(featuredByCategory, "featuredByCategory");
        AbstractC3292y.i(categories, "categories");
        AbstractC3292y.i(miniTops, "miniTops");
        this.f35584a = true;
        if (!miniTops.isEmpty()) {
            m(miniTops, -2);
        }
        if (!miniTops.isEmpty()) {
            o(miniTops, -1);
        }
        if ((!featuredByCategory.isEmpty()) && featuredByCategory.size() > 1) {
            Object obj = featuredByCategory.get(1);
            AbstractC3292y.h(obj, "get(...)");
            n((C2043h) obj);
        }
        if ((!categories.isEmpty()) && ((C2046k) categories.get(0)).i() == 523) {
            if (!miniTops.isEmpty()) {
                o(miniTops, 558);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 566);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 562);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 564);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 559);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 645);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 560);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 561);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 565);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 593);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 568);
            }
        }
        if (!miniTops.isEmpty()) {
            Iterator it = miniTops.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                s((c5.P) next);
            }
        }
    }

    public final void u() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            new X4.d(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* renamed from: n5.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f35588b;

        b(Presenter.ViewHolder viewHolder) {
            this.f35588b = viewHolder;
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C3428n.this.getActivity() != null && (C3428n.this.getActivity() instanceof m5.b)) {
                try {
                    m5.b bVar = (m5.b) C3428n.this.getActivity();
                    AbstractC3292y.f(bVar);
                    bVar.l(appInfo, this.f35588b);
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
