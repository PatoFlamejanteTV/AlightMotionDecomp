package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1515h0;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1980d;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SearchActivity;
import com.uptodown.views.InstantAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.X;
import q5.C3791p;
import q5.C3795t;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class SearchActivity extends AbstractActivityC2691a {

    /* renamed from: V, reason: collision with root package name */
    public static final b f30094V = new b(null);

    /* renamed from: Q, reason: collision with root package name */
    private InterfaceC3488x0 f30097Q;

    /* renamed from: R, reason: collision with root package name */
    private I4.F f30098R;

    /* renamed from: S, reason: collision with root package name */
    private a f30099S;

    /* renamed from: U, reason: collision with root package name */
    private final ActivityResultLauncher f30101U;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30095O = Q5.l.b(new Function0() { // from class: F4.W3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1515h0 q32;
            q32 = SearchActivity.q3(SearchActivity.this);
            return q32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30096P = new ViewModelLazy(U.b(y.class), new j(this), new i(this), new k(null, this));

    /* renamed from: T, reason: collision with root package name */
    private boolean f30100T = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class a extends ArrayAdapter implements Filterable {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f30102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f30103b;

        /* renamed from: com.uptodown.activities.SearchActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0698a extends Filter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f30104a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f30105b;

            C0698a(SearchActivity searchActivity, a aVar) {
                this.f30104a = searchActivity;
                this.f30105b = aVar;
            }

            @Override // android.widget.Filter
            public CharSequence convertResultToString(Object resultValue) {
                AbstractC3292y.i(resultValue, "resultValue");
                String a9 = ((c5.H) resultValue).a();
                AbstractC3292y.f(a9);
                return a9;
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                AbstractC3292y.i(charSequence, "charSequence");
                C3791p.a aVar = C3791p.f37286s;
                Context applicationContext = this.f30104a.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3791p a9 = aVar.a(applicationContext);
                a9.a();
                ArrayList q02 = a9.q0();
                a9.i();
                if (charSequence.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = q02.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String a10 = ((c5.H) q02.get(i8)).a();
                        if (a10 != null && l6.n.G(a10, charSequence, false, 2, null)) {
                            arrayList.add(q02.get(i8));
                        }
                    }
                    q02 = arrayList;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = q02;
                filterResults.count = q02.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                AbstractC3292y.i(charSequence, "charSequence");
                AbstractC3292y.i(filterResults, "filterResults");
                this.f30105b.clear();
                Object obj = filterResults.values;
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    this.f30105b.add((c5.H) it.next());
                }
                if (filterResults.count > 0) {
                    a aVar = this.f30104a.f30099S;
                    AbstractC3292y.f(aVar);
                    aVar.notifyDataSetChanged();
                } else {
                    a aVar2 = this.f30104a.f30099S;
                    AbstractC3292y.f(aVar2);
                    aVar2.notifyDataSetInvalidated();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchActivity searchActivity, Context context) {
            super(context, -1);
            AbstractC3292y.i(context, "context");
            this.f30103b = searchActivity;
            LayoutInflater from = LayoutInflater.from(context);
            AbstractC3292y.h(from, "from(...)");
            this.f30102a = from;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SearchActivity searchActivity, View view) {
            AbstractC3292y.i(view, "view");
            if (UptodownApp.f29249C.a0()) {
                Object tag = view.getTag();
                AbstractC3292y.g(tag, "null cannot be cast to non-null type kotlin.String");
                C3791p.a aVar = C3791p.f37286s;
                Context applicationContext = searchActivity.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3791p a9 = aVar.a(applicationContext);
                a9.a();
                int K8 = a9.K((String) tag);
                a9.i();
                if (K8 > 0) {
                    a aVar2 = searchActivity.f30099S;
                    AbstractC3292y.f(aVar2);
                    aVar2.getFilter().filter(searchActivity.r3().f12775b.f12786b.getText().toString());
                }
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            return new C0698a(this.f30103b, this);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i8, View view, ViewGroup parent) {
            LinearLayout linearLayout;
            AbstractC3292y.i(parent, "parent");
            c5.H h8 = (c5.H) getItem(i8);
            if (h8 != null) {
                if (view != null) {
                    linearLayout = (LinearLayout) view;
                } else {
                    View inflate = this.f30102a.inflate(R.layout.recent_search_item, parent, false);
                    AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    linearLayout = (LinearLayout) inflate;
                }
                TextView textView = (TextView) linearLayout.findViewById(R.id.tv_query_recent_search_item);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_delete_recent_search_item);
                imageView.setTag(h8.a());
                final SearchActivity searchActivity = this.f30103b;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchActivity.a.b(SearchActivity.this, view2);
                    }
                });
                textView.setTypeface(J4.j.f4395g.v());
                textView.setText(h8.a());
                return linearLayout;
            }
            View inflate2 = this.f30102a.inflate(R.layout.recent_search_item, parent, false);
            AbstractC3292y.g(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) inflate2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String F32 = SearchActivity.this.F3(String.valueOf(editable));
            int length = F32.length();
            if (2 <= length && length < 40) {
                SearchActivity.this.G3(F32, 2);
            } else {
                if (SearchActivity.this.f30097Q != null) {
                    InterfaceC3488x0 interfaceC3488x0 = SearchActivity.this.f30097Q;
                    AbstractC3292y.f(interfaceC3488x0);
                    InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
                }
                if (SearchActivity.this.f30098R != null) {
                    I4.F f8 = SearchActivity.this.f30098R;
                    AbstractC3292y.f(f8);
                    f8.c(new ArrayList());
                }
            }
            if (String.valueOf(editable).length() <= 0) {
                I4.F f9 = SearchActivity.this.f30098R;
                if (f9 != null) {
                    f9.c(new ArrayList());
                }
                SearchActivity.this.r3().f12775b.f12788d.setVisibility(4);
                SearchActivity.this.r3().f12775b.f12789e.setVisibility(0);
                return;
            }
            SearchActivity.this.r3().f12775b.f12788d.setVisibility(0);
            SearchActivity.this.r3().f12775b.f12789e.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f30107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f30108b;

        d(LinearLayoutManager linearLayoutManager, SearchActivity searchActivity) {
            this.f30107a = linearLayoutManager;
            this.f30108b = searchActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int childCount = this.f30107a.getChildCount();
                int itemCount = this.f30107a.getItemCount();
                int findFirstVisibleItemPosition = this.f30107a.findFirstVisibleItemPosition();
                SearchActivity searchActivity = this.f30108b;
                String F32 = searchActivity.F3(searchActivity.r3().f12775b.f12786b.getText().toString());
                if (F32.length() > 2 && childCount + findFirstVisibleItemPosition >= itemCount && !this.f30108b.s3().d()) {
                    this.f30108b.I3(F32);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC1980d {
        e() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0()) {
                SearchActivity.this.C2(app.h());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30110a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f30112a;

            a(SearchActivity searchActivity) {
                this.f30112a = searchActivity;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:            if (r4.b().size() == 0) goto L8;     */
            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(q5.AbstractC3768A r4, U5.d r5) {
                /*
                    Method dump skipped, instructions count: 404
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.SearchActivity.f.a.emit(q5.A, U5.d):java.lang.Object");
            }
        }

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30110a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L c8 = SearchActivity.this.s3().c();
                a aVar = new a(SearchActivity.this);
                this.f30110a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchActivity f30115c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30116d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i8, SearchActivity searchActivity, String str, U5.d dVar) {
            super(2, dVar);
            this.f30114b = i8;
            this.f30115c = searchActivity;
            this.f30116d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f30114b, this.f30115c, this.f30116d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30113a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                long j8 = this.f30114b * 1000;
                this.f30113a = 1;
                if (X.b(j8, this) == e8) {
                    return e8;
                }
            }
            y s32 = this.f30115c.s3();
            SearchActivity searchActivity = this.f30115c;
            s32.b(searchActivity, searchActivity.F3(this.f30116d), 0);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30117a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, U5.d dVar) {
            super(2, dVar);
            this.f30119c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f30119c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30117a == 0) {
                Q5.t.b(obj);
                y s32 = SearchActivity.this.s3();
                SearchActivity searchActivity = SearchActivity.this;
                String F32 = searchActivity.F3(this.f30119c);
                I4.F f8 = SearchActivity.this.f30098R;
                AbstractC3292y.f(f8);
                s32.b(searchActivity, F32, f8.getItemCount());
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f30120a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30120a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f30121a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30121a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30123b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30122a = function0;
            this.f30123b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30122a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30123b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public SearchActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.X3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SearchActivity.K3(SearchActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30101U = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(SearchActivity searchActivity, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3292y.i(adapterView, "adapterView");
        if (UptodownApp.f29249C.a0()) {
            Object itemAtPosition = adapterView.getItemAtPosition(i8);
            AbstractC3292y.g(itemAtPosition, "null cannot be cast to non-null type com.uptodown.models.RecentSearch");
            c5.H h8 = (c5.H) itemAtPosition;
            if (h8.a() != null) {
                String a9 = h8.a();
                AbstractC3292y.f(a9);
                H3(searchActivity, a9, 0, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(View view) {
    }

    private final void C3() {
        try {
            this.f30101U.launch(new Intent("android.speech.action.RECOGNIZE_SPEECH"));
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            Toast.makeText(this, getString(R.string.feature_not_supported), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(ArrayList arrayList) {
        this.f30098R = new I4.F(arrayList, new e(), this);
    }

    private final String E3(String str) {
        return new l6.j("[^a-zA-Z0-9 ]+").f(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F3(String str) {
        AbstractC3292y.f(str);
        return l6.n.z(str, "/", "", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String str, int i8) {
        InterfaceC3488x0 d8;
        InterfaceC3488x0 interfaceC3488x0 = this.f30097Q;
        if (interfaceC3488x0 != null) {
            AbstractC3292y.f(interfaceC3488x0);
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        d8 = AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(i8, this, str, null), 3, null);
        this.f30097Q = d8;
    }

    static /* synthetic */ void H3(SearchActivity searchActivity, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        searchActivity.G3(str, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(String str) {
        InterfaceC3488x0 d8;
        if (this.f30100T) {
            InterfaceC3488x0 interfaceC3488x0 = this.f30097Q;
            if (interfaceC3488x0 != null) {
                AbstractC3292y.f(interfaceC3488x0);
                if (!interfaceC3488x0.b()) {
                    return;
                }
            }
            if (this.f30098R != null) {
                s3().e(true);
                I4.F f8 = this.f30098R;
                if (f8 != null) {
                    f8.d(true);
                }
                d8 = AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(str, null), 3, null);
                this.f30097Q = d8;
            }
        }
    }

    private final void J3(String str) {
        c5.H h8 = new c5.H();
        h8.c(E3(str));
        h8.d(String.valueOf(System.currentTimeMillis()));
        C3791p a9 = C3791p.f37286s.a(this);
        a9.a();
        Iterator it = a9.q0().iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                if (l6.n.s(((c5.H) next).a(), str, true)) {
                    break;
                }
            } else {
                a9.L0(h8);
                break;
            }
        }
        a9.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(SearchActivity searchActivity, ActivityResult activityResult) {
        String str;
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Intent data = activityResult.getData();
            AbstractC3292y.f(data);
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra != null) {
                str = stringArrayListExtra.get(0);
            } else {
                str = null;
            }
            searchActivity.r3().f12775b.f12786b.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1515h0 q3(SearchActivity searchActivity) {
        return C1515h0.c(searchActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1515h0 r3() {
        return (C1515h0) this.f30095O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y s3() {
        return (y) this.f30096P.getValue();
    }

    private final void t3(Intent intent) {
        String stringExtra;
        if (AbstractC3292y.d("android.intent.action.SEARCH", intent.getAction()) && (stringExtra = intent.getStringExtra(MBridgeConstans.DYNAMIC_VIEW_WX_QUERY)) != null) {
            H3(this, stringExtra, 0, 2, null);
        }
    }

    private final void u3() {
        Object systemService = getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(r3().f12775b.f12786b.getWindowToken(), 0);
    }

    private final void v3() {
        setContentView(r3().getRoot());
        ImageView imageView = (ImageView) findViewById(R.id.iv_back_search_bar);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.Y3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchActivity.w3(SearchActivity.this, view);
                }
            });
        }
        r3().f12775b.f12788d.setOnClickListener(new View.OnClickListener() { // from class: F4.Z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.x3(SearchActivity.this, view);
            }
        });
        r3().f12775b.f12789e.setOnClickListener(new View.OnClickListener() { // from class: F4.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.y3(SearchActivity.this, view);
            }
        });
        r3().f12775b.f12786b.requestFocus();
        InstantAutoCompleteTextView instantAutoCompleteTextView = r3().f12775b.f12786b;
        j.a aVar = J4.j.f4395g;
        instantAutoCompleteTextView.setTypeface(aVar.v());
        r3().f12775b.f12786b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: F4.b4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean z32;
                z32 = SearchActivity.z3(SearchActivity.this, textView, i8, keyEvent);
                return z32;
            }
        });
        this.f30099S = new a(this, this);
        r3().f12775b.f12786b.setAdapter(this.f30099S);
        r3().f12775b.f12786b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: F4.c4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                SearchActivity.A3(SearchActivity.this, adapterView, view, i8, j8);
            }
        });
        InstantAutoCompleteTextView actvSearchBar = r3().f12775b.f12786b;
        AbstractC3292y.h(actvSearchBar, "actvSearchBar");
        actvSearchBar.addTextChangedListener(new c());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        r3().f12777d.setLayoutManager(linearLayoutManager);
        r3().f12777d.setItemAnimator(new DefaultItemAnimator());
        r3().f12777d.addOnScrollListener(new d(linearLayoutManager, this));
        r3().f12776c.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.B3(view);
            }
        });
        r3().f12778e.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(SearchActivity searchActivity, View view) {
        if (UptodownApp.f29249C.a0()) {
            searchActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(SearchActivity searchActivity, View view) {
        if (UptodownApp.f29249C.a0()) {
            searchActivity.r3().f12775b.f12786b.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(SearchActivity searchActivity, View view) {
        if (UptodownApp.f29249C.a0()) {
            searchActivity.C3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z3(SearchActivity searchActivity, TextView v8, int i8, KeyEvent keyEvent) {
        AbstractC3292y.i(v8, "v");
        if (i8 != 3) {
            return false;
        }
        String obj = v8.getText().toString();
        if (obj.length() > 0) {
            searchActivity.u3();
            H3(searchActivity, obj, 0, 2, null);
            Bundle bundle = new Bundle();
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, obj);
            C3795t q22 = searchActivity.q2();
            if (q22 != null) {
                q22.e("search", bundle);
            }
            searchActivity.J3(obj);
            searchActivity.r3().f12775b.f12786b.dismissDropDown();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v3();
        a aVar = this.f30099S;
        AbstractC3292y.f(aVar);
        aVar.getFilter().filter(r3().f12775b.f12786b.getText().toString());
        Intent intent = getIntent();
        if (intent != null) {
            t3(intent);
        }
        r3().f12776c.f12236b.setVisibility(8);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(null), 2, null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3292y.i(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        AbstractC3292y.h(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_search, menu);
        Object systemService = getSystemService("search");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.SearchManager");
        SearchManager searchManager = (SearchManager) systemService;
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setIconifiedByDefault(false);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC3292y.i(intent, "intent");
        super.onNewIntent(intent);
        t3(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        u3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(r3().f12775b.f12786b, 1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startSearch(null, false, new Bundle(), false);
        return true;
    }
}
