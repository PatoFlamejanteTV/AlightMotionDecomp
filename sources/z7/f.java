package Z7;

import R5.AbstractC1435t;
import S7.n;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f14029a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f14030b;

    /* renamed from: c, reason: collision with root package name */
    public final S7.a f14031c;

    /* renamed from: d, reason: collision with root package name */
    public final J6.f f14032d;

    /* renamed from: e, reason: collision with root package name */
    public final Q7.g f14033e;

    /* renamed from: f, reason: collision with root package name */
    public final L5.c f14034f;

    public f(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, S7.a screenTexts, J6.f fVar, Q7.g tracking, L5.c gbcPurposeResponse) {
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(screenTexts, "screenTexts");
        AbstractC3292y.i(tracking, "tracking");
        AbstractC3292y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f14029a = sharedStorage;
        this.f14030b = choiceCmpCallback;
        this.f14031c = screenTexts;
        this.f14032d = fVar;
        this.f14033e = tracking;
        this.f14034f = gbcPurposeResponse;
    }

    public final String a() {
        J6.a aVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (aVar = fVar.f4497b) == null || (str = aVar.f4440E) == null) {
            return "";
        }
        return str;
    }

    public final String b() {
        n nVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (nVar = fVar.f4501f) == null || (str = nVar.f9939h) == null) {
            return "";
        }
        return str;
    }

    public final boolean c() {
        J6.f fVar;
        J6.a aVar;
        String str;
        if (b().length() > 0 && (fVar = this.f14032d) != null && (aVar = fVar.f4497b) != null && (str = aVar.f4440E) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String d() {
        if (!this.f14031c.f9779b.isEmpty()) {
            return (String) AbstractC1435t.m0(this.f14031c.f9779b);
        }
        return "";
    }

    public final boolean e() {
        boolean z8;
        J6.a aVar;
        J6.f fVar = this.f14032d;
        if (fVar != null && (aVar = fVar.f4497b) != null && aVar.f4438C) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    public final String f() {
        J6.a aVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (aVar = fVar.f4497b) == null || (str = aVar.f4439D) == null) {
            return "";
        }
        return str;
    }

    public final String g() {
        n nVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (nVar = fVar.f4501f) == null || (str = nVar.f9938g) == null) {
            return "";
        }
        return str;
    }

    public final boolean h() {
        J6.f fVar;
        J6.a aVar;
        String str;
        if (g().length() > 0 && (fVar = this.f14032d) != null && (aVar = fVar.f4497b) != null && (str = aVar.f4439D) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String i() {
        J6.a aVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (aVar = fVar.f4497b) == null || (str = aVar.f4441F) == null) {
            return "";
        }
        return str;
    }

    public final String j() {
        n nVar;
        String str;
        J6.f fVar = this.f14032d;
        if (fVar == null || (nVar = fVar.f4501f) == null || (str = nVar.f9937f) == null) {
            return "";
        }
        return str;
    }

    public final boolean k() {
        J6.f fVar;
        J6.a aVar;
        String str;
        if (j().length() > 0 && (fVar = this.f14032d) != null && (aVar = fVar.f4497b) != null && (str = aVar.f4441F) != null && str.length() > 0) {
            return true;
        }
        return false;
    }
}
