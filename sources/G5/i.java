package G5;

import androidx.appcompat.widget.SearchView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i implements SearchView.OnQueryTextListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f3088a;

    public i(h hVar) {
        this.f3088a = hVar;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String newText) {
        boolean z8;
        AbstractC3292y.i(newText, "newText");
        b8.a aVar = this.f3088a.f3087p;
        l lVar = null;
        if (aVar == null) {
            AbstractC3292y.y("switchAdapter");
            aVar = null;
        }
        l lVar2 = this.f3088a.f3086o;
        if (lVar2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            lVar = lVar2;
        }
        List c8 = lVar.c(newText);
        if (newText.length() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.b(c8, z8);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }
}
