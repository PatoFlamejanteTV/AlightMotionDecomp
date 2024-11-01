package A5;

import android.util.Log;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f238a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final ChoiceCmpCallback f239b = ChoiceCmp.INSTANCE.getCallback();

    public static /* synthetic */ void a(b bVar, ChoiceError choiceError, String str, String str2, c cVar, Throwable th, int i8) {
        String str3;
        String str4;
        Throwable th2;
        if ((i8 & 2) != 0) {
            str3 = "ChoiceCmp";
        } else {
            str3 = null;
        }
        if ((i8 & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        if ((i8 & 8) != 0) {
            cVar = c.CALLBACK;
        }
        c cVar2 = cVar;
        if ((i8 & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
        bVar.b(choiceError, str3, str4, cVar2, th2);
    }

    public final void b(ChoiceError error, String tag, String message, c level, Throwable th) {
        AbstractC3292y.i(error, "error");
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(level, "level");
        if (message.length() == 0) {
            message = error.getMessage();
        }
        int ordinal = level.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (message.length() > 0 && tag.length() > 0) {
                        Log.e(tag, message, th);
                    }
                    ChoiceCmpCallback choiceCmpCallback = f239b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onCmpError(error);
                        return;
                    }
                    return;
                }
                return;
            }
            ChoiceCmpCallback choiceCmpCallback2 = f239b;
            if (choiceCmpCallback2 != null) {
                choiceCmpCallback2.onCmpError(error);
                return;
            }
            return;
        }
        if (message.length() > 0 && tag.length() > 0) {
            Log.e(tag, message, th);
        }
    }
}
