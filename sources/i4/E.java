package I4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1974C;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4050t0;

/* loaded from: classes5.dex */
public final class E extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3429c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3430a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1974C f3431b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public E(ArrayList arrayList, InterfaceC1974C listener) {
        AbstractC3292y.i(listener, "listener");
        this.f3430a = arrayList;
        this.f3431b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4050t0 viewHolder, int i8) {
        Object obj;
        AbstractC3292y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3430a;
        Object obj2 = null;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof c5.V) {
            ArrayList arrayList2 = this.f3430a;
            if (arrayList2 != null) {
                obj2 = arrayList2.get(i8);
            }
            AbstractC3292y.f(obj2);
            viewHolder.g((c5.V) obj2);
            return;
        }
        ArrayList arrayList3 = this.f3430a;
        if (arrayList3 != null) {
            obj2 = arrayList3.get(i8);
        }
        AbstractC3292y.f(obj2);
        viewHolder.f((c5.N) obj2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4050t0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.screenshot_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4050t0(inflate, this.f3431b);
    }

    public final void c(Object item) {
        Integer num;
        AbstractC3292y.i(item, "item");
        ArrayList arrayList = this.f3430a;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.indexOf(item));
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1) {
            ArrayList arrayList2 = this.f3430a;
            if (arrayList2 != null) {
                arrayList2.remove(num.intValue());
            }
            notifyItemRemoved(num.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3430a;
        if (arrayList != null) {
            AbstractC3292y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj;
        ArrayList arrayList = this.f3430a;
        if (arrayList != null) {
            obj = arrayList.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof c5.V) {
            return 0;
        }
        return 1;
    }
}
