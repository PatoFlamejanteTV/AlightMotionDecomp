package x5;

import Q7.n;
import R5.AbstractC1435t;
import S7.p;
import a8.i;
import a8.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.AbstractC1948c;
import b8.a;
import c.C1996d;
import c.C1997e;
import c.C1999g;
import c.C2001i;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3475q0;
import o.AbstractC3495a;
import o.AbstractC3496b;
import o.C3504j;

/* loaded from: classes5.dex */
public final class i extends a8.a implements a.b, m.a {

    /* renamed from: E, reason: collision with root package name */
    public static final a f41100E = new a();

    /* renamed from: F, reason: collision with root package name */
    public static final String f41101F = i.class.getName();

    /* renamed from: A, reason: collision with root package name */
    public TextView f41102A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f41103B;

    /* renamed from: C, reason: collision with root package name */
    public k f41104C;

    /* renamed from: D, reason: collision with root package name */
    public m f41105D;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f41106m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f41107n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f41108o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f41109p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f41110q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f41111r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f41112s;

    /* renamed from: t, reason: collision with root package name */
    public Button f41113t;

    /* renamed from: u, reason: collision with root package name */
    public Button f41114u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f41115v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f41116w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f41117x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f41118y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f41119z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(i this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(i this$0, Boolean bool) {
        AbstractC3292y.i(this$0, "this$0");
        m mVar = this$0.f41105D;
        k kVar = null;
        if (mVar == null) {
            AbstractC3292y.y("stacksAdapter");
            mVar = null;
        }
        k kVar2 = this$0.f41104C;
        if (kVar2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        List items = kVar.d();
        mVar.getClass();
        AbstractC3292y.i(items, "items");
        mVar.f14207a = items;
        mVar.notifyDataSetChanged();
    }

    public static final void m(i this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void n(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3292y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new G5.h(), G5.h.f3083r)) != null) {
            add.commit();
        }
    }

