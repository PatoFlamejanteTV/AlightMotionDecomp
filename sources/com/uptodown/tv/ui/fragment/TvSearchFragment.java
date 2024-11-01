package com.uptodown.tv.ui.fragment;

import Q5.I;
import Q5.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.SpeechRecognitionCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2043h;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvSearchFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class TvSearchFragment extends SearchSupportFragment implements SearchSupportFragment.SearchResultProvider {

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f31153a;

    /* renamed from: b, reason: collision with root package name */
    private String f31154b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f31155c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31156a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2043h f31158c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.tv.ui.fragment.TvSearchFragment$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0710a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31159a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvSearchFragment f31160b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2043h f31161c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0710a(TvSearchFragment tvSearchFragment, C2043h c2043h, U5.d dVar) {
                super(2, dVar);
                this.f31160b = tvSearchFragment;
                this.f31161c = c2043h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0710a(this.f31160b, this.f31161c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31159a == 0) {
                    t.b(obj);
                    Intent intent = new Intent(this.f31160b.getActivity(), (Class<?>) TvAppDetailActivity.class);
                    intent.putExtra("appInfo", this.f31161c);
                    this.f31160b.startActivity(intent);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0710a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2043h c2043h, U5.d dVar) {
            super(2, dVar);
            this.f31158c = c2043h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f31158c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONObject jSONObject;
            Object e8 = V5.b.e();
            int i9 = this.f31156a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    Context requireContext = TvSearchFragment.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    K Q8 = new C3775H(requireContext).Q(this.f31158c.h());
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8);
                        if (!jSONObject2.isNull("success")) {
                            i8 = jSONObject2.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (i8 == 1 && jSONObject != null) {
                            this.f31158c.a(jSONObject);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                C0710a c0710a = new C0710a(TvSearchFragment.this, this.f31158c, null);
                this.f31156a = 1;
                if (AbstractC3458i.g(c8, c0710a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31162a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, U5.d dVar) {
            super(2, dVar);
            this.f31164c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f31164c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31162a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                String str = this.f31164c;
                this.f31162a = 1;
                if (tvSearchFragment.y(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31165a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2043h f31167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2043h c2043h, U5.d dVar) {
            super(2, dVar);
            this.f31167c = c2043h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f31167c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31165a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                C2043h c2043h = this.f31167c;
                this.f31165a = 1;
                if (tvSearchFragment.t(c2043h, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements SearchBar.SearchBarListener {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TvSearchFragment tvSearchFragment) {
            tvSearchFragment.focusOnResults();
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onKeyboardDismiss(String query) {
            AbstractC3292y.i(query, "query");
            Handler handler = new Handler(Looper.getMainLooper());
            final TvSearchFragment tvSearchFragment = TvSearchFragment.this;
            handler.postDelayed(new Runnable() { // from class: n5.S
                @Override // java.lang.Runnable
                public final void run() {
                    TvSearchFragment.d.b(TvSearchFragment.this);
                }
            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQueryChange(String str) {
            if (str != null && str.length() > 2 && !n.s(str, TvSearchFragment.this.f31154b, true)) {
                TvSearchFragment.this.f31154b = str;
                TvSearchFragment.this.x(str);
            }
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQuerySubmit(String str) {
            if (str != null && str.length() > 2 && !n.s(str, TvSearchFragment.this.f31154b, true)) {
                TvSearchFragment.this.f31154b = str;
                TvSearchFragment.this.x(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31169a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31171c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31172a;

            a(U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31172a == 0) {
                    t.b(obj);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, U5.d dVar) {
            super(2, dVar);
            this.f31171c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f31171c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:12:0x0022, B:14:0x0059, B:16:0x005f, B:18:0x0072, B:19:0x007b, B:21:0x0081, B:23:0x008b, B:26:0x0095, B:28:0x009d, B:30:0x00a3, B:31:0x00b0, B:33:0x00b6, B:35:0x00d1, B:37:0x00e4, B:40:0x00e7), top: B:11:0x0022 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvSearchFragment.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusOnResults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TvSearchFragment tvSearchFragment, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
        tvSearchFragment.v((C2043h) obj);
    }

    private final OnItemViewClickedListener s() {
        return new OnItemViewClickedListener() { // from class: n5.Q
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                TvSearchFragment.j(TvSearchFragment.this, viewHolder, obj, viewHolder2, row);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C2043h c2043h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new a(c2043h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void u(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(str, null), 3, null);
    }

    private final void v(C2043h c2043h) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(c2043h, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        ArrayObjectAdapter arrayObjectAdapter = this.f31153a;
        AbstractC3292y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (!TextUtils.isEmpty(str)) {
            u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new e(str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str, List list) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.e());
        AbstractC3292y.f(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayObjectAdapter.add((C2043h) it.next());
        }
        HeaderItem headerItem = new HeaderItem(str);
        ArrayObjectAdapter arrayObjectAdapter2 = this.f31153a;
        AbstractC3292y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(new ListRow(headerItem, arrayObjectAdapter));
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public ObjectAdapter getResultsAdapter() {
        ArrayObjectAdapter arrayObjectAdapter = this.f31153a;
        AbstractC3292y.f(arrayObjectAdapter);
        return arrayObjectAdapter;
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = TvSearchFragment.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        this.f31153a = new ArrayObjectAdapter(new ListRowPresenter());
        setSearchResultProvider(this);
        setOnItemViewClickedListener(s());
        this.f31155c = new ArrayList();
        setSpeechRecognitionCallback(new SpeechRecognitionCallback() { // from class: n5.P
            @Override // androidx.leanback.widget.SpeechRecognitionCallback
            public final void recognizeSpeech() {
                TvSearchFragment.w();
            }
        });
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextChange(String str) {
        if (str != null && str.length() > 2 && !n.s(str, this.f31154b, true)) {
            this.f31154b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextSubmit(String str) {
        if (str != null && str.length() > 2 && !n.s(str, this.f31154b, true)) {
            this.f31154b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        SearchBar searchBar = (SearchBar) view.findViewById(R.id.lb_search_bar);
        if (searchBar != null) {
            searchBar.setSearchBarListener(new d());
        }
    }
}
