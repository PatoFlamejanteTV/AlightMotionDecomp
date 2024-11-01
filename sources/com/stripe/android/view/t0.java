package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.view.C0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class t0 extends ItemTouchHelper.SimpleCallback {

    /* renamed from: i, reason: collision with root package name */
    public static final a f29204i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f29205j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C0 f29206a;

    /* renamed from: b, reason: collision with root package name */
    private final b f29207b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f29208c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29209d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29210e;

    /* renamed from: f, reason: collision with root package name */
    private final ColorDrawable f29211f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29212g;

    /* renamed from: h, reason: collision with root package name */
    private final int f29213h;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final int a(float f8, int i8, int i9) {
            return Color.argb((int) (Color.alpha(i8) + ((Color.alpha(i9) - r0) * f8)), (int) (Color.red(i8) + ((Color.red(i9) - r1) * f8)), (int) (Color.green(i8) + ((Color.green(i9) - r2) * f8)), (int) (Color.blue(i8) + ((Color.blue(i9) - r8) * f8)));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(com.stripe.android.model.o oVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, C0 adapter, b listener) {
        super(0, 8);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(adapter, "adapter");
        AbstractC3292y.i(listener, "listener");
        this.f29206a = adapter;
        this.f29207b = listener;
        Drawable drawable = ContextCompat.getDrawable(context, n2.z.f35483S);
        AbstractC3292y.f(drawable);
        this.f29208c = drawable;
        int color = ContextCompat.getColor(context, n2.x.f35457h);
        this.f29209d = color;
        this.f29210e = ContextCompat.getColor(context, n2.x.f35458i);
        this.f29211f = new ColorDrawable(color);
        this.f29212g = drawable.getIntrinsicWidth() / 2;
        this.f29213h = context.getResources().getDimensionPixelSize(n2.y.f35464f);
    }

    private final void a(View view, int i8, float f8, Canvas canvas) {
        int a9;
        int top = view.getTop() + ((view.getHeight() - this.f29208c.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.f29208c.getIntrinsicHeight() + top;
        if (i8 > 0) {
            int left = view.getLeft() + this.f29213h;
            int intrinsicWidth = this.f29208c.getIntrinsicWidth() + left;
            if (i8 > intrinsicWidth) {
                this.f29208c.setBounds(left, top, intrinsicWidth, intrinsicHeight);
            } else {
                this.f29208c.setBounds(0, 0, 0, 0);
            }
            this.f29211f.setBounds(view.getLeft(), view.getTop(), view.getLeft() + i8 + this.f29212g, view.getBottom());
            ColorDrawable colorDrawable = this.f29211f;
            if (f8 <= 0.0f) {
                a9 = this.f29209d;
            } else if (f8 >= 1.0f) {
                a9 = this.f29210e;
            } else {
                a9 = f29204i.a(f8, this.f29209d, this.f29210e);
            }
            colorDrawable.setColor(a9);
        } else {
            this.f29208c.setBounds(0, 0, 0, 0);
            this.f29211f.setBounds(0, 0, 0, 0);
        }
        this.f29211f.draw(canvas);
        this.f29208c.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        AbstractC3292y.i(recyclerView, "recyclerView");
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C0.c.d) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f8, float f9, int i8, boolean z8) {
        float f10;
        AbstractC3292y.i(canvas, "canvas");
        AbstractC3292y.i(recyclerView, "recyclerView");
        AbstractC3292y.i(viewHolder, "viewHolder");
        super.onChildDraw(canvas, recyclerView, viewHolder, f8, f9, i8, z8);
        if (viewHolder instanceof C0.c.d) {
            View itemView = viewHolder.itemView;
            AbstractC3292y.h(itemView, "itemView");
            float width = itemView.getWidth() * 0.25f;
            float width2 = itemView.getWidth() * 0.5f;
            if (f8 < width) {
                f10 = 0.0f;
            } else if (f8 >= width2) {
                f10 = 1.0f;
            } else {
                f10 = (f8 - width) / (width2 - width);
            }
            a(itemView, (int) f8, f10, canvas);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        AbstractC3292y.i(recyclerView, "recyclerView");
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(target, "target");
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        this.f29207b.a(this.f29206a.m(viewHolder.getBindingAdapterPosition()));
    }
}