    public static final void o(i this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void p(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3292y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3504j(), C3504j.f35800u)) != null) {
            add.commit();
        }
    }

    public static final void r(final i this$0, View view) {
        C1999g c1999g;
        AbstractC3292y.i(this$0, "this$0");
        C2001i c2001i = C2001i.f15172a;
        k kVar = null;
        if (C2001i.f15173b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15164h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            } else {
                c1999g = null;
            }
            if (c1999g != null) {
                C1997e c1997e = c1999g.f15167c;
                if (c1997e == null) {
                    AbstractC3292y.y("viewModel");
                    c1997e = null;
                }
                c1997e.getClass();
                if (C2001i.f15173b) {
                    C2001i.f15174c.setAllOwnedItems();
                    SharedStorage sharedStorage = c1997e.f15159a;
                    X7.a aVar = X7.a.GBC_CONSENT_STRING;
                    sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15174c));
                    ChoiceCmpCallback choiceCmpCallback = c1997e.f15160b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
                    }
                    AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new C1996d(null), 2, null);
                }
            }
        }
        k kVar2 = this$0.f41104C;
        if (kVar2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.f41122a.x();
        kVar.e();
        Q7.m.f9074a.b(n.ACCEPT_ALL, Q7.f.GDPR).observe(this$0, new Observer() { // from class: x5.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.m(i.this, (String) obj);
            }
        });
    }

    public static final void t(final i this$0, View view) {
        C1999g c1999g;
        AbstractC3292y.i(this$0, "this$0");
        k kVar = null;
        if (C2001i.f15173b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15164h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            } else {
                c1999g = null;
            }
            if (c1999g != null) {
                c1999g.h();
            }
        }
        k kVar2 = this$0.f41104C;
        if (kVar2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.e();
        Q7.m.f9074a.b(n.SAVE_AND_EXIT, Q7.f.GDPR).observe(this$0, new Observer() { // from class: x5.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.o(i.this, (String) obj);
            }
        });
    }

    @Override // b8.a.b
    public void b(b8.d item) {
        AbstractC3292y.i(item, "item");
        k kVar = this.f41104C;
        if (kVar == null) {
            AbstractC3292y.y("viewModel");
            kVar = null;
        }
        kVar.getClass();
        AbstractC3292y.i(item, "item");
        G6.f fVar = item.f15122a;
        if (fVar instanceof G6.i) {
            Boolean bool = item.f15123b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3292y.d(bool, bool2)) {
                kVar.f41122a.f1431r.set(item.f15122a.f3123a);
            } else {
                kVar.f41122a.f1431r.unset(item.f15122a.f3123a);
            }
            Q7.m mVar = Q7.m.f9074a;
            StringBuilder a9 = AbstractC3495a.a("Purposes", '_');
            a9.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, bool2, mVar, a9.toString());
            return;
        }
        if (fVar instanceof G6.d) {
            Boolean bool3 = item.f15123b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3292y.d(bool3, bool4)) {
                kVar.f41122a.f1430q.set(item.f15122a.f3123a);
            } else {
                kVar.f41122a.f1430q.unset(item.f15122a.f3123a);
            }
            Q7.m mVar2 = Q7.m.f9074a;
            StringBuilder a10 = AbstractC3495a.a("Special Features", '_');
            a10.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, bool4, mVar2, a10.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.a.b
    public void e(b8.d item) {
        AbstractC3292y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f15122a instanceof G6.g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = a8.i.f14184y;
            String str = a8.i.f14185z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                G6.f fVar = item.f15122a;
                String str2 = fVar.f3124b;
                String a9 = ((G6.g) fVar).a();
                String b9 = ((G6.g) item.f15122a).b();
                k kVar = this.f41104C;
                k kVar2 = null;
                if (kVar == null) {
                    AbstractC3292y.y("viewModel");
                    kVar = null;
                }
                String str3 = kVar.f41127f.f().f9900i;
                k kVar3 = this.f41104C;
                if (kVar3 == null) {
                    AbstractC3292y.y("viewModel");
                } else {
                    kVar2 = kVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a9, b9, str3, kVar2.f41127f.f().f9905n, item.f15122a.f3123a, item.f15125d, false, null, 384), str).commit();
            }
        }
    }

    @Override // a8.m.a
    public void f(p item) {
        AbstractC3292y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str = K5.d.f4804w;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                int i8 = item.f9944a;
                K5.d dVar = new K5.d();
                Bundle bundle = new Bundle();
                bundle.putInt("stack_id", i8);
                dVar.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().add(dVar, str).commit();
            }
        }
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore, "it.viewModelStore");
            k kVar = (k) new ViewModelProvider(viewModelStore, new l()).get(k.class);
            this.f41104C = kVar;
            if (kVar == null) {
                AbstractC3292y.y("viewModel");
                kVar = null;
            }
            kVar.f41136o.observe(this, new Observer() { // from class: x5.a
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    i.l(i.this, (Boolean) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6049g, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentActivity activity;
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == 16908332 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        int i9;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        k kVar;
        int i10;
        int i11;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        String str;
        Map map;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f41106m = (RecyclerView) view.findViewById(M1.b.f5959T);
        this.f41107n = (RecyclerView) view.findViewById(M1.b.f5967X);
        this.f41108o = (RecyclerView) view.findViewById(M1.b.f5963V);
        this.f41109p = (RecyclerView) view.findViewById(M1.b.f5969Y);
        this.f41110q = (ConstraintLayout) view.findViewById(M1.b.f5941K);
        this.f41111r = (LinearLayout) view.findViewById(M1.b.f5980c0);
        this.f41112s = (LinearLayout) view.findViewById(M1.b.f5983d0);
        this.f41114u = (Button) view.findViewById(M1.b.f5979c);
        this.f41113t = (Button) view.findViewById(M1.b.f6006l);
        this.f41115v = (TextView) view.findViewById(M1.b.f5970Y0);
        this.f41116w = (TextView) view.findViewById(M1.b.f6002j1);
        this.f41117x = (TextView) view.findViewById(M1.b.f5981c1);
        this.f41118y = (TextView) view.findViewById(M1.b.f5948N0);
        this.f41119z = (TextView) view.findViewById(M1.b.f5968X0);
        this.f41102A = (TextView) view.findViewById(M1.b.f5966W0);
        int i12 = M1.b.f6041z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i12);
        this.f41103B = frameLayout;
        if (C2001i.f15173b) {
            getChildFragmentManager().beginTransaction().add(i12, new C1999g(), C1999g.f15164h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        k kVar2 = this.f41104C;
        if (kVar2 == null) {
            AbstractC3292y.y("viewModel");
            kVar2 = null;
        }
        kVar2.getClass();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(kVar2), C3445b0.b(), null, new j(kVar2, null), 2, null);
        k kVar3 = this.f41104C;
        if (kVar3 == null) {
            AbstractC3292y.y("viewModel");
            kVar3 = null;
        }
        G6.e eVar = kVar3.f41122a.f1414a;
        if (eVar == null || (map = eVar.f3119i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((G6.l) entry.getValue()).f3137k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = kVar3.f41123b.f4498c.f4493a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1435t.b1(((J6.d) obj).f4491f);
            List list2 = kVar3.f41123b.f4497b.f4462h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1948c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        int size = kVar3.f41124c.f1371a.size() + arrayList.size() + i8;
        if (kVar3.f41125d == null) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        String valueOf = String.valueOf(size + i9);
        k kVar4 = this.f41104C;
        if (kVar4 == null) {
            AbstractC3292y.y("viewModel");
            kVar4 = null;
        }
        String str2 = kVar4.f41127f.f().f9893b;
        TextView textView = this.f41102A;
        if (textView != null) {
            textView.setText(l6.n.x(str2, "${partners}", valueOf, true));
        }
        TextView textView2 = this.f41102A;
        if (textView2 != null) {
            k kVar5 = this.f41104C;
            if (kVar5 == null) {
                AbstractC3292y.y("viewModel");
                kVar5 = null;
            }
            kVar5.getClass();
            if (C2001i.f15173b) {
                str = kVar5.f41132k.f5406b.f5401c;
            } else {
                str = "";
            }
            textView2.append(str);
        }
        TextView textView3 = this.f41119z;
        if (textView3 != null) {
            k kVar6 = this.f41104C;
            if (kVar6 == null) {
                AbstractC3292y.y("viewModel");
                kVar6 = null;
            }
            textView3.setText(R7.b.a(kVar6.f41127f.f().f9896e));
        }
        TextView textView4 = this.f41118y;
        if (textView4 != null) {
            k kVar7 = this.f41104C;
            if (kVar7 == null) {
                AbstractC3292y.y("viewModel");
                kVar7 = null;
            }
            textView4.setText(R7.b.a(kVar7.f41127f.f().f9894c));
        }
        TextView textView5 = this.f41117x;
        if (textView5 != null) {
            k kVar8 = this.f41104C;
            if (kVar8 == null) {
                AbstractC3292y.y("viewModel");
                kVar8 = null;
            }
            textView5.setText(kVar8.f41127f.f().f9895d);
        }
        TextView textView6 = this.f41116w;
        if (textView6 != null) {
            k kVar9 = this.f41104C;
            if (kVar9 == null) {
                AbstractC3292y.y("viewModel");
                kVar9 = null;
            }
            textView6.setText(kVar9.f41127f.f().f9897f);
        }
        TextView textView7 = this.f41115v;
        if (textView7 != null) {
            k kVar10 = this.f41104C;
            if (kVar10 == null) {
                AbstractC3292y.y("viewModel");
                kVar10 = null;
            }
            textView7.setText(kVar10.f41127f.f().f9901j);
        }
        TextView textView8 = this.f14148b;
        if (textView8 != null) {
            k kVar11 = this.f41104C;
            if (kVar11 == null) {
                AbstractC3292y.y("viewModel");
                kVar11 = null;
            }
            textView8.setText(kVar11.f41127f.f().f9892a);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: x5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
            k kVar12 = this.f41104C;
            if (kVar12 == null) {
                AbstractC3292y.y("viewModel");
                kVar12 = null;
            }
            imageView.setContentDescription(kVar12.f41127f.f().f9906o);
        }
        k kVar13 = this.f41104C;
        if (kVar13 == null) {
            AbstractC3292y.y("viewModel");
            kVar13 = null;
        }
        List d8 = kVar13.d();
        S7.c cVar = this.f14156j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f9794i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f9786a;
        }
        this.f41105D = new m(d8, this, num, num2, this.f14158l);
        RecyclerView recyclerView = this.f41109p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            m mVar = this.f41105D;
            if (mVar == null) {
                AbstractC3292y.y("stacksAdapter");
                mVar = null;
            }
            recyclerView.setAdapter(mVar);
        }
        RecyclerView recyclerView2 = this.f41108o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            k kVar14 = this.f41104C;
            if (kVar14 == null) {
                AbstractC3292y.y("viewModel");
                kVar14 = null;
            }
            List b9 = kVar14.b();
            S7.c cVar2 = this.f14156j;
            if (cVar2 == null) {
                num3 = null;
            } else {
                num3 = cVar2.f9794i;
            }
            if (cVar2 == null) {
                num4 = null;
            } else {
                num4 = cVar2.f9790e;
            }
            if (cVar2 == null) {
                num5 = null;
            } else {
                num5 = cVar2.f9791f;
            }
            if (cVar2 == null) {
                num6 = null;
            } else {
                num6 = cVar2.f9786a;
            }
            recyclerView2.setAdapter(new b8.a(b9, this, null, null, num3, num4, num5, num6, null, this.f14158l, 268));
        }
        RecyclerView recyclerView3 = this.f41107n;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            k kVar15 = this.f41104C;
            if (kVar15 == null) {
                AbstractC3292y.y("viewModel");
                kVar15 = null;
            }
            List c8 = kVar15.c();
            S7.c cVar3 = this.f14156j;
            if (cVar3 == null) {
                num9 = null;
            } else {
                num9 = cVar3.f9794i;
            }
            if (cVar3 == null) {
                num10 = null;
            } else {
                num10 = cVar3.f9790e;
            }
            if (cVar3 == null) {
                num11 = null;
            } else {
                num11 = cVar3.f9791f;
            }
            if (cVar3 == null) {
                num12 = null;
            } else {
                num12 = cVar3.f9786a;
            }
            recyclerView3.setAdapter(new b8.a(c8, this, null, null, num9, num10, num11, num12, null, this.f14158l, 268));
        }
        RecyclerView recyclerView4 = this.f41106m;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
            k kVar16 = this.f41104C;
            if (kVar16 == null) {
                AbstractC3292y.y("viewModel");
                kVar16 = null;
            }
            List list3 = kVar16.f41128g;
            Context context = recyclerView4.getContext();
            AbstractC3292y.h(context, "context");
            S7.c cVar4 = this.f14156j;
            if (cVar4 == null) {
                num8 = null;
            } else {
                num8 = cVar4.f9797l;
            }
            recyclerView4.setAdapter(new a8.l(list3, context, num8, this.f14158l));
        }
        s();
        TextView textView9 = this.f41117x;
        if (textView9 != null) {
            k kVar17 = this.f41104C;
            if (kVar17 == null) {
                AbstractC3292y.y("viewModel");
                kVar17 = null;
            }
            k kVar18 = this.f41104C;
            if (kVar18 == null) {
                AbstractC3292y.y("viewModel");
                kVar18 = null;
            }
            List itemsList = kVar18.b();
            kVar17.getClass();
            AbstractC3292y.i(itemsList, "itemsList");
            if (!((ArrayList) itemsList).isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView9.setVisibility(i11);
        }
        TextView textView10 = this.f41116w;
        if (textView10 != null) {
            k kVar19 = this.f41104C;
            if (kVar19 == null) {
                AbstractC3292y.y("viewModel");
                kVar19 = null;
            }
            k kVar20 = this.f41104C;
            if (kVar20 == null) {
                AbstractC3292y.y("viewModel");
                kVar = null;
            } else {
                kVar = kVar20;
            }
            List itemsList2 = kVar.c();
            kVar19.getClass();
            AbstractC3292y.i(itemsList2, "itemsList");
            if (!((ArrayList) itemsList2).isEmpty()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView10.setVisibility(i10);
        }
        S7.c cVar5 = this.f14156j;
        if (cVar5 != null) {
            Integer num13 = cVar5.f9792g;
            if (num13 != null) {
                int intValue = num13.intValue();
                ConstraintLayout constraintLayout = this.f41110q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num14 = cVar5.f9794i;
            if (num14 != null) {
                int intValue2 = num14.intValue();
                TextView textView11 = this.f41117x;
                if (textView11 != null) {
                    textView11.setTextColor(intValue2);
                }
                TextView textView12 = this.f41116w;
                if (textView12 != null) {
                    textView12.setTextColor(intValue2);
                }
                TextView textView13 = this.f41115v;
                if (textView13 != null) {
                    textView13.setTextColor(intValue2);
                }
                TextView textView14 = this.f41119z;
                if (textView14 != null) {
                    textView14.setTextColor(intValue2);
                }
                TextView textView15 = this.f41118y;
                if (textView15 != null) {
                    textView15.setTextColor(intValue2);
                }
                TextView textView16 = this.f41102A;
                if (textView16 != null) {
                    textView16.setTextColor(intValue2);
                }
            }
            Integer num15 = cVar5.f9786a;
            if (num15 != null) {
                int intValue3 = num15.intValue();
                TextView textView17 = this.f41102A;
                if (textView17 != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue3);
                    textView17.setBackground(gradientDrawable);
                }
            }
            Integer num16 = cVar5.f9798m;
            if (num16 != null) {
                int intValue4 = num16.intValue();
                Button button = this.f41114u;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f41113t;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num17 = cVar5.f9800o;
            if (num17 != null) {
                int intValue5 = num17.intValue();
                Button button3 = this.f41114u;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
                Button button4 = this.f41113t;
                if (button4 != null) {
                    button4.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        S7.c cVar6 = this.f14156j;
        if (cVar6 != null && (num7 = cVar6.f9786a) != null) {
            int intValue6 = num7.intValue();
            View findViewById = view.findViewById(M1.b.f5949O);
            if (findViewById != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById2 = view.findViewById(M1.b.f5989f0);
            if (findViewById2 != null) {
                findViewById2.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById3 = view.findViewById(M1.b.f5945M);
            if (findViewById3 != null) {
                findViewById3.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById4 = view.findViewById(M1.b.f6018p);
            if (findViewById4 != null) {
                findViewById4.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById5 = view.findViewById(M1.b.f5933G);
            if (findViewById5 != null) {
                findViewById5.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
        }
        Typeface typeface = this.f14157k;
        if (typeface != null) {
            TextView textView18 = this.f41117x;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            TextView textView19 = this.f41116w;
            if (textView19 != null) {
                textView19.setTypeface(typeface);
            }
            TextView textView20 = this.f41115v;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f14158l;
        if (typeface2 != null) {
            TextView textView21 = this.f41102A;
            if (textView21 != null) {
                textView21.setTypeface(typeface2);
            }
            TextView textView22 = this.f41119z;
            if (textView22 != null) {
                textView22.setTypeface(typeface2);
            }
            TextView textView23 = this.f41118y;
            if (textView23 != null) {
                textView23.setTypeface(typeface2);
            }
            Button button5 = this.f41114u;
            if (button5 != null) {
                button5.setTypeface(typeface2);
            }
            Button button6 = this.f41113t;
            if (button6 != null) {
                button6.setTypeface(typeface2);
            }
        }
    }

    public final void q() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager.findFragmentByTag(I5.f.f3767m);
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) fragment;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismiss();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void s() {
        Button button = this.f41114u;
        k kVar = null;
        if (button != null) {
            k kVar2 = this.f41104C;
            if (kVar2 == null) {
                AbstractC3292y.y("viewModel");
                kVar2 = null;
            }
            button.setText(kVar2.f41127f.f().f9898g);
            button.setOnClickListener(new View.OnClickListener() { // from class: x5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.r(i.this, view);
                }
            });
        }
        Button button2 = this.f41113t;
        if (button2 != null) {
            k kVar3 = this.f41104C;
            if (kVar3 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                kVar = kVar3;
            }
            button2.setText(kVar.f41127f.f().f9899h);
            button2.setOnClickListener(new View.OnClickListener() { // from class: x5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.t(i.this, view);
                }
            });
        }
        LinearLayout linearLayout = this.f41112s;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: x5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.n(i.this, view);
                }
            });
        }
        LinearLayout linearLayout2 = this.f41111r;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: x5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.p(i.this, view);
                }
            });
        }
    }
}
