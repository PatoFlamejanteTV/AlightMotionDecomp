package W4;

import J4.h;
import J4.j;
import S4.u;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final O4.g f10775a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f10776b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f10777c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f10778d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f10779e;

    /* renamed from: f, reason: collision with root package name */
    private final CheckBox f10780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView, O4.g listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        this.f10775a = listener;
        View findViewById = itemView.findViewById(J4.e.f4276s);
        AbstractC3292y.h(findViewById, "itemView.findViewById(R.id.iv_icon_file_item)");
        this.f10776b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(J4.e.f4149B1);
        AbstractC3292y.h(findViewById2, "itemView.findViewById(R.id.tv_name_file_item)");
        TextView textView = (TextView) findViewById2;
        this.f10777c = textView;
        View findViewById3 = itemView.findViewById(J4.e.f4166H0);
        AbstractC3292y.h(findViewById3, "itemView.findViewById(R.id.tv_date_file_item)");
        TextView textView2 = (TextView) findViewById3;
        this.f10778d = textView2;
        View findViewById4 = itemView.findViewById(J4.e.f4197R1);
        AbstractC3292y.h(findViewById4, "itemView.findViewById(R.id.tv_size_file_item)");
        TextView textView3 = (TextView) findViewById4;
        this.f10779e = textView3;
        View findViewById5 = itemView.findViewById(J4.e.f4246i);
        AbstractC3292y.h(findViewById5, "itemView.findViewById(R.id.cb_checked_file_item)");
        this.f10780f = (CheckBox) findViewById5;
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e this$0, Object file, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f10775a.a(file, absoluteAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(e this$0, Object file, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f10775a.b(file, absoluteAdapterPosition);
            return true;
        }
        return true;
    }

    public final void c(final Object file, boolean z8, boolean z9) {
        long j8;
        String str;
        String str2;
        boolean z10;
        Drawable drawable;
        AbstractC3292y.i(file, "file");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: W4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.d(e.this, file, view);
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: W4.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean e8;
                e8 = e.e(e.this, file, view);
                return e8;
            }
        });
        if (file instanceof File) {
            File file2 = (File) file;
            str = file2.getName();
            str2 = new S4.e().g(file2.lastModified());
            z10 = file2.isDirectory();
            j8 = file2.length();
        } else if (file instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) file;
            str = documentFile.getName();
            str2 = new S4.e().g(documentFile.lastModified());
            z10 = documentFile.isDirectory();
            j8 = documentFile.length();
        } else {
            j8 = 0;
            str = null;
            str2 = null;
            z10 = false;
        }
        if (str != null) {
            this.f10777c.setText(str);
            if (z10) {
                this.f10779e.setText(j.f4395g.g().getString(h.f4379p, new S4.e().b(file)));
                drawable = AppCompatResources.getDrawable(this.f10777c.getContext(), J4.d.f4127d);
            } else {
                this.f10779e.setText(new S4.g().c(j8));
                if (n.r(str, ".apk", false, 2, null)) {
                    u uVar = u.f9499a;
                    if (uVar.a().get(str) != null) {
                        drawable = (Drawable) uVar.a().get(str);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f10777c.getContext(), J4.d.f4124a);
                    }
                } else if (!n.r(str, ".xapk", false, 2, null) && !n.r(str, ".apks", false, 2, null)) {
                    if (n.r(str, ".zip", false, 2, null)) {
                        drawable = AppCompatResources.getDrawable(this.f10777c.getContext(), J4.d.f4141r);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f10777c.getContext(), J4.d.f4126c);
                    }
                } else {
                    drawable = AppCompatResources.getDrawable(this.f10777c.getContext(), J4.d.f4140q);
                }
            }
            this.f10776b.setImageDrawable(drawable);
        }
        if (str2 != null) {
            this.f10778d.setText(str2);
        }
        if (z8) {
            this.f10780f.setVisibility(0);
            this.f10779e.setVisibility(4);
            this.f10780f.setChecked(z9);
        } else {
            this.f10780f.setVisibility(8);
            this.f10779e.setVisibility(0);
        }
    }
}
