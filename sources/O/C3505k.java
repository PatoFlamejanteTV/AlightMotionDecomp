package o;

import androidx.appcompat.widget.SearchView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3505k implements SearchView.OnQueryTextListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3504j f35808a;

    public C3505k(C3504j c3504j) {
        this.f35808a = c3504j;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String newText) {
        boolean z8;
        AbstractC3292y.i(newText, "newText");
        b8.a aVar = this.f35808a.f35807s;
        C3507m c3507m = null;
        if (aVar == null) {
            AbstractC3292y.y("switchAdapter");
            aVar = null;
        }
        C3507m c3507m2 = this.f35808a.f35805q;
        if (c3507m2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c3507m = c3507m2;
        }
        List b9 = c3507m.b(newText);
        if (newText.length() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.b(b9, z8);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }
}
