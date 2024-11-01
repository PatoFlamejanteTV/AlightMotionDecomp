package t5;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class e1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f39891a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_container_warning_not_storage_available);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39891a = (RelativeLayout) findViewById;
    }

    public final void a(boolean z8) {
        if (z8) {
            this.f39891a.setVisibility(0);
        } else {
            this.f39891a.setVisibility(8);
        }
    }
}
