package I4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3707a;

    /* renamed from: b, reason: collision with root package name */
    private final b5.u f3708b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3709c;

    public r(ArrayList arrayList, b5.u listener, String currentLanguageCode) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(currentLanguageCode, "currentLanguageCode");
        this.f3707a = arrayList;
        this.f3708b = listener;
        this.f3709c = currentLanguageCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(t5.K viewHolder, int i8) {
        c5.y yVar;
        AbstractC3292y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3707a;
        if (arrayList != null) {
            yVar = (c5.y) arrayList.get(i8);
        } else {
            yVar = null;
        }
        AbstractC3292y.f(yVar);
        viewHolder.b(yVar, this.f3709c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t5.K onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new t5.K(inflate, this.f3708b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3707a;
        if (arrayList != null) {
            AbstractC3292y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
