package O6;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7882a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f7883b;

    /* renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f7884c;

    /* loaded from: classes5.dex */
    final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(L6.c.f5425p);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f7883b = strArr;
        f7884c = new DateFormat[strArr.length];
    }

    public static String a(Date date) {
        return ((DateFormat) f7882a.get()).format(date);
    }

    public static Date b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f7882a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f7883b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    DateFormat[] dateFormatArr = f7884c;
                    DateFormat dateFormat = dateFormatArr[i8];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f7883b[i8], Locale.US);
                        dateFormat.setTimeZone(L6.c.f5425p);
                        dateFormatArr[i8] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
