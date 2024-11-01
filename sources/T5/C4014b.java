package t5;

import J4.j;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1979c;
import c5.C2055u;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4014b extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1979c f39823a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f39824b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39825c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39826d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f39827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4014b(View itemView, InterfaceC1979c listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        this.f39823a = listener;
        View findViewById = itemView.findViewById(R.id.rl_app_file_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39824b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_type_app_file_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39825c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_file_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39826d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_app_file_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39827e = (TextView) findViewById4;
        TextView textView = this.f39825c;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        this.f39826d.setTypeface(aVar.u());
        this.f39827e.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4014b c4014b, C2055u c2055u, View view) {
        c4014b.f39823a.a(c2055u);
    }

    public final void b(final C2055u fileInfo) {
        AbstractC3292y.i(fileInfo, "fileInfo");
        this.f39824b.setOnClickListener(new View.OnClickListener() { // from class: t5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4014b.c(C4014b.this, fileInfo, view);
            }
        });
        String c8 = fileInfo.c();
        if (c8 != null) {
            TextView textView = this.f39825c;
            String substring = c8.substring(l6.n.X(c8, ".", 0, false, 6, null) + 1);
            AbstractC3292y.h(substring, "substring(...)");
            textView.setText(substring);
        }
        this.f39826d.setText(fileInfo.c());
        this.f39827e.setText(new S4.g().c(fileInfo.e()));
    }
}
