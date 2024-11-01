package I5;

import I5.f;
import Q5.I;
import Q5.t;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import c6.InterfaceC2072n;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.J0;

/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f3779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3781c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f3782a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f3783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, f fVar, U5.d dVar) {
            super(2, dVar);
            this.f3782a = bitmap;
            this.f3783b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f3782a, this.f3783b, dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new a(this.f3782a, this.f3783b, (U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            t.b(obj);
            Bitmap bitmap = this.f3782a;
            if (bitmap != null) {
                f fVar = this.f3783b;
                ImageView imageView = fVar.f3769b;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                ImageView imageView2 = fVar.f3769b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
            f fVar2 = this.f3783b;
            f.a aVar = f.f3766l;
            fVar2.getClass();
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(fVar2.f3768a);
            ImageView imageView3 = fVar2.f3769b;
            if (imageView3 != null && imageView3.getVisibility() == 0) {
                ImageView imageView4 = fVar2.f3769b;
                if (imageView4 != null) {
                    Button button = fVar2.f3770c;
                    if (button != null) {
                        constraintSet.connect(button.getId(), 4, imageView4.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f3768a);
                }
            } else {
                TextView textView = fVar2.f3774g;
                if (textView != null) {
                    Button button2 = fVar2.f3770c;
                    if (button2 != null) {
                        constraintSet.connect(button2.getId(), 4, textView.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f3768a);
                }
            }
            return I.f8786a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Bitmap bitmap, f fVar, U5.d dVar) {
        super(2, dVar);
        this.f3780b = bitmap;
        this.f3781c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new g(this.f3780b, this.f3781c, dVar);
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        return new g(this.f3780b, this.f3781c, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.f3779a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            J0 G8 = C3445b0.c().G();
            a aVar = new a(this.f3780b, this.f3781c, null);
            this.f3779a = 1;
            if (AbstractC3458i.g(G8, aVar, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
