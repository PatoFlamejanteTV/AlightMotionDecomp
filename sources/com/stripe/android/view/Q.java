package com.stripe.android.view;

import R5.AbstractC1435t;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import z2.C4266a;

/* loaded from: classes4.dex */
public final class Q extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List f28814a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f28815b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28816c;

    /* renamed from: d, reason: collision with root package name */
    private List f28817d;

    /* loaded from: classes4.dex */
    private static final class a extends Filter {

        /* renamed from: a, reason: collision with root package name */
        private List f28818a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f28819b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference f28820c;

        public a(List unfilteredCountries, Q adapter, Activity activity) {
            AbstractC3292y.i(unfilteredCountries, "unfilteredCountries");
            AbstractC3292y.i(adapter, "adapter");
            this.f28818a = unfilteredCountries;
            this.f28819b = adapter;
            this.f28820c = new WeakReference(activity);
        }

        private final List a(CharSequence charSequence) {
            List b9 = b(charSequence);
            if (b9.isEmpty() || d(b9, charSequence)) {
                return this.f28818a;
            }
            return b9;
        }

        private final List b(CharSequence charSequence) {
            List list = this.f28818a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String f8 = ((C4266a) obj).f();
                Locale locale = Locale.ROOT;
                String lowerCase = f8.toLowerCase(locale);
                AbstractC3292y.h(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                AbstractC3292y.h(lowerCase2, "toLowerCase(...)");
                if (l6.n.B(lowerCase, lowerCase2, false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final void c(Activity activity) {
            InputMethodManager inputMethodManager;
            Object systemService = activity.getSystemService("input_method");
            IBinder iBinder = null;
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }

        private final boolean d(List list, CharSequence charSequence) {
            if (list.size() != 1 || !AbstractC3292y.d(((C4266a) list.get(0)).f(), String.valueOf(charSequence))) {
                return false;
            }
            return true;
        }

        public final void e(List list) {
            AbstractC3292y.i(list, "<set-?>");
            this.f28818a = list;
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            List list;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || (list = a(charSequence)) == null) {
                list = this.f28818a;
            }
            filterResults.values = list;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj;
            if (filterResults != null) {
                obj = filterResults.values;
            } else {
                obj = null;
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = (Activity) this.f28820c.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (AbstractC3292y.d(((C4266a) it.next()).f(), charSequence)) {
                            c(activity);
                            break;
                        }
                    }
                }
            }
            this.f28819b.f28817d = list;
            this.f28819b.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Context context, List unfilteredCountries, int i8, Function1 textViewFactory) {
        super(context, i8);
        Activity activity;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(unfilteredCountries, "unfilteredCountries");
        AbstractC3292y.i(textViewFactory, "textViewFactory");
        this.f28814a = unfilteredCountries;
        this.f28815b = textViewFactory;
        List list = this.f28814a;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f28816c = new a(list, this, activity);
        this.f28817d = this.f28814a;
    }

    public final /* synthetic */ C4266a b() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4266a getItem(int i8) {
        return (C4266a) this.f28817d.get(i8);
    }

    @Override // android.widget.ArrayAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int getPosition(C4266a c4266a) {
        return AbstractC1435t.r0(this.f28817d, c4266a);
    }

    public final List e() {
        return this.f28814a;
    }

    public final boolean f(Set allowedCountryCodes) {
        AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List list = this.f28814a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            z2.b a9 = ((C4266a) obj).a();
            Set set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (l6.n.s((String) it.next(), a9.b(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        this.f28814a = arrayList;
        this.f28816c.e(arrayList);
        this.f28817d = this.f28814a;
        notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f28817d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f28816c;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i8) {
        return getItem(i8).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        TextView textView;
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) this.f28815b.invoke(viewGroup);
        }
        textView.setText(getItem(i8).f());
        return textView;
    }
}
