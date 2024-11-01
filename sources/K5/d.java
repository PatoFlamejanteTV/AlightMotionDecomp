package K5;

import G6.g;
import G6.j;
import a8.i;
import android.R;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import x5.k;
import x5.l;

/* loaded from: classes5.dex */
public final class d extends a8.a implements a.b {

    /* renamed from: v, reason: collision with root package name */
    public static final a f4803v = new a();

    /* renamed from: w, reason: collision with root package name */
    public static final String f4804w = d.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public Button f4805m;

    /* renamed from: n, reason: collision with root package name */
    public Button f4806n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f4807o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f4808p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f4809q;

    /* renamed from: r, reason: collision with root package name */
    public int f4810r;

    /* renamed from: s, reason: collision with root package name */
    public b8.a f4811s;

    /* renamed from: t, reason: collision with root package name */
    public e f4812t;

    /* renamed from: u, reason: collision with root package name */
    public k f4813u;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(d this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(d this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        e eVar = this$0.f4812t;
        if (eVar == null) {
            AbstractC3292y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f4810r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f4814a.f1431r.unset(((b8.d) it.next()).f15122a.f3123a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f4814a.f1430q.unset(((b8.d) it2.next()).f15122a.f3123a);
        }
        this$0.q();
    }

    public static final void n(d this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        e eVar = this$0.f4812t;
        if (eVar == null) {
            AbstractC3292y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f4810r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f4814a.f1431r.set(((b8.d) it.next()).f15122a.f3123a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f4814a.f1430q.set(((b8.d) it2.next()).f15122a.f3123a);
        }
        this$0.q();
    }

    @Override // b8.a.b
    public void b(b8.d switchItem) {
        AbstractC3292y.i(switchItem, "item");
        e eVar = this.f4812t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3292y.y("viewModel");
            eVar = null;
        }
        eVar.getClass();
        AbstractC3292y.i(switchItem, "switchItem");
        int ordinal = switchItem.f15125d.ordinal();
        if (ordinal != 4) {
            if (ordinal == 7) {
                if (AbstractC3292y.d(switchItem.f15123b, Boolean.TRUE)) {
                    eVar.f4814a.f1430q.set(switchItem.f15122a.f3123a);
                } else {
                    eVar.f4814a.f1430q.unset(switchItem.f15122a.f3123a);
                }
            }
        } else if (AbstractC3292y.d(switchItem.f15123b, Boolean.TRUE)) {
            eVar.f4814a.f1431r.set(switchItem.f15122a.f3123a);
        } else {
            eVar.f4814a.f1431r.unset(switchItem.f15122a.f3123a);
        }
        e eVar3 = this.f4812t;
        if (eVar3 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            eVar2 = eVar3;
        }
        l(eVar2.b(this.f4810r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.a.b
    public void e(b8.d item) {
        AbstractC3292y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f15122a instanceof g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = i.f14184y;
            String str = i.f14185z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                G6.f fVar = item.f15122a;
                String str2 = fVar.f3124b;
                String a9 = ((g) fVar).a();
                String b9 = ((g) item.f15122a).b();
                e eVar = this.f4812t;
                e eVar2 = null;
                if (eVar == null) {
                    AbstractC3292y.y("viewModel");
                    eVar = null;
                }
                String str3 = eVar.f4816c.h().f9948b;
                e eVar3 = this.f4812t;
                if (eVar3 == null) {
                    AbstractC3292y.y("viewModel");
                } else {
                    eVar2 = eVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a9, b9, str3, eVar2.f4816c.h().f9951e, item.f15122a.f3123a, item.f15125d, false, null, 384), str).commit();
            }
        }
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f4806n;
        boolean z9 = false;
        if (button != null) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z8 = true;
                        break;
                    }
                }
            }
            z8 = false;
            button.setEnabled(z8);
        }
        Button button2 = this.f4805m;
        if (button2 != null) {
            if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
            }
            button2.setEnabled(z9);
        }
    }

    public final ColorStateList o() {
        Integer num;
        S7.c cVar = this.f14156j;
        if (cVar == null || (num = cVar.f9800o) == null || cVar.f9801p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f9801p.intValue()});
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f4812t = (e) new ViewModelProvider(viewModelStore, new f()).get(e.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore2, "it.viewModelStore");
            this.f4813u = (k) new ViewModelProvider(viewModelStore2, new l()).get(k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6053k, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…stacks, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC3292y.i(dialog, "dialog");
        super.onDismiss(dialog);
        k kVar = this.f4813u;
        if (kVar == null) {
            AbstractC3292y.y("optionsViewModel");
            kVar = null;
        }
        kVar.f41136o.postValue(Boolean.TRUE);
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
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        Map map;
        j jVar;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f4805m = (Button) view.findViewById(M1.b.f5979c);
        this.f4806n = (Button) view.findViewById(M1.b.f5991g);
        this.f4807o = (RecyclerView) view.findViewById(M1.b.f5971Z);
        this.f4808p = (TextView) view.findViewById(M1.b.f6008l1);
        this.f4809q = (ConstraintLayout) view.findViewById(M1.b.f5992g0);
        Bundle arguments = getArguments();
        if (arguments == null) {
            i8 = 0;
        } else {
            i8 = arguments.getInt("stack_id");
        }
        this.f4810r = i8;
        TextView textView = this.f4808p;
        b8.a aVar = null;
        if (textView != null) {
            e eVar = this.f4812t;
            if (eVar == null) {
                AbstractC3292y.y("viewModel");
                eVar = null;
            }
            int i9 = this.f4810r;
            G6.e eVar2 = eVar.f4814a.f1414a;
            if (eVar2 == null || (map = eVar2.f3120j) == null || (jVar = (j) map.get(String.valueOf(i9))) == null) {
                str = null;
            } else {
                str = jVar.f3124b;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f14148b;
        if (textView2 != null) {
            e eVar3 = this.f4812t;
            if (eVar3 == null) {
                AbstractC3292y.y("viewModel");
                eVar3 = null;
            }
            textView2.setText(eVar3.f4816c.h().f9947a);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: K5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.k(d.this, view2);
                }
            });
            e eVar4 = this.f4812t;
            if (eVar4 == null) {
                AbstractC3292y.y("viewModel");
                eVar4 = null;
            }
            imageView.setContentDescription(eVar4.f4816c.h().f9952f);
        }
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num5 = cVar.f9792g;
            if (num5 != null) {
                int intValue = num5.intValue();
                ConstraintLayout constraintLayout = this.f4809q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num6 = cVar.f9794i;
            if (num6 != null) {
                int intValue2 = num6.intValue();
                TextView textView3 = this.f4808p;
                if (textView3 != null) {
                    textView3.setTextColor(intValue2);
                }
            }
            Typeface typeface = this.f14158l;
            if (typeface != null) {
                TextView textView4 = this.f4808p;
                if (textView4 != null) {
                    textView4.setTypeface(typeface);
                }
                Button button = this.f4805m;
                if (button != null) {
                    button.setTypeface(typeface);
                }
                Button button2 = this.f4806n;
                if (button2 != null) {
                    button2.setTypeface(typeface);
                }
            }
            Button button3 = this.f4805m;
            if (button3 != null) {
                ColorStateList p8 = p();
                if (p8 != null) {
                    button3.setTextColor(p8);
                }
                ColorStateList o8 = o();
                if (o8 != null) {
                    button3.setBackgroundTintList(o8);
                }
            }
            Button button4 = this.f4806n;
            if (button4 != null) {
                ColorStateList p9 = p();
                if (p9 != null) {
                    button4.setTextColor(p9);
                }
                ColorStateList o9 = o();
                if (o9 != null) {
                    button4.setBackgroundTintList(o9);
                }
            }
        }
        e eVar5 = this.f4812t;
        if (eVar5 == null) {
            AbstractC3292y.y("viewModel");
            eVar5 = null;
        }
        List a9 = eVar5.a(this.f4810r);
        S7.c cVar2 = this.f14156j;
        if (cVar2 == null) {
            num = null;
        } else {
            num = cVar2.f9794i;
        }
        if (cVar2 == null) {
            num2 = null;
        } else {
            num2 = cVar2.f9790e;
        }
        if (cVar2 == null) {
            num3 = null;
        } else {
            num3 = cVar2.f9791f;
        }
        if (cVar2 == null) {
            num4 = null;
        } else {
            num4 = cVar2.f9786a;
        }
        this.f4811s = new b8.a(a9, this, null, null, num, num2, num3, num4, null, this.f14158l, 268);
        RecyclerView recyclerView = this.f4807o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            b8.a aVar2 = this.f4811s;
            if (aVar2 == null) {
                AbstractC3292y.y("switchAdapter");
            } else {
                aVar = aVar2;
            }
            recyclerView.setAdapter(aVar);
        }
        r();
    }

    public final ColorStateList p() {
        Integer num;
        S7.c cVar = this.f14156j;
        if (cVar == null || (num = cVar.f9798m) == null || cVar.f9799n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f9799n.intValue()});
    }

    public final void q() {
        b8.a aVar = this.f4811s;
        e eVar = null;
        if (aVar == null) {
            AbstractC3292y.y("switchAdapter");
            aVar = null;
        }
        e eVar2 = this.f4812t;
        if (eVar2 == null) {
            AbstractC3292y.y("viewModel");
            eVar2 = null;
        }
        aVar.b(eVar2.a(this.f4810r), true);
        e eVar3 = this.f4812t;
        if (eVar3 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            eVar = eVar3;
        }
        l(eVar.b(this.f4810r));
    }

    public final void r() {
        Button button = this.f4806n;
        if (button != null) {
            button.setText(getString(M1.e.f6073e));
        }
        e eVar = this.f4812t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3292y.y("viewModel");
            eVar = null;
        }
        l(eVar.b(this.f4810r));
        Button button2 = this.f4806n;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: K5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.m(d.this, view);
                }
            });
        }
        Button button3 = this.f4805m;
        if (button3 != null) {
            e eVar3 = this.f4812t;
            if (eVar3 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                eVar2 = eVar3;
            }
            button3.setText(eVar2.f4816c.h().f9949c);
        }
        Button button4 = this.f4805m;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: K5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.n(d.this, view);
                }
            });
        }
    }
}
